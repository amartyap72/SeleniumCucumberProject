Feature: Login to Test Me App
Scenario Outline: Login Page open
Given The Browser opens the URL "http://10.232.237.143:443/TestMeApp/fetchcat.htm"
When Click on login Button
And Enter the UserName "<User>"
And Enter the Password "<Pass>"
Then Click on Login Button

Examples: 
|User|Pass|
|Lalitha|Password123|
|admin|Password456|