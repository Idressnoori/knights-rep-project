@Smoke @Regression
Feature: login and validating

  @US_1
  Scenario: login and validate the page header title
    When navigate to the home page and open Browser
    When sending username "idrissnoori" and password "idress@123"
    And click on Sign In button
    Then Login Successfully
    Then close Browser

    @US_2
  Scenario: enter wrong credentials
    When navigate to the home page and open Browser
    When sending username "wrong" and password "wrong@123"
    And click on Sign In button
    Then validate the error message
    Then close Browser
