@amazonTest
Feature: Amazon scenario
Scenario: Amazon scenario

	Given user on the Amazon home page
	And user searching for "wooden spoon"
	And user choose first result
	Then user should be able to use methods from home page