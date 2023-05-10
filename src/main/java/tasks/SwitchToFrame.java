package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;

public class SwitchToFrame implements Task {

    private final String target;

    public SwitchToFrame(String target) {
        this.target = target;
    }

    public static Performable withTarget(String target) {
        return new SwitchToFrame(target);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        driver.switchTo().frame(target);
    }


}