package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    
    // Locators
    By usernameField = By.id("user-name");
    By passwordField = By.id("password");
    By loginButton = By.id("login-button");
    
    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Methods
    public void enterUsername(String username) {
        driver.findElement(usernameField).sendKeys("standard_user");
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys("secret_sauce");
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }
}
