Feature: Delete existing Album from collection

  Scenario: Delete existing Album from collection
    Given Album Brothers exists
    When  I remove Album Brothers
    Then Album Brothers can not be found