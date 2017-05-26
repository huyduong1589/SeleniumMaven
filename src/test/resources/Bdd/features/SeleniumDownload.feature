@selenium
Feature: SeleniumDownload section
  In order to use Selenium in my project, I want to download Selenium language bindings
 
  Scenario: Java binding download link check
    Given I navigate to page at "http://docs.seleniumhq.org" address
    When I click "Download" link
    Then I should see "Java" appear on page
    And I should see "C#" appear on page
    And I should see "Ruby" appear on page
    And I should see "Python" appear on page
    And I should see "Javascript (Node)" appear on page
