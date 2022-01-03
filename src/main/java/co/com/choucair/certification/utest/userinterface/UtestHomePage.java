package co.com.choucair.certification.utest.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;


public class UtestHomePage {
    public static final Target JOIN_TODAY_BUTTON = Target.the("BUTTON registro").located(By.xpath("//a[contains(text(),'Join Today')]"));
    public static final Target INPUT_USER = Target.the("INPUT nombre del usuario").located(By.id("firstName"));
    public static final Target INPUT_PASSWORD = Target.the("INPUT contraseña").located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("INPUT email").located(By.id("email"));
    public static final Target SELECT_MONTH = Target.the("SELECT mes").located(By.id("birthMonth"));
    public static final Target SELECT_DAY = Target.the("SELECT dia").located(By.id("birthDay"));
    public static final Target SELECT_YEAR = Target.the("SELECT año").located(By.id("birthYear"));
    public static final Target NEXT_BUTTON = Target.the("BUTTON siguiente").located(By.xpath("//span[contains(text(),'Next: Location')]"));


}
