package testng.pro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AppTest {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        // WebDriverManager se ChromeDriver ko setup karna
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        // Navigate to the SauceDemo login page
        driver.get("https://www.saucedemo.com/v1/");
    }

    // DataProvider for different test cases
    @DataProvider(name = "loginTestData")
    public Object[][] loginTestData() {
        return new Object[][] {
            // Positive Test Case
            {"standard_user", "secret_sauce", true},

            // Negative Test Cases
            {"invalid_user", "secret_sauce", false},        // Invalid username
            {"standard_user", "wrong_password", false},     // Invalid password
            {"", "", false},                                // Empty username and password

//            // Boundary Value Test Cases
//            {"a".repeat(30), "p".repeat(30), false},        // Max length for username and password
//            {"a".repeat(1), "p".repeat(1), false}           // Min length (boundary) for username and password
        };
    }

    // Login Test using DataProvider
    @Test(dataProvider = "loginTestData")
    public void loginTest(String username, String password, boolean shouldLoginSucceed) {
        performLogin(username, password);

        if (shouldLoginSucceed) {
            // Verify login success by checking the URL
            String expectedURL = "https://www.saucedemo.com/v1/inventory.html";
            String actualURL = driver.getCurrentUrl();
            Assert.assertEquals(actualURL, expectedURL, "Login failed: URL does not match");
        } else {
            // Verify login failed by checking error message
            WebElement errorMessage = driver.findElement(By.cssSelector("h3[data-test='error']"));
            Assert.assertTrue(errorMessage.isDisplayed(), "Error message not displayed for invalid login attempt");
        }
    }

    // Helper Method to Perform Login
    private void performLogin(String username, String password) {
        // Find the username input field and enter the username
        WebElement usernameField = driver.findElement(By.id("user-name"));
        usernameField.clear();
        usernameField.sendKeys(username);

        // Find the password input field and enter the password
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.clear();
        passwordField.sendKeys(password);

        // Find the login button and click it
        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();
        try {
        	Thread.sleep(5000);        
        	}
        catch(Exception e) {
        	e.printStackTrace();
        }
    }

    @AfterMethod
    public void tearDown() {
        // Close the browser
        driver.quit();
    }
}
