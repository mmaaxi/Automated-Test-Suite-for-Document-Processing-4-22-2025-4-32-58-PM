package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;
import pages.tc_004Page;

public class tc_004Steps {

    tc_004Page page = new tc_004Page();

    @Given("el usuario está en la página de carga de archivos")
    public void usuarioEnPaginaDeCarga() {
        page.irAPaginaDeCarga();
    }

    @When("el usuario sube un archivo comprimido")
    public void usuarioSubeArchivoComprimido() {
        page.subirArchivoComprimido("ruta/del/archivo/archivo.zip");
    }

    @Then("el sistema debería descomprimir el archivo")
    public void validarDescompresion() {
        boolean descompresionExitosa = page.verificarDescompresionExitosa();
        assertTrue("La descompresión no fue exitosa", descompresionExitosa);
    }

    @Then("el sistema debería listar los documentos descomprimidos para validación")
    public void validarListaDeDocumentos() {
        boolean listaDocumentosCorrecta = page.verificarListaDeDocumentos();
        assertTrue("La lista de documentos no es correcta", listaDocumentosCorrecta);
    }
}