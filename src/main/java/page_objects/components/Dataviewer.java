package page_objects.components;

import common.Utilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.Assert.assertEquals;

public class Dataviewer extends Component {

    @FindBy(xpath = "//span[contains(text(),'Open Configurator')]")
    private WebElement openConfigurator;

    @FindBy(xpath = "(//input[@type='text'])[2  ]")
    private WebElement configurationTitle;

    @FindBy(xpath = "(//input[@type='text'])[3]")
    private WebElement dataviewerTitle;

    @FindBy(xpath = "(//input[contains(@class,'ms-BasePicker-input')])[1]")
    private WebElement listInput;


    @FindBy(xpath = "//button[@name='Add new']")
    private WebElement addNew;

    @FindBy(xpath="//button[@title='Actions']/descendant::div[contains (text(),'Actions')]")
    private WebElement actions;

    @FindBy(xpath = "//div/div/label[text()='Button Type']//parent::div//parent::div/following-sibling::div//span")
    private WebElement buttonType;

    @FindBy(xpath = "//i[@data-icon-name='SaveAndClose']")
    private WebElement saveAndClose;

    @FindBy(xpath = "//div[@data-bpa-value='AutoCustomButtonTitle']")
    private WebElement customButton;

    @FindBy(xpath = "//input[@value='AutoCustomButtonTitle']")
    private WebElement cbInput;

    @FindBy(xpath ="//div[@tabindex='0']/child::span[2]/i[@data-icon-name='ChevronDown']")
    private WebElement enterButton;

    @FindBy(xpath ="(//div[@tabindex='0']/child::span[2]/i[@data-icon-name='ChevronDown'])[2]")
    private WebElement enterButton2;

    @FindBy(xpath ="(//div[@tabindex='0']/child::span[2]/i[@data-icon-name='ChevronDown'])[3]")
    private WebElement enterButton3;

    @FindBy(xpath ="(//div[@tabindex='0']/child::span[2]/i[@data-icon-name='ChevronDown'])[4]")
    private WebElement enterButton4;

    @FindBy(xpath ="(//div[@tabindex='0']/child::span[2]/i[@data-icon-name='ChevronDown'])[5]")
    private WebElement enterButton5;

    @FindBy(xpath ="(//div[@class='ms-Dropdown-container']/descendant::span)[4]")
    private WebElement enterButtonAlert;

    @FindBy(xpath ="(//div[@class='ms-Dropdown-container']/descendant::span)[5]")
    private WebElement enterButtonItemHistory;

    @FindBy(xpath ="(//div[@class='ms-Dropdown-container']/descendant::span)[3]")
    private WebElement enterNewButton;

    @FindBy(xpath="(//i[@data-icon-name='ChevronDown'])[3]")
    private WebElement chevronDown;

    @FindBy(xpath="//span[contains(text(),'Upload file')]")
    private WebElement uploadButton;

    @FindBy(xpath="//span[contains(text(),'Alert me')]")
    private WebElement alertMeButton;

    @FindBy(xpath="//span[contains(text(),'Permissions')]")
    private WebElement permissionButton;

    @FindBy(xpath="//span[contains(text(),'Share to Teams')]")
    private WebElement shareTeamButton;

    @FindBy(xpath="//span[contains(text(),'AutoCustomButtonTitle')]")
    private WebElement customBtn;

    @FindBy(xpath="//span[contains(text(),'New item')]")
    private WebElement newItemBtn;

    @FindBy(xpath="//span[contains(text(),'Mail Merge')]")
    private WebElement MMButton;

    @FindBy(xpath="//span[contains(@class,'ms-Button-textContainer textContainer')]/child::span[contains(text(),'...')]")
    private WebElement MMSettings;

    @FindBy(xpath="//tr/td[contains(text(),'2/9')]")
    private WebElement templateSection;

    @FindBy(xpath="(//input[@aria-haspopup='listbox'])[3]")
    private WebElement templateDocLibrary;

    @FindBy(xpath="//div[contains(text(),'BPA Mail Merge Templates')]")
    private WebElement MMTemplate;

    @FindBy(xpath="//td[contains(@class,'BPAWizStepContent-')]/div[2]/descendant::input")
    private WebElement templateDocTitle;

    @FindBy(xpath="//div[contains(text(),'AuditReport.docx')]")
    private WebElement documentOption;

    @FindBy(xpath="//tr/td[contains(text(),'3/9')]")
    private WebElement destination;

    @FindBy(xpath="(//button[@title='Close'])[2]")
    private WebElement missingClose;

    @FindBy(xpath="//tr/td[contains(text(),'4/9')]")
    private WebElement mergeMode;

    @FindBy(xpath="//span[contains(text(),'One document per main list item')]")
    private WebElement mergeOption;

    @FindBy(xpath="//span[contains(text(),'One single document. Document content repeated for each main list item')]")
    private WebElement singleDocOption;

    @FindBy(xpath="//tr/td[contains(text(),'8/9')]")
    private WebElement MMManagement;

    @FindBy(xpath="//td[contains(@class,'BPAWizStepContent-')]/div[1]/descendant::input")
    private WebElement uniqueTitle;

    @FindBy(xpath="//label[contains(text(),'Description')]/ancestor::td[contains(@class,'BPAWizStepContent-')]/div[2]/descendant::input")
    private WebElement description;

    @FindBy(xpath="//tr/td[contains(text(),'9/9')]")
    private WebElement automationOption;

    @FindBy(xpath="//label[contains(text(),'Runs automatically')]/parent::div/parent::div/child::div[2]/descendant::i[@data-icon-name='CheckMark']")
    private WebElement runAutomatically;

    @FindBy(xpath="//label[contains(text(),'will merge all items from view')]/parent::div/parent::div/child::div[2]/descendant::i[@data-icon-name='CheckMark']")
    private WebElement mergeWithoutItem;

    @FindBy(xpath="//button[@type='submit']/descendant::span[contains(text(),'Save')]")
    private WebElement saveSettings;

    @FindBy(xpath="(//div[starts-with(text(),'Document Library')])[2]")
    private WebElement documents;

    @FindBy(xpath="//label[contains(text(),'Destination library')]/ancestor::td[contains(@class,'BPAWizStepContent-')]/div[1]/descendant::div[@class='ms-BasePicker']/descendant::input")
    private WebElement destinationLibrary;

    @FindBy(xpath="//td[contains(@class,'BPAWizStepContent-')]/div[3]/div[2]/descendant::input")
    private WebElement destinationDocTitle;

    @FindBy(xpath="//div[contains(text(),'Display options')]")
    private WebElement displayOptions;

    @FindBy(xpath="(//div[@class='ms-SelectionZone']/div/input[@aria-label='SP picker'])[2]")
    private WebElement detailPageTitle;

    @FindBy(xpath="(//div[@class='ms-SelectionZone']/div/input[@aria-label='SP picker'])[3]")
    private WebElement openDocumentColumn;

    @FindBy(xpath="//button[@aria-label='Title']/descendant::div[contains(text(),'Title')]")
    private WebElement titleOption;

    @FindBy(xpath="(//button[@aria-label='Version']/descendant::div[contains(text(),'Version')])[2]")
    private WebElement versionOption;

    @FindBy(xpath="//button[@aria-label='Name']/descendant::div[contains(text(),'LinkFilename')]")
    private WebElement nameOption;

    @FindBy(xpath="(//i[starts-with(@class,'ms-Checkbox-checkmark checkmark')])[1]")
    private WebElement quickEdit;

    @FindBy(xpath="(//i[starts-with(@class,'ms-Checkbox-checkmark checkmark')])[2]")
    private WebElement quickDelete;

    @FindBy(xpath="(//i[starts-with(@class,'ms-Checkbox-checkmark checkmark')])[3]")
    private WebElement allowItemSelection;

    @FindBy(xpath="//span[contains(text(),'Open document')]")
    private WebElement openDocumentButton;

    @FindBy(xpath ="//span[contains(text(),'BPA AI Chat Bot')]")
    private WebElement enterButtonType;

    @FindBy(xpath ="//button[@data-index='2']")
    private WebElement enterButtonTypeEdit;

    @FindBy(xpath="//button[@data-index='6']")
    private WebElement enterButtonTypeShareToTeams;

    @FindBy(xpath="//span[contains(text(),'Alert me')]")
    private WebElement enterButtonTypeAlert;

    @FindBy(xpath = "(//div[@class='ms-TextField-wrapper']/descendant::input[@inputmode='text']) [3]")
    private WebElement buttonTitle;

    @FindBy(xpath ="//button[@title='Icon Picker']/descendant::span[@data-automationid='splitbuttonprimary']")
    private WebElement buttonIcon;

    @FindBy(xpath ="//input[@placeholder='Filter...']")
    private WebElement filterName;

    @FindBy(xpath ="//i[@data-icon-name='EditMirrored']")
    private WebElement selectIcon;

    @FindBy(xpath = "(//span[contains(text(),'Close')])[3]")
    private WebElement closeButton;

    @FindBy(xpath="//i[@data-icon-name='Copy']")
    private WebElement copyDV;

    @FindBy(xpath ="//button[@title='Close']")
    private WebElement closeDataViewer;

    @FindBy(xpath ="//p/descendant::span[contains(text(),'The option Main view is required')]")
    private WebElement mainViewError;

    @FindBy(xpath ="//i[@data-icon-name='ChromeClose']")
    private WebElement cancelButton;

    @FindBy(xpath ="//div[@class='ms-BasePicker']")
    private WebElement mainList;

    @FindBy(xpath = "//div[contains(text(),'This is Custom List')]")
    private WebElement listItem;

    @FindBy(xpath="//div[contains(text(),'Contacts')]")
    private WebElement contactItem;

    @FindBy(xpath="(//div[contains(text(),'Custom List')])[1]")
    private WebElement customListItem;

    @FindBy(xpath="//div[contains(text(),'Compliance Documents')]")
    private WebElement complianceDoc;

    @FindBy(xpath ="(//div[@class='ms-SelectionZone'])[2]")
    private WebElement mainView;

    @FindBy(xpath="(//input[@aria-label='SP picker'])[1]")
    private WebElement listMain;

    @FindBy(xpath="//div[contains(text(),'This is Custom List')]")
    private WebElement customList;

    @FindBy(xpath="//div[contains(text(),'Audits')]")
    private WebElement auditList;

    @FindBy(xpath="//div[contains(text(),'All Audits')]")
    private WebElement All_Audits;

    @FindBy(xpath ="(//input[@aria-label='SP picker'])[2]")
    private WebElement mainViewText;

    @FindBy(xpath="//div[contains(text(),'All Items')]")
    private WebElement mainViewOptn;

    @FindBy(xpath="//div[contains(text(),'All Contacts')]")
    private WebElement contactView;

    @FindBy(xpath="//div[contains(text(),'SampleDDocument')]")
    private WebElement docLibOption;

    @FindBy(xpath="//div[contains(text(),'All Documents')]")
    private WebElement docViewOptn;

    @FindBy(xpath="//div[contains(text(),'Flat View')]")
    private WebElement flatViewOption;

    @FindBy(xpath="//span[contains(text(),'Item history')]")
    private WebElement itemHistoryButton;

    @FindBy(xpath="//span[contains(text(),'BPA AI Chat Bot')]")
    private WebElement chatBotButton;

    @FindBy(xpath="//button[@name='Close']/span/i[@data-icon-name='ChromeClose']")
    private WebElement closeButtonDV;

    @FindBy(xpath="//span[contains(text(),'Button 1')]")
    private WebElement button1;

    @FindBy(xpath="//span[contains(text(),'Button 2')]")
    private WebElement button2;


    public void configureDataviewerForCustomButton(String configTitle, String dvTitle, String list, String view){
        Utilities.sleep(2000);
        clickElement(openConfigurator);
        enterText(configurationTitle,configTitle);
        enterText(dataviewerTitle,dvTitle);
        clickElement(mainList);
        Utilities.sleep(1000);
        enterText(listMain,list);
        clickElement(customList);
        Utilities.sleep(1000);
        clickElement(mainView);
        waitForElementVisibility(mainViewOptn);
        clickElement(mainViewOptn);
    }

    public void configureDataviewerForCustomButtonContactList(String configTitle, String dvTitle, String list, String view){
        Utilities.sleep(2000);
        clickElement(openConfigurator);
        enterText(configurationTitle,configTitle);
        enterText(dataviewerTitle,dvTitle);
        clickElement(mainList);
        Utilities.sleep(1000);
        enterText(listMain,list);
        clickElement(contactItem);
        Utilities.sleep(1000);
        clickElement(mainView);
        waitForElementVisibility(contactView);
        clickElement(contactView);
    }

    public void addMandatoryDVFields(){

    }


    public void configureDataviewerForCustomButtonForQuickEditItem(String configTitle, String dvTitle, String list, String view) {
        Utilities.sleep(2000);
        clickElement(openConfigurator);
        enterText(configurationTitle, configTitle);
        enterText(dataviewerTitle, dvTitle);
        clickElement(mainList);
        Utilities.sleep(1000);
        enterText(listMain, list);
        clickElement(customListItem);
        Utilities.sleep(1000);
        clickElement(mainView);
        Utilities.sleep(2000);
        clickElement(mainViewOptn);
    }

    public void configureDataviewerForComplianceDocuments(String configTitle, String dvTitle, String list, String view) {
        Utilities.sleep(2000);
        clickElement(openConfigurator);
        enterText(configurationTitle, configTitle);
        enterText(dataviewerTitle, dvTitle);
        clickElement(mainList);
        Utilities.sleep(1000);
        enterText(listMain, list);
        clickElement(complianceDoc);
        Utilities.sleep(1000);
        clickElement(mainView);
        Utilities.sleep(2000);
        clickElement(docViewOptn);
    }

    public void configureDataviewerForAuditList(String configTitle, String dvTitle, String list, String view){
        Utilities.sleep(2000);
        clickElement(openConfigurator);
        enterText(configurationTitle, configTitle);
        enterText(dataviewerTitle, dvTitle);
        clickElement(mainList);
        Utilities.sleep(1000);
        enterText(listMain, list);
        clickElement(auditList);
        Utilities.sleep(1000);
        clickElement(mainView);
        Utilities.sleep(2000);
        clickElement(All_Audits);
    }

    public void configureDataviewerForComplianceDocumentsForFlatView(String configTitle, String dvTitle, String list, String flatView){
        Utilities.sleep(2000);
        clickElement(openConfigurator);
        enterText(configurationTitle, configTitle);
        enterText(dataviewerTitle, dvTitle);
        clickElement(mainList);
        Utilities.sleep(1000);
        enterText(listMain, list);
        clickElement(complianceDoc);
        Utilities.sleep(1000);
        clickElement(mainView);
        Utilities.sleep(2000);
        clickElement(flatViewOption);
    }


    public void configureDataviewerForDocumentLibrary(String configTitle, String dvTitle, String doc, String view) {
        Utilities.sleep(2000);
        clickElement(openConfigurator);
        enterText(configurationTitle, configTitle);
        enterText(dataviewerTitle, dvTitle);
        clickElement(mainList);
        Utilities.sleep(1000);
        enterText(listMain, doc);
        clickElement(docLibOption);
        Utilities.sleep(1000);
        clickElement(mainView);
        Utilities.sleep(2000);
        clickElement(docViewOptn);
    }

    public void configureDataviewerForCustomButtonMandatoryFields(String list, String view) {
        clickElement(openConfigurator);
        clickElement(mainList);
        Utilities.sleep(1000);
        enterText(listMain,list);
        clickElement(contactItem);
        Utilities.sleep(1000);
        clickElement(mainView);
        Utilities.sleep(2000);
        clickElement(contactView);
        clickElement(saveAndClose);
        Utilities.sleep(2000);
        clickElement(closeDataViewer);

    }

    public void configureDataviewerForOneCustomButtonMandatoryFields(String list) {
        clickElement(openConfigurator);
        clickElement(mainList);
        Utilities.sleep(1000);
        enterText(listMain,list);
        clickElement(contactItem);
        clickElement(saveAndClose);
        Utilities.sleep(2000);
        String error = mainViewError.getText();
        assertEquals("The option Main view is required",error);
    }

    public void configureCustomButton(){
        Utilities.sleep(2000);
        clickElement(addNew);
        Utilities.sleep(2000);
        scrollToElement(enterButton);
        javaScriptClick(enterButton);
        Utilities.sleep(2000);
        javaScriptClick(enterButtonType);
        Utilities.sleep(2000);
        clearText(buttonTitle);
        Utilities.sleep(2000);
        enterTextKeys(buttonTitle, "Edit Button");
        Utilities.sleep(2000);
        clickElement(buttonIcon);
        Utilities.sleep(2000);
        enterTextKeys(filterName, "Edit");
        Utilities.sleep(1000);
        clickElement(selectIcon);
        Utilities.sleep(2000);
        clickElement(closeButton);
        Utilities.sleep(2000);
        clickElement(saveAndClose);
        Utilities.sleep(2000);
        clickElement(closeDataViewer);
    }

    public void cancelConfigureCustomButton(){
        Utilities.sleep(2000);
        clickElement(addNew);
        Utilities.sleep(2000);
        javaScriptClick(enterButton);
        Utilities.sleep(2000);
        clickElement(enterButtonType);
        Utilities.sleep(2000);
        clearText(buttonTitle);
        Utilities.sleep(2000);
        enterTextKeys(buttonTitle, "Edit Button");
        Utilities.sleep(2000);
        clickElement(buttonIcon);
        Utilities.sleep(2000);
        enterTextKeys(filterName, "Edit");
        Utilities.sleep(1000);
        clickElement(selectIcon);
        Utilities.sleep(2000);
        clickElement(closeButton);
        Utilities.sleep(2000);
        clickElement(cancelButton);
        Utilities.sleep(2000);
        clickElement(closeDataViewer);
    }

    public void selectCustomButton(){
        clickElement(openConfigurator);
        clickElement(buttonType);
        clickElement(customButton);
        clickElement(saveAndClose);
    }

    public void addItemHistoryButton(){
        Utilities.sleep(2000);
        clickElement(addNew);
        Utilities.sleep(2000);
        javaScriptClick(enterButton);
        Utilities.sleep(2000);
        javaScriptClick(itemHistoryButton);
        Utilities.sleep(1000);
        clickElement(itemHistoryButton);
        Utilities.sleep(2000);
    }

    public void addChatBotButton(){
        Utilities.sleep(2000);
        clickElement(addNew);
        Utilities.sleep(2000);
        javaScriptClick(enterButton);
        Utilities.sleep(2000);
        clickElement(chatBotButton);
    }

    public void addOpenDocumentButton(){
        Utilities.sleep(2000);
        clickElement(addNew);
        Utilities.sleep(2000);
        javaScriptClick(enterButton);
        Utilities.sleep(2000);
        clickElement(openDocumentButton);
        Utilities.sleep(2000);
    }

    public void addUploadButton(){
        Utilities.sleep(2000);
        clickElement(addNew);
        Utilities.sleep(2000);
        javaScriptClick(enterButton);
        Utilities.sleep(2000);
        clickElement(uploadButton);
        Utilities.sleep(2000);
        clickElement(saveAndClose);
        Utilities.sleep(2000);
        clickElement(closeDataViewer);
    }

    public void addAlertMeButton(){
        Utilities.sleep(2000);
        clickElement(addNew);
        Utilities.sleep(2000);
        javaScriptClick(enterButton);
        Utilities.sleep(2000);
        javaScriptClick(alertMeButton);
        Utilities.sleep(2000);
        clickElement(alertMeButton);
        Utilities.sleep(2000);
    }

    public void addPermissionButton(){
        Utilities.sleep(2000);
        clickElement(addNew);
        Utilities.sleep(2000);
        javaScriptClick(enterButton);
        clickElement(permissionButton);
        Utilities.sleep(2000);
    }

    public void shareToTeamButton(){
        Utilities.sleep(2000);
        clickElement(addNew);
        Utilities.sleep(2000);
        javaScriptClick(enterButton);
        Utilities.sleep(2000);
        clickElement(shareTeamButton);
        Utilities.sleep(2000);
    }

    public void addCustomButton(){
        Utilities.sleep(2000);
        clickElement(addNew);
        Utilities.sleep(2000);
        javaScriptClick(enterButton);
        Utilities.sleep(2000);
        clickElement(customBtn);
        Utilities.sleep(2000);
    }

    public void showDisplayOptions(){
        Utilities.sleep(2000);
        clickElement(displayOptions);
        Utilities.sleep(2000);
        clickElement(quickEdit);
        clickElement(quickDelete);
        clickElement(allowItemSelection);
        Utilities.sleep(2000);

    }

    public void showDisplayDeleteOptions(){
        clickElement(displayOptions);
        Utilities.sleep(2000);
        clickElement(quickDelete);
    }

    public void showDisplayQuickEditOption(){
        Utilities.sleep(2000);
        clickElement(displayOptions);
        Utilities.sleep(2000);
        clickElement(quickEdit);
    }

    public void clickDisplayOptions(){
        clickElement(displayOptions);
    }

    public void selectDetailPageColumn(){
        clickElement(detailPageTitle);
        Utilities.sleep(2000);
        enterText(detailPageTitle,"Version");
        clickElement(versionOption);
        Utilities.sleep(1000);
    }

    public void addNewItemButton() {
        Utilities.sleep(2000);
        clickElement(addNew);
        Utilities.sleep(5000);
        scrollToElement(enterButton);
        javaScriptClick(enterButton);
        Utilities.sleep(2000);
        clickElement(newItemBtn);
    }

    public void addNewItemButtonMM() {
        Utilities.sleep(2000);
        clickElement(addNew);
        Utilities.sleep(5000);
        scrollToElement(enterButton2);
        javaScriptClick(enterButton2);
        Utilities.sleep(2000);
        clickElement(newItemBtn);
    }
    public void selectOpenDocumentColumn(){
        clickElement(openDocumentColumn);
        Utilities.sleep(2000);
        clickElement(titleOption);
        Utilities.sleep(1000);
    }

    public void checkShowOpenLinkColumn(){
        scrollBar();
        System.out.println("Show link to open document on this column is not present");
    }

    public void addEditButtonWithText(){
        Utilities.sleep(2000);
        clickElement(addNew);
        Utilities.sleep(2000);
        clickElement(enterButton);
        Utilities.sleep(2000);
        clickElement(enterButtonTypeEdit);
        Utilities.sleep(2000);
        clearText(buttonTitle);
        Utilities.sleep(2000);
        enterTextKeys(buttonTitle, "Button-1");
        Utilities.sleep(2000);
    }

    public void addShareButtonWithText(){
        clickElement(addNew);
        Utilities.sleep(2000);
        waitForElementVisibility(enterButton);
        clickElement(enterButton);
        Utilities.sleep(2000);
        clickElement(enterButtonTypeShareToTeams);
        Utilities.sleep(2000);
        clearText(buttonTitle);
        Utilities.sleep(2000);
        enterTextKeys(buttonTitle, "Button-2");
        Utilities.sleep(2000);
    }

    public void addAlertButtonWithText(){
        clickElement(addNew);
        Utilities.sleep(2000);
        clickElement(chevronDown);
        Utilities.sleep(2000);
        clickElement(enterButtonTypeAlert);
        Utilities.sleep(2000);
        clearText(buttonTitle);
        Utilities.sleep(2000);
        enterTextKeys(buttonTitle, "Button-3");
        Utilities.sleep(2000);
    }

    public void addMMButton(){
        Utilities.sleep(2000);
        clickElement(addNew);
        Utilities.sleep(2000);
        javaScriptClick(enterButton);
        Utilities.sleep(2000);
        clickElement(MMButton);
    }

    public void addFirstButton(){
        Utilities.sleep(2000);
        clickElement(addNew);
        Utilities.sleep(5000);
        scrollToElement(enterButton);
        javaScriptClick(enterButton);
        Utilities.sleep(2000);
        clickElement(newItemBtn);
        Utilities.sleep(2000);
    }

    public void addSecondButton(){
        Utilities.sleep(2000);
        clickElement(addNew);
        Utilities.sleep(2000);
        scrollToElement(enterButton2);
        javaScriptClick(enterButton2);
        Utilities.sleep(2000);
        javaScriptClick(alertMeButton);
        Utilities.sleep(2000);
    }

    public void addThirdButton(){
        Utilities.sleep(2000);
        clickElement(addNew);
        Utilities.sleep(5000);
        scrollToElement(enterButton3);
        javaScriptClick(enterButton3);
        Utilities.sleep(2000);
        clickElement(itemHistoryButton);
    }

    public void addFourthButton(){
        Utilities.sleep(2000);
        clickElement(addNew);
        Utilities.sleep(5000);
        scrollToElement(enterButton4);
        javaScriptClick(enterButton4);
        Utilities.sleep(2000);
        clickElement(permissionButton);
        Utilities.sleep(2000);

    }

    public void addFifthButton(){
        Utilities.sleep(2000);
        clickElement(addNew);
        Utilities.sleep(5000);
        scrollToElement(enterButton5);
        javaScriptClick(enterButton5);
        Utilities.sleep(2000);
        clickElement(openDocumentButton);
        Utilities.sleep(2000);
    }

    public void MMButtonSettings(){
        Utilities.sleep(2000);
        scrollToElement(MMSettings);
        clickElement(MMSettings);
        clickElement(templateSection);
        clickElement(templateDocLibrary);
        enterText(templateDocLibrary,"BPA Mail Merge Templates");
        clickElement(MMTemplate);
        Utilities.sleep(1000);
        clickElement(templateDocTitle);
        clickElement(documentOption);
        Utilities.sleep(2000);
        clickElement(templateSection);
        clickElement(destination);
        Utilities.sleep(2000);
        javaScriptClick(templateDocTitle);
        Utilities.sleep(2000);
        enterText(destinationLibrary,"Compliance Documents");
        clickElement(complianceDoc);
        clickElement(destinationDocTitle);
        enterText(destinationDocTitle,"TestAutomation-MM");
        clickElement(destination);
        clickElement(mergeMode);
        clickElement(mergeOption);
        Utilities.sleep(2000);
        clickElement(singleDocOption);
        clickElement(mergeMode);
        clickElement(MMManagement);
        Utilities.sleep(1000);
        clickElement(uniqueTitle);
        enterText(uniqueTitle,"TestAutomMMTitle");
        enterText(description,"TestAutomMMTitle");
        Utilities.sleep(2000);
    }

    public void MMButtonSettingsDocument(){
        Utilities.sleep(2000);
        scrollToElement(MMSettings);
        clickElement(MMSettings);
        clickElement(templateSection);
        clickElement(templateDocLibrary);
        enterText(templateDocLibrary,"BPA Mail Merge Templates");
        clickElement(MMTemplate);
        Utilities.sleep(1000);
        clickElement(templateDocTitle);
        clickElement(documentOption);
        Utilities.sleep(2000);
        clickElement(templateSection);
        clickElement(destination);
        Utilities.sleep(2000);
        clickElement(templateDocTitle);
        Utilities.sleep(2000);
        enterText(destinationLibrary,"Documents");
        clickElement(documents);
        clickElement(destinationDocTitle);
        enterText(destinationDocTitle,"TestAutomation-MM");
        clickElement(destination);
        clickElement(mergeMode);
        clickElement(mergeOption);
        Utilities.sleep(2000);
        clickElement(singleDocOption);
        clickElement(mergeMode);
        clickElement(MMManagement);
        Utilities.sleep(1000);
        clickElement(uniqueTitle);
        enterText(uniqueTitle,"TestAutomMMTitle");
        enterText(description,"TestAutomMMTitle");
        Utilities.sleep(2000);
    }

    public void automationOption(){
        clickElement(automationOption);
        waitForElementVisibility(runAutomatically);
        scrollToElement(runAutomatically);
        Utilities.sleep(2000);
        clickElement(runAutomatically);
    }

    public void mergeWithoutItem(){
        clickElement(automationOption);
        waitForElementVisibility(mergeWithoutItem);
        scrollToElement(mergeWithoutItem);
        javaScriptClick(mergeWithoutItem);
    }

    public void saveSettings(){
        clickElement(saveSettings);
    }

    public void linkToOpenDocumentByName(){
        clickElement(openDocumentColumn);
        Utilities.sleep(2000);
        scrollToElement(nameOption);
        Utilities.sleep(1000);
        clickElement(nameOption);
    }

    public void saveandCloseButton(){
        clickElement(saveAndClose);
        Utilities.sleep(5000);
    }

    public void createMultipleDV(){
        clickElement(copyDV);
        Utilities.sleep(1000);
    }

    public void changeDVNames(String dvName){
        Utilities.sleep(2000);
        clickElement(openConfigurator);
        clickElement(dataviewerTitle);
        clearText(dataviewerTitle);
        enterText(dataviewerTitle,dvName);
    }

    public void reorderButton(){
        Utilities.sleep(2000);
        clickElement(openConfigurator);
        scrollToElement(addNew);
        dragAndDrop(button1,button2);

    }

    public void clickCloseButton(){
        clickElement(closeButtonDV);
    }
}
