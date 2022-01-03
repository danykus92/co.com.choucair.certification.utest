package co.com.choucair.certification.utest.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/register.feature",
        tags = "@registro",
        glue = "co.com.choucair.certification.utest.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE)
public class RunnerTags {


}
