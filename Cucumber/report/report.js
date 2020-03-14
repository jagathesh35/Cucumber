$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/feature/login.feature");
formatter.feature({
  "name": "To validate the login fuction",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To verify the user login with valid username, password",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Has to validate the FB login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPageStepDefinition.has_to_validate_the_FB_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to enter username,password and click login",
  "rows": [
    {
      "cells": [
        "farith",
        "123373939"
      ]
    },
    {
      "cells": [
        "jagathesh35",
        "9898999999"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageStepDefinition.user_has_to_enter_username_password_and_click_login(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has find error message",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageStepDefinition.user_has_find_error_message()"
});
formatter.result({
  "status": "passed"
});
});