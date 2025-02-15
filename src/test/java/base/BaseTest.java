package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.*;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    public static WebDriver driver;

    //@Parameters({"browser"})
    @BeforeMethod(alwaysRun=true)
    public WebDriver setup(){
    String browserName="chrome";
        switch(browserName){
            case "chrome":
                driver=new ChromeDriver();
                break;
            case "firefox":
                driver=new FirefoxDriver();
                break;
            case "edge":
                driver=new EdgeDriver();
                break;
            case "safari":
                driver=new SafariDriver();
                break;
            case "headless":
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--headless");
                options.addArguments("window-size=1920,1080");
                driver = new ChromeDriver(options);
                break;
            default:
                System.out.println("Please pass the correct browser..");
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://www.liquidation.com");

        PageInitializer.initialize();
        return driver;

    }

    @AfterMethod(alwaysRun=true)
    public void tearDown(){
        if (driver != null) {
            driver.quit();
        }
    }
}
