Feature:As an existing user, I want to be able to log in to the CCRM system using my
  existing username and password, so that I can access to home page.
@Login
  Scenario:Verify Login Functionality
    Given User goes to the login page
    When User enters existing email "blyst6@si.edu" and password "barbabaslyst"
    And User should see the home page
    Then User should see the map
