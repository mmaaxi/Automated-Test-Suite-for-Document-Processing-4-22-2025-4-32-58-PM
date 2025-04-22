package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_005Page;

public class tc_005Steps {

    tc_005Page page = new tc_005Page();

    @Given("el usuario está en la página de carga de documentos")
    public void el_usuario_está_en_la_página_de_carga_de_documentos() {
        page.navigateToUploadPage();
    }

    @When("intenta iniciar el proceso de carga sin el documento obligatorio")
    public void intenta_iniciar_el_proceso_de_carga_sin_el_documento_obligatorio() {
        page.startUploadWithoutMandatoryDocument();
    }

    @Then("el sistema debe impedir avanzar y mostrar un mensaje de error indicando el documento faltante")
    public void el_sistema_debe_impedir_avanzar_y_mostrar_un_mensaje_de_error_indicando_el_documento_faltante() {
        String expectedErrorMessage = "Falta un documento obligatorio.";
        Assert.assertEquals(expectedErrorMessage, page.getErrorMessage());
    }
}