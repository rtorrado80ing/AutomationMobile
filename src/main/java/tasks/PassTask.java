package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyEnabled;
import static userinterface.LoginUI.*;

public class PassTask implements Task {

    String pass;
    public PassTask(String pass){
        this.pass = pass;
    }

    public static PassTask login(String pass){
        return Tasks.instrumented(PassTask.class, pass);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(PassLogin,isCurrentlyEnabled()).forNoMoreThan(120).seconds());
        PassLogin.resolveFor(actor).sendKeys(pass);
        BotonLogin.resolveFor(actor).click();
    }
}
