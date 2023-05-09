package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginUI {

    public static Target BotonHome = Target.the("Boton Home")
            .locatedBy("//android.widget.Button[@content-desc=\"Home, tab, 1 of 2\"]");

    public static Target BotonTags = Target.the("Boton Tags")
            .located(By.id("tags-button"));
    public static Target BotonSalir = Target.the("Bonton Salir")
            .locatedBy("//android.widget.Button[@content-desc='Login, tab, 2 of 2']");
    public static final Target UsuarioLogin = Target.the("Ingresar el Usuario de logueo")
            .locatedBy("//*[contains(text(),'dominio.com')]");

    public static final Target PassLogin = Target.the("Ingresar el pass de logueo")
            .locatedBy("//*[contains(text(),'Password')]");

    public static final Target BotonLogin = Target.the("Boton UserTask")
            .located(By.id("login-button"));
}
