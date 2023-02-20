$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("HomePage.feature");
formatter.feature({
  "line": 1,
  "name": "VolkerWessels Sample Test",
  "description": "As a candidate I am showing interviewer my framework",
  "id": "volkerwessels-sample-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 13729034700,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User verify VolkerWessels homepage",
  "description": "",
  "id": "volkerwessels-sample-test;user-verify-volkerwessels-homepage",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is on VolkerWessels main page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user hovers mouse on WHAT WE DO tab and user click on Rail Infrastructure option",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user is successfully navigated to Rail Infrastructure project",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.userIsOnVolkerWesselsMainPage()"
});
formatter.result({
  "duration": 341724400,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.userHoversMouseOnWHATWEDOTabAndUserClickOnRailInfrastructureOption()"
});
formatter.result({
  "duration": 3872928800,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.userIsSuccessfullyNavigatedToRailInfrastructureProject()"
});
formatter.result({
  "duration": 41485400,
  "status": "passed"
});
formatter.after({
  "duration": 1261675400,
  "status": "passed"
});
formatter.before({
  "duration": 6341056000,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "User lists out inside WHAT WE DO tasks and print them",
  "description": "",
  "id": "volkerwessels-sample-test;user-lists-out-inside-what-we-do-tasks-and-print-them",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "user is on VolkerWessels main page",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "user hovers mouse on WHAT WE DO tab and checks how many tasks are there",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "user is successfully prints the list of tasks",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.userIsOnVolkerWesselsMainPage()"
});
formatter.result({
  "duration": 27400,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.userHoversMouseOnWHATWEDOTabAndChecksHowManyTasksAreThere()"
});
formatter.result({
  "duration": 96800500,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.userIsSuccessfullyPrintsTheListOfTasks()"
});
formatter.result({
  "duration": 4459896500,
  "status": "passed"
});
formatter.after({
  "duration": 1182460500,
  "status": "passed"
});
});