$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/skeletons/shock.feature");
formatter.feature({
  "name": "Shout Feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Saun and Lucia are not in the range",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "name": "Saun is 1000 meters away from Lucia",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Saun Shouts \"Free Coffee\"",
  "keyword": "When "
});
formatter.match({
  "location": "ShoutStepDefination.saun_Shouts(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Lucia cannot listen to the message",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});