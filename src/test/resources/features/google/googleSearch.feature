Feature:  Search Google for "Ducks"

  Scenario Outline: Search Google for "Ducks"
    Given Open Google Search
    When Search in Google: '<searchValue>'
    Then Verify search result in the URL: '<searchValue>'
    And Verify search result in the search line: '<searchValue>'
    And Verify each search result: '<linkSearchValue>'
    Examples:
      | searchValue | linkSearchValue |
      | Ducks       | Duck            |