Feature: Adactin hotel booking functionality

@Login
Scenario Outline: User validate the login function using valid username and password

Given User launch the adactin appliction
When User enter the Username "<username>" in Username
And User enter the password "<password>" in Password
And User click the login button
Examples:
|username|Password|
|manomala|Maran@3718|
|hariharan96|hariharan@96|
|ananthamechkumar|ananth123|
|manomala|Maran@3718|

@Login
Scenario: User validate the login function using valid username and password

Given User launch the adactin appliction
When User enter the Username "manomala" in Username
And User enter the password "Maran@3718" in Password
And User click the login button

Scenario: Hotel booking in Adactin

When User Selecting a Location
And User selecting a Hotel
And User Selecting a Room
And User Enter a Room Number
And User Selecting a Date
And User Selecting a Adult Room
And User Choose a Child Room
And User Click the Submit Button
 
@HotelSearch
Scenario: Selecting Hotel in Adactin
When User Enter Particular Hotel
And User Confirm a Hotel

Scenario: Credential enter in Adactin

When User Enter Firstname
And User Enter LastName
And User Enter billing Address
And User Enter CreditCard Number
And  User Enter CreditCard Type
And User Enter Expired Month
And User Enter Expired Year
And User Enter CVV Number
And User click the Booknow button
And User click the Itinerary button


Scenario: Book Itinerary in Adactin
When User click the OrderId1
And User click the OrderId5
And User click the OrderId15
And User Search Hotel

Scenario: Logout Functionality from Adactin
When User Logout the Page

