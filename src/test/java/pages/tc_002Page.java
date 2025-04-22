package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class tc_002Page {
    WebDriver driver;

    By fileInput = By.id("fileUpload");
    By previewSection = By.id("previewSection");
    By fileNameElement = By.id("fileName");
    By fileSizeElement = By.id("fileSize");
    By fileTypeElement = By.id("fileType");

    public tc_002Page(WebDriver driver) {
        this.driver = driver;
    }

    public void uploadFile(String filePath) {
        driver.findElement(fileInput).sendKeys(filePath);
    }

    public boolean isPreviewDisplayed() {
        return driver.findElement(previewSection).isDisplayed();
    }

    public String getFileName() {
        return driver.findElement(fileNameElement).getText();
    }

    public long getFileSize() {
        String sizeText = driver.findElement(fileSizeElement).getText();
        return Long.parseLong(sizeText); // Assumes size is returned in bytes
    }

    public String getFileType() {
        return driver.findElement(fileTypeElement).getText();
    }
}