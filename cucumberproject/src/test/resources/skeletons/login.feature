Feature: Login feature for demo webshop
Scenario: valid login scenario
Given url of demowebshop "http://demowebshop.tricentis.com/login"
When user enters "askmail@email.com" as username
And user enters "abc123" as password
And user clicks the login button
Then user is in webshop