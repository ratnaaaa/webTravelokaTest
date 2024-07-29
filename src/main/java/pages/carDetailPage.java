package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class carDetailPage {

        WebDriver driver;

        By buttonSelectCar = By.xpath("(//div[contains(text(), 'Lanjutkan')])[1]");

        @FindBy(id = "selectCarProvider")
        private WebElement selectCarProvider;

        @FindBy(id = "continueButton")
        private WebElement continueButton;

        @FindBy(id = "rentalOffice")
        private WebElement rentalOffice;

        @FindBy(id = "otherLocation")
        private WebElement otherLocation;

        @FindBy(id = "bookNowButton")
        private WebElement bookNowButton;

        public carDetailPage(WebDriver driver) {
            this.driver = driver;

        }
        public void selectCar() {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement clickSelect = wait.until(ExpectedConditions.elementToBeClickable(buttonSelectCar));
            clickSelect.click();

        }

        public void selectCarProvider() {
            selectCarProvider.click();
        }

        public void clickContinueButton() {
            continueButton.click();
        }

        public void setRentalOffice(String location) {
            rentalOffice.sendKeys(location);
        }

        public void setOtherLocation(String location) {
            otherLocation.sendKeys(location);
        }

        public void clickBookNowButton() {
            bookNowButton.click();
        }
    }
