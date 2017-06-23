@smokeTest
@stepdef2
Feature: test for Step defs 2
Background: 
When I run this

Scenario Outline: test for step defs 2
	And serching for "<item>"
	And search result is more then 100000
	Examples:
|item    |
|selemium|
|fawefagv|
|Cucumber|

	