#Author: your.email@your.domain.com

Feature: Login
  I want to use login to the HRM protal with valid credentials.

  @login
  Scenario: Admin can login to the HRM portal with valid credentials
    Given Admin is on the login page
    When Admin enter valid "Admin" and "admin123"
    Then Home page is displayed for the admin
    
    

  