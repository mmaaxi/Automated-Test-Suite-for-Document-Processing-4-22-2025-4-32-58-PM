package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_002Page;

public class tc_002Steps {
    WebDriver driver;
    tc_002Page uploadPage;

    @Given("I am on the file upload page")
    public void i_am_on_the_file_upload_page() {
        // Initialize the web driver and navigate to the file upload page
        driver = Setup.getDriver();
        uploadPage = PageFactory.initElements(driver, tc_002Page.class);
        driver.get("http://example.com/upload");
    }

    @When("I select a file in PDF/DOCX format within the limit of 50 MB")
    public void i_select_a_file_in_pdf_docx_format_within_limit() {
        // Use the page object model to select a file within the specified criteria
        uploadPage.uploadFile("validFile.pdf"); // Ensure validFile.pdf is a compatible file
    }

    @Then("the file should be uploaded and the preview should display the file name, size, and type")
    public void file_upload_preview_validation() {
        // Verify if the uploaded file's details are displayed correctly
        assert(uploadPage.isPreviewDisplayed());
        assert(uploadPage.getFileName().equals("validFile.pdf"));
        assert(uploadPage.getFileSize() < 50 * 1024 * 1024); // Less than 50 MB
        assert(uploadPage.getFileType().equals("PDF"));
    }
}