Feature: profile data validation

  @US_4
  Scenario: Navigate to profile and validate profile side drawer.
    When Open Browser
    When Send username "idrissnoori" and password "idress@123"
    And click on SignIn button
    Then click on Profile
#    Then validate information Profile Side Drawer is "correct"
    Then clos browser

    @US_5
    Scenario: Navigate to profile and then logout
      When Open Browser
      When Send username "idrissnoori" and password "idress@123"
      And click on SignIn button
      Then click on Profile
      Then click on Logout button
      Then clos browser