Feature: Usability validation of file preview and delete functionality

  Scenario: Validate file preview and delete functionalities
    Given I upload documents
    Then I should see a preview showing the name, size, and type of each file
    When I delete one of the files using the delete option
    Then the deleted file should be removed from the list before confirmation