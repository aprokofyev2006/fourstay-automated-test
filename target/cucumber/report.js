$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("test.feature");
formatter.feature({
  "line": 1,
  "name": "test",
  "description": "",
  "id": "test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 8000656877,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "test scenario",
  "description": "",
  "id": "test;test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "I run this",
  "keyword": "When "
});
formatter.step({
  "line": 4,
  "name": "it should pass",
  "keyword": "Then "
});
formatter.match({
  "location": "TestStepDefs.i_run_this()"
});
formatter.result({
  "duration": 9861690882,
  "status": "passed"
});
formatter.match({
  "location": "TestStepDefs.it_should_pass()"
});
formatter.result({
  "duration": 617250314,
  "status": "passed"
});
formatter.after({
  "duration": 2025954129,
  "status": "passed"
});
});