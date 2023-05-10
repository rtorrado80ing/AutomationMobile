Feature: Loguearme en la aplicacion
  Yo como usuario podre loguearme en la aplicacion

  @loginOk
  Scenario: login user
    Given el usuario puede ingresar el username 'prueba@accenture.com'
    When el usuario puede ingresar el password '123456'
    Then el usuario se loguea exitosamente

  @loginFail
  Scenario: login user
    Given el usuario puede ingresar el username 'prueba@accenture.com'
    When el usuario puede ingresar el password '123457'
    Then el usuario No se loguea exitosamente