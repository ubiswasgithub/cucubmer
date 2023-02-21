Feature: Logout 
  Background:  User is already logged in with valid credentials
    Given Admin is on the login page
    When Admin enter valid "Admin" and "admin123"
    Then Home page is displayed for the admin
	@logout
  Scenario: User can logout from the home page
    Given user at the home page
    When user click on the logout option
    Then Login page is displayed