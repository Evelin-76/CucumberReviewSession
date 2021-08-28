$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/conctactFromDB.feature");
formatter.feature({
  "name": "contact page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@db"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.vytrackLiveSession.step_definitions.LoginStepDefs.theUserIsOnTheLoginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters the driver information",
  "keyword": "When "
});
formatter.match({
  "location": "com.vytrackLiveSession.step_definitions.LoginStepDefs.theUserEntersTheDriverInformation()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user logged in as \"sales manager\"",
  "keyword": "Given "
});
formatter.match({
  "location": "com.vytrackLiveSession.step_definitions.NAvigationStepDefs.theUserLoggedInAs(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigate to \"Customers\" \"Contacts\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.vytrackLiveSession.step_definitions.ContactStepDefs.userNavigateTo(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks the \"mbrackstone9@example.com\" from contacts",
  "keyword": "When "
});
formatter.match({
  "location": "com.vytrackLiveSession.step_definitions.ContactStepDefs.theUserClicksTheFromContacts(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the information should be same with database",
  "keyword": "Then "
});
formatter.match({
  "location": "com.vytrackLiveSession.step_definitions.ContactStepDefs.theInformationShouldBeSameWithDatabase()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});