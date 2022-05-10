package gov.uk.check.visa.testsuits;

import gov.uk.check.visa.pages.*;
import gov.uk.check.visa.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VisaConfirmationTest extends TestBase {
    FamilyImmigrationStatusPage familyImmigrationStatusPage;
    ReasonForTravelPage reasonForTravelPage;
    ResultPage resultPage;
    SelectNationalityPage selectNationalityPage;
    StartPage startPage;
    WorkTypePage workTypePage;
    DurationOfStayPage durationOfStayPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        familyImmigrationStatusPage = new FamilyImmigrationStatusPage();
        reasonForTravelPage = new ReasonForTravelPage();
        resultPage = new ResultPage();
        selectNationalityPage = new SelectNationalityPage();
        startPage = new StartPage();
        workTypePage = new WorkTypePage();
        durationOfStayPage = new DurationOfStayPage();
    }

    @Test(groups = {"sanity","smoke","regression"})
    public void anAustralianCominToUKForTourism() throws InterruptedException {
        //startPage.clickCookies();
        Thread.sleep(2000);
        startPage.clickStartNow();
        selectNationalityPage.selectNationality("Australia");
        selectNationalityPage.ClickOnNationalityContinue();
        reasonForTravelPage.reasonForTravelling("Tourism");
        reasonForTravelPage.ClickOnReasonContinue();
        resultPage.confirmResultMessage("You will not need a visa to come to the UK");
    }

    @Test(groups = {"smoke","regression"})
    public void aChileanComingToTheUKForWorkAndPlansOnStayingForLongerThanSixMonths() throws InterruptedException {

        startPage.clickStartNow();
        selectNationalityPage.selectNationality("Chile");
        selectNationalityPage.ClickOnNationalityContinue();
        Thread.sleep(2000);
        reasonForTravelPage.reasonForTravelling("Work,academic visit or business");
        reasonForTravelPage.ClickOnReasonContinue();
        durationOfStayPage.selectLengthOfStay("longer than 6 months");
        durationOfStayPage.ClickOndDurationContinue();
        workTypePage.selectworkPlne("Health and care professional");
        workTypePage.ClickOnWorkPlanningContinue();
        resultPage.confirmResultMessage("You need a visa to work in health and care");
    }

    @Test(groups = {"regression"})
    public void aColumbianNationalComingToTheUKToJoinAPartnerForALongStayTheyDoHaveAnArticle10Or20Card() throws InterruptedException {
        startPage.clickStartNow();
        selectNationalityPage.selectNationality("Colombia");
        selectNationalityPage.ClickOnNationalityContinue();
        Thread.sleep(2000);
        reasonForTravelPage.reasonForTravelling("Join partner or family for a long stay");
        reasonForTravelPage.ClickOnReasonContinue();
        familyImmigrationStatusPage.selectImmigrationStatus("Yes");
        familyImmigrationStatusPage.ClickOnStatusContinue();
        resultPage.confirmResultMessage("You’ll need a visa to join your family or partner in the UK");

    }
}
