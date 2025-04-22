Feature: Validate file handling with invalid format or exceeded size

  Scenario: User attempts to upload a file with invalid format or size exceeding 50 MB
    Given the user is on the file upload page
    When the user attempts to upload a file with an invalid format or size exceeding 50 MB
    Then the system displays an error message indicating invalid format or size exceeded