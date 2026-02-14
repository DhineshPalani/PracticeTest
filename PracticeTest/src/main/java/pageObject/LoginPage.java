package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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
	public void enterUsername(String username) {
		driver.findElement(usernameField).sendKeys(username);
	}
	
	public void enterPassword(String password) {
		driver.findElement(passwordField).sendKeys(password);
	}
	
	public void submitbtn() {
		driver.findElement(submitButton).click();
	}
	
	
}
