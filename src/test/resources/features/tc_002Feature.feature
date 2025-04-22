Feature: File Upload Validation

  Scenario: Validate file upload with a valid format and preview
    Given I am on the file upload page
    When I select a file in PDF/DOCX format within the limit of 50 MB
    Then the file should be uploaded and the preview should display the file name, size, and type