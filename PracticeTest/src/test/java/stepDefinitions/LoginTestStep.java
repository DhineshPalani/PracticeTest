package stepDefinitions;


import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;
import pageObject.LoginPage;


public class LoginTestStep {
	
	
	WebDriver driver;
	LoginPage loginPage;
	
	public LoginTestStep(WebDriver driver) {
		super(driver);
		
	}


	@Given("user open login page")
	public void user_open_login_page() {
		driver.get("https://example.com/login");
	}
	
	@When("user enter username {string} into the username field")
	public void user_enter_username_into_the_username_field() {
		
	}
	
	@Then("user enter password {string} into the password field")
	public void user_enter_password_into_the_password_field() {
		enterPassword("Password123");
	}
	
	@And("user click on the login button")
	public void user_click_on_the_login_button() {
		submitbtn();
	}
	
	@Then("the new page URL should contain {string}")
	public void the_new_page_url_should_contain(String expectedUrl) {
		String currentUrl = driver.getCurrentUrl();
		if (currentUrl.contains(expectedUrl)) {
			System.out.println("Login successful, URL contains: " + expectedUrl);
		} else {
			System.out.println("Login failed, URL does not contain: " + expectedUrl);
		}
	}
	
	@And("the page should be text {string}")
	public void the_page_should_be_text(String expectedText) {
		String pageSource = driver.getPageSource();
		if (pageSource.contains(expectedText)) {
			System.out.println("Login successful, page contains: " + expectedText);
		} else {
			System.out.println("Login failed, page does not contain: " + expectedText);
		}
	}

}
