Feature: Fetch and Validate Posts

  Scenario: Fetch all posts
    Given The client fetches all posts
    Then The response status code should be 200
    Then The response should contain posts


