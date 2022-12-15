
@tag
Feature: purchase the order from Ecommerce website
  I want to use this template for my feature file

  Background:
  Given I landed on Ecommerce page

  @tag2
  Scenario: Postive test for submitting the order
    Given login with username and password
    And  products added to the cart page
    When checking out the cart products
    And  filling the details and place the order
    Then message is displayed

  