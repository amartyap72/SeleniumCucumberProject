Feature: Shout Feature
@tag1
Scenario: Saun and Lucia are within range
Given Saun is 20 meter away from Lucia
When Saun Shouts "Free Coffee"
Then Lucia listens to the message
@tag2
Scenario: Saun and Lucia are not in the range
Given Saun is 1000 meters away from Lucia
When Saun Shouts "Free Coffee"
Then Lucia cannot listen to the message

