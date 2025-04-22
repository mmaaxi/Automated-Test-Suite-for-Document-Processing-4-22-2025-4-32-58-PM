package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc_001Page;
import io.cucumber.java.en.*;

public class tc_001Steps {

    WebDriver driver;
    tc_001Page page;

    public tc_001Steps() {
        this.driver = Hook.driver;
        page = PageFactory.initElements(driver, tc_001Page.class);
    }

    @Given("I am on the document upload page")
    public void i_am_on_the_document_upload_page() {
        driver.get("http://example.com/upload");
    }

    @When("I select the option to 'cargar documentos'")
    public void i_select_the_option_to_cargar_documentos() {
        page.clickUploadDocumentsOption();
    }

    @Then("the system should display options for 'carga única' and 'carga múltiple'")
    public void the_system_should_display_options_for_carga_unica_and_carga_multiple() {
        page.verifyUploadOptionsDisplayed();
    }

    @When("I choose 'carga en un solo archivo'")
    public void i_choose_carga_en_un_solo_archivo() {
        page.selectSingleFileUpload();
    }

    @Then("a single upload box should be enabled for the file")
    public void a_single_upload_box_should_be_enabled_for_the_file() {
        page.verifySingleUploadBoxEnabled();
    }

    @When("I choose 'cargar documentos por separado'")
    public void i_choose_cargar_documentos_por_separado() {
        page.selectMultipleFileUpload();
    }

    @Then("multiple upload boxes should be displayed for each required document")
    public void multiple_upload_boxes_should_be_displayed_for_each_required_document() {
        page.verifyMultipleUploadBoxesDisplayed();
    }
}