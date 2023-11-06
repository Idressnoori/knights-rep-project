@Smoke

Feature: plans

  Scenario: validate four rows of the plans section
    When Open Browser
    When Enter username "idrissnoori" and password "idress@123"
    And click on Sign in button
    Then click on plan
    Then validate the contents of the plan sections
    Then clos browser