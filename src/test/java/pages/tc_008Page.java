package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class tc_008Page {

    WebDriver driver;

    @FindBy(xpath = "//*[@id='uploadButton']")
    private WebElement uploadButton;

    @FindBy(className = "file-preview")
    private List<WebElement> filePreviews;

    @FindBy(className = "delete-button")
    private WebElement deleteButton;

    public tc_008Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void uploadDocuments() {
        uploadButton.sendKeys("path/to/document");
    }

    public boolean isFilePreviewDisplayed() {
        for (WebElement preview : filePreviews) {
            if (!preview.isDisplayed()) {
                return false;
            }
        }
        return true;
    }

    public void deleteFile() {
        deleteButton.click();
    }

    public boolean isFileDeleted() {
        return !driver.findElement(By.className("deleted-file")).isDisplayed();
    }
}