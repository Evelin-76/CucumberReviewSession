Feature: contact page

@db
Scenario:
  Given the user is on the login page
  When the user enters the driver information
Given the user logged in as "sales manager"
And user navigate to "Customers" "Contacts"
When the user clicks the "mbrackstone9@example.com" from contacts
Then the information should be same with database