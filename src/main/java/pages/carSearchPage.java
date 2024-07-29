package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class carSearchPage {
    WebDriver driver;

   By withoutDriverTab = By.xpath("//div[contains(text(), 'Tanpa Sopir')]");
   By pickUpLocation = By.xpath("//input[@placeholder='Cari kota atau wilayah']");
   By selectPickUpLocation = By.xpath("(//div[@aria-label= 'Jakarta Pusat'])");

    @FindBy(id = "pickUpDateTime")
    private WebElement pickUpDateTime;

    @FindBy(id = "dropOffDateTime")
    private WebElement dropOffDateTime;

    By searchCarButton = By.xpath("(//div[contains(text(), 'Cari Mobil')])[2]");

    public carSearchPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectWithoutDriverTab() {
        driver.findElement(withoutDriverTab).click();
    }
    public void setPickUpLocation(){
        driver.findElement(pickUpLocation).sendKeys("Jakarta");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement pickUpLocation = wait.until(ExpectedConditions.elementToBeClickable(selectPickUpLocation));
        pickUpLocation.click();
    }

    public void setPickUpDateTime(String dateTime) {
        pickUpDateTime.sendKeys(dateTime);
    }

    public void setDropOffDateTime(String dateTime) {
        dropOffDateTime.sendKeys(dateTime);
    }

    public void clickSearchCarButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement SearchCar = wait.until(ExpectedConditions.elementToBeClickable(searchCarButton));
        SearchCar.click();
    }
}

