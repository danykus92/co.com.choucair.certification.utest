package co.com.choucair.certification.utest.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static co.com.choucair.certification.utest.userinterface.UtestSignUpPage.*;

public class RegisterStepTwo implements Task {
    private String strCity;
    private String strZyp;
    private String strCountry;
    public RegisterStepTwo(String strCity, String strZyp, String strCountry){
        this.strCity = strCity;
        this.strZyp = strZyp;
        this.strCountry = strCountry;

    }
    public static RegisterStepTwo the(String strCity, String strZyp, String strCountry) {

        return Tasks.instrumented(RegisterStepTwo.class,strCity, strZyp, strCountry);
    }
    @Override
    public <T extends Actor> void performAs(T actor){
     actor
         .attemptsTo(
             Enter.theValue(strCity).into(INPUT_CITY),
                    Enter.theValue(strZyp).into(INPUT_ZIP),
                    Click.on(BUTTON_NEXT));
    }

}
