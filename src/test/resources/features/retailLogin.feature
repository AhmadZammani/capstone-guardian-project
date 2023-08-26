@regression
Feature:Login 

Background: 
 Given User is on retail website homepage
 When User click on Sign in option

@login
Scenario: Verify user is able to log in to retail website
    And User enter email 'omar.zammani@gmail.com' and password 'Omari@2016'
    And User click on login button
    Then User should be logged in into Account
    
 @account
Scenario Outline: Verify user is able to register with tek retail website
	And User click on create new account link
	And User enter '<name>' and '<email>' and '<password>' and '<confPassword>'
	And User click on singup button
	Then Verify user account is created
	
Examples:
|name|email|password|confPassword|
|Amir|Amir.zamani004@gmail.com|Amir@2017|Amir@2017|
|Amir|Amir.zamani005@gmail.com|Amir@2017|Amir@2017|
|Amir|Amir.zamani006@gmail.com|Amir@2017|Amir@2017|
