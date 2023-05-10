package stepdefinitions;

import interactions.Salir;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.BotonUsuarioVisible;
import questions.LogueoNoExitoso;
import tasks.PassTask;
import tasks.UserTask;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class LoginSD {

    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Prueba");
        OnStage.theActorInTheSpotlight().attemptsTo(Salir.salir());
    }

        @Given("^el usuario puede ingresar el username '(.*)'$")
        public void elUsuarioPuedeIngresarElUsername(String user){
            OnStage.theActorInTheSpotlight().attemptsTo(UserTask.login(user));
        }

    @When("^el usuario puede ingresar el password '(.*)'$")
    public void elUsuarioPuedeIngresarElPassword(String pass) {
        OnStage.theActorInTheSpotlight().attemptsTo(PassTask.login(pass));
    }

    @Then("el usuario se loguea exitosamente")
    public void elUsuarioSeLogueaExitosamente() {
        OnStage.theActorInTheSpotlight().should(seeThat(BotonUsuarioVisible.esVisible(), equalTo(true)));
    }


    @Then("el usuario No se loguea exitosamente")
    public void elUsuarioNoSeLogueaExitosamente() {
        OnStage.theActorInTheSpotlight().should(seeThat(LogueoNoExitoso.oOps(), equalTo(true)));
    }
}
