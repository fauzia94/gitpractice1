@login
Feature: facebook login and create new account

  @loginfb
  Scenario Outline: User login to facebook
    Given I am on the facebook login page
    When I enter email address "<emailAddress>"
    And I enter password "<password> "
    And I click on login button
    Then I should see login successful

    Examples: 
      | emailAddress  | password |
      | abc@gmail.com | ghhj12   |

  @precreate
  Scenario: User able to create account
    Given I am on the facebook page
    When I click on create account button
    Then I am on the facebook create account page

  @createfb
  Scenario Outline: create new facebook account
    Given I am on the facebook page
    When I click on create account button
    And I type first name "<firstname>"
    And I type last name "<lastname>"
    And I enter email "<email>"
    And I enter new password "<password>"
    And I select birth month"<month>"
    And I select birth day"<day>"
    And I select birth year"<year>"
    And I pick gender"<gender>"
    Then I am able to create facebook account successfully

    Examples: 
      | firstname | lastname | email  | password | month | day | year | gender |
      | name1     | name2    | name1@ | ghhj12   | Oct   |  24 | 2019 | Male   |
