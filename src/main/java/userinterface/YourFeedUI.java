package userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class YourFeedUI {

    public static Target Label = Target.the("Label en your feed")
            .locatedBy("//*[contains(text(),'No articles are here')]");

}
