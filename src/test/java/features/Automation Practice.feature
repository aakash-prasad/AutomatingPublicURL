Feature: Login functionality

  Scenario: Valid Login
    Given user is on the login page and launch a browser
    When user enters valid username "student" and password "Password123"
    Then user should see message "Logged In Successfully"

#  Scenario: Invalid Login
#    Given user is on the login page
#    When user enters invalid username "wronguser" or password "wrongpass"
#    Then user should see error message "Your username is invalid!"
