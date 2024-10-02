package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
    WebDriver driver;

    // Locators
    By firstProductAddButton = By.xpath("(//button[contains(text(), 'Add to cart')])[1]");
    By secondProductAddButton = By.xpath("(//button[contains(text(), 'Add to cart')])[2]");
    By cartButton = By.className("shopping_cart_link");

    // Constructor
    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    // Methods
    public void addFirstProductToCart() {
        driver.findElement(firstProductAddButton).click();
    }

    public void addSecondProductToCart() {
        driver.findElement(secondProductAddButton).click();
    }

    public void goToCart() {
        driver.findElement(cartButton).click();
    }
}
