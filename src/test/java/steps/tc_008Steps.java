package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.tc_008Page;
import org.junit.Assert;

public class tc_008Steps {
    tc_008Page page = new tc_008Page();

    @Given("I upload documents")
    public void i_upload_documents() {
        page.uploadDocuments();
    }

    @Then("I should see a preview showing the name, size, and type of each file")
    public void i_should_see_a_preview_showing_the_name_size_and_type_of_each_file() {
        Assert.assertTrue(page.isFilePreviewDisplayed());
    }

    @When("I delete one of the files using the delete option")
    public void i_delete_one_of_the_files_using_the_delete_option() {
        page.deleteFile();
    }

    @Then("the deleted file should be removed from the list before confirmation")
    public void the_deleted_file_should_be_removed_from_the_list_before_confirmation() {
        Assert.assertTrue(page.isFileDeleted());
    }
}