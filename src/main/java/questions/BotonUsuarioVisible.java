package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static userinterface.YourFeedUI.BotonUser;

public class BotonUsuarioVisible implements Question {
    public static BotonUsuarioVisible esVisible(){
        return new BotonUsuarioVisible();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean control;
        int count = 0;
        do{
            control= BotonUser.resolveFor(actor).isVisible();
            if(!control){
                try {
                    Thread.sleep(100);
                    count ++;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }while (!control && count < 30);
        return BotonUser.resolveFor(actor).isVisible();
    }
}
