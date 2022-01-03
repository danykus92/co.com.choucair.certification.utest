package co.com.choucair.certification.utest.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.choucair.certification.utest.userinterface.UtestSignUpPage.*;

public class RegisterStepFour implements Task {
    private String strPassword;
    private String strConfirmePassword;
    public RegisterStepFour(String strPassword, String strConfirmePassword){
        this.strPassword = strPassword;
        this.strConfirmePassword = strConfirmePassword;

    }
    public static RegisterStepFour the(String strPassword, String strConfirmePassword) {

        return Tasks.instrumented(RegisterStepFour.class, strPassword, strConfirmePassword);
    }
    @Override
    public <T extends Actor> void performAs(T actor){
     actor
         .attemptsTo(
                 Enter.theValue(strPassword).into(INPUT_PASSWORD),
                 Enter.theValue(strConfirmePassword).into(INPUT_CONFIRME_PASSWORD),
                 Click.on(CHECK_STAY),
                 Click.on(CHECK_TERMS),
                 Click.on(CHECK_PRIVACY),
                 Click.on(BUTTON_COMPLETE_SETUP)
                 );
    }

}
