package pages;

import base.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LiquidationHomePageElements extends CommonMethods {

    @FindBy(xpath="//input[@id='searchparam_words']")
    public WebElement search;
    @FindBy(css=".shortDesc")
    public List<WebElement> productList;
    @FindBy(xpath="//div[@id='modalSellerRatings']/following-sibling::div[2]//div[2]")
    public WebElement product;



    public LiquidationHomePageElements(){

        PageFactory.initElements(driver, this);
    }


}
