Feature: Hotel Booking Functionality 

Background: User want to login the application 
	Given User want to launch the adactin application 
	When User enter "vinovicky" the valid username 
	And User enter "GMN630" the valid password 
	Then User verify the valid username and password 
	
	
Scenario Outline: User want to login the application 
	Given User want to launch the adactin application 
	When User enter "<Username>" the valid username 
	And User enter "<Password>" the valid password 
	Then User verify the valid username and password 
	
	Examples: 
		|Username|Password|
		|AAA|111|
		|BBB|222|
		|CCC|333| 

@Login	
Scenario: User want to login the application 
	Given User want to launch the adactin application 
	When User enter "vinovicky" the valid username 
	And User enter "GMN630" the valid password 
	Then User verify the valid username and password 
	
 