package co.com.choucair.certification.utest.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static co.com.choucair.certification.utest.userinterface.UtestSignUpPage.*;

public class RegisterStepThree implements Task {
    private String strLanguage;
    private String strMobile;
    private String strModel;
    private String strOperatingSystem;
    public RegisterStepThree(String strLanguage, String strMobile, String strModel, String strOperatingSystem ){
        this.strLanguage = strLanguage;
        this.strMobile = strMobile;
        this.strModel = strModel;
        this.strOperatingSystem = strOperatingSystem;

    }
    public static RegisterStepThree the(String strLanguage, String strMobile, String strModel, String strOperatingSystem) {

        return Tasks.instrumented(RegisterStepThree.class, strLanguage, strMobile, strModel, strOperatingSystem);
    }
    @Override
    public <T extends Actor> void performAs(T actor){
     actor
         .attemptsTo(
                 Click.on(SELECT_COMPUTER),
                 Enter.theValue("Windows").into(INPUT_COMPUTER),
                 Click.on(SELECT_VERSION),
                 Enter.theValue("10").into(INPUT_VERSION),
                 Click.on(LANGUAGE_DEVICE),
                 Enter.theValue(strLanguage).into(INPUT_LANGUAGE_DEVICE),
                 Click.on(MOBIL),
                 Enter.theValue(strMobile+ Keys.ENTER).into(INPUT_MOBILE),
                 Click.on(SELECT_MODEL),
                 Enter.theValue(strModel + Keys.ENTER).into(INPUT_MODEL),
                 Click.on(SELECT_SYSTEM),
                 Enter.theValue(strOperatingSystem+ Keys.ENTER).into(INPUT_SYSTEM),
                 Click.on(BUTTON_NEXT3)
                 );
    }

}
