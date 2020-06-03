Feature: Login feature
  Scenario: Login with valid credentials
    Given I navigate to https://demo.broadleafcommerce.org
    And I click SignIn
    When i enter Email and Password
    And I click SignIn Button
    Then I should see MyAccount
    Then I close the brower