package stepDefinitions;

import common.BasePage;
import common.Utilities;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import page_objects.components.Dataviewer;
import page_objects.components.MasterDetails;
import page_objects.pages.Home;
import page_objects.pages.SitePages;

import java.util.List;

public class MasterDetailStepDefinitions extends BasePage {

    @Given("Add Master Detail on Home Page")
    public void add_master_detail_on_home_page() {
        System.out.println("You are on Home Page..");
        getInstance(Home.class).goToSiteContents();
        getInstance(SitePages.class).addSitePage("TestingMDSample");
        getInstance(SitePages.class).addMDWebPart("BPA Master-Detail (SPFx)");
        getInstance(SitePages.class).editWebPart();
    }

    @Then("configure added Master Detail")
    public void configure_added_master_detail(DataTable dvDetails) {
        List<List<String>> data = dvDetails.asLists(String.class);
        getInstance(MasterDetails.class).configureMasterDetailForCustomButton(data.get(0).get(0),data.get(0).get(1),data.get(0).get(2),data.get(0).get(3));
    }

    @Then("configure added Custom List for Master Detail in Child List")
    public void configure_added_custom_list_for_master_detail_in_child_list(DataTable dvDetails) {
        List<List<String>> data = dvDetails.asLists();
        getInstance(MasterDetails.class).configureCustomListForMasterDetailChildList(data.get(0).get(0),data.get(0).get(1),data.get(0).get(2),data.get(0).get(3));
    }

    @Then("add a new Custom Button in Master View")
    public void add_a_new_custom_button_in_master_view() {
        getInstance(MasterDetails.class).addNewButtonInMasterView();
        getInstance(MasterDetails.class).addCustomButtonInMasterView();
    }

    @Then("add a Custom Button in Master View")
    public void add_a_custom_button_in_master_view() {
        getInstance(MasterDetails.class).addNewButtonInMasterView();
        getInstance(MasterDetails.class).addCustomButtonInMasterView();
    }

    @Then("add a new Button in Master View")
    public void add_a_new_button_in_master_view() {
        getInstance(MasterDetails.class).addNewButtonInMasterView();
        getInstance(MasterDetails.class).addNewItemButtonInMasterView();
    }

    @Then("Add Buttons in Detail view-Actions")
    public void add_buttons_in_detail_view_actions() {
       getInstance(MasterDetails.class).addButtonsInDetailView();
       getInstance(MasterDetails.class).addFirstButton();
       getInstance(MasterDetails.class).addSecondButton();
       getInstance(MasterDetails.class).addThirdButton();
    }

    @Then("click on the Master View and select the fields")
    public void click_on_the_master_view_and_select_the_fields() {
        getInstance(MasterDetails.class).masterView();
    }

    @Then("click on the Detail view and select the fields")
    public void click_on_the_detail_view_and_select_the_fields() {
       getInstance(MasterDetails.class).detailView();
    }

    @Then("add new Tab in Detail View")
    public void add_new_tab_in_detail_view() {
        getInstance(MasterDetails.class).addNewTabInDetailView();
    }

    @Then("click on Child List in Detail View")
    public void click_on_child_list_in_detail_view() {
       getInstance(MasterDetails.class).addChildListInDetailView();
    }

    @Then("configure added dataviewer for Compliance Documents in Child List")
    public void configure_added_dataviewer_for_compliance_documents_in_child_list(DataTable dvDetails) {
        List<List<String>> data = dvDetails.asLists();
        getInstance(MasterDetails.class).configureDataviewerForChildList(data.get(0).get(0),data.get(0).get(1),data.get(0).get(2),data.get(0).get(3));
    }

    @Then("configure Compliance Documents for Master Detail in Child List")
    public void configure_compliance_documents_for_master_detail_in_child_list(DataTable dvDetails) {
        List<List<String>> data = dvDetails.asLists();
        getInstance(MasterDetails.class).configureComplianceDocumentForChildList(data.get(0).get(0),data.get(0).get(1),data.get(0).get(2),data.get(0).get(3));
    }

    @Then("add new Action Buttons in Child List")
    public void add_new_action_buttons_in_child_list() {
        getInstance(MasterDetails.class).newActionButtonsInChildList();
        getInstance(MasterDetails.class).addFirstChildListButton();
        getInstance(MasterDetails.class).addSecondChildListButton();
        getInstance(MasterDetails.class).addThirdChildListButton();
        getInstance(MasterDetails.class).addFourthChildListButton();
    }

    @Then("save the MD page")
    public void save_the_md_page() {
       getInstance(MasterDetails.class).saveAndCloseMDPage();
    }

    @Then("check Custom Button on MD page")
    public void check_custom_button_on_md_page() {
        getInstance(MasterDetails.class).checkCustomButtonOnMD();
    }

    @Then("edit the added MD page")
    public void edit_the_added_md_page() {
        getInstance(MasterDetails.class).editMDPage();
        getInstance(SitePages.class).addMDWebPart("BPA Master-Detail (SPFx)");
        getInstance(SitePages.class).editWebPart();
    }


    @Then("add new Buttons in the First Child List")
    public void add_new_buttons_in_the_first_child_list() {
       getInstance(MasterDetails.class).addFirstButtonInChildList();
       getInstance(MasterDetails.class).addSecondButtonInChildList();
       getInstance(MasterDetails.class).addThirdButtonInChildList();
       getInstance(MasterDetails.class).addFourthButtonInChildList();
       getInstance(MasterDetails.class).addFifthButtonInChildList();
       getInstance(MasterDetails.class).removeButtonsInChildList();
    }

    @Then("click on display options by selecting Filter field")
    public void click_on_display_options_by_selecting_filter_field() {
        getInstance(Dataviewer.class).showDisplayOptions();
    }

    @And("select the look in the filter field")
    public void select_the_look_in_the_filter_field() {
        getInstance(MasterDetails.class).selectFilterField();

    }

    @Then("verify the added Custom Button on MD Page")
    public void verify_the_added_custom_button_on_md_page() {
        getInstance(MasterDetails.class).verifyCustomButtonOnMDPage();
    }

    @Then("check the order of the Action buttons")
    public void check_the_order_of_the_action_buttons() {
        getInstance(MasterDetails.class).checkOrder();
    }

    @And("check the order of the Action buttons after reordering")
    public void check_the_order_of_the_action_buttons_after_reordering() {
        getInstance(MasterDetails.class).editMDPage();
        getInstance(SitePages.class).editMDPart();
        getInstance(MasterDetails.class).reorderActionButton();
        getInstance(MasterDetails.class).saveAndCloseMDPage();
        getInstance(SitePages.class).republish();
        Utilities.sleep(3000);
        getInstance(MasterDetails.class).checkReOrder();

    }

    @Then("add a Custom Button in DetailView Action Section")
    public void add_a_custom_button_in_detail_view_action_section() {
        getInstance(MasterDetails.class).addButtonsInDetailView();
        getInstance(MasterDetails.class).addCustomButtonInDetailViewAction();
    }

    @Then("verify the added Custom Action button in the MD config")
    public void verify_the_added_custom_action_button_in_the_md_config() {
        getInstance(MasterDetails.class).verifyCustomButtonOnMDPage();
    }
}
