package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;
import tasks.SwitchToFrame;
import userinterface.LoginUI;


import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyEnabled;
import static userinterface.LoginUI.frame;


public class Salir implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(WaitUntil.the(LoginUI.BotonSalir,isCurrentlyEnabled()).forNoMoreThan(120).seconds());
        actor.attemptsTo(Click.on(LoginUI.BotonSalir));

    }
    public static Salir salir(){
        return new Salir();
    }
}
