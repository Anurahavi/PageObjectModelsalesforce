#Feature: Salesforce login application

#Scenario: Password null scenario
#Given Launch the browser
#When Get the "https://login.salesforce.com/" URL
#Then Enter "anurahavi@cognizant.com","" and click login
#And Error message is displayed
#
#Scenario: Positive login scenario
#Given Launch the browser
#When Get the "https://login.salesforce.com/" URL
#Then Enter "anurahavi@cognizant.com","test@123" and click login
#And HomePage is displayed
#
#Scenario: RememberMe checkbox
#Given Launch the browser
#When Get the "https://login.salesforce.com/" URL
#And Enter "anurahavi@cognizant.com","test@123",check RememberMe and click login
#Then LogOut from the Salesforce application
#And Check username is displayed

#Scenario: Forgot password
#Given Launch the browser
#When Get the "https://login.salesforce.com/" URL
#And Click on forgot password
#Then Password reset Email to registered the user is sent


#Scenario: Invalid crendentials
#Given Launch the browser
#When Get the "https://login.salesforce.com/" URL
#Then Enter "123","22131" and click login
#And Error message is displayed1

#Scenario: Select user menu for <username> drop down
#Given Launch the browser
#When Get the "https://login.salesforce.com/" URL
#Then Enter "anurahavi@cognizant.com","test@123" and click login
#Then Click on Usermenu dropdown


