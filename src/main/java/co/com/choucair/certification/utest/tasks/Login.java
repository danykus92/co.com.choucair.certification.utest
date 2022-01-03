package co.com.choucair.certification.utest.tasks;

import co.com.choucair.certification.utest.userinterface.UtestHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static co.com.choucair.certification.utest.userinterface.UtestHomePage.*;

public class Login implements Task {
    private  String strUser;
    private  String strPassword;
    private String strDay;
    private String strMonth;
    private String strYear;
    private String strEmail;

    public Login(String strUser, String strPassword, String strEmail, String strMonth, String strDay, String strYear) {
        this.strUser = strUser;
        this.strPassword = strPassword;
        this.strEmail = strEmail;
        this.strDay = strDay;
        this.strMonth = strMonth;
        this.strYear = strYear;
    }

    public static Performable onThePage(String strUser, String strPassword, String strEmail, String strMonth, String strDay, String strYear) {
        return Tasks.instrumented(Login.class,strUser,strPassword, strEmail, strMonth, strDay, strYear);
    }
    @Override
    public  <T extends Actor> void performAs (T actor){
        actor.attemptsTo(Click.on(JOIN_TODAY_BUTTON),
                Enter.theValue(strUser).into(INPUT_USER),
                Enter.theValue(strPassword).into(INPUT_PASSWORD),
                Enter.theValue(strEmail).into(INPUT_EMAIL),
                Click.on(SELECT_MONTH),
                SelectFromOptions.byVisibleText(strMonth).from(SELECT_MONTH),
                Click.on(SELECT_DAY),
                SelectFromOptions.byVisibleText(strDay).from(SELECT_DAY),
                Click.on(SELECT_YEAR),
                SelectFromOptions.byVisibleText(strYear).from(SELECT_YEAR),
                Click.on(UtestHomePage.NEXT_BUTTON)
        );
    }
}