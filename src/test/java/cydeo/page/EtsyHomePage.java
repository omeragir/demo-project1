package cydeo.page;

import cydeo.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EtsyHomePage {
    public EtsyHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@id=\"gdpr-single-choice-overlay\"]/div/div[2]/div[2]/button")
    public WebElement cookies;
}
