Feature: Validar descompresión automática de archivos comprimidos

  Scenario: Subida y descompresión de archivo comprimido
    Given el usuario está en la página de carga de archivos
    When el usuario sube un archivo comprimido 
    Then el sistema debería descomprimir el archivo
    And el sistema debería listar los documentos descomprimidos para validación