Feature: Teleccom feature
  I want to use this template for my feature file

  Scenario: add customer flow
    Given user is in telecom home page
    And user click on add customer
    When user is filling all the fields
    And user click on submit
    Then user should be displayed customer id is generate
