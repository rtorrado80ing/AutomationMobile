package stepdefinitions;

import interactions.Salir;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.PassTask;
import tasks.UserTask;

public class LoginSD {

    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Prueba");
    }

        @Given("^el usuario puede ingresar el username '(.*)'$")
        public void elUsuarioPuedeIngresarElUsername(String user){
            System.out.println("llega aqui?S");
            OnStage.theActorInTheSpotlight().attemptsTo(Salir.salir(),
                UserTask.login(user));
        }

    @When("el usuario puede ingresar el password '(.*)'")
    public void elUsuarioPuedeIngresarElPassword(String pass) {
        OnStage.theActorInTheSpotlight().attemptsTo(PassTask.login(pass));
    }

    @Then("el usuario se loguea exitosamente")
    public void elUsuarioSeLogueaExitosamente() {
    }


}
