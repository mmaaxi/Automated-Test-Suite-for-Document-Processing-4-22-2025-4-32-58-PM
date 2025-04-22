package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_006Page {
    WebDriver driver;

    private By uploadPageIndicator = By.id("upload-page-indicator");
    private By structuredUploadButton = By.id("upload-structured");
    private By unstructuredUploadButton = By.id("upload-unstructured");
    private By ocrProcessingIndicator = By.id("ocr-processing");
    private By dataExtractionIndicator = By.id("data-extraction");
    private By confirmationDisplay = By.id("confirmation-display");

    public tc_006Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToUploadPage() {
        driver.get("http://example.com/upload");
    }

    public void uploadStructuredDocument(String filePath) {
        driver.findElement(structuredUploadButton).sendKeys(filePath);
    }

    public void uploadUnstructuredDocument(String filePath) {
        driver.findElement(unstructuredUploadButton).sendKeys(filePath);
    }

    public boolean isOCRProcessingDisplayed() {
        return driver.findElement(ocrProcessingIndicator).isDisplayed();
    }

    public boolean isDataExtracted() {
        return driver.findElement(dataExtractionIndicator).isDisplayed();
    }

    public boolean isConfirmationDisplayed() {
        return driver.findElement(confirmationDisplay).isDisplayed();
    }
}