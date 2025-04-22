Feature: Validar rendimiento en la carga de archivos de diferentes tamaños

  Scenario: Subir archivos de tamaños pequeños y medir tiempos de respuesta
    Given estoy en la página de carga de archivos
    When subo un archivo de 3 MB
    Then el tiempo de carga y procesamiento es inferior a 1 segundo

    When subo un archivo de 6 MB
    Then el tiempo de carga y procesamiento es inferior a 1 segundo