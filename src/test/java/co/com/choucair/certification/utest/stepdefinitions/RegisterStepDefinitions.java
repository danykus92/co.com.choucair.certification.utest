package co.com.choucair.certification.utest.stepdefinitions;

import co.com.choucair.certification.utest.questions.Answer;
import co.com.choucair.certification.utest.tasks.*;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;
import java.util.Map;

public class RegisterStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que (.*) se encuentra en el step 1 de registro$")
    public void queDanielSeEncuentraEnLaPlataformaUTest(String strUsuario, List<Map<String, String>> academyChoucairData) throws Exception  {
        OnStage
                .theActorCalled( strUsuario)
                    .wasAbleTo(OpenUp.thePage(),
                            Login.onThePage(academyChoucairData.get(0).get("strName"),
                                            academyChoucairData.get(0).get("strLastName"),
                                            academyChoucairData.get(0).get("strEmail"),
                                            academyChoucairData.get(0).get("strMonth"),
                                            academyChoucairData.get(0).get("strDay"),
                                            academyChoucairData.get(0).get("strYear")));
    }

    @Cuando("^Registre los pasos 2, 3 y 4$")
    public void requieraRegistrarseEnLaPlataforma(List<Map<String, String>> academyChoucairData) throws Exception  {
        OnStage
            .theActorInTheSpotlight()
                .attemptsTo(
                        RegisterStepTwo.the(
                                academyChoucairData.get(0).get("strCity"),
                                academyChoucairData.get(0).get("strZyp"),
                                academyChoucairData.get(0).get("strCountry")),
                        RegisterStepThree.the(
                                academyChoucairData.get(0).get("strLanguage"),
                                academyChoucairData.get(0).get("strMobile"),
                                academyChoucairData.get(0).get("strModel"),
                                academyChoucairData.get(0).get("strOperatingSystem")),
                        RegisterStepFour.the(
                                academyChoucairData.get(0).get("strPassword"),
                                academyChoucairData.get(0).get("strConfirmePassword")));
    }

    @Entonces("^el puede ver en pantalla la informarcion de registro$")
    public void elPuedeVerEnPantallaLaInformarcionDeRegistro(List<Map<String, String>> academyChoucairData) throws Exception  {
        OnStage
            .theActorInTheSpotlight()
                .should(
                        GivenWhenThen
                                .seeThat(
                                        Answer.toThe(academyChoucairData.get(0).get("strVerify"))));
    }
}

















