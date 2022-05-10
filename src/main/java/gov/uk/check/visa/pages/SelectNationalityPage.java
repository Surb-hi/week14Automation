package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class SelectNationalityPage extends Utility {
    public SelectNationalityPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//select[@id='response']")
    WebElement nationalityDropDownList;

    public void selectNationality(String nationality) {
        Reporter.log("Selecting nationality DropDownList "+nationality +" from dropdown "+nationalityDropDownList.toString() + "<br>");
        selectByVisibleTextFromDropDown(nationalityDropDownList, nationality);
    }

    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement NationalityContinue;

    public void ClickOnNationalityContinue() {
        Reporter.log("Clicking on NationalityContinue"+ NationalityContinue.toString()+ "<br>");
        clickOnElement(NationalityContinue);
    }

}