Feature: Loguearme en la aplicacion
  Yo como usuario podre loguearme en la aplicacion

  Scenario: login
    Given el usuario puede ingresar el username 'prueba@accenture.com'
    When el usuario puede ingresar el password '123456'
    Then el usuario se loguea exitosamente
