package stepDefinitions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import hooks.Hooks;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.cucumber.messages.types.Duration;
import pageObject.LoginPage;


public class LoginTestStep {
	
	
	WebDriver driver = Hooks.driver;
	LoginPage loginPage = new LoginPage(driver);
    
	@Given("user open login page")
	public void user_open_login_page() {
		
		loginPage.navigateToLoginPage();
	}
	
	@When("user enter username {string} into the username field")
	public void user_enter_username_into_the_username_field(String username) {
		//driver.findElement(By.id("username")).sendKeys(username);
		
		loginPage.enterUsername(username);
	}
	
	@Then("user enter password {string} into the password field")
	public void user_enter_password_into_the_password_field(String password) {
		//driver.findElement(By.id("password")).sendKeys(password);
		loginPage.enterPassword(password);
		
	}
	
	@Then("user click on submit button")
	public void user_click_on_the_login_button() {
		//driver.findElement(By.id("submit")).click();
		loginPage.submitbtn();
	}
	
	@Then("the new page URL should contain {string}")
	public void the_new_page_url_should_contain(String expectedUrl) {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertTrue(expectedUrl.contains(currentUrl));
	}
	
	@And("the page should be text {string}")
	public void the_page_should_be_text(String expectedText) {
		String pageSource = driver.getPageSource();
		Assert.assertTrue(pageSource.contains(expectedText));
	}
	
	@Then("user Verify error message is displayed")
	public void user_Verify_error_message_is_displayed() {
		boolean errorMessage = driver.findElement(By.id("error")).isDisplayed();
		Assert.assertTrue(errorMessage);
	}
	
	@And("Verify error message text is {string}")
	public void verify_error_message_text_is(String expectedErrorMessage) {
		String actualErrorMessage = driver.findElement(By.id("error")).getText();
		Assert.assertEquals(actualErrorMessage, expectedErrorMessage);
	}

}
