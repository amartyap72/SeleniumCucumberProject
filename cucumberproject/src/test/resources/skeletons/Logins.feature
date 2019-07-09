Feature: I want to use this page for my feature file
Scenario: Register to test me app
Given URL of test me app "http://10.232.237.143:443/TestMeApp/fetchcat.htm"
When On home page click sign up
And Enter "Amartya0542" as username
And Enter "Amartya" as first name
And Enter "Pandey" as last name
And Enter "Amartya33" as password
And Enter "Amartya33" as Confirm password
And Enter Gender as male
And Enter email as "amartya72@gmail.com"
And Enter Mobile no as"9884214470"
And Enter "01/25/1997" as Birth date
And Enter "B-20/47 Kailah, Bhelupur, Varanasi, Uttar Pradesh 221010" as Address
And Enter "Varanasi" as answer to sequrity question
Then click on Register button