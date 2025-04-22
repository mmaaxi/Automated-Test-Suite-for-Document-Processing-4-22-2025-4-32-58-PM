package steps;

import pages.tc_010Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.assertTrue;

public class tc_010Steps {

    tc_010Page page = new tc_010Page();

    @Given("^El usuario ha iniciado sesión y está en la página de solicitudes$")
    public void elUsuarioHaIniciadoSesionYEstaEnLaPaginaDeSolicitudes() {
        page.navigateToSolicitudesPage();
    }

    @When("^El usuario carga los documentos necesarios$")
    public void elUsuarioCargaLosDocumentosNecesarios() {
        page.uploadDocuments();
    }

    @When("^El usuario inicia el procesamiento de los documentos$")
    public void elUsuarioIniciaElProcesamientoDeLosDocumentos() {
        page.processDocuments();
    }

    @Then("^El sistema genera el 'Slip de salida'$")
    public void elSistemaGeneraElSlipDeSalida() {
        assertTrue(page.isSlipGenerated());
    }

    @Then("^El sistema guarda los documentos originales en el historial de la solicitud$")
    public void elSistemaGuardaLosDocumentosOriginalesEnElHistorialDeLaSolicitud() {
        assertTrue(page.areOriginalDocumentsStored());
    }

    @Then("^El sistema guarda los datos extraídos en el historial de la solicitud$")
    public void elSistemaGuardaLosDatosExtraidosEnElHistorialDeLaSolicitud() {
        assertTrue(page.areExtractedDataStored());
    }
}