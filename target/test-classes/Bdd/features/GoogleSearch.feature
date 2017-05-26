@google
Feature: Google Search
  User use Google search to search for a specific string

Scenario: Advance Search in Google
  Given I navigate to page at "http://www.google.com.vn" address
  When I enter "testing" text into search field
  And click on search button
  Then verify title is "testing"
