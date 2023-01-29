@login
Feature: Leaftaps login functionality

#Background:
#Given Open the Chrome browser
#And Load the application url 'http://leaftaps.com/opentaps'

@functional @smoke @regression
Scenario Outline: Login with positive credential
Given Enter the username as <username>
And Enter the password as <password>
When Click on login button
Then Homepage should be displayed

Examples:
|username|password|
|'Demosalesmanager'|'crmsfa'|
|'DemoCSR'|'crmsfa'|

@functional
Scenario: Login with negative credential
Given Enter the username as 'DemoCSR'
And Enter the password as 'crmsfa123'
When Click on login button
But Error message should be displayed



#And Enter username as 'Demosalesmanager' and password as 'crmsfa'