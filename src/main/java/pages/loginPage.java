package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
	WebDriver driver;

    // Constructor to initialize driver
    public loginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    private By usernameTextbox = By.xpath("//input[contains(@id,'username')]");
    private By passwordTextbox = By.xpath("//input[contains(@id,'password')]");
    private By loginButton = By.xpath("//input[contains(@id,'Login')]");

    // Actions
    public void enterUsername(String username) {
        driver.findElement(usernameTextbox).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordTextbox).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }
}