package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class DurationOfStayPage extends Utility {
    public DurationOfStayPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='response-0']")
    WebElement lessThanSixMonths;

    @FindBy(xpath = "//input[@id='response-1']")
    WebElement moreThanSixMonths;

    public void selectLengthOfStay(String moreOrLess) {

        switch (moreOrLess) {
            case "6 months or less":
                Reporter.log("Clicking on 6 months or less"+ lessThanSixMonths.toString()+ "<br>");
                clickOnElement(lessThanSixMonths);
                break;
            case "longer than 6 months":
                Reporter.log("Clicking on longer than 6 months"+ moreThanSixMonths.toString()+ "<br>");
                clickOnElement(moreThanSixMonths);
        }
    }

    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement durationContinue;

    public void ClickOndDurationContinue() {
        Reporter.log("Clicking on durationContinue "+ durationContinue.toString()+ "<br>");
        clickOnElement(durationContinue);
    }


}
