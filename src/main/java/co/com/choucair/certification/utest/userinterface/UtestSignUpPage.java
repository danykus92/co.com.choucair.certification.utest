package co.com.choucair.certification.utest.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;


public class UtestSignUpPage {
    public static final Target INPUT_CITY = Target.the("INPUT ciudad").located(By.id("city"));
    public static final Target INPUT_ZIP = Target.the("INPUT codigo postal").located(By.id("zip"));
    public static final Target BUTTON_NEXT = Target.the("BUTTON siguiente").located(By.xpath("//span[contains(text(),'Next: Devices')]"));
    public static final Target SELECT_COMPUTER = Target.the("SELECT sistema operativo del usuario").located(By.xpath("//div[@id='web-device']//div[1]//div[2]//div"));
    public static final Target INPUT_COMPUTER = Target.the("INPUT sistema operativo del usuario").located(By.xpath("//div[@id='web-device']//div[1]//div[2]//div//input[1]"));
    public static final Target SELECT_VERSION = Target.the("SLECT la version del so").located(By.xpath("//div[@id='web-device']//div[2]//div[2]//div"));
    public static final Target INPUT_VERSION = Target.the("INPUT la version del so").located(By.xpath("//div[@id='web-device']//div[2]//div[2]//div//input[1]"));
    public static final Target LANGUAGE_DEVICE = Target.the("SELECT lenguaje").located(By.xpath("//div[@id='web-device']//div[3]//div[2]//div"));
    public static final Target INPUT_LANGUAGE_DEVICE = Target.the("INPUT lenguaje del equipo").located(By.xpath("//div[@id='web-device']//div[3]//div[2]//div//input[1]"));
    public static final Target MOBIL = Target.the("select el movil").located(By.xpath("//div[@id='mobile-device']//div[1]//div[2]//div"));
    public static final Target INPUT_MOBILE = Target.the("INPUT dispositivo").located(By.xpath("//div[@id='mobile-device']//div[1]//div[2]//div//input[1]"));
    public static final Target SELECT_MODEL = Target.the("select modelo del dispositivo").located(By.xpath("//div[@id='mobile-device']//div[2]//div[2]//div"));
    public static final Target INPUT_MODEL = Target.the("INPUT modelo del dispositivo").located(By.xpath("//div[@id='mobile-device']//div[2]//div[2]//div//input[1]"));
    public static final Target SELECT_SYSTEM = Target.the("SELECT SO del dispositivo").located(By.xpath("//div[@id='mobile-device']//div[3]//div[2]//div"));
    public static final Target INPUT_SYSTEM = Target.the("INPUT SO del dispositivo").located(By.xpath("//div[@id='mobile-device']//div[3]//div[2]//div//input[1]"));
    public static final Target BUTTON_NEXT3 = Target.the("BUTTON siguiente").located(By.xpath("//div[@class='pull-right next-step']//a"));
    public static final Target INPUT_PASSWORD = Target.the("INPUT contraseña").located(By.id("password"));
    public static final Target INPUT_CONFIRME_PASSWORD = Target.the("INPUT confirme contraseña").located(By.id("confirmPassword"));
    public static final Target CHECK_STAY = Target.the("CHECK opcional información").located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[4]/label/span"));
    public static final Target CHECK_TERMS = Target.the("CHECK terminos y condiciones").located(By.id("termOfUse"));
    public static final Target CHECK_PRIVACY = Target.the("CHECK privacidad").located(By.id("privacySetting"));
    public static final Target BUTTON_COMPLETE_SETUP = Target.the("BUTTON completar registro").located(By.id("laddaBtn"));
    public static final Target LABEl_WELCOME= Target.the("BUTTON bienvenido").located(By.id("//*[contains(text(),'Welcome')]"));
}
