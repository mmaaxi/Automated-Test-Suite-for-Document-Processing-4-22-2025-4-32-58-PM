package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_007Page {
    WebDriver driver;
    By uploadField = By.id("uploadFieldId");
    By errorMessage = By.id("errorMessageId");
    By brokerNotification = By.id("brokerNotificationId");
    By processStatus = By.id("processStatusId");

    public tc_007Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToDocumentProcessingPage() {
        driver.get("https://example.com/document-processing");
    }

    public void uploadCorruptFile() {
        driver.findElement(uploadField).sendKeys("/path/to/corrupt/file");
    }

    public void verifyErrorDetection() {
        String message = driver.findElement(errorMessage).getText();
        assert message.contains("Error: Archivo corrupto detectado");
    }

    public void verifyErrorNotificationToBroker() {
        String notification = driver.findElement(brokerNotification).getText();
        assert notification.contains("Error notificado al Bróker");
    }

    public void verifyProcessTermination() {
        String status = driver.findElement(processStatus).getText();
        assert status.equals("Procesamiento finalizado");
    }
}