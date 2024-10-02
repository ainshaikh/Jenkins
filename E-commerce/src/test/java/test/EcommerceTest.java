package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.CartPage;
import Pages.CheckoutPage;
import Pages.ConfirmationPage;
import Pages.LoginPage;
import Pages.ProductPage;


public class EcommerceTest {
    WebDriver driver;
    LoginPage loginPage;
    ProductPage productsPage;
    CartPage cartPage;
    CheckoutPage checkoutPage;
    ConfirmationPage confirmationPage;

    @BeforeMethod
    public void setup() {
        // Set up ChromeDriver
//        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

        // Initialize page objects
        loginPage = new LoginPage(driver);
        productsPage = new ProductPage(driver);
        cartPage = new CartPage(driver);
        checkoutPage = new CheckoutPage(driver);
        confirmationPage = new ConfirmationPage(driver);
    }

    @Test
    public void testPurchaseFlow() {
        // Log in
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLogin();

        // Add two items to the cart
        productsPage.addFirstProductToCart();
        productsPage.addSecondProductToCart();
        productsPage.goToCart();

        // Proceed to checkout
        cartPage.proceedToCheckout();

        // Fill in shipping information
        checkoutPage.enterShippingDetails("ain", "abc", "123456");
        checkoutPage.clickContinue();
        
        // Complete the purchase
        checkoutPage.clickFinish();

        // Verify order confirmation
        String confirmationMessage = confirmationPage.getConfirmationMessage();
        Assert.assertEquals(confirmationMessage, "Thank you for your order!", "Order confirmation does not match.");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
