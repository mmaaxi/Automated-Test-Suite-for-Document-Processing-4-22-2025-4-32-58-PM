Feature: Validar obligatoriedad de documentos en la carga

  Scenario: Intentar iniciar el proceso de carga sin un documento obligatorio
    Given el usuario está en la página de carga de documentos
    When intenta iniciar el proceso de carga sin el documento obligatorio
    Then el sistema debe impedir avanzar y mostrar un mensaje de error indicando el documento faltante