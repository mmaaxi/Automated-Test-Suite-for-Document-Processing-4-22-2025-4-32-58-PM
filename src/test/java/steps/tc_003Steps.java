package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_003Page;

public class tc_003Steps {
    tc_003Page page = new tc_003Page();

    @Given("the user is on the file upload page")
    public void the_user_is_on_the_file_upload_page() {
        page.navigateToUploadPage();
    }

    @When("the user attempts to upload a file with an invalid format or size exceeding 50 MB")
    public void the_user_attempts_to_upload_a_file_with_invalid_format_or_exceeded_size() {
        page.uploadFile("path/to/invalid/or/large/file");
    }

    @Then("the system displays an error message indicating invalid format or size exceeded")
    public void the_system_displays_an_error_message() {
        Assert.assertTrue(page.isErrorMessageDisplayed());
    }
}