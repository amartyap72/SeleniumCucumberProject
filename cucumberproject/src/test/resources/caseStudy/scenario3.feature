Feature: TestMeApp Process 
Scenario: Payment Details
Given URL for the website is "http://10.232.237.143:443/TestMeApp/fetchcat.htm"
When Click on SignIN button
And Give user name as "Lalitha"
And Give password as "Password123"
And click on login button
And Search for "Headphone" and click on Search
And Click on add to cart
And open cart and click on Checkout
And click on proceed to pay
Then Complete payment and exit


