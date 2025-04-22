Feature: Validate OCR and METIQ integration and correct processing

  Scenario: Upload structured and unstructured documents
    Given the user is on the document upload page
    When the user uploads structured and unstructured documents
    Then the system processes the documents with OCR
    And extracts data
    And displays information for confirmation