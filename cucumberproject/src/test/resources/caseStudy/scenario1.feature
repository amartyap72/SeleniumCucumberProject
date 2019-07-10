Feature: Register to Test Me App
Scenario: Register Page open
Given The Browser opens the url "http://10.232.237.143:443/TestMeApp/fetchcat.htm"
When Clicks login button
And Type in username field "amartyap7272"
And Type in the first name "Amartya"
And Type in the last nam "Pandey"
And Type in password field "amartya"
And Type in confirm password "amartya"
And Select your gender
And Type your email as "amartyap72@gmail.com"
And Type the mobile number "9884214470"
And Type the DOB as "01/25/1997"
And Type the Address "B-20/47, Kailash, Bhelupur, Varanasi, Uttar Pradesh 221010"
And type the security answer "Varanasi"
Then Click on Register button and close the browser
