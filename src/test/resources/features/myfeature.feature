
Feature: google search 

  Scenario: veryfy the google search
    Given open the url as "https://www.google.com/"
    When search the keyword as "selenium"
    Then I validate the result

  