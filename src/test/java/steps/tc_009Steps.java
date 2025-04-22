package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.tc_009Page;

public class tc_009Steps {

    tc_009Page page = new tc_009Page();

    @Given("estoy en la página de carga de archivos")
    public void estoy_en_la_pagina_de_carga_de_archivos() {
        page.navigateToFileUploadPage();
    }

    @When("subo un archivo de {int} MB")
    public void subo_un_archivo_de_MB(int size) {
        page.uploadFile(size);
    }

    @Then("el tiempo de carga y procesamiento es inferior a {int} segundo")
    public void el_tiempo_de_carga_y_procesamiento_es_inferior_a_segundo(int tiempoLimite) {
        long tiempoDeProceso = page.getProcessingTime();
        Assert.assertTrue("El tiempo de procesamiento es mayor de lo esperado", tiempoDeProceso < tiempoLimite * 1000);
    }
}