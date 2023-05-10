package userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class YourFeedUI {

    public static Target BotonUser = Target.the("Boton User")
            .locatedBy("//android.widget.Button[@content-desc='Tab5, tab, 5 of 5']");

    public static Target LabelLoginFail = Target.the("Logueo no exitoso")
            .locatedBy("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.TextView");

}
