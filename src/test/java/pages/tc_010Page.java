package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_010Page {

    WebDriver driver;

    By solicitudesPageLocator = By.id("solicitudesPage");
    By uploadButtonLocator = By.id("uploadButton");
    By processButtonLocator = By.id("processButton");
    By slipGeneratedMessageLocator = By.id("slipGeneratedMessage");
    By documentsStoredMessageLocator = By.id("documentsStoredMessage");
    By dataStoredMessageLocator = By.id("dataStoredMessage");

    public tc_010Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToSolicitudesPage() {
        driver.findElement(solicitudesPageLocator).click();
    }

    public void uploadDocuments() {
        driver.findElement(uploadButtonLocator).click();
    }

    public void processDocuments() {
        driver.findElement(processButtonLocator).click();
    }

    public boolean isSlipGenerated() {
        return driver.findElement(slipGeneratedMessageLocator).isDisplayed();
    }

    public boolean areOriginalDocumentsStored() {
        return driver.findElement(documentsStoredMessageLocator).isDisplayed();
    }

    public boolean areExtractedDataStored() {
        return driver.findElement(dataStoredMessageLocator).isDisplayed();
    }
}