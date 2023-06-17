$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Virgin Games Functionality",
  "description": "",
  "id": "virgin-games-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 10285939900,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "I can open the website successfully",
  "description": "",
  "id": "virgin-games-functionality;i-can-open-the-website-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I enter url in the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user is on Home Page",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I should see the message",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTestSteps.iEnterUrlInTheBrowser()"
});
formatter.result({
  "duration": 282433800,
  "status": "passed"
});
formatter.match({
  "location": "LoginTestSteps.userIsOnHomePage()"
});
formatter.result({
  "duration": 69300,
  "status": "passed"
});
formatter.match({
  "location": "LoginTestSteps.iShouldSeeTheMessage()"
});
formatter.result({
  "duration": 174305200,
  "status": "passed"
});
formatter.after({
  "duration": 1610392000,
  "status": "passed"
});
});