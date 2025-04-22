package steps;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_006Page;
import static org.junit.Assert.assertTrue;

public class tc_006Steps {
    WebDriver driver;
    tc_006Page page;

    @Given("the user is on the document upload page")
    public void the_user_is_on_the_document_upload_page() {
        page = new tc_006Page(driver);
        page.navigateToUploadPage();
    }

    @When("the user uploads structured and unstructured documents")
    public void the_user_uploads_documents() {
        page.uploadStructuredDocument("path/to/structured/document");
        page.uploadUnstructuredDocument("path/to/unstructured/document");
    }

    @Then("the system processes the documents with OCR")
    public void the_system_processes_with_ocr() {
        assertTrue(page.isOCRProcessingDisplayed());
    }

    @Then("extracts data")
    public void extracts_data() {
        assertTrue(page.isDataExtracted());
    }

    @Then("displays information for confirmation")
    public void displays_information_for_confirmation() {
        assertTrue(page.isConfirmationDisplayed());
    }
}