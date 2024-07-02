package co.com.sofka.certification.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.CoreMatchers.equalTo;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import io.cucumber.datatable.DataTable;

import net.serenitybdd.screenplay.actors.OnStage;
import org.junit.Before;


public class PruebasStepdefinition {

    @Before
    public void Begin() {
        OnStage.theActorCalled("Gustavo");
    }
    private String apiUrl;
    private Map<String, String> userData = new HashMap<>();

    private List<Integer> userIds;

    @Given("la API está disponible en {string}")
    public void laApiEstaDisponibleEn(String url) {
        this.apiUrl = url;
    }

    @When("hago una petición GET al endpoint {string}")
    public void hagoUnaPeticionGETAlEndpoint(String endpoint) {
           SerenityRest.given().baseUri(apiUrl).get(endpoint);
    }

    @Then("el código de respuesta es {int}")
    public void elCodigoDeRespuestaEs(int statusCode) {
        SerenityRest.then().statusCode(statusCode);
    }

    @Then("el nombre del usuario es {string}")
    public void elNombreDelUsuarioEs(String name) {
        SerenityRest.then().body("data.first_name", equalTo(name));
    }

    @Then("la lista de usuarios no está vacía")
    public void laListaDeUsuariosNoEstaVacia() {
        SerenityRest.then().body("data", is(not(empty())));
    }

    @And("tengo los nuevos datos del usuario")
    public void tengoLosNuevosDatosDelUsuario(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        userData = data.get(0);
    }
    @When("hago una petición PUT al endpoint {string} con los nuevos datos")
    public void hagoUnaPeticionPUTAlEndpointConLosNuevosDatos(String endpoint) {
        SerenityRest.given()
                .baseUri(apiUrl)
                .contentType("application/json")
                .body(userData)
                .put(endpoint);
    }

    @Then("el nombre actualizado del usuario es {string}")
    public void elNombreActualizadoDelUsuarioEs(String name) {
        SerenityRest.then().body("name", equalTo(name));
    }

    @Then("el trabajo actualizado del usuario es {string}")
    public void elTrabajoActualizadoDelUsuarioEs(String job) {
        SerenityRest.then().body("job", equalTo(job));
    }

    @When("hago una petición DELETE al endpoint {string}")
    public void hagoUnaPeticionDELETEAlEndpoint(String endpoint) {
        SerenityRest.given().baseUri(apiUrl).delete(endpoint);
    }

    @Then("el usuario con id {int} no se encuentra en la lista")
    public void elUsuarioConIdNoSeEncuentraEnLaLista(int userId) {
        SerenityRest.then().body("data.id", not(hasItem(userId)));
    }


}
