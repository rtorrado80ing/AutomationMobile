# Prueba Técnica

# Automation (Mobile)

# Introducción

  

##Pre-requisitos##

- JDK 16 (variables de entorno configuradas)
- IntelliJ IDEA (2022.3.3) o superior
- Gradle v8.0.2 o superior (variables de entorno configuradas)
- Appium-Server-GUI-windows-1.22.3-4
- Android Debug Bridge version 1.0.41
- Habilitar Depuración por USB en el celular
- Appium Setting instalado en el celular


## Configuracion en Serenity.properties del Dispositivo fisico  ##
```
webdriver.driver = appium
appium.hub = http://127.0.0.1:4723/wd/hub
appium.automationName= UiAutomator2
appium.platformName = Android
appium.deviceName  = AutomationTesting
appium.app = ${user.dir}/src/test/resources/app/app-qa-release.apk
appium.newCommandTimeout = 1000
appium.autoAcceptAlerts = true
appium.waitForAppScript = true
appium.noReset = false
appium.fullReset = true
appium.udid = R5CT90XQ28R --Nombre del celular
appium.platformVersion = 13.0 --Version del Android
#appium.platformName = Android
appium.appPackage = com.conduitreactnative.qa
#appium.automationName = UiAutomator2
appium.appActivity = com.conduitreactnative.SplashActivity
```
## Detalles Ejecución CMD  ## 
Para correr el proyecto por CMD se realiza con el siguiente comando:
gradle clean test -i

reporte
rootPathProject/AutomationMobile/target/site/serenity/index.html

@Automatizador: Ricardo Torrado  
