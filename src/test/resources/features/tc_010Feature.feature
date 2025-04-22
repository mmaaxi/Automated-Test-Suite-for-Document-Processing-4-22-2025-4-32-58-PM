Feature: Validar generación de 'Slip de salida' y almacenamiento en historial

  Scenario: Completar la carga y procesamiento de documentos
    Given El usuario ha iniciado sesión y está en la página de solicitudes
    When El usuario carga los documentos necesarios
    And El usuario inicia el procesamiento de los documentos
    Then El sistema genera el 'Slip de salida'
    And El sistema guarda los documentos originales en el historial de la solicitud
    And El sistema guarda los datos extraídos en el historial de la solicitud