Feature: Hotel Booking In Adactin Application 
@SmokeTest
Scenario: user Login In the web Application 
	Given user Launch The Adactin Application 
	When user Enter The Username In Username Field 
	And user Enter The Password In Password Field 
	Then user Click The Login Button And It Navigates To Search Hotel Page 

@SmokeTest
Scenario: user Entered Into The Search Hotel Page 
	When user Select The Location In Location Field 
	And user Select The Hotel Name In Hotel Field 
	And user Select Type Of Room In Room Type Field 
	And user Select The Number Of Room In Number Of Rooms Field 
	And user Enter The Check In Date In Check In Date Field 
	And user Enter The Check Out Date In Check Out Date Field 
	And user Select The Number Of Adults Per Room In Adults Per Room Field 
	And user Select The Number Of Children Per Room in Adults Per Room Field 
	Then user Click The Search Button It Navigate To Select Hotel Page 

@SmokeTest
Scenario: user Entered Into Select hotel Page 
	When user Select The Hotel From Search Results 
	Then user Click The Continue Button Navigate To Book A Hotel Page 

@SmokeTest
Scenario: user Entered Into The Book A Hotel Page 
	When user Enter The First Name In First Name field 
	And  user Enter The Last Name In Last Name field 
	And  user Enter The Address In Billing Address field 
	And  user Enter The Credit Card No In Credit Card No field 
	And  user Select The Credit Card Type In Credit Card Type field 
	And  user Select The Expiry Date In Expiry Date Field 
	And  user Enter The CVV Number In CVV Number Field 
	Then user Click The Book Now Button to Navigate to Confirmation Page 

@SmokeTest
Scenario: user Entered Into Confirmation Page 
	Then  user Click The Logout page 
	
	
	
	
	
	
	
	
	
