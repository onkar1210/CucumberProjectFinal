Feature: Submit form
  Background:
    Given Should be on "https://demoqa.com/"
    When user click on form button
    And click on prctice form
    Then form should be displayed

  Scenario: Form with valid inputs should be submitted
    When Form is filled with vaild input
    And Click on Submit button
    Then Form should be sumitted

  Scenario: Choose a file to upload
    When Click on upload file
    And Select a file
    Then File should be uploaded