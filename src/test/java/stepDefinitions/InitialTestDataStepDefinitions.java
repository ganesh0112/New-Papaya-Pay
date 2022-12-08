package stepDefinitions;

import common.BasePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import page_objects.pages.Contacts;
import page_objects.pages.Home;
import page_objects.pages.Organizations;
import page_objects.pages.SiteContents;

public class InitialTestDataStepDefinitions extends BasePage {


    @Given("Navigate to Contact lists through site Content")
    public void navigate_to_contact_lists_through_site_content() {
        getInstance(Home.class).goToSiteContents();
    }

    @Then("go to Contacts List")
    public void go_to_contacts_list() {
        getInstance(SiteContents.class).clickOnContactsList();
    }

    @Then("add Contacts")
    public void add_contacts() {
        getInstance(Contacts.class).addContacts();
    }

    @Then("close current window")
    public void close_current_window() {
        String currentWindow = getCurrentWindow();
        closeCurrentWindow(currentWindow);
    }

    @Then("^scroll up to Organizations List$")
    public void scroll_up_to_Organizations_List() {
        getInstance(SiteContents.class).scrollUpToOrganizationsList();
    }

    @Then("go to Organizations List")
    public void go_to_organizations_list() {
        getInstance(SiteContents.class).clickOnOrganizationsList();
    }

    @Then("add Accounts")
    public void add_accounts() {
        getInstance(Organizations.class).addAccounts();
    }
}
