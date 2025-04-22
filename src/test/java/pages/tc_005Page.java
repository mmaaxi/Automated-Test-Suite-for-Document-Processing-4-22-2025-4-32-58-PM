package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_005Page {

    private WebDriver driver;
    private By uploadButton = By.id("uploadButton");
    private By errorMessage = By.id("errorMessage");

    public tc_005Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToUploadPage() {
        driver.get("http://example.com/upload");
    }

    public void startUploadWithoutMandatoryDocument() {
        driver.findElement(uploadButton).click();
    }

    public String getErrorMessage() {
        WebElement error = driver.findElement(errorMessage);
        return error.isDisplayed() ? error.getText() : "";
    }
}