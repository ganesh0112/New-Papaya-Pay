package stepDefinitions;

import common.BasePage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page_objects.components.Dataviewer;
import page_objects.pages.Home;
import page_objects.pages.Login;
import page_objects.pages.SiteContents;
import page_objects.pages.SitePages;

import java.awt.*;
import java.util.List;


public class DataviewerStepDefinitions extends BasePage {


    @Given("add dataviewer on Home page")
    public void add_dataviewer_on_Home_page() {
        System.out.println("You are on Home Page..");
        getInstance(Home.class).goToSiteContents();
        getInstance(SitePages.class).addSitePage("TestingDVSample");
        getInstance(SitePages.class).addWebPart("BPA DataViewer (SPFx)");
        getInstance(SitePages.class).editWebPart();
    }

    @Given("change the site permissions")
    public void change_the_site_permissions() {
        getInstance(Home.class).goToSitePermissions();
        getInstance(Home.class).readPermission();
    }

    @Given("change the edit permissions for an item in the custom list")
    public void change_the_edit_permissions_for_an_item_in_the_custom_list() {
        getInstance(Home.class).editElementPermission();
    }


    @Given("user logs in to the website with new credentials")
    public void user_logs_in_to_the_website_with_new_credentials() {
        setBrowserIncognito();
        getInstance(Login.class).logIntoSPFxSiteWithPermissionCredntials();
    }

    @When("user navigates to the custom list")
    public void user_navigates_to_the_custom_list() {
        getInstance(Home.class).navigateToCustomList();
    }


    @Given("^add dataviewer button on Home page$")
    public void add_dataviewer_button_on_Home_page() throws Throwable {
        System.out.println("You are on Home Page..");
        getInstance(SitePages.class).addSitePage("TestingDVSample");
        getInstance(SitePages.class).addWebPart("BPA DataViewer (SPFx)");
        getInstance(SitePages.class).addLibraryList("Button");
        getInstance(SitePages.class).editWebPart();
    }

    @Given("create a new Custom List")
    public void create_a_new_Custom_List() {
        getInstance(Home.class).goToSiteContents();
        getInstance(Home.class).createCustomList("This is Custom List");

    }

    @And("Add Columns in the Custom List")
    public void add_columns_in_the_custom_list() {
        getInstance(SiteContents.class).addColumnsInCustomList("Custom List", true, "This is Custom List");
    }

    @And("Add Data in the Custom List")
    public void add_data_in_the_custom_list() {
        getInstance(SiteContents.class).addDataIntoCustomList();
    }

    @Given("add new columns in the list")
    public void add_new_columns_in_the_list() {
        getInstance(SitePages.class).addColumnsInList();
    }

    @When("user creates new items")
    public void user_creates_new_items() {
        getInstance(SitePages.class).createItemsInList();
    }

    @When("user creates a new View")
    public void user_creates_a_new_View() {
        getInstance(SitePages.class).createView();
        getInstance(SitePages.class).editView();
    }

    @Given("adds content for the custom List")
    public void adds_content_for_the_custom_List() {
        getInstance(Home.class).addContentsForCustomList();
        getInstance(Home.class).enterFieldsForCustomList("test-1","10","abhijeet.divate@bpa-solutions.net","8/29/2022");
        getInstance(Home.class).enterFieldsForCustomList("test-2","20","Varsha.Chavan@bpa-solutions.net","4/30/2022");
        getInstance(Home.class).enterFieldsForCustomList("test-3","30","Jeevan.Bhalerao@bpa-solutions.net","7/5/2022");
        getInstance(Home.class).enterFieldsForCustomList("test-4","40","Mayur.Padgaonkar@bpa-solutions.net","9/1/2022");
    }

    @Given("navigate to the custom list")
    public void navigate_to_the_custom_list() {
        getInstance(Home.class).navigateToCustomList();
    }

    @Given("change the edit permissions for an item in the custom listPresent")
    public void change_the_edit_permissions_for_an_item_in_the_custom_listPresent() {
        getInstance(Home.class).goToSitePermissions();
        getInstance(Home.class).editElementPermission();
    }


    @Given("create a new view for the custom list")
    public void create_a_new_view_for_the_custom_list() {
        getInstance(Home.class).createNewViewForList();
    }

    @Given("add the item in the custom list")
    public void add_the_item_in_the_custom_list() {
        getInstance(SitePages.class).addItem();
        getInstance(SitePages.class).addColumn();
    }

    @When("adding a dataviewer on Home page")
    public void adding_a_dataviewer_on_Home_page() {
        System.out.println("You are on Home Page..");
        getInstance(Home.class).goToSiteContents();
        getInstance(SitePages.class).addSitePage("TestingDVSample");
        getInstance(SitePages.class).addWebPart("BPA DataViewer (SPFx)");
        getInstance(SitePages.class).editWebPart();
    }

    @Given("^delete dataviewer on Home page$")
    public void delete_dataviewer_on_Home_page() throws Throwable {
        getInstance(SitePages.class).deleteWebPart();
    }

    @Given("^duplicate dataviewer on Home page$")
    public void duplicate_dataviewer_on_Home_page() throws Throwable {
        getInstance(SitePages.class).duplicateWebPart();
    }

    @When("user navigates to DV sample")
    public void user_navigates_to_DV_sample() {
        getInstance(Home.class).navigateToDV();
    }

    @Given("close the nav bar")
    public void close_the_nav_bar() {
        getInstance(SitePages.class).closeNavBar();
    }


    @And("^click on cancel button$")
    public void click_on_cancel_button()
    {
        getInstance(Dataviewer.class).cancelConfigureCustomButton();
    }


    @And("^configure added dataviewer only mandatory fields$")
    public void configure_added_dataViewer_only_mandatory_fields(DataTable dvDetails)throws Throwable{
        List<List<String>> data = dvDetails.asLists(String.class);
        getInstance(Dataviewer.class).configureDataviewerForCustomButtonMandatoryFields(data.get(0).get(0),data.get(0).get(1));
    }

    @And("^configure added dataviewer only one mandatory fields$")
    public void configure_added_dataViewer_only_one_mandatory_fields(DataTable dvDetails)throws Throwable{
        List<List<String>> data = dvDetails.asLists(String.class);
        getInstance(Dataviewer.class).configureDataviewerForOneCustomButtonMandatoryFields(data.get(0).get(0));
    }

    @Given("navigate to compliance document  via Site Contents")
    public void navigate_to_compliance_document_via_Site_Contents() {
        getInstance(Home.class).goToSiteContents();
        getInstance(Home.class).navigateToComplianceDocument();
    }

    @Given("create a new Flat View")
    public void create_a_new_Flat_View() {
        getInstance(Home.class).createFlatView();
    }

    @Given("create a new Folder")
    public void create_a_new_Folder() {
        getInstance(Home.class).createViewFolder();
    }

    @Given("go to Library settings via Setting")
    public void go_to_Library_settings_via_Setting() {
        getInstance(Home.class).goToLibrarySettings();
    }

    @Given("navigate to the added DV")
    public void navigate_to_the_added_DV() {
        getInstance(Home.class).navigateToAddedDV();
    }

    @Given("user creates a document library")
    public void user_creates_a_document_library() {
        getInstance(Home.class).createDocLibrary();
    }

    @Given("user uploads the document")
    public void user_uploads_the_document() throws AWTException {
        getInstance(Home.class).uploadFile("C:\\Users\\Lenovo\\Desktop\\TestFile.txt");
        getInstance(Home.class).uploadFile("C:\\Users\\Lenovo\\Desktop\\BPA Migration process 2016 to 2019.docx");
    }

    @Given("user clicks on Page Styles link via BPA Settings")
    public void user_clicks_on_Page_Styles_link_via_BPA_Settings() {
        getInstance(Home.class).goToBPASettings();
        getInstance(Home.class).clickOnPageStyle();
    }

    @Given("check if user can change permission to edit")
    public void check_if_user_can_change_permission_to_edit() {
        getInstance(Home.class).goToSitePermissions();
        getInstance(Home.class).editPermission();
    }

    @Given("the user logs in to the website")
    public void the_user_logs_in_to_the_website() {
        setBrowser();
        getInstance(Login.class).logIntoSPFxSiteForNonLicensedUser();
    }

    @Given("the user logs in to the website with expired license")
    public void the_user_logs_in_to_the_website_with_expired_license() {
        setBrowser();
        getInstance(Login.class).logIntoSPFxSiteForExpiredLicensed();
    }

    @Given("the user logs in to the website for max users limit")
    public void the_user_logs_in_to_the_website_for_max_users_limit() {
        setBrowser();
        getInstance(Login.class).logIntoSPFxSiteMaxUser();
    }

    @When("user clicks on the DV sample to check the max users limit reached")
    public void user_clicks_on_the_DV_sample_to_check_the_max_users_limit_reached() {
        getInstance(SitePages.class).checkUserLimitDV();
    }

    @When("user clicks on the DV sample to check the expired license")
    public void user_clicks_on_the_DV_sample_to_check_the_expired_license() {
        getInstance(SitePages.class).checkExpiredLicenseDV();
    }

    @When("user navigates to the added DV and changes view to Standard")
    public void user_navigates_to_the_added_DV_and_changes_view_to_Standard() throws AWTException {
        getInstance(Home.class).changeDVView();
        getInstance(Home.class).selectStandardView();
    }

    @When("user visits compliance Document setting")
    public void user_visits_compliance_Document_setting() {
        getInstance(Home.class).goToComplianceDocumentSettings();
    }

    @When("^go To Site Contents page$")
    public void go_To_Site_Contents() throws Throwable {
        getInstance(Home.class).goToSiteContents();
    }

    @When("User clicks on BPA Setting on Home Page")
    public void user_clicks_on_BPA_Setting_on_Home_Page() {
        System.out.println("You are on Home Page..");
        getInstance(Home.class).goToBPASettings();
    }

    @When("clicked on Site Contents")
    public void clicked_on_Site_Contents() {
        getInstance(Home.class).goToSiteContents();
    }

    @When("User creates a custom buttons")
    public void user_creates_a_custom_buttons() {
        getInstance(SitePages.class).clickOnNewCustomButton();
        getInstance(SitePages.class).addCustomButton();
        getInstance(SitePages.class).buttonIcon();
    }

    @When("adding the document list")
    public void adding_the_document_list() {
        getInstance(SitePages.class).addDocumentList();
    }

    @When("add the custom list details")
    public void add_the_custom_list_details() {
        getInstance(SitePages.class).addCustomList();
    }

    @When("add the item in the list")
    public void add_the_item_in_the_list() {
        getInstance(SitePages.class).addListItem();
        getInstance(SitePages.class).addItem();
        getInstance(SitePages.class).addColumn();
    }

    @When("adding a folder in the document list")
    public void adding_a_folder_in_the_document_list() {
        getInstance(SitePages.class).addFolderForDocumentList();
    }

    @When("adding the document list in DV configurator")
    public void adding_the_document_list_in_DV_configurator() {
        System.out.println("You are on Home Page..");
        getInstance(Home.class).goToSiteContents();
        getInstance(SitePages.class).addSitePage("TestingDVSample");
        getInstance(SitePages.class).addWebPart("BPA DataViewer (SPFx)");
        getInstance(SitePages.class).editWebPart();
    }

    @When("user clicks on the DV sample")
    public void user_clicks_on_the_DV_sample() {
        getInstance(Home.class).navigateNonLicenseDV();
    }

    @When("navigate to DV configurator")
    public void navigate_to_DV_configurator() {
        getInstance(SitePages.class).navigateDVConfigurator("BPA DataViewer (SPFx)");
        getInstance(SitePages.class).editWebPart();
    }

    @Given("a file is uploaded")
    public void a_file_is_uploaded() throws AWTException {
        getInstance(Home.class).uploadFile("C:\\Users\\Lenovo\\Desktop\\TestFile.txt");
    }

    @Given("user tries to edit the view")
    public void user_tries_to_edit_the_view() {
        getInstance(Home.class).editView();
    }

    @Then("verify by clicking on the breadcrumbs for nested folder through Name")
    public void verify_by_clicking_on_the_breadcrumbs_for_nested_folder_through_Name() {
        for(int i=0; i<5; i++) {
            getInstance(Home.class).navigateToFolder();
        }
    }

    @Then("check the permission of the DV Sample")
    public void check_the_permission_of_the_DV_Sample() {
        getInstance(Home.class).checkReadPermission();
    }

    @Then("configure added dataviewer for Compliance Documents for FlatView")
    public void configure_added_dataviewer_for_Compliance_Documents_for_FlatView(DataTable dvDetails) {
        List<List<String>> data = dvDetails.asLists(String.class);
        getInstance(Dataviewer.class).configureDataviewerForComplianceDocumentsForFlatView(data.get(0).get(0),data.get(0).get(1),data.get(0).get(2),data.get(0).get(3));
    }

    @Then("delete the added folders")
    public void delete_the_added_folders() {
        getInstance(Home.class).goToSiteContents();
        getInstance(Home.class).navigateToComplianceDocument();
        getInstance(Home.class).deleteFolder();
    }

    @Then("check if user can change the permission")
    public void check_if_user_can_change_the_permission() {
        getInstance(Home.class).checkPermission();
    }

    @Then("check the permission for the items in the given view")
    public void check_the_permission_for_the_items_in_the_given_view() {
        getInstance(Home.class).checkViewForItem();
        getInstance(Home.class).checkPermission();
    }


    @Then("click on the folders by name to trace it")
    public void click_on_the_folders_by_name_to_trace_it() {
        getInstance(Home.class).traceFoldersBackward();
    }

    @Then("^enter the button alignment$")
    public void enter_the_button_alignment()throws Throwable{
        getInstance(SitePages.class).enterButtonDetails("Add Button","https://example.com");
    }

    @Then("configure added dataviewer")
    public void configure_added_dataviewer(DataTable dvDetails) {
        List<List<String>> data = dvDetails.asLists(String.class);
        //getInstance(Dataviewer.class).addMandatoryDVFields();
        getInstance(Dataviewer.class).configureDataviewerForCustomButton(data.get(0).get(0),data.get(0).get(1),data.get(0).get(2),data.get(0).get(3));
    }

    @Then("add a AI Chat Bot button")
    public void add_a_AI_Chat_Bot_button() {
        getInstance(Dataviewer.class).addChatBotButton();
    }


    @Then("configure added dataviewer for Compliance Documents")
    public void configure_added_dataviewer_for_Compliance_Documents(DataTable dvDetails) {
        List<List<String>> data = dvDetails.asLists(String.class);
        getInstance(Dataviewer.class).configureDataviewerForComplianceDocuments(data.get(0).get(0),data.get(0).get(1),data.get(0).get(2),data.get(0).get(3));
    }

    @Then("configure added dataviewer for Audits")
    public void configure_added_dataviewer_for_Audits(io.cucumber.datatable.DataTable dvDetails) {
        List<List<String>> data = dvDetails.asLists(String.class);
        getInstance(Dataviewer.class).configureDataviewerForAuditList(data.get(0).get(0),data.get(0).get(1),data.get(0).get(2),data.get(0).get(3));
    }

    @Then("configure added dataviewer for quick edit item")
    public void configure_added_dataviewer_for_quick_edit_item(DataTable dvDetails) {
        List<List<String>> data = dvDetails.asLists(String.class);
        getInstance(Dataviewer.class).configureDataviewerForCustomButtonForQuickEditItem(data.get(0).get(0),data.get(0).get(1),data.get(0).get(2),data.get(0).get(3));
    }

    @Then("select the Display Options on DV Page")
    public void select_the_Display_Options_on_DV_Page() {
        getInstance(Dataviewer.class).clickDisplayOptions();
    }

    @Then("add an new Item Button")
    public void add_an_new_Item_Button() {
        getInstance(Dataviewer.class).addNewItemButton();
    }

    @Then("add an new Item Button for MM functionality")
    public void add_an_new_item_button_for_mm_functionality() {
        getInstance(Dataviewer.class).addNewItemButtonMM();
    }

    @Then("add Buttons")
    public void add_Buttons() {
        getInstance(Dataviewer.class).addFirstButton();
        getInstance(Dataviewer.class).addSecondButton();
        getInstance(Dataviewer.class).addThirdButton();
        getInstance(Dataviewer.class).addFourthButton();
        getInstance(Dataviewer.class).addFifthButton();
    }

    @Then("click on display options")
    public void click_on_display_options() {
        getInstance(Dataviewer.class).showDisplayOptions();
    }

    @Then("check the show link to open document column by Name")
    public void check_the_show_link_to_open_document_column_by_Name() {
        getInstance(Dataviewer.class).linkToOpenDocumentByName();
    }

    @Then("select the option in link to open document column")
    public void select_the_option_in_link_to_open_document_column() {
        getInstance(Dataviewer.class).selectOpenDocumentColumn();
    }

    @Then("add new Buttons")
    public void add_new_Buttons() {
        getInstance(Dataviewer.class).addEditButtonWithText();
        getInstance(Dataviewer.class).addShareButtonWithText();
        getInstance(Dataviewer.class).saveandCloseButton();
        getInstance(SitePages.class).publish();
        getInstance(SitePages.class).editDV();

    }

    @Then("add an Item History Button")
    public void add_an_Item_History_Button() {
        getInstance(Dataviewer.class).addItemHistoryButton();
    }

    @Then("configure added dataviewer for Document Library")
    public void configure_added_dataviewer_for_Document_Library(DataTable dvDetails) {
        List<List<String>> data = dvDetails.asLists(String.class);
        getInstance(Dataviewer.class).configureDataviewerForDocumentLibrary(data.get(0).get(0),data.get(0).get(1),data.get(0).get(2),data.get(0).get(3));
    }

    @Then("add a new Button")
    public void add_a_new_Button() {
        getInstance(Dataviewer.class).configureCustomButton();
    }

    @Then("add an Open document Button")
    public void add_an_Open_document_Button() {
        getInstance(Dataviewer.class).addOpenDocumentButton();
    }

    @Then("add an Upload Button")
    public void add_an_Upload_Button() {
        getInstance(Dataviewer.class).addUploadButton();
    }

    @Then("add an Alertme Button")
    public void add_an_Alertme_Button() {
        getInstance(Dataviewer.class).addAlertMeButton();
    }

    @Then("add a Permission Button")
    public void add_a_Permission_Button() {
        getInstance(Dataviewer.class).addPermissionButton();
    }

    @Then("add a Share to Team Button")
    public void add_a_Share_to_Team_Button() {
        getInstance(Dataviewer.class).shareToTeamButton();
    }

    @Then("add a new Custom button")
    public void add_a_new_Custom_button() {
        getInstance(Dataviewer.class).addCustomButton();
    }

    @Then("verify the Share To Team button on the Site Page")
    public void verify_the_Share_To_Team_button_on_the_Site_Page() {
        getInstance(SitePages.class).checkShareTeamButton();
    }

    @Then("add a Button")
    public void add_a_Button() {
        getInstance(Dataviewer.class).shareToTeamButton();
    }

    @Then("select quick edit option")
    public void select_quick_edit_option() {
        getInstance(Dataviewer.class).showDisplayQuickEditOption();
        getInstance(Dataviewer.class).saveandCloseButton();
    }

    @Then("select quick option edit selection delete on Data viewer")
    public void select_quick_option_edit_selection_delete_on_Data_viewer() {
        getInstance(Dataviewer.class).showDisplayOptions();
        getInstance(Dataviewer.class).saveandCloseButton();
    }

    @Then("select the option in link to detail page")
    public void select_the_option_in_link_to_detail_page() {
        getInstance(Dataviewer.class).selectDetailPageColumn();
        getInstance(Dataviewer.class).saveandCloseButton();
    }

    @Then("select quick delete option on Data viewer")
    public void select_quick_delete_option_on_Data_viewer() {
        getInstance(Dataviewer.class).showDisplayOptions();
        getInstance(Dataviewer.class).saveandCloseButton();
    }

    @Then("add the view by clicking on View Options")
    public void add_the_view_by_clicking_on_View_Options() {
        getInstance(SitePages.class).addViewOptions("All Items", "View-2");
    }

    @Then("save the DV page")
    public void save_the_DV_page() {
        getInstance(Dataviewer.class).saveandCloseButton();
    }

    @Then("create multiple DV")
    public void create_multiple_DV() {
        getInstance(Dataviewer.class).createMultipleDV();
        getInstance(SitePages.class).editWebPart();
        getInstance(Dataviewer.class).changeDVNames("Dataviewer02");
        getInstance(Dataviewer.class).saveandCloseButton();
        getInstance(Dataviewer.class).createMultipleDV();
        getInstance(SitePages.class).editWebPart();
        getInstance(Dataviewer.class).changeDVNames("Dataviewer03");
        getInstance(Dataviewer.class).saveandCloseButton();
    }

    @Then("verify the added AI Chat bot button")
    public void verify_the_added_AI_Chat_bot_button() {
        getInstance(Home.class).checkChatBotButton();
    }

    @Then("publish the page")
    public void publish_the_page() {
        getInstance(SitePages.class).publish();

    }

    @Then("click on Switch View and confirm")
    public void click_on_Switch_View_and_confirm() {
        getInstance(SitePages.class).switchView();
    }

    @Then("reorder the buttons and check")
    public void reorder_the_buttons_and_check() {
        getInstance(SitePages.class).editDV();
        getInstance(Dataviewer.class).reorderButton();
    }

    @Then("check the permission button functionality")
    public void check_the_permission_button_functionality() {
        getInstance(Home.class).checkPermissionFunctionality();
    }

    @Then("add new Items for MM button")
    public void add_new_Items_for_MM_button() {
        getInstance(Home.class).createNewItemMMButton("test-1");
        getInstance(Home.class).createNewItemMMButton("test-2");
        getInstance(Home.class).mergeDataDocument();
    }

    @Then("add new Items for MM button for automatic option")
    public void add_new_Items_for_MM_button_for_automatic_option() {
        getInstance(Home.class).createNewItemMMButton("test-1");
        getInstance(Home.class).createNewItemMMButton("test-2");
        getInstance(Home.class).mergeDataDocumentAutomatically();
    }

    @Then("check whether MM document is created")
    public void check_whether_MM_document_is_created() {
        getInstance(Home.class).goToSiteContents();
        getInstance(Home.class).navigateToComplianceDocument();
        getInstance(Home.class).checkMMDocument();
    }

    @Then("check whether MM document is created in Documents")
    public void check_whether_MM_document_is_created_in_Documents() {
        getInstance(Home.class).goToSiteContents();
        getInstance(Home.class).navigateToDocuments();
        getInstance(Home.class).checkMMDocument();
    }


    @Then("create new folders")
    public void create_new_folders() {
        getInstance(Home.class).createNewItem();
        getInstance(Home.class).createDocument();
    }

    @Then("create the nested folders")
    public void create_the_nested_folders() {
        getInstance(Home.class).createNewFolder();
        getInstance(Home.class).createFolder("Folder-1","Name-1");
        getInstance(Home.class).navigateToFolder();
        getInstance(Home.class).createNewFolder();
        getInstance(Home.class).createFolder("Folder-2","Name-2");
        getInstance(Home.class).navigateToFolder();
        getInstance(Home.class).createNewFolder();
        getInstance(Home.class).createFolder("Folder-3","Name-3");
        getInstance(Home.class).navigateToFolder();
        getInstance(Home.class).createNewFolder();
        getInstance(Home.class).createFolder("Folder-4","Name-4");
        getInstance(Home.class).navigateToFolder();
        getInstance(Home.class).createNewFolder();
        getInstance(Home.class).createFolder("Folder-5","Name-5");
        getInstance(Home.class).navigateToFolder();
    }

    @Then("check the edit permission of the DV Sample")
    public void check_the_edit_permission_of_the_DV_Sample() {
        getInstance(Home.class).checkEditPermission();
    }

    @Then("upload a new File")
    public void upload_a_new_File() throws AWTException {
        getInstance(Home.class).uploadANewFile();
    }

    @Then("remove the newly created Custom List")
    public void remove_the_newly_created_Custom_List() {
        getInstance(Home.class).goToSiteContents();
        getInstance(Home.class).goToClassicWebSite();
        getInstance(Home.class).removeCustomList();
    }

    @Then("click on link to open document on the column")
    public void click_on_link_to_open_document_on_the_column() {
        getInstance(Home.class).clickLinkColumn();
    }

    @Then("go to Page Styles link via BPA Settings")
    public void go_to_Page_Styles_link_via_BPA_Settings() {
        getInstance(Home.class).goToBPASettings();
        getInstance(Home.class).clickOnPageStyle();

    }

    @Then("navigate to added DV and change the view")
    public void navigate_to_added_DV_and_change_the_view() throws AWTException {
        getInstance(Home.class).changeDVView();
        getInstance(Home.class).selectLargerView();
    }

    @Then("check the view of the DVs")
    public void check_the_view_of_the_DVs() {
        getInstance(Home.class).navigateToDV();
    }

    @Then("check the view")
    public void check_the_view() {
        getInstance(Home.class).checkView();
    }

    @Then("go To Link Editor via Setting")
    public void go_To_Link_Editor_via_Setting() {
        getInstance(Home.class).goToBPASettings();
        getInstance(SitePages.class).clickLinkEditor();
        getInstance(SitePages.class).fillLinkDetails();
    }

    @Then("delete the added dataviewer")
    public void delete_the_added_dataviewer() {
        getInstance(Home.class).deleteDV();
    }

    @Then("delete the added folder")
    public void delete_the_added_folder() {
        getInstance(Home.class).goToSiteContents();
        getInstance(Home.class).navigateToComplianceDocument();
        getInstance(Home.class).deleteFolder();
    }

    @Then("click on the new Custom Button")
    public void click_on_the_new_Custom_Button() {
        getInstance(SitePages.class).checkNewCustomButton();
    }

    @Then("click on delete custom list item")
    public void click_on_delete_custom_list_item() {
        getInstance(SitePages.class).deletecustomItem();
    }

    @Then("click on quick edit list item")
    public void click_on_quick_edit_list_item() {
        getInstance(SitePages.class).quickEditItem();

    }

    @Then("navigate to the added dataviewer")
    public void navigate_to_the_added_dataviewer() {
        getInstance(Home.class).navigateToDV();
    }

    @Then("click on the link to show detail page")
    public void click_on_the_link_to_show_detail_page() {
        getInstance(Home.class).clickOnShowLink();
    }

    @Then("verify the button on the Site Page")
    public void verify_the_button_on_the_Site_Page() {
        getInstance(SitePages.class).clickCircleMark();
    }

    @Then("check the show link to open document column")
    public void check_the_show_link_to_open_document_column() {
        getInstance(Dataviewer.class).checkShowOpenLinkColumn();
    }

    @Then("add a MM button")
    public void add_a_MM_button() {
        getInstance(Dataviewer.class).addMMButton();
    }

    @Then("do the MM button setting")
    public void do_the_MM_button_setting() {
        getInstance(Dataviewer.class).MMButtonSettings();
        getInstance(Dataviewer.class).saveSettings();
    }

    @Then("do the MM button setting by selecting run automatically option")
    public void do_the_MM_button_setting_by_selecting_run_automatically_option() {
        getInstance(Dataviewer.class).MMButtonSettings();
        getInstance(Dataviewer.class).automationOption();
        getInstance(Dataviewer.class).saveSettings();
    }

    @Then("do the MM button setting by merging without any item selection")
    public void do_the_MM_button_setting_by_merging_without_any_item_selection() {
        getInstance(Dataviewer.class).MMButtonSettingsDocument();
        getInstance(Dataviewer.class).mergeWithoutItem();
        getInstance(Dataviewer.class).saveSettings();

    }

    @Then("check if user can change the permission for the edited item")
    public void check_if_user_can_change_the_permission_for_the_edited_item() {
        getInstance(Home.class).checkPermissionOfEditedItem();
    }


    @Then("check the non licensed user functionality")
    public void check_the_non_licensed_user_functionality() {
        getInstance(Home.class).checkNonLicense();
    }


    @Then("click on the close button")
    public void click_on_the_close_button() {
        getInstance(Dataviewer.class).clickCloseButton();
    }


    @Then("navigate to the document library")
    public void navigate_to_the_document_library() {
        getInstance(Home.class).navigateToDocLibrary();
    }

    @Then("check the permission of the document library")
    public void check_the_permission_of_the_document_library() {
        getInstance(Home.class).checkDocPermission();
    }

    @Then("check the orders of the button")
    public void check_the_orders_of_the_button() {
    }
}
