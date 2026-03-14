package stepDefinitions;


import org.openqa.selenium.WebDriver;
import hooks.Hooks;
import io.cucumber.java.en.*;
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
		
		
		loginPage.enterUsername(username);
	}
	
	@Then("user enter password {string} into the password field")
	public void user_enter_password_into_the_password_field(String password) {
		
		loginPage.enterPassword(password);
		
	}
	
	@Then("user click on submit button")
	public void user_click_on_the_login_button() {
		
		loginPage.submitbtn();
	}
	
	@Then("the new page URL should contain {string}")
	public void the_new_page_url_should_contain(String expectedUrl) {
		
		loginPage.verifyUrlContains(expectedUrl);
		
	}
	
	@And("the page should be text {string}")
	public void the_page_should_be_text(String expectedText) {
		loginPage.verifyTextOnPage(expectedText);
		
	}
	
	@Then("user Verify error message is displayed")
	public void user_Verify_error_message_is_displayed() {
		loginPage.verifyErrorMessage();
	
	}
	
	@And("Verify error message text is {string}")
	public void verify_error_message_text_is(String expectedErrorMessage) {
		loginPage.verifyErrorMessageText(expectedErrorMessage);
	}

}
