package example;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import static base.BaseTest.driver;

public class BrokenLink extends BaseTest {
    public static WebDriver driver;

    public static void main(String[] args) {

        driver = new ChromeDriver();
        driver.get("https://www.google.com");

        // Get all links from the page
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Total links: "+links.size());

        System.out.println(links);
        // Check each link
        for (WebElement link : links) {
            String url = link.getAttribute("href");
            if (url != null && !url.isEmpty()) {
                try {
                    HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
                    connection.setRequestMethod("HEAD");
                    connection.connect();
                    int responseCode = connection.getResponseCode();

                    // If response code is >= 400, the link is broken
                    if (responseCode >= 400) {
                        System.out.println("Broken link: " + url + " | Response Code: " + responseCode);
                    } else {
                        System.out.println("Valid link: " + url+ " | Response Code: " + responseCode);
                    }

                } catch (Exception e) {
                    System.out.println("Exception for URL: " + url + " -> " + e.getMessage());
                }
            }
        }

        // Close the browser
        driver.quit();

    }
}
