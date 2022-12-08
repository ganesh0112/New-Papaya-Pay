package page_objects.pages;

import common.Utilities;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SitePages extends SubsitePage {
    private static final Logger log = LogManager.getLogger(SitePages.class);

    @FindBy(xpath = "//a[@title='Pages']")
    private WebElement Pages;

    @FindBy(xpath = "//span[contains(text(),'New')]")
    private WebElement New;

    @FindBy(xpath="//button[@name='Site Page']/descendant::span[contains(text(),'Site Page')]")
    private WebElement sitePage;

    @FindBy(xpath = "//textarea[@placeholder='Add a name']")
    private WebElement pageTitle;

    @FindBy(xpath = "//button[@name='Publish']/descendant::span[contains(text(),'Publish')]")
    private WebElement publish;

    @FindBy(xpath = "//button[@name='Republish']")
    private WebElement republish;

    @FindBy(xpath = "//button[contains(text(),'TestCustomButton.aspx')]")
    private WebElement testCustomButtonPage;

    @FindBy(xpath = "(//i[@data-icon-name='Add'])[2]")
    private WebElement addWebPart;

    @FindBy(xpath = "//input[@placeholder='Search']")
    private WebElement search;

    @FindBy(xpath = "//div[@title='BPA DataViewer (SPFx)']")
    private WebElement dataViewer;

    @FindBy(xpath="//div[@title='BPA Master-Detail (SPFx)']")
    private WebElement masterDetail;

    @FindBy(xpath="//i[@data-icon-name='TabletMode']")
    private WebElement button;

    @FindBy(xpath = "//header[contains(text(), 'Frequently used')]//following::div[@title='BPA DataViewer (SPFx)'][1]")
    private WebElement dataViewer1;

    @FindBy(xpath = "(//button[@aria-label='Edit web part'])[2]")
    private WebElement editWebPart;

    @FindBy(xpath="//span[contains(text(),'Create a new item')]")
    private WebElement btnOrder1;

    @FindBy(xpath="//span[contains(text(),'Alert me on changes')]")
    private WebElement btnOrder2;


    @FindBy(xpath="//button[@name='Edit']/span/child::i[@data-icon-name='Edit']")
    private WebElement editDV;

    @FindBy(xpath="//div[contains(text(),'Dataviewer01')]")
    private WebElement dataViewerCheck;

    @FindBy(xpath="//span[contains(text(),'Close')]")
    private WebElement cancelBtnDV;

    @FindBy(xpath = "//h2[contains(text(),'Component is not configured')]")
    private WebElement componentIsNotConfigured;

    @FindBy(xpath="(//i[@data-icon-name='Delete'])[1]")
    private WebElement trashDV;

    @FindBy(xpath = "(//i[@data-icon-name='Edit'])[1]")
    private WebElement edit;

    @FindBy(xpath = "(//i[@data-icon-name='Cancel'])[2]")
    private WebElement cancle;

    @FindBy(id = "obf-ToastCancel")
    private WebElement closeAleart;

    @FindBy(xpath = "//i[@data-icon-name= 'BackToWindow']")
    private WebElement showHeaderAndNavigation;

    @FindBy(xpath = "//span[contains(text(),'Open Configurator')]")
    private WebElement configuratorButton;

    @FindBy(xpath = "//button[@data-automation-id='deleteButton']")
    private WebElement deleteWebPart;

    @FindBy(xpath ="//button[@data-automation-id='duplicateButton']")
    private WebElement duplicateWebPart;

    @FindBy(xpath = "//input[@placeholder='Type label here']")
    private WebElement buttonDetails;

    @FindBy(xpath="//input[@placeholder='https://']")
    private WebElement buttonUrl;

    @FindBy(xpath="//i[@data-icon-name='AlignHorizontalCenter']")
    private WebElement buttonAlignment;

    @FindBy(xpath="//button[@title='Close']")
    private WebElement cancelButton;

    @FindBy(xpath="(//i[@data-icon-name='Cancel'])[2]")
    private WebElement cancelNavBar;

    @FindBy(xpath="//i[@id='o365shellwcssframe']")
    private WebElement publishIframe;

    @FindBy(xpath="//span[contains(text(),'Add page to navigation')]")
    private WebElement addPage;

    @FindBy(xpath="//div[contains(text(),'Help others find your page')]/parent::div/following::button[1]")
    private WebElement addCancelPage;

    @FindBy(xpath="//button[@name='New']/child::span/child::i[@data-icon-name='CalculatorAddition']")
    private WebElement newBtn;

    @FindBy(xpath="//li[@title='Document library']")
    private WebElement documentLibrary;

    @FindBy(xpath="//li[@title='List']/button[@name='List']")
    private WebElement listOption;

    @FindBy(xpath="//iframe[@name='createListFrame']")
    private WebElement listIframe;

    @FindBy(xpath="//i[@data-icon-name='Add']")
    private WebElement blankList;

    @FindBy(xpath="//input[@id='listNameInput']")
    private WebElement listName;

    @FindBy(xpath="//button[@data-automationid='createListButton']")
    private WebElement createListBtn;

    @FindBy(xpath="//i[@data-icon-name='Cancel']")
    private WebElement cancelBtn;

    @FindBy(xpath="//div[@name='This is Custom List']/descendant::span[contains(text(),'This is Custom List')]")
    private WebElement listItem;

    @FindBy(xpath="//div[@class='ms-TextField-wrapper']/descendant::input[@placeholder='Enter value here']")
    private WebElement addItemTitle;

    @FindBy(xpath="//button[@data-automationid='ReactClientFormSaveButton']/descendant::span[contains(text(),'Save')]")
    private WebElement saveItemBtn;

    @FindBy(xpath="//span[contains(text(),'Add column')]")
    private WebElement addColumn;

    @FindBy(xpath="//span[contains(text(),'Number')]")
    private WebElement numOption;

    @FindBy(xpath="//input[@aria-label='Name']")
    private WebElement colName;

    @FindBy(xpath="//i[@data-icon-name='Add']")
    private WebElement newPageBtn;

    @FindBy(xpath="//span[contains(text(),'Save')]")
    private WebElement saveBtn;

    @FindBy(xpath="//span[contains(text(),'TestDVSample')]")
    private WebElement dvElement;

    @FindBy(xpath="//button[@name='Edit']")
    private WebElement editButton;

    @FindBy(xpath="//div[@class='ms-TextField-wrapper']/child::div/child::input[@type='text']")
    private WebElement docLibraryName;

    @FindBy(xpath="(//span[contains(text(),'Create')])[2]")
    private WebElement createDocBtn;

    @FindBy(xpath="//span[contains(text(),'DocuList')]")
    private WebElement docList;

    @FindBy(xpath="//button[@name='Word document']")
    private WebElement wordDoc;

    @FindBy(xpath="//div[@name='TestingDVSample']/a[@title='TestingDVSample']")
    private WebElement dvTestElement;

    @FindBy(xpath="//i[@data-icon-name='StatusCircleCheckmark']")
    private WebElement cirlceMark;

    @FindBy(xpath="//span[contains(text(),'View and change permissions')]")
    private WebElement checkPermissonBtn;

    @FindBy(xpath="//span[contains(text(),'Share to Teams')]")
    private WebElement shareTeam;

    @FindBy(xpath="//i[@data-icon-name='Delete']")
    private WebElement deleteCustomItem;

    @FindBy(xpath="(//i[@data-icon-name='Edit'])[2]")
    private WebElement quickEditBtn;

    @FindBy(xpath="//input[starts-with(@id,'TextField')]")
    private WebElement quickEditText;

    @FindBy(xpath="//button[@name='Save']")
    private WebElement quickEditSaveBtn;

    @FindBy(xpath="//a[contains(text(),'Custom Buttons')]")
    private WebElement customBtn;

    @FindBy(xpath="//span[contains(text(),'New Custom button')]")
    private WebElement newCustomBtn;

    @FindBy(xpath="//input[@placeholder='Button ID']")
    private WebElement buttonId;

    @FindBy(xpath="//input[@placeholder='Button title']")
    private WebElement buttonTitle;

    @FindBy(xpath="//input[@placeholder='Button URL']")
    private WebElement buttonURL;

    @FindBy(xpath="//input[@placeholder='Button description']")
    private WebElement buttonDescription;

    @FindBy(xpath="//span[contains(text(),'New window')]")
    private WebElement windowOptn;

    @FindBy(xpath="//i[@data-icon-name='Unknown']")
    private WebElement btnIcon;

    @FindBy(xpath="//input[@placeholder='Filter...']")
    private WebElement filter;

    @FindBy(xpath="//i[@data-icon-name='PowerButton']")
    private WebElement iconName;

    @FindBy(xpath="//span[contains(text(),'Close')]")
    private WebElement closeIconBtn;

    @FindBy(xpath="//button[@type='submit']/descendant::span[contains(text(),'Save')]")
    private WebElement saveCustomBtn;

    @FindBy(xpath="//button[@title='This button created for Automation Test']/descendant::span[contains(text(),'AutoCustomButtonTitle')]")
    private WebElement customBtnClick;

    @FindBy(xpath="//a[contains(text(),'Link Editor')]")
    private WebElement linkEditor;

    @FindBy(xpath="//button[@aria-label='New Lookup Link']/span/descendant::span[contains(text(),'New Lookup Link')]")
    private WebElement newLookUpLink;

    @FindBy(xpath="(//div[@class='ms-SelectionZone']/descendant::input[@aria-label='SP picker'])[1]")
    private WebElement linklistOption;

    @FindBy(xpath="//button[@aria-label='Compliance Documents']/descendant::div[contains(text(),'Compliance Documents')]")
    private WebElement complianceDocOption;

    @FindBy(xpath="//input[@placeholder='Link URL']")
    private WebElement listLinkURL;

    @FindBy(xpath="//div[@data-bpa-fieldname='linkConditionType']/span[contains(text(),'No condition')]")
    private WebElement conditionType;

    @FindBy(xpath="//button[@type='submit']/descendant::span[contains(text(),'Save')]")
    private WebElement saveLinkBtn;

    @FindBy(xpath="//button[@name='New']/span/child::span/following-sibling::i[@data-icon-name='ChevronDown']")
    private WebElement newDocBtn;

    @FindBy(xpath="//button[@name='Folder']/div/i[@data-icon-name='folder16_1.5x_svg']")
    private WebElement folderOption;

    @FindBy(xpath="//input[@placeholder='Enter your folder name']")
    private WebElement folderName;

    @FindBy(xpath="//button[@data-automation-id='Create']//span[contains(text(),'Create')]")
    private WebElement createFolder;

    @FindBy(xpath="//div[contains(text(),'ListTesting')]")
    private WebElement editedQuickText;

    @FindBy(xpath="//span[contains(text(),'Yes, delete')]")
    private WebElement yesDelete;

    @FindBy(xpath="//a[@title ='Test-DV']/span")
    private WebElement expiredDVLicense;

    @FindBy(xpath="//div[contains(text(),'Your license is expired. Please submit a new license request from')]")
    private WebElement expiredDVMsg;

    @FindBy(xpath="//span[contains(text(),'Test-DV')]")
    private WebElement maxUserDV;

    @FindBy(xpath="//div[contains(text(),'Maximum number of users allowed by this license is reached. Please deactivate some users from ')]")
    private WebElement maxUserMsg;

    @FindBy(xpath="//li[1]/button[@name='Single line of text']")
    private WebElement singleTextColumn;

    @FindBy(xpath="//li[2]/button[@name='Multiple lines of text']")
    private WebElement multipleTestColumn;

    @FindBy(xpath="//li[4]/button[@name='Number']")
    private WebElement numberColumn;

    @FindBy(xpath="//li/button[@name='Yes/No']")
    private WebElement yesNo;

    @FindBy(xpath = "//li/button[@name='Date and time']")
    private WebElement dateTime;

    @FindBy(xpath="//input[@type='text']")
    private WebElement titleText;

    @FindBy(xpath="(//input[@type='text'])[2]")
    private WebElement singleText;

    @FindBy(xpath="//textarea[@aria-label='MultipleText, empty, field editor. ']")
    private WebElement multipleText;

    @FindBy(xpath ="(//input[@type='text'])[3]")
    private WebElement number;

    @FindBy(xpath="//input[@placeholder='Enter a date']")
    private WebElement dateText;

    @FindBy(xpath="//i[@data-icon-name='CheckMark']")
    private WebElement checkbox;

    @FindBy(xpath ="//button[@name='All Items']")
    private WebElement allItems;

    @FindBy(xpath ="//span[contains(text(),'Create new view')]")
    private WebElement createView;

    @FindBy(xpath ="//input[@id='ViewName']")
    private WebElement addView;

    @FindBy(xpath ="//button/descendant::span[contains(text(),'Create')]")
    private WebElement create;

    @FindBy(xpath="//button[@name='View-2']/descendant::span[contains(text(),'View-2')]")
    private WebElement addedView;

    @FindBy(xpath="//button[@name='Edit current view']")
    private WebElement editView;

    @FindBy(xpath="//a[@role='button']/img[@id='imgViewGroup']")
    private WebElement groupBy;

    @FindBy(xpath="//select[@name='GroupField1']")
    private WebElement groupField;

    @FindBy(xpath="//select[@id='idGroupField2']")
    private WebElement groupField2;

    @FindBy(xpath="//input[@id='onetidSaveItem']")
    private WebElement saveItem;

    @FindBy(xpath="//button[@title='View Options']")
    private WebElement viewOptions;

    @FindBy(xpath="//span[contains(text(),'Add View')]")
    private WebElement viewAdd;

    @FindBy(xpath= "(//input[@role='combobox'])[4]")
    private WebElement newView1;

    @FindBy(xpath= "(//input[contains(@id,'combobox-id__')])[3]")
    private WebElement newView2;

    @FindBy(xpath ="//div[contains(text(),'All Items')]")
    private WebElement AllItems;

    @FindBy(xpath="//div[contains(text(),'View-2')]")
    private WebElement View2;

    @FindBy(xpath="//span[contains(text(),'Switch View')]")
    private WebElement switchView;

    @FindBy(xpath="//button[@title='View-2']")
    private WebElement view2;

    @FindBy(xpath="//i[@data-icon-name='ChevronRightMed']")
    private  WebElement chevronType;

    @FindBy(xpath ="//div[@class='ms-List-surface']/child::div[@class='ms-List-page']")
    private WebElement itemList;

    @FindBy(xpath = "//span[contains(text(),'Open Configurator')]")
    private WebElement openConfigurator;

    @FindBy(xpath="//div[contains(text(),'MasterDetail')]")
    private WebElement MasterDetail;

    public void addSitePage(String pageName){
        waitForPageLoaded();
        Utilities.sleep(3000);
        clickElement(Pages);
        Utilities.sleep(2000);
        clickElement(New);
        Utilities.sleep(2000);
        clickElement(sitePage);
        enterText(pageTitle,pageName);
        log.info("Page added");
    }

    public void publish(){
        waitForElementVisibility(publish);
        javaScriptClick(publish);
        log.info("Page Published");
        Utilities.sleep(2000);
        clickElement(addPage);
        Utilities.sleep(2000);
        clickElement(addCancelPage);
    }

    public void republish(){
        Utilities.sleep(500);
        clickElement(republish);
        log.info("Page republished");
    }

    public void addWebPart(String webPartName){
        clickElement(addWebPart);
        enterText(search,webPartName);
        Utilities.sleep(2000);
        clickElement(dataViewer);
        log.info(webPartName +" web part added");
        Utilities.sleep(5000);
    }

    public void addMDWebPart(String webPartName){
        waitForElementVisibility(addWebPart);
        javaScriptClick(addWebPart);
        enterText(search,webPartName);
        Utilities.sleep(2000);
        clickElement(masterDetail);
        log.info(webPartName +" web part added");
        Utilities.sleep(5000);

    }

    public void editWebPart(){
        waitForElementVisibility(componentIsNotConfigured);
        clickElement(editWebPart);
    }

    public void editMDPart(){
        waitForElementVisibility(MasterDetail);
        javaScriptClick(MasterDetail);
        clickElement(editWebPart);
    }

    public void checkBtnOrder(){
        waitForPageLoaded();
        System.out.println("The order of the button is:");
        String button1 = btnOrder1.getText();
        String button2 = btnOrder2.getText();
        System.out.println(button1 +"\n" + button2);

    }

    public void editDV(){
        clickElement(editDV);
        Utilities.sleep(5000);
        javaScriptClick(dataViewerCheck);
        Utilities.sleep(5000);
        clickElement(editWebPart);
        if(cancelBtn.isDisplayed()){
            clickElement(cancelBtnDV);
        }
    }

    public void addLibraryList(String webPartName) {
        clickElement(addWebPart);
        enterText(search,webPartName);
        Utilities.sleep(2000);
        clickElement(button);
    }

    public void editAddedWebPart(){
        Utilities.sleep(2000);
        waitForPageLoaded();
        clickElement(edit);
        Utilities.sleep(2000);
        clickElement(closeAleart);
        Utilities.sleep(2000);
        clickElement(showHeaderAndNavigation);
        clickElement(editWebPart);
    }

    public void openTestCustomButtonPage(){
        clickElement(Pages);
        clickElement(testCustomButtonPage);
        waitForPageLoaded();
    }

    public void deleteWebPart() {
        refreshPage();
        clickElement(editDV);
        clickElement(addWebPart);
        clickElement(trashDV);
    }

    public void duplicateWebPart() {
        refreshPage();
        clickElement(editDV);
        clickElement(addWebPart);
        waitForElementVisibility(componentIsNotConfigured);
        clickElement(duplicateWebPart);
    }

    public void enterButtonDetails(String label, String url) {
        enterText(buttonDetails, label);
        Utilities.sleep(1000);
        enterText(buttonUrl, url);
        clickElement(buttonAlignment);
        Utilities.sleep(1000);
        clickElement(cancelButton);
    }

    public void addCustomList(){
        Utilities.sleep(2000);
        clickElement(newBtn);
        Utilities.sleep(1000);
        clickElement(listOption);
        Utilities.sleep(2000);
        switchToIFrame(listIframe);
        Utilities.sleep(1000);
        clickElement(blankList);
        Utilities.sleep(1000);
        enterText(listName,"This is Custom List");
        Utilities.sleep(2000);
        clickElement(createListBtn);
        clickElement(cancelBtn);
        switchToDefaultContent();
    }

    public void addListItem(){
        scrollToElement(listItem);
        Utilities.sleep(2000);
        clickElement(listItem);
        Utilities.sleep(1000);
    }

    public void addItem(){
        clickElement(newBtn);
        enterText(addItemTitle,"Sample-List");
        clickElement(saveItemBtn);
    }

    public void addColumn(){
        clickElement(addColumn);
        clickElement(numOption);
        enterText(colName,"NewColumnAdded");
        clickElement(saveBtn);
        refreshPage();
    }

    public void addListDV(String webPartName){
        scrollToElement(dvElement);
        Utilities.sleep(2000);
        clickElement(dvElement);
        clickElement(editButton);
        Utilities.sleep(1000);
        clickElement(addWebPart);
        enterText(search,webPartName);
        Utilities.sleep(2000);
        clickElement(dataViewer);
        log.info(webPartName +" web part added");
        Utilities.sleep(2000);
    }

    public void addDocumentList(){
        Utilities.sleep(3000);
        clickElement(newPageBtn);
        Utilities.sleep(2000);
        clickElement(documentLibrary);
        Utilities.sleep(1000);
        enterText(docLibraryName,"SampleDDocument");
        clickElement(createDocBtn);
    }

    public void createDocument(){
        scrollToElement(docList);
        Utilities.sleep(2000);
        clickElement(docList);
        clickElement(newBtn);
        Utilities.sleep(1000);
        clickElement(wordDoc);
        switchToTab();
    }

    public void navigateDVConfigurator(String webPartName){
        scrollToElement(dvElement);
        Utilities.sleep(2000);
        clickElement(dvTestElement);
        //clickElement(editButton);
        clickElement(editButton);
        Utilities.sleep(1000);
        log.info(webPartName +" web part added");
        Utilities.sleep(2000);
    }

    public void clickCircleMark(){
        Utilities.sleep(2000);
        clickElement(cirlceMark);
        if(checkPermissonBtn.isDisplayed()){
            System.out.println("Permission button is displayed..");
        }
    }

    public void checkShareTeamButton(){
        waitForElementVisibility(shareTeam);
        if(shareTeam.isDisplayed()){
            System.out.println("Share Team button is displayed..");
        }
    }

    public void deletecustomItem(){
        Utilities.sleep(2000);
        clickElement(deleteCustomItem);
        Utilities.sleep(1000);
        clickElement(yesDelete);
    }

    public void quickEditItem(){
        Utilities.sleep(5000);
        clickElement(quickEditBtn);
        Utilities.sleep(2000);
        clickElement(quickEditText);
        clearText(quickEditText);
        Utilities.sleep(1000);
        enterText(quickEditText, "ListTesting");
        clickElement(quickEditSaveBtn);
    }

    public void clickOnNewCustomButton(){
        clickElement(customBtn);
        clickElement(newCustomBtn);
    }

    public void addCustomButton(){
        clickElement(buttonId);
        enterText(buttonId,"button123");
        clickElement(buttonTitle);
        enterText(buttonTitle,"button123");
        clickElement(buttonURL);
        enterText(buttonURL, prop.getProperty("enterBtnURL"));
        clickElement(buttonDescription);
        enterText(buttonDescription,"Samplebutton");
        clickElement(windowOptn);
    }

    public void buttonIcon(){
        clickElement(btnIcon);
        clickElement(filter);
        enterText(filter,"button");
        Utilities.sleep(2000);
        clickElement(iconName);
        clickElement(closeIconBtn);
        clickElement(saveCustomBtn);
    }

    public void checkNewCustomButton(){
        waitForElementVisibility(customBtnClick);
        clickElement(customBtnClick);
        switchTabAndCloseTab();

    }

    public void clickLinkEditor(){
        clickElement(linkEditor);
        clickElement(newLookUpLink);
    }

    public void fillLinkDetails(){
        javaScriptClick(linklistOption);
        clickElement(complianceDocOption);
        clickElement(listLinkURL);
        Utilities.sleep(5000);
        enterText(listLinkURL,"/Shared%20Documents/Forms/AllItems.aspx");
        clickElement(conditionType);
        clickElement(saveLinkBtn);
        Utilities.sleep(12000);
    }

    public void addFolderForDocumentList(){
        clickElement(newDocBtn);
        Utilities.sleep(2000);
        clickElement(folderOption);
        Utilities.sleep(1000);
        clickElement(folderName);
        Utilities.sleep(1000);
        enterText(folderName,"This is folder for Document List");
        clickElement(createFolder);
    }

    public void checkExpiredLicenseDV(){
        clickElement(expiredDVLicense);
        Utilities.sleep(30000);
        Assert.assertTrue(expiredDVMsg.isDisplayed());
    }

    public void checkUserLimitDV(){
        scrollToElement(maxUserDV);
        clickElement(maxUserDV);
        waitForElementVisibility(maxUserMsg);
        if(maxUserMsg.isDisplayed()){
            System.out.println("Max users limit reached is displayed");
        }
    }

    public void checkChangedBtnOrder(){
        System.out.println("The order of the button is:");
        String button1 = btnOrder1.getText();
        String button2 = btnOrder2.getText();
        System.out.println(button1 +"\n" + button2);
    }

    public void addColumnsInList(){
        javaScriptClick(addColumn);
        waitForElementVisibility(singleTextColumn);
        clickElement(singleTextColumn);
        enterText(colName, "SingleText");
        javaScriptClick(saveBtn);
        refreshPage();
        waitForElementVisibility(addColumn);
        javaScriptClick(addColumn);
        waitForElementVisibility(multipleTestColumn);
        clickElement(multipleTestColumn);
        enterText(colName, "MultipleText");
        javaScriptClick(saveBtn);
        refreshPage();
        javaScriptClick(addColumn);
        waitForElementVisibility(numberColumn);
        clickElement(numberColumn);
        enterText(colName, "Number");
        javaScriptClick(saveBtn);
        refreshPage();
        javaScriptClick(addColumn);
        waitForElementVisibility(yesNo);
        clickElement(yesNo);
        enterText(colName, "yes/No");
        javaScriptClick(saveBtn);
        refreshPage();
        javaScriptClick(addColumn);
        waitForElementVisibility(dateTime);
        clickElement(dateTime);
        enterText(colName, "Date&Time");
        javaScriptClick(saveBtn);
        refreshPage();
    }

    public void createItemsInList(){
        for(int i=1; i<=15; i++ ){
            javaScriptClick(newBtn);
            enterText(titleText, "T"+ i);
            enterText(singleText, Utilities.RandomUtils(10));
            enterText(number, String.valueOf(i));
            enterText(multipleText, Utilities.RandomUtils(50));
            if(i%2==0){
                clickElement(checkbox);
            }
            enterText(dateText, "8/15/2022");
            clickElement(saveBtn);
        }
    }

    public void createView(){
        clickElement(allItems);
        waitForElementVisibility(createView);
        javaScriptClick(createView);
        enterText(addView, "View-2");
        javaScriptClick(create);
    }

    public void editView(){
        clickElement(addedView);
        waitForElementVisibility(editView);
        javaScriptClick(editView);
        switchtoNewTab();
        scrollToElement(groupBy);
        javaScriptClick(groupBy);
        selectDropDown(groupField, "Type (icon linked to document)");
        waitForElementVisibility(groupField2);
        List<WebElement> allOptions = driver.findElements(By.xpath("//select[@id='idGroupField2']"));
        System.out.println(allOptions.size());
        for(int i = 0; i<=allOptions.size()-1; i++) {
            if(allOptions.get(i).getText().contains("ID")) {

                allOptions.get(i).click();
                break;

            }
        }
        scrollToElement(saveItem);
        javaScriptClick(saveItem);
    }

    public void addViewOptions(String view1, String view2){
        clickElement(viewOptions);
        javaScriptClick(viewAdd);
        clickElement(newView1);
        enterText(newView1, view1);
        clickElement(AllItems);
        javaScriptClick(viewAdd);
        waitForElementVisibility(newView2);
        clickElement(newView2);
        enterText(newView2, view2);
        clickElement(View2);
    }

    public void switchView(){
        refreshPage();
        clickElement(switchView);
        waitForElementVisibility(view2);
        clickElement(view2);
        clickElement(chevronType);
        List<WebElement> listItems = driver.findElements(By.xpath("//div[@class='ms-List-surface']/child::div[@class='ms-List-page']"));
        if((listItems.size()-1)==15)
        {
            log.info("No of items in view matches with custom list");
        }
    }


    public void closeNavBar(){
        Utilities.sleep(2000);
        clickElement(cancelNavBar);
        Utilities.sleep(1000);
    }

}
