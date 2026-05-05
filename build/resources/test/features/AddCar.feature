Feature: Add Car

  @addcar
  Scenario: Add new car
    Given User is logged in
    When User clicks on Add Car button
    And User fills car form
    And User submits new car
    Then User verifies car added successfully