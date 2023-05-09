package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;
import userinterface.LoginUI;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyEnabled;


public class Salir implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {

        try {
            Thread.sleep(30000);

        actor.attemptsTo(Click.on(LoginUI.BotonTags));

        actor.attemptsTo(WaitUntil.the(LoginUI.BotonSalir,isCurrentlyEnabled()).forNoMoreThan(120).seconds());
        actor.attemptsTo(Click.on(LoginUI.BotonSalir));

        actor.attemptsTo(SendKeys.of(Keys.ENTER).into(LoginUI.BotonHome),
                SendKeys.of(Keys.TAB).into(LoginUI.BotonHome));

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static Salir salir(){
        return new Salir();
    }
}
