@amazonTest
@smokeTest
Feature: Amazon scenario
Scenario: Amazon scenario
	Given user on the Amazon home page
	And user searching for "wooden spoon"
	And user choose first result
	Then user should be able to use methods from home page
	
Scenario: Amazon scenario 2
	Given user on the Amazon home page
	And user searching for "selenium"
	And user choose first result
	Then user should be able to use methods from home page
	
Scenario: Amazon scenario 3
	Given user on the Amazon home page
	And user searching for "bmw"
	And user choose first result
	Then user should be able to use methods from home page