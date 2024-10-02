package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConfirmationPage {
    WebDriver driver;

    // Locators
    By confirmationMessage = By.className("complete-header");

    // Constructor
    public ConfirmationPage(WebDriver driver) {
        this.driver = driver;
    }

    // Methods
    public String getConfirmationMessage() {
        return driver.findElement(confirmationMessage).getText();
    }
}
