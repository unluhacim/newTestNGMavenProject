package mytests;

import base.CommonMethods;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.File;
import java.util.List;

@Listeners(base.TestListener.class)
public class SampleTest extends CommonMethods {


    @Test
    public void productSearch() throws Exception {
        /*
        Task:
        1.Navigate https://liquidation.com
        2.Fetch web page URL and Title
        3.Search furniture
        4.Loop all products related with furniture and write to the console and select first product include "Furniture"
        5.Take the screenshot of product
        6.Find the Auction Id and write to the console
        */


        String url = driver.getCurrentUrl();
        String title = driver.getTitle();
        System.out.println(url + "  -  " + title);

        homePage.search.sendKeys("furniture",Keys.ENTER);
        List<WebElement> list=homePage.productList;

       for(WebElement e:list){
           String product=e.getText();
           System.out.println(product);

           if(product.contains("Furniture")){
               e.click();
               break;
           }
       }

        Thread.sleep(2000);
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
        File destFile = new File("src/test/java/screenshots/screenshot.png");
        FileUtils.copyFile(srcFile, destFile);

        WebElement el=homePage.product;
        String auctionId=el.getText();
        System.out.println("Auction Id: "+auctionId);


    }


}
