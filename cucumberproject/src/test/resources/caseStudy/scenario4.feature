Feature: Testme App is turned on
Scenario: The one where user moves to cat without adding anything to cart
Given User is registered to TestMeApp
When User search for headphone
And User try to proceed to payment without adding to cart
Then TestMeApp doesn't display the cart icon