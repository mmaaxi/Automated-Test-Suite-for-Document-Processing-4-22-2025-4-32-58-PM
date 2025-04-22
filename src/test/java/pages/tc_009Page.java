package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class tc_009Page {

    private WebDriver driver;

    @FindBy(id = "uploadField")
    private WebElement uploadField;

    public tc_009Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void navigateToFileUploadPage() {
        driver.get("http://example.com/file-upload");
    }

    public void uploadFile(int fileSizeMB) {
        String filePath = generateFile(fileSizeMB);
        long startTime = System.currentTimeMillis();
        uploadField.sendKeys(filePath);
        // Assumes some form of processing indicator to wait for completion
        waitForProcessingToComplete();
    }

    private String generateFile(int sizeMB) {
        // Logic to generate a temporary file of the specified size
        return "/path/to/generated/file";
    }

    private void waitForProcessingToComplete() {
        // Logic to wait until a file is fully processed and ready
    }

    public long getProcessingTime() {
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }
}