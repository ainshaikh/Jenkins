E-Commerce Automation Test--------

This project automates the e-commerce website "SauceDemo" using Selenium WebDrivers with Java,
with Page Object Model (POM) design pattern. The tests use TestNG framework for execution.

Features of the Test Suite:-
 1-Log in to the website.
 2-Add two items to the cart.
 3-Proceed to checkout(click on cart).
 4-Fill the shipping information.
 5-Complete the purchase.
 6-Verify the order confirmation.
 
 Prerequisites
The following prerequisites are required:-

 Java kit
 Eclipse
 Create a Maven Project
 ChromeDriver (or other browser drivers)
 Add TestNG from eclipse marketplace
 
 Project Structure following POM design pattern
 Create two packages with name Pages and Test in src/test/java
 In Pages create CartPage, CheckoutPage, ConfirmationPage, LoginPage, ProductPage and inside test create EcommerceTest for execution
 of the script.
 
   Page Classes:

LoginPage.java: Handles login functionality.
ProductsPage.java: Manages adding two products to the cart.
CartPage.java: Manages cart functionality.
CheckoutPage.java: Handles checkout and shipping details.
Test Class: ECommerceTest.java: Contains the test methods with TestNG annotations.
 
 
 Dependencies
 Add TestNG dependency.
