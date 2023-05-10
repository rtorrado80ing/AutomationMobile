package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static userinterface.YourFeedUI.LabelLoginFail;

public class LogueoNoExitoso implements Question {
    public static LogueoNoExitoso oOps(){
        return new LogueoNoExitoso();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean control;
        int count = 0;
        do{
            control= LabelLoginFail.resolveFor(actor).isVisible();
            if(!control){
                try {
                    Thread.sleep(100);
                    count ++;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }while (!control && count < 30);
        return LabelLoginFail.resolveFor(actor).isVisible();
    }
}

