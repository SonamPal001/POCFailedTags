
@Regression
Feature: Test UserLogin
  @smoke @scenario1
  Scenario: User is able to successfully login into the application

Given user navigates to login page

When  user enters correct credentials

Then user is directed to the homepage