Feature: Obtener información de usuario
  Background:Consumir la API
    Given la API está disponible en "https://reqres.in/api"
  Scenario: Obtener un usuario existente
    When hago una petición GET al endpoint "/users/2"
    Then el código de respuesta es 200
    And el nombre del usuario es "Janet"

  Scenario: Obtener la lista de todos los usuarios
    When hago una petición GET al endpoint "/users"
    Then el código de respuesta es 200
    And la lista de usuarios no está vacía

  Scenario: Actualizar los datos de un usuario existente
    And tengo los nuevos datos del usuario
      | name  | job       |
      | Janet | Engineer  |
    When hago una petición PUT al endpoint "/users/2" con los nuevos datos
    Then el código de respuesta es 200
    And el nombre actualizado del usuario es "Janet"
    And el trabajo actualizado del usuario es "Engineer"

  Scenario: Eliminar un usuario del sistema
    When hago una petición DELETE al endpoint "/users/2"
    Then el código de respuesta es 204

  Scenario: Verificar que el usuario eliminado no se encuentra en el sistema
    When hago una petición GET al endpoint "/users"
    Then el código de respuesta es 200
    And el usuario con id 8 no se encuentra en la lista



