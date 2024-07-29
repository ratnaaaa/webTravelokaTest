package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.carDetailPage;
import pages.homePage;
import pages.carSearchPage;
import utils.driverManagers;

public class bookcarWithoutDriver {
    WebDriver driver;
    homePage homePage;
    carSearchPage carSearchPage;
    carDetailPage carDetailPage;

    @Given("User is on Traveloka homepage")
    public void userIsOnTravelokaHomepage() {
        driver = driverManagers.getDriver();
        driver.get("https://www.traveloka.com/id-id");
        homePage = new homePage(driver);

    }

    @When("User selects Cars Product")
    public void userSelectsCarsProduct() {
        homePage.selectCarsProduct();
    }

    @And("User selects tab Without Driver")
    public void userSelectsTabWithoutDriver() {
        carSearchPage = new carSearchPage(driver);
        carSearchPage.selectWithoutDriverTab();
    }

    @And("User selects Pick-up Location")
    public void userSelectsPickUpLocation(){
        carSearchPage.setPickUpLocation();
    }

    @And("User selects Pick-up Date & Time {int} days from now at {string}")
    public void userSelectsPickUpDateTimeDaysFromNowAt(int arg0, String arg1) {
    }

    @And("User selects Drop-off Date & Time {int} days from now at {string}")
    public void userSelectsDropOffDateTimeDaysFromNowAt(int arg0, String arg1) {
    }

    @And("User clicks button Search Car")
    public void userClicksButtonSearchCar() {
        carSearchPage.clickSearchCarButton();
    }

    @And("User selects a car")
    public void userSelectsACar() {
        carDetailPage = new carDetailPage(driver);
        carDetailPage.selectCar();
    }

    @And("User selects a car provider")
    public void userSelectsACarProvider() {
    }

    @And("User clicks button Continue in Product Detail")
    public void userClicksButtonContinueInProductDetail() {
    }

    @And("User selects Pick-up Location in Rental Office")
    public void userSelectsPickUpLocationInRentalOffice() {
    }

    @And("User selects Drop-off Location in Other Location")
    public void userSelectsDropOffLocationInOtherLocation() {
    }

    @And("User inputs Pick-up\\/Drop-off notes")
    public void userInputsPickUpDropOffNotes() {
    }

    @And("User clicks button Book Now")
    public void userClicksButtonBookNow() {
    }

    @And("User fills Contact Details")
    public void userFillsContactDetails() {
    }

    @And("User fills Driver Details")
    public void userFillsDriverDetails() {
    }

    @And("User clicks Continue")
    public void userClicksContinue() {
    }

    @And("User adds a special request")
    public void userAddsASpecialRequest() {
    }

    @And("User checks all rental requirements")
    public void userChecksAllRentalRequirements() {
    }

    @And("User clicks Continue after checking rental requirements")
    public void userClicksContinueAfterCheckingRentalRequirements() {
    }

    @And("User selects payment method and proceeds to payment")
    public void userSelectsPaymentMethodAndProceedsToPayment() {
    }

    @Then("Booking is completed successfully")
    public void bookingIsCompletedSuccessfully() {
    }

}
