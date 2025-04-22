package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

public class tc_004Page {

    WebDriver driver;
    WebDriverWait wait;

    By cargaArchivoInput = By.id("input-carga-archivo");
    By listaDocumentos = By.id("lista-documentos");

    public tc_004Page(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void irAPaginaDeCarga() {
        driver.get("https://example.com/carga-archivos");
    }

    public void subirArchivoComprimido(String filePath) {
        WebElement uploadElement = driver.findElement(cargaArchivoInput);
        uploadElement.sendKeys(filePath);
    }

    public boolean verificarDescompresionExitosa() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(listaDocumentos));
        List<WebElement> documentos = driver.findElements(listaDocumentos);
        return !documentos.isEmpty();
    }

    public boolean verificarListaDeDocumentos() {
        List<WebElement> documentos = driver.findElements(listaDocumentos);
        // Aquí puede agregarse validación adicional sobre los elementos de la lista
        return documentos.size() > 0;
    }
}