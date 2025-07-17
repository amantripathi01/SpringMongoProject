Feature: Custom Prompt API Testing

Background:
  Given the API base URL "<API_BASE_URL>"
  And the authorization header is set to "<AUTH_TOKEN>"
  And the content type is "application/json"

Scenario: Verify that the API accepts valid prompt inputs
  Given I send a POST request to "/custom-prompt" with the payload:
    """
    {
      "prompt": "Generate a summary of this article"
    }
    """
  When I receive the response
  Then The response status should be 200
  And The response body should contain "success": true
  And The system should process the prompt without any validation errors

Scenario: Verify that the API enforces the maximum character limit on prompts
  Given I send a POST request to "/custom-prompt" with the payload:
    """
    {
      "prompt": "<LONG_TEXT_OVER_CHARACTER_LIMIT>"
    }
    """
  When I receive the response
  Then The response status should be 400
  And The response body should contain "error": "Character limit exceeded"
  And The system should not process the request further

Scenario: Verify the API's handling of empty prompt inputs
  Given I send a POST request to "/custom-prompt" with the payload:
    """
    {
      "prompt": ""
    }
    """
  When I receive the response
  Then The response status should be 400
  And The response body should contain "error": "Prompt field cannot be empty"
  And The system should reject the request without errors

Scenario: Verify whether special characters within the prompt are properly handled
  Given I send a POST request to "/custom-prompt" with the payload:
    """
    {
      "prompt": "Summarize @electrical#engineering concepts"
    }
    """
  When I receive the response
  Then The response status should be 200
  And The response body should contain "success": true
  And The system should process the input and return the correct output

Scenario: Test the response time of the API for valid prompt submission
  Given I send a POST request to "/custom-prompt" with the payload:
    """
    {
      "prompt": "Analyze the trends in data science for 2023"
    }
    """
  When I receive the response
  Then The response status should be 200
  And The response time should be less than 2000 milliseconds
  And The system should return the appropriate output without delay

Scenario: Simulate multiple users submitting prompts simultaneously
  Given I simulate sending 1000 POST requests to "/custom-prompt" with the payload:
    """
    {
      "prompt": "Test prompt for scalability"
    }
    """
  When I monitor the server response
  Then No request should return a response status greater than 500
  And The average response time should not exceed 2 seconds
  And The server should not crash under load

Scenario: Verify the ability to reset the input prompt field via API
  Given I send a POST request to "/custom-prompt/reset"
  When I receive the response
  Then The response status should be 200
  And The response body should contain "success": true
  And The API should reset the prompt input field successfully

Scenario: Verify the accessibility compliance for API functionality
  Given I send requests using a screen-reader tool to "/custom-prompt"
  When I observe the screen reader announcing field instructions
  Then The instructions should be clear and concise
  And The API should return responses readable by the accessibility tool
  And All endpoints should be functional in high-contrast and keyboard-only modes
