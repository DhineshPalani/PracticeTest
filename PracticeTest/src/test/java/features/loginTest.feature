Feature: LogIn test


Scenario: Positive LogIn test
 Given user open login page
 When user enter username "student" into the username field
 Then user enter password "Password123" into the password field
 And user click on submit button
 Then the new page URL should contain "https://practicetestautomation.com/logged-in-successfully/"
 And the page should be text "Congratulations student. You successfully logged in!"
 
Scenario Outline: Negative LogIn test
  Given user open login page
  When user enter username <username> into the username field
  Then user enter password <Password> into the password field
  And user click on submit button
  Then user Verify error message is displayed
  And Verify error message text is <message> 
  
  Example:
     |username|Password|message|
     |user|Password123|Your username is invalid!|
     |student|pass|Your password is invalid!|
     
  
 
 
