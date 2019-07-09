$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/skeletons/shock.feature");
formatter.feature({
  "name": "Shout Feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Saun and Lucia are within range",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Saun is 20 meter away from Lucia",
  "keyword": "Given "
});
formatter.match({
  "location": "ShoutStepDefination.saun_is_meter_away_from_Lucia(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Saun Shouts \"Free Coffee\"",
  "keyword": "When "
});
formatter.match({
  "location": "ShoutStepDefination.saun_Shouts(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Lucia Listens to the message",
  "keyword": "Then "
});
formatter.match({
  "location": "ShoutStepDefination.lucia_Listens_to_the_message()"
});
formatter.result({
  "error_message": "junit.framework.ComparisonFailure: expected:\u003c[free c]offee\u003e but was:\u003c[Free C]offee\u003e\r\n\tat junit.framework.Assert.assertEquals(Assert.java:100)\r\n\tat junit.framework.Assert.assertEquals(Assert.java:107)\r\n\tat skeletons.ShoutStepDefination.lucia_Listens_to_the_message(ShoutStepDefination.java:30)\r\n\tat ✽.Lucia Listens to the message(file:src/test/resources/skeletons/shock.feature:5)\r\n",
  "status": "failed"
});
});