package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class FamilyImmigrationStatusPage extends Utility {
    public FamilyImmigrationStatusPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='response-0']")
    WebElement Yes;

    @FindBy(xpath = "//input[@id='response-1']")
    WebElement No;

    public void selectImmigrationStatus(String status) {

        switch (status) {
            case "Yes":
                Reporter.log("Clicking on Yes"+ Yes.toString()+ "<br>");
                clickOnElement(Yes);
                break;
            case "No" :
                Reporter.log("Clicking on No "+ No.toString()+ "<br>");
                clickOnElement(No);
        }
    }
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement StatusContinue;

    public void ClickOnStatusContinue (){
        Reporter.log("Clicking on StatusContinue "+ StatusContinue.toString()+ "<br>");
        clickOnElement(StatusContinue);
    }
}
