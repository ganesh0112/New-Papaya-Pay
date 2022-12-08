package stepDefinitions;

import common.BasePage;
import common.Utilities;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page_objects.components.CustomButton;
import page_objects.components.Dataviewer;
import page_objects.pages.Home;
import page_objects.pages.Settings;
import page_objects.pages.SitePages;

import java.util.List;
import java.util.Map;


public class CustomButtonStepDefinitions extends BasePage {
    static int size;
    static List<Map<String, String>> customButtonFields;
    private String buttonID;
    private String buttonTitle;
    private String buttonURL;
    private String buttonDescription;
    private String window;

    @Given("Navigate to custom button through BPA Settings")
    public void navigate_to_custom_button_through_bpa_settings() {
        getInstance(Home.class).goToBPASettings();
        getInstance(Settings.class).clickOnCustomButton();
//        getInstance(Settings.class).clickOnNewButton();
    }

    @And("Click on Delete Icon to delete the addded custom button")
    public void click_on_delete_icon_to_delete_the_addded_custom_button() {
        getInstance(CustomButton.class).deleteCustomButton();
    }

    @When("^Click on New Button and fill mandatory custom button fields$")
    public void click_on_new_button_and_fill_mandatory_custom_button_fields(DataTable newCustomButton) {
        List<List<String>> data = newCustomButton.asLists(String.class);
        getInstance(CustomButton.class).addNewCustomButton(data.get(0).get(0), data.get(0).get(1), data.get(0).get(2), data.get(0).get(3), data.get(0).get(4));
    }

    @When("Click on New Button and fill mandatory custom button fields as {string}, {string}, {string}, {string}, {string}")
    public void click_on_new_button_and_fill_mandatory_custom_button_fields_as(String buttonID, String buttonTitle, String buttonURL, String buttonDescription, String window) {
        this.buttonID = buttonID;
        this.buttonTitle = buttonTitle;
        this.buttonURL = buttonURL;
        this.buttonDescription = buttonDescription;
        this.window = window;
        getInstance(CustomButton.class).addNewCustomButton(this.buttonID, this.buttonTitle, this.buttonURL, this.buttonDescription, this.window );
    }


    @Then("^Verify Custom Button created successfully\\.$")
    public void verifyCustomButtonCreatedSuccessfully() {
        getInstance(CustomButton.class).verifyCustomButtonConfiguredInDataviewer();
    }

    @Given("^Create web part page to test Custom Button$")
    public void createWebPartPageToTestCustomButton() {
        getInstance(SitePages.class).addSitePage("TestCustomButton");
        getInstance(SitePages.class).addWebPart("BPA DataViewer");
        getInstance(SitePages.class).editWebPart();
    }

    @Then("^edit Added Web Part$")
    public void editAddedWebPart() {
        getInstance(SitePages.class).editAddedWebPart();
        getInstance(Dataviewer.class).selectCustomButton();
    }

    @Then("^verify clicking on custom button URL opens in same window$")
    public void verifyClickingOnCustomButtonURLOpensInSameWindow() {
        getInstance(CustomButton.class).verifyCustomButtonURLOpensInSameWindow();
    }

    @Then("data Viewer Configuration for Custom Button")
    public void data_viewer_configuration_for_custom_button(DataTable  dvDetails) {
        List<List<String>> data = dvDetails.asLists(String.class);
        getInstance(Dataviewer.class).configureDataviewerForCustomButtonContactList(data.get(0).get(0),data.get(0).get(1),data.get(0).get(2),data.get(0).get(3));
    }

    @Then("^Configure data Viewer$")
    public void configure_data_Viewer(DataTable dvDetails) {
        List<List<String>> data = dvDetails.asLists(String.class);
        getInstance(Dataviewer.class).configureDataviewerForCustomButton(data.get(0).get(0),data.get(0).get(1),data.get(0).get(2),data.get(0).get(3));
    }

    @Then("^republish the page$")
    public void republish_the_page() throws Throwable {
        getInstance(SitePages.class).republish();
        Utilities.sleep(3000);
    }

    @Then("^verify configured \"([^\"]*)\" with custom button$")
    public void verifyConfiguredWithCustomButton(String url)  {
        getInstance(CustomButton.class).verifyCurrentURLisSameAsConfiguredWithCustomButton(url);
    }

    @Then("^Click on Edit Icon present in BPASettings Page$")
    public void clickOnEditIconPresentInBPASettingsPage() {
        getInstance(Home.class).goToBPASettings();
        getInstance(Settings.class).clickOnCustomButton();
        getInstance(CustomButton.class).clickEditButton();
    }

    @When("check the Button Icon and change it")
    public void check_the_button_icon_and_change_it() {
        getInstance(CustomButton.class).changeCustomButtonIcon();
    }

    @Then("check on DV whether it has been edited")
    public void check_on_dv_whether_it_has_been_edited() {
        getInstance(SitePages.class).openTestCustomButtonPage();
        getInstance(CustomButton.class).verifyCustomButtonIconEdited();
    }


    @When("^buttonId field is removed and click Save$")
    public void buttonIdFieldIsRemovedAndClickSave() {
        getInstance(CustomButton.class).editButtonId();
    }

    @Then("^Error message should display as The option Button ID is required$")
    public void errorMessageShouldDisplayAsTheOptionButtonIDIsRequired() {
        getInstance(CustomButton.class).verifyButtonIdMandatory();
    }

    @When("^buttonTitle field is removed and click Save$")
    public void buttonTitleFieldIsRemovedAndClickSave() {
        getInstance(CustomButton.class).editButtonTitle();
    }

    @Then("^Error message should display as The option Button Title is required$")
    public void errorMessageShouldDisplayAsTheOptionButtonTitleIsRequired() {
        getInstance(CustomButton.class).verifyButtonTitleMandatory();
    }

    @When("^buttonURL field is removed and click Save$")
    public void buttonUrlFieldIsRemovedAndClickSave() {
        getInstance(CustomButton.class).editButtonURL();
    }

    @Then("^Error message should display as The option Button URL is required$")
    public void errorMessageShouldDisplayAsTheOptionButtonURLIsRequired() {
        getInstance(CustomButton.class).verifyButtonURLMandatory();
    }

    @Then("^check for New Window option and Save the edited button$")
    public void checkForNewWindowOptionAndSaveTheEditedButton() {
        getInstance(CustomButton.class).selectNewWindow();
    }

    @Then("^verify Custom button edited and clicking on custom button URL opens in new window$")
    public void verifyCustomButtonEditedAndClickingOnCustomButtonURLOpensInNewWindow() {
        getInstance(SitePages.class).openTestCustomButtonPage();
        getInstance(CustomButton.class).verifyCustomButtonEdited();
    }

    @Then("^Verify delete custom Button$")
    public void verifyDeleteCustomButton() {
        getInstance(Home.class).goToBPASettings();
        getInstance(Settings.class).clickOnCustomButton();
        getInstance(CustomButton.class).clickDeleteButton();
    }


}

