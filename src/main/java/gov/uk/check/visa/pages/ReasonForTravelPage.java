package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class ReasonForTravelPage extends Utility {
    public ReasonForTravelPage(){
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//input[@id='response-0']")
    WebElement Tourism;

    @FindBy(xpath = "//input[@id='response-1']")
    WebElement Workacademicvisitorbusiness;

    @FindBy(xpath = "//input[@id='response-4']")
    WebElement Joinpartnerorfamilyforalongstay;

    public void reasonForTravelling(String reason){
        if(reason=="Tourism"){
            Reporter.log("Clicking on Tourism "+ Tourism.toString()+ "<br>");
            clickOnElement(Tourism);
        }else if(reason=="Work,academic visit or business"){
            Reporter.log("Clicking on Work,academic visit or business"+ Workacademicvisitorbusiness.toString()+ "<br>");
            clickOnElement(Workacademicvisitorbusiness);
        }else if(reason=="Join partner or family for a long stay"){
            Reporter.log("Clicking on Join partner or family for a long stay"+ Joinpartnerorfamilyforalongstay.toString()+ "<br>");
            clickOnElement(Joinpartnerorfamilyforalongstay);
        }
    }
    @FindBy(xpath="//button[contains(text(),'Continue')]")
    WebElement reasonForTravellingContinueButton;

    public void ClickOnReasonContinue (){
        Reporter.log("Clicking on reason For Travelling Continue Button "+ reasonForTravellingContinueButton.toString()+ "<br>");
        clickOnElement(reasonForTravellingContinueButton);
    }
}
