package stepDefinitions;

import common.BasePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import page_objects.components.LeftNavigation;
import page_objects.pages.Home;
import page_objects.pages.Settings;

public class LeftNavigationStepDefinitions extends BasePage {


    @Given("^add new category$")
    public void addNewCategory() {
        getInstance(Home.class).goToBPASettings();
        getInstance(Settings.class).clickOnNavigationLinks();
        getInstance(LeftNavigation.class).addNewCategory();
    }

    @Then("^verify Category added$")
    public void verifyCategoryAdded() {
        getInstance(Home.class).openBPANavigation();
        getInstance(LeftNavigation.class).verifyCategoryAdded();
        getInstance(Home.class).closeBPANavigation();
    }

    @Then("^edit category$")
    public void editCategory() {
        getInstance(Home.class).goToBPASettings();
        getInstance(Settings.class).clickOnNavigationLinks();
        getInstance(LeftNavigation.class).editCategory();
    }

    @Given("^add new quick link Automation Links category$")
    public void addNewQuickLinkAutomationLinksCategory() {
        getInstance(Home.class).goToBPASettings();
        getInstance(Settings.class).clickOnNavigationLinks();
        getInstance(LeftNavigation.class).addQuickLink();
    }

    @Then("^verify quick link added$")
    public void verifyQuickLinkAdded() {
        getInstance(LeftNavigation.class).loadUrlInNewTab1();
        getInstance(Home.class).openBPANavigation();
        getInstance(LeftNavigation.class).verifyQuickLinkAdded();
        getInstance(Home.class).closeBPANavigation();
    }

    @Then("^navigate to left navigation through BPA settings$")
    public void navigateToLeftNavigationThroughBPASettings() {
        getInstance(Home.class).goToBPASettings();
        getInstance(Settings.class).clickOnNavigationLinks();
    }

    @Then("^verify quick link Edited$")
    public void verifyQuickLinkEdited() {
        getInstance(LeftNavigation.class).editQuickLink();
    }

    @Then("^verify quick link edited, reflected in BPA navigation$")
    public void verifyQuickLinkEditedReflectedInBPANavigation() {
        getInstance(Home.class).openBPANavigation();
        getInstance(LeftNavigation.class).verifyQuickLinkEditedInBPANavigation();
        getInstance(Home.class).closeBPANavigation();
    }

    @Then("^delete the quick link$")
    public void deleteTheQuickLink() {
        getInstance(LeftNavigation.class).deleteQuickLink();
    }

    @Then("^verify quick link deleted$")
    public void verifyQuickLinkDeleted() {
        getInstance(Home.class).openBPANavigation();
        getInstance(LeftNavigation.class).verifyQuickLinkDeleted();
        getInstance(Home.class).closeBPANavigation();
    }

    @Then("^delete the category Automation Link$")
    public void deleteTheCategoryAutomationLink() {
        getInstance(LeftNavigation.class).deleteCategory();
    }

    @Then("^verify category automation deleted$")
    public void verifyCategoryAutomationDeleted() {
        getInstance(Home.class).openBPANavigation();
        getInstance(LeftNavigation.class).verifyCategoryDeleted();
        getInstance(Home.class).closeBPANavigation();
    }
}
