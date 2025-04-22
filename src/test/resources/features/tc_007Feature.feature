Feature: Validar manejo de error en procesamiento OCR por archivo corrupto

  Scenario: Subir un archivo corrupto que afecte el proceso OCR
    Given el usuario está en la página de procesamiento de documentos
    When el usuario sube un archivo corrupto
    Then el sistema detecta el fallo
    And el sistema notifica el error al Bróker
    And el sistema finaliza el procesamiento