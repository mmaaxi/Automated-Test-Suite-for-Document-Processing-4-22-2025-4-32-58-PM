package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_003Page {
    WebDriver driver;

    // Constructor to initialize WebDriver
    public tc_003Page(WebDriver driver) {
        this.driver = driver;
    }

    // Navigate to upload page
    public void navigateToUploadPage() {
        driver.get("http://example.com/file-upload");
    }

    // Upload a file with invalid format or size
    public void uploadFile(String filePath) {
        WebElement uploadButton = driver.findElement(By.id("uploadButton"));
        uploadButton.sendKeys(filePath);
    }

    // Check if error message is displayed
    public boolean isErrorMessageDisplayed() {
        try {
            WebElement errorMessage = driver.findElement(By.id("error"));
            return errorMessage.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}