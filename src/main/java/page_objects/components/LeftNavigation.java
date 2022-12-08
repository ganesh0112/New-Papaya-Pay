package page_objects.components;

import common.Utilities;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;


public class LeftNavigation extends Component{

    @FindBy(xpath = "//button[@aria-label='Add Category']")
    private WebElement addCategory;

    @FindBy(xpath = "//input[@placeholder='Category Name']")
    private WebElement categoryName;

    @FindBy(xpath = "(//i[@data-icon-name='CheckMark'])[1]")
    private WebElement checkMark1;

    @FindBy(xpath = "(//i[@data-icon-name='CheckMark'])[2]")
    private WebElement checkMark2;

    @FindBy(xpath = "(//span[contains(text(),'Save')])[4]")
    private WebElement Save;

    @FindBy(xpath="//span[contains(text(),'Save and Publish')]")
    private WebElement saveAndPublish;

    @FindBy(xpath = "//button[contains(@class,'ms-Nav-chevronButton')]")
    private List<WebElement> allCategories;

    @FindBy(xpath="//button[contains(text(),'Automation Links')]")
    private WebElement addedLinks;

    @FindBy(xpath = "(//button[contains(@class,'ms-Nav-chevronButton')])[1]")
    private WebElement stakeholders;

    @FindBy(xpath = "(//button[@aria-label='Edit this category'])[9]")
    private WebElement editAutomationLink;

    @FindBy(xpath="//span[contains(text(),'Automation Links')]")
    private WebElement navigateAutoLink;

    @FindBy(xpath = "(//input[@type='checkbox'])[1]")
    private WebElement checkbox1;

    @FindBy(xpath = "(//input[@type='checkbox'])[2]")
    private WebElement checkbox2;

    @FindBy(xpath = "(//div[contains(@class,'ms-TooltipHost')])[4]")
    private WebElement toolTip;

    @FindBy(xpath = "//i[@data-icon-name='Hide3']")
    private WebElement hide3;

    @FindBy(xpath = "//span[contains(text(),'Automation Links')]/parent::span/following-sibling::button/span/i[@data-icon-name='AddLink']")
    private WebElement addLink;

    @FindBy(xpath = "//input[@placeholder='Link Text']")
    private WebElement linkText;

    @FindBy(xpath = "//button[contains(@class,'pickerButton')]")
    private WebElement pickerButton;

    @FindBy(xpath = "//input[@aria-label='Hex']")
    private WebElement hexInput;

    @FindBy(xpath = "(//span[contains(text(),'Save')])[3]")
    private WebElement saveColor;

    @FindBy(xpath = "//input[@placeholder='https://...']")
    private WebElement destinationURL;

    @FindBy(xpath = "//button[@title='Icon Picker']")
    private WebElement iconPicker;

    @FindBy(xpath = "//i[@data-icon-name='Hotel']/following::i[@data-icon-name='Bank']")
    private WebElement bankIcon;

    @FindBy(xpath = "//i[@data-icon-name='Bank']")
    private WebElement bankIcon1;

    @FindBy(xpath = "//span[contains(@class,'ms-Button-label') and contains(text(),'Close')]")
    private WebElement close;

    @FindBy(xpath = "//a[@title='AutoLink']")
    private WebElement autoLink;

    @FindBy(xpath = "//span[@class='ms-ChoiceFieldLabel' and contains(text(),'Same window')]")
    private WebElement sameWindow1;

    @FindBy(xpath = "//span[@class='ms-ChoiceFieldLabel' and contains(text(),'New window')]")
    private WebElement newWindow1;

    @FindBy(xpath = "(//div[@data-automation-key='color'])[35]")
    private WebElement autoLinkColor;

    @FindBy(xpath = "(//i[@data-icon-name='Edit'])[45]")
    private WebElement editAutoLink;

    @FindBy(xpath = "//a[@title='AutoLinkEdited']")
    private WebElement autoLinkEdited;

    @FindBy(xpath = "(//i[@data-icon-name='Delete'])[44]")
    private WebElement deleteQuickLink;

    @FindBy(xpath = "//span[contains(@class,'ms-Button-label') and contains(text(),'Yes, delete')]")
    private WebElement yesDelete;

    @FindBy(xpath = "//a[contains(@class,'ms-Button')]")
    private List<WebElement> quickLinks;

    @FindBy(xpath = "(//i[@data-icon-name='Delete'])[43]")
    private WebElement deleteAutomationCategory;

    @FindBy(xpath = "//button[contains(@class,'ms-Nav-chevronButton')]")
    private List<WebElement> categories;

    @FindBy(xpath = "//span[contains(@class,'ms-Button-label') and contains(text(),'Yes, delete')]")
    private WebElement yesDeleteCategory;


    @FindBy(xpath = "//div[@class='ms-Nav-group is-expanded'][6]")    //   Added by Prasad on 03/01/2022
    private WebElement competencyTraining;

    @FindBy(xpath = "//div[@class='ms-Nav-group is-expanded'][8]")
    private WebElement bpaSettings;

    public void addNewCategory(){
        clickElement(addCategory);
        enterText(categoryName,"Automation Links");
        clickElement(Save);
        waitForElementVisibility(saveAndPublish);
        clickElement(saveAndPublish);
        refreshPage();
        System.out.println("Automation Links Category added");
    }

    public void verifyCategoryAdded(){
        try {
            waitForElementVisibility(stakeholders);
            List<String> allCat = new ArrayList<>();
            for (WebElement category : allCategories) {
                allCat.add(category.getText());
            }
            scrollToElement(addedLinks);
            Assert.assertTrue(addedLinks.isDisplayed());
            System.out.println("Automation Links category added verified ");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public void editCategory(){
        try {
            scrollToElement(editAutomationLink);
            clickElement(editAutomationLink);
            checkCheckboxTrue(checkbox1, checkMark1);
            checkCheckboxFalse(checkbox2, checkMark2);
            Utilities.sleep(500);       //
            clickElement(Save);
            scrollToElement(saveAndPublish);
            clickElement(saveAndPublish);
            Assert.assertTrue(isElementPresent(toolTip));
            System.out.println("Automation Links Category collapsed by default verified");
            clickElement(editAutomationLink);
            checkCheckboxFalse(checkbox1, checkMark1);
            checkCheckboxTrue(checkbox2, checkMark2);
            Utilities.sleep(1000);
            clickElement(Save);
            scrollToElement(saveAndPublish);
            clickElement(saveAndPublish);
            Assert.assertTrue(isElementPresent(hide3));
            System.out.println("Automation Links Category hidden verified");
            clickElement(editAutomationLink);
            checkCheckboxFalse(checkbox1, checkMark1);
            checkCheckboxFalse(checkbox2, checkMark2);
            Utilities.sleep(500);
            clickElement(Save);
            scrollToElement(saveAndPublish);
            clickElement(saveAndPublish);
            System.out.println("Automation Links Category edited verified");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public void addQuickLink(){
        scrollDown(addLink);
        clickElement(addLink);
        enterText(linkText,"AutoLink");
        clickElement(iconPicker);
        Utilities.sleep(500);
        clickElement(bankIcon);
        clickElement(close);
        clickElement(pickerButton);
        clearText(hexInput);
        enterText(hexInput,"47db25");
        clickElement(saveColor);
        String dURL = prop.getProperty("spfxURL_dev");
        enterText(destinationURL,dURL);
        Utilities.sleep(1000);  //
        if (sameWindow1.equals("Same window")) {
            clickElement(sameWindow1);
        } else {
            clickElement(newWindow1);
        }
        clickElement(Save);
        waitForElementVisibility(autoLinkColor);
        Assert.assertTrue(autoLinkColor.getText().contains("#47DB25"));
        System.out.println("quick link color verified");
        driver.navigate().refresh();
        Utilities.sleep(5000);
    }

    public void loadUrlInNewTab1(){
        ((JavascriptExecutor)driver).executeScript("window.open()");
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        Utilities.sleep(1000);
        String urlForNewTab1 = prop.getProperty("spfxURL_dev");
        driver.get(urlForNewTab1);
        waitForPageLoaded();
        System.out.println("Following URL opened in new Tab: " + getCurrentURL());
        Utilities.sleep(1000);     //
    }

    private void switchToNewTab1(String basePage){
        Utilities.sleep(2000);
        for(String w: getWindows()){
            if(!w.equals(basePage)){
                switchToWindow(w);
                break;
            }
        }
    }

    public void verifyQuickLinkAdded(){
        try {
            Utilities.sleep(1000);
            scrollToElement(bpaSettings);
            waitForPageLoaded();
            String url = getCurrentURL();
            Assert.assertEquals(url, prop.getProperty("spfxURL_dev")); // Added by Prasad on 28/12/2021
            System.out.println("quick link link verified");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public void editQuickLink(){
        try {
            clickElement(editAutoLink);
            checkCheckboxTrue(checkbox1, checkMark1);
            clickElement(Save);
            Assert.assertTrue(isElementPresent(hide3));
            System.out.println("AutoLink Quick Link hidden verified");
            waitForElementVisibility(editAutoLink);
            clickElement(editAutoLink);
            clearText(linkText);
            enterText(linkText, "AutoLinkEdited");
            checkCheckboxFalse(checkbox1, checkMark1);
            System.out.println("AutoLink Quick link edited verified");
            clickElement(Save);
            waitForPageLoaded();
            Utilities.sleep(1000);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public void verifyQuickLinkEditedInBPANavigation(){
        try {
            Utilities.sleep(1000);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public void deleteQuickLink(){
        Utilities.sleep(1000);
        clickElement(deleteQuickLink);
        Utilities.sleep(1000);
        javaScriptClick(yesDelete);
    }

    public void verifyQuickLinkDeleted(){
        Utilities.sleep(1000); //
        for(WebElement ql: quickLinks){
            if(ql.getText().contains("AutoLink")){
                Assert.fail();
            }
        }
        System.out.println("AutoLink deleted verified");
    }

    public void deleteCategory(){
        clickElement(deleteAutomationCategory);
        javaScriptClick(yesDeleteCategory);
        System.out.println("Automation Links category deleted");
    }

    public void verifyCategoryDeleted(){
        try{
            Utilities.sleep(1000);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
