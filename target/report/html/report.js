$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("facebook.feature");
formatter.feature({
  "line": 2,
  "name": "facebook login",
  "description": "",
  "id": "facebook-login",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@login"
    }
  ]
});
formatter.scenarioOutline({
  "line": 4,
  "name": "User login to facebook",
  "description": "",
  "id": "facebook-login;user-login-to-facebook",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "I am on the facebook login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter email address \"\u003cemailAddress\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I enter password \"\u003cpassword\u003e \"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I should see login successful",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "facebook-login;user-login-to-facebook;",
  "rows": [
    {
      "cells": [
        "emailAddress",
        "password"
      ],
      "line": 12,
      "id": "facebook-login;user-login-to-facebook;;1"
    },
    {
      "cells": [
        "abc@gmail.com",
        "ghhj12"
      ],
      "line": 13,
      "id": "facebook-login;user-login-to-facebook;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 13,
  "name": "User login to facebook",
  "description": "",
  "id": "facebook-login;user-login-to-facebook;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am on the facebook login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter email address \"abc@gmail.com\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I enter password \"ghhj12 \"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I should see login successful",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.i_am_on_the_facebook_login_page()"
});
formatter.result({
  "duration": 12335655634,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc@gmail.com",
      "offset": 23
    }
  ],
  "location": "LoginSteps.i_enter_email_address(String)"
});
formatter.result({
  "duration": 279313010,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ghhj12 ",
      "offset": 18
    }
  ],
  "location": "LoginSteps.i_enter_password(String)"
});
formatter.result({
  "duration": 147178420,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_click_on_login_button()"
});
formatter.result({
  "duration": 117788365,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_should_see_login_successful()"
});
formatter.result({
  "duration": 256166405,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "User able to create account",
  "description": "",
  "id": "facebook-login;user-able-to-create-account",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 16,
  "name": "I am on the facebook page",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "I click on create account button",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "I am on the facebook create account page",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateAccountButtonSteps.i_am_on_the_facebook_page()"
});
formatter.result({
  "duration": 4962280027,
  "status": "passed"
});
formatter.match({
  "location": "CreateAccountButtonSteps.i_click_on_create_account_button()"
});
formatter.result({
  "duration": 118286482,
  "status": "passed"
});
formatter.match({
  "location": "CreateAccountButtonSteps.i_am_on_the_facebook_create_account_page()"
});
formatter.result({
  "duration": 261720068,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 20,
  "name": "create new facebook account",
  "description": "",
  "id": "facebook-login;create-new-facebook-account",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 21,
  "name": "I am on the facebook page",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "I click on create account button",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "I type first name \"\u003cfirstname\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I type last name \"\u003clastname\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I enter email \"\u003cemail\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I enter new password \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I select birth month\"\u003cmonth\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "I select birth day\"\u003cday\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "I select birth year\"\u003cyear\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "I pick gender\"\u003cgender\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "I am able to create facebook account successfully",
  "keyword": "Then "
});
formatter.examples({
  "line": 33,
  "name": "",
  "description": "",
  "id": "facebook-login;create-new-facebook-account;",
  "rows": [
    {
      "cells": [
        "firstname",
        "lastname",
        "email",
        "password",
        "month",
        "day",
        "year",
        "gender"
      ],
      "line": 34,
      "id": "facebook-login;create-new-facebook-account;;1"
    },
    {
      "cells": [
        "name1",
        "name2",
        "name1@",
        "ghhj12",
        "Oct",
        "24",
        "2019",
        "Male"
      ],
      "line": 35,
      "id": "facebook-login;create-new-facebook-account;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 35,
  "name": "create new facebook account",
  "description": "",
  "id": "facebook-login;create-new-facebook-account;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "I am on the facebook page",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "I click on create account button",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "I type first name \"name1\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I type last name \"name2\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I enter email \"name1@\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I enter new password \"ghhj12\"",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I select birth month\"Oct\"",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "I select birth day\"24\"",
  "matchedColumns": [
    5
  ],
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "I select birth year\"2019\"",
  "matchedColumns": [
    6
  ],
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "I pick gender\"Male\"",
  "matchedColumns": [
    7
  ],
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "I am able to create facebook account successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateAccountButtonSteps.i_am_on_the_facebook_page()"
});
formatter.result({
  "duration": 5976033893,
  "status": "passed"
});
formatter.match({
  "location": "CreateAccountButtonSteps.i_click_on_create_account_button()"
});
formatter.result({
  "duration": 132003911,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "name1",
      "offset": 19
    }
  ],
  "location": "CreateAccountSteps.i_type_first_name(String)"
});
formatter.result({
  "duration": 1297551920,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "name2",
      "offset": 18
    }
  ],
  "location": "CreateAccountSteps.i_type_last_name(String)"
});
formatter.result({
  "duration": 158421220,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "name1@",
      "offset": 15
    }
  ],
  "location": "CreateAccountSteps.i_enter_email(String)"
});
formatter.result({
  "duration": 176236383,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ghhj12",
      "offset": 22
    }
  ],
  "location": "CreateAccountSteps.i_enter_new_password(String)"
});
formatter.result({
  "duration": 370565213,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Oct",
      "offset": 21
    }
  ],
  "location": "CreateAccountSteps.i_select_birth_month(String)"
});
formatter.result({
  "duration": 683619755,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "24",
      "offset": 19
    }
  ],
  "location": "CreateAccountSteps.i_select_birth_day(String)"
});
formatter.result({
  "duration": 301647704,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2019",
      "offset": 20
    }
  ],
  "location": "CreateAccountSteps.i_select_birth_year(String)"
});
formatter.result({
  "duration": 384740152,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Male",
      "offset": 14
    }
  ],
  "location": "CreateAccountSteps.i_pick_gender(String)"
});
formatter.result({
  "duration": 223395609,
  "status": "passed"
});
formatter.match({
  "location": "CreateAccountSteps.i_am_able_to_create_facebook_account_successfully()"
});
formatter.result({
  "duration": 321117795,
  "status": "passed"
});
});