package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import static userinterface.LoginUI.PassLogin;

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
        PassLogin.resolveFor(actor).sendKeys(pass);
    }
}
