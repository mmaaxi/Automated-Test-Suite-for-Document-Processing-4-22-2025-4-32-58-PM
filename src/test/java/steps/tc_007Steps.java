package steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc_007Page;

public class tc_007Steps {
    WebDriver driver = new ChromeDriver();
    tc_007Page page = new tc_007Page(driver);

    @Given("el usuario está en la página de procesamiento de documentos")
    public void el_usuario_está_en_la_página_de_procesamiento_de_documentos() {
        page.navigateToDocumentProcessingPage();
    }

    @When("el usuario sube un archivo corrupto")
    public void el_usuario_sube_un_archivo_corrupto() {
        page.uploadCorruptFile();
    }

    @Then("el sistema detecta el fallo")
    public void el_sistema_detecta_el_fallo() {
        page.verifyErrorDetection();
    }

    @Then("el sistema notifica el error al Bróker")
    public void el_sistema_notifica_el_error_al_bróker() {
        page.verifyErrorNotificationToBroker();
    }

    @Then("el sistema finaliza el procesamiento")
    public void el_sistema_finaliza_el_procesamiento() {
        page.verifyProcessTermination();
    }
}