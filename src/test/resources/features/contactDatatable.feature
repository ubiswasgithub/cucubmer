Feature: Send mass message with data table

  Background: user should be at form page
    Given User is at Contact page

  @datatable
  Scenario: Verify user can send multiple message
    Given user has the below information to send
      | Tester1 | Tester1@test.com | This is the message1 |
      | Tester2 | Tester2@test.com | This is the message2 |
      | Tester3 | Tester3@test.com | This is the message3 |
    When user click on the send button
    Then message is sent successfully
