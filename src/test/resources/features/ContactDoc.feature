Feature: Doc Testing - Contact

  @doc
  Scenario: Verify Contact form is working with doc input
    Given User is at Contact page
    When User enter "Tester" as first name
    And User enter "leanacademy@test.com" as email
    And Email as below
      """
      Hello HR,
      
      This is a demo message from a testing academy in order to validate
      either the doc string is working with the cucumber.
        
      Thanks, 
      Tester Lean Academy
      """
    And user click on the send button
    Then Message was submitted successfully
