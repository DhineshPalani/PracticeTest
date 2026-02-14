Feature: LogIn test

@Testcase:1
Scenario: Positive LogIn test
 Given user open login page
 When user enter username "username" into the username field
 Then user enter password "password" into the password field
 And user click on submit button
 Then the new page URL should contain "practicetestautomation.com/logged-in-successfully/"
 And the page should be text "Congratulations" or "successfully logged in"
 
