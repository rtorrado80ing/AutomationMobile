package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyEnabled;
import static userinterface.LoginUI.BotonSalir;
import static userinterface.LoginUI.UsuarioLogin;

public class UserTask implements Task {

    String user;
    public UserTask(String user){
        this.user = user;
    }

    public static UserTask login(String user){
        return Tasks.instrumented(UserTask.class, user);
        }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(UsuarioLogin,isCurrentlyEnabled()).forNoMoreThan(120).seconds());
            UsuarioLogin.resolveFor(actor).sendKeys(user);

    }
}
