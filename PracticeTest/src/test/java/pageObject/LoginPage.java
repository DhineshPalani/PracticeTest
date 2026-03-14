package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPage 
{
	WebDriver driver;
   
	//Constructor to initialize the driver
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	//Locators
	private By usernameField = By.id("username");
	private By passwordField = By.id("password");
	private By submitButton = By.id("submit");
	
	
	//Actions
	public void navigateToLoginPage() {
		driver.get("https://practicetestautomation.com/practice-test-login/");
	}
	public void enterUsername(String username) {
		driver.findElement(usernameField).sendKeys(username);
	}
	
	public void enterPassword(String password) {
		driver.findElement(passwordField).sendKeys(password);
	}
	
	public void submitbtn() {
		driver.findElement(submitButton).click();
	}
	
	public void verifyUrlContains(String expectedUrl) {
		String currentUrl = driver.getCurrentUrl();
		if (!currentUrl.contains(expectedUrl)) {
			throw new AssertionError("Expected URL to contain: " + expectedUrl + " but was: " + currentUrl);
		}
	}
	
	public void verifyTextOnPage(String expectedText) {
		String pageSource = driver.getPageSource();
		if (!pageSource.contains(expectedText)) {
			throw new AssertionError("Expected text not found on the page: " + expectedText);
		}
	}
	
	public void verifyErrorMessage() {
		boolean errorMessage = driver.findElement(By.id("error")).isDisplayed();
		if(errorMessage) {
           
		Assert.assertTrue(errorMessage);
	    } 
		else {
		Assert.fail("Error message is not displayed");
	    }
		
	}
	
	public void verifyErrorMessageText(String expectedErrorMessage) {
		String actualErrorMessage = driver.findElement(By.id("error")).getText();
		Assert.assertEquals(actualErrorMessage, expectedErrorMessage);
	}
	
}
