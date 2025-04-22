Feature: Document Upload Mode Selection

  Scenario: Validate selection of document upload mode
    Given I am on the document upload page
    When I select the option to 'cargar documentos'
    Then the system should display options for 'carga única' and 'carga múltiple'
    
    When I choose 'carga en un solo archivo'
    Then a single upload box should be enabled for the file
    
    When I choose 'cargar documentos por separado'
    Then multiple upload boxes should be displayed for each required document