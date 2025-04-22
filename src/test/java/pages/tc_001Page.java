package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_001Page{

    WebDriver driver;

    By uploadDocumentsOption = By.id("upload-docs-option");
    By singleFileUploadOption = By.id("single-upload-option");
    By multipleFileUploadOption = By.id("multiple-upload-option");
    By singleUploadBox = By.id("single-upload-box");
    By multipleUploadBoxes = By.className("multi-upload-box");

    public tc_001Page(WebDriver driver) {
        this.driver = driver;
    }

    public void clickUploadDocumentsOption() {
        driver.findElement(uploadDocumentsOption).click();
    }

    public void verifyUploadOptionsDisplayed() {
        driver.findElement(singleFileUploadOption).isDisplayed();
        driver.findElement(multipleFileUploadOption).isDisplayed();
    }

    public void selectSingleFileUpload() {
        driver.findElement(singleFileUploadOption).click();
    }

    public void verifySingleUploadBoxEnabled() {
        WebElement uploadBox = driver.findElement(singleUploadBox);
        assert uploadBox.isDisplayed() && uploadBox.isEnabled();
    }

    public void selectMultipleFileUpload() {
        driver.findElement(multipleFileUploadOption).click();
    }

    public void verifyMultipleUploadBoxesDisplayed() {
        assert driver.findElements(multipleUploadBoxes).size() > 0;
    }
}