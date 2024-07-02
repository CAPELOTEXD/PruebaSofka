package co.com.sofka.certification.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src\\test\\resources\\features\\Pruebas.feature",
        glue = "co.com.sofka.certification.stepdefinitions"
)
public class Prueba {
}
