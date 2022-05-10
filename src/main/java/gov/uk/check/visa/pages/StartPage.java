package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class StartPage extends Utility {
    public StartPage() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//button[contains(text(),'Accept additional cookies')]")
    WebElement starPagecookies;

    public void clickCookies(){
        Reporter.log("Clicking on starPagecookies "+ starPagecookies.toString()+ "<br>");
        clickOnElement(StartNowButton);
    }

    @FindBy(xpath = "//body/div[@id='wrapper']/div[1]/main[1]/div[2]/div[1]/article[1]/section[1]/a[1]")
    WebElement  StartNowButton;

   public void clickStartNow(){
       Reporter.log("Clicking on StartNowButton"+ StartNowButton.toString()+ "<br>");
       clickOnElement(StartNowButton);
   }

}
