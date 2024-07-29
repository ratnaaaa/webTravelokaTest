package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class homePage {
    WebDriver driver;

    By carsProductLink = By.linkText("Rental Mobil");


    public homePage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectCarsProduct() {
        driver.findElement(carsProductLink).click();
    }
}
