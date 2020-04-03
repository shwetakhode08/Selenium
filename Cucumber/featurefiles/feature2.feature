Feature: Login feature

  Scenario Outline: To test login scenario with multiple test data
    Given Application1 is up and running
    When I enter valid username and password
    Then I should be loggied in

    Examples: 
      | username | password |
      | admin    | admin123 |
      | admin    | admin123 |
