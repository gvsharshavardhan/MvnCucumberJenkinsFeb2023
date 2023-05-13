Feature: Login feature



  Scenario: Login into Orange HRM
    Given user is a valid orange HRM user
    When user logs in to the HRM portal
    Then user should be on home page