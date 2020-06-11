Feature: Validationg usermenu dropdown in HomePage

#Scenario: Validating MyProfile in HomePage
#Given Launch the browser
#When Get the "https://login.salesforce.com/" URL
#Then Enter "anurahavi@cognizant.com","test@123" and click login
#Then Click on Usermenu dropdown and select MyProfile
#Then Click on edit profile button to edit contact information
#Then Click on About tabs and update lastname
#Then CLick on post and share a post
#Then Click on file and post a file
#And Click on photo and upload a photo

#Scenario: Validating DeveloperConsole in HomePage
#Given Launch the browser
#When Get the "https://login.salesforce.com/" URL
#Then Enter "anurahavi@cognizant.com","test@123" and click login
#Then Click on Usermenu dropdown and select DeveloperConsole
#And Close developer console window

#Scenario: Validating DeveloperConsole in HomePage
#Given Launch the browser
#When Get the "https://login.salesforce.com/" URL
#Then Enter "anurahavi@cognizant.com","test@123" and click login
#Then Click on Usermenu dropdown and select Logout
#And LoginPage is displayed

#Scenario: Validating MySettings in HomePage
#Given Launch the browser
#When Get the "https://login.salesforce.com/" URL
#Then Enter "anurahavi@cognizant.com","test@123" and click login
#Then Click on Usermenu dropdown and select MySettings
#Then Click on personal link and download login history
#Then Click on Display & Layout link and customize tabs
#Then Click on Email link and click on my email settings link under that
#And Click on Calendar & Remainders and click preview remainder

Scenario: Create new Account
Given Launch the browser
When Get the "https://login.salesforce.com/" URL
Then Enter "anurahavi@cognizant.com","test@123" and click login
Then Click Account page and click on new account
Then Enter account name, priority and other details
And Click on save


