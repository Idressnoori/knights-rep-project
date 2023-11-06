@Regression
Feature: Create primary account

  @US_1
  Scenario: click on Create Primary Account Button and validate page title
    When Navigate to Home page then click on Create Primary Account Button
    Then validate page title should be "Create Primary Account Holder"
@US_2
  Scenario:Create primary account and validate form title as expected
    When Navigate to Home page then click on Create Primary Account Button
    When enter email address as "idress.noori@yahoo.com"
    Then DropDown and select "Mr."
    When Enter firstname as "Idress"
    Then Enter lastname as "Noori"
    Then Select Gender as "Male"
    Then select Marital Status as "Married"
    Then Enter Employment Status as "Student"
    Then Enter date of birth "09/07/1993"
    Then click on Create Account button
    Then enter the username "idrissnoori" password "idress@123" and confirm the password "idress@123"
    Then click on submit button

  @US_3
    Scenario: validate the error message with existing email address
      When Navigate to Home page then click on Create Primary Account Button
      When enter email address as "idress.noori@yahoo.com"
      Then DropDown and select "Mr."
      When Enter firstname as "Idress"
      Then Enter lastname as "Noori"
      Then Select Gender as "Male"
      Then select Marital Status as "Married"
      Then Enter Employment Status as "Student"
      Then Enter date of birth "09/07/1993"
      Then click on Create Account button
      Then validate error message as expected






