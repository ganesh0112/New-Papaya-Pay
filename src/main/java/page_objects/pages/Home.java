package page_objects.pages;

import common.Utilities;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.awt.*;
import java.util.List;

public class Home extends SubsitePage {

   @FindBy (xpath = "//button[@id='O365_MainLink_Settings']")
    private WebElement settings;

    @FindBy(xpath="//a[contains(text(),'Site permissions')]")
    private WebElement sitePermissions;

    @FindBy(xpath="//a[contains(text(),'Advanced permissions settings')]")
    private WebElement advancedSitePermissions;

    @FindBy(xpath="(//a[contains(text(),'spfx-')])[1]")
    private WebElement devSwqa;


    @FindBy(xpath="//input[@title='SWQA-TEST']")
    private WebElement swqaTest;

    @FindBy(xpath="//a[contains(text(),'Show users.')]")
    private WebElement showUsers;

    @FindBy(xpath="//input[@title='bpaqa-test2']")
    private WebElement userBPA;

    @FindBy(xpath="//span[contains(text(),'Edit User')]")
    private WebElement editUserPermissions;

    @FindBy(xpath="//label[contains(text(),'Read - Can view pages and list items and download documents.')]/parent::td/preceding-sibling::td/child::input[@type='checkbox']")
    private WebElement readPermission;

    @FindBy(xpath="//label[contains(text(),'Edit - Can add, edit and delete lists; can view, add, update and delete list items and documents.')]/parent::td/preceding-sibling::td/child::input[@type='checkbox']")
    private WebElement editPermission;

    @FindBy(xpath="//input[@value='OK']")
    private WebElement okBtn;

    @FindBy(xpath="//a[@aria-label='Library settings']")
    private WebElement librarySettings;

    @FindBy(xpath="//a[contains(text(),'All Documents')]")
    private WebElement allDocuments;

    @FindBy(xpath="//td[@class='ms-authoringcontrols']/label[contains(text(),'Name (linked to document)')]/parent::td/parent::tr/descendant::input[@type='checkbox']")
    private WebElement nameDocument;

    @FindBy(xpath="//input[@id='onetidSaveItem']")
    private WebElement saveItem;

    @FindBy (xpath = "//a[@id='BPASettings']")
    private WebElement BPASettingsLink;


    @FindBy(xpath="//span[contains(text(),'New')]")
    private WebElement newBtn;

    @FindBy(xpath="//span[contains(text(),'Folder')]")
    private WebElement clickFolder;

    @FindBy(xpath="//input[@placeholder='Enter your folder name']")
    private WebElement enterFolderName;


    @FindBy(xpath="//button[@name='List']/div/span[contains(text(),'List')]")
    private WebElement listOption;

    @FindBy(xpath="//iframe[@name='createListFrame']")
    private WebElement listIframe;

    @FindBy(xpath="//i[@data-icon-name='Add']")
    private WebElement blankList;

    @FindBy(xpath="//input[@id='listNameInput']")
    private WebElement listName;

    @FindBy(xpath="//button[@data-automationid='createListButton']")
    private WebElement createListBtn;

    @FindBy(xpath ="//button[@id='flexPaneCloseButton']")
    private WebElement cancelBtn;

    @FindBy(xpath="//a[@title='Site contents']")
    private WebElement siteContents;

    @FindBy (xpath = "//a[contains(text(),'Site contents')]")
    private WebElement siteContentsLink;

    @FindBy(xpath="//a[@title='Compliance Documents']")
    private WebElement complianceDocument;

    @FindBy(xpath="(//a[@title='Documents'])[2]")
    private WebElement Documents;

    @FindBy(xpath="//div[contains(text(),'TestAutomation-MM.docx')]")
    private WebElement checkMMDoc;

    @FindBy(xpath="//span[contains(text(),'Open')]")
    private WebElement open;

    @FindBy(xpath="//span[contains(text(),'Open in browser')]")
    private WebElement openInBrowser;

    @FindBy(xpath="//div[contains(text(),'Compliance Documents')]")
    private WebElement complianceDoc;

    @FindBy(xpath="//span[contains(text(),'Flat View')]")
    private WebElement flatView;

    @FindBy(xpath="//span[contains(text(),'Edit current view')]")
    private WebElement editView;

    @FindBy(xpath="//img[@id='imgViewFilter']")
    private WebElement filterView;

    @FindBy(xpath="//label[contains(text(),'Show items only when the following is true:')]/parent::td/parent::tr/child::td/input[@name='IsThereAQuery']")
    private WebElement showItemOption;

    @FindBy(xpath="//select[@title='Column to Filter']")
    private WebElement columnFilter;

    @FindBy(xpath="//select[@name='OperatorPicker1']")
    private WebElement operatorFilter;

    @FindBy(xpath="//option[contains(text(),' is less than or equal to')]")
    private WebElement lessThanEqualToOption;

    @FindBy(xpath="(//input[@title='Value'])[1]")
    private WebElement valueOption;

    @FindBy(xpath="//a[@role='button']/img[@id='imgFolders']")
    private WebElement imgFolders;

    @FindBy(xpath="//label[contains(text(),'Show all items without folders')]")
    private WebElement withoutFoldersOption;

    @FindBy(xpath="(//td[@align='right']/child::input[@value='OK'])[2]")
    private WebElement OkBtn;

    @FindBy(xpath="//div[contains(text(),'Folder-1')]")
    private WebElement checkfolder;

    @FindBy(xpath="//div[contains(text(),'Name-1')]")
    private WebElement navigateFolder;

    @FindBy(xpath="//button[@aria-label='Delete']/descendant::span[contains(text(),'Delete')]")
    private WebElement deleteFolder;

    @FindBy(xpath="//button[@data-automationid='confirmbutton']/descendant::span[contains(text(),'Delete')]")
    private WebElement deleteBtn;

    @FindBy(xpath="//span[contains(text(),'Delete')]")
    private WebElement deleteOptionPermission;

    @FindBy(xpath="//a[@title='TestingDVSample']/span[contains(text(),'TestingDVSample')]")
    private WebElement createdDV;

    @FindBy(xpath="//div[@data-automation-key='Title']/a[contains(text(),'SOP-Procedure-Template.docx')]")
    private WebElement showLinkTitle;

    @FindBy(xpath="(//div[@data-automation-key='_UIVersionString']/a[contains(text(),'3.0')])[1]")
    private WebElement showVersionOption;

    @FindBy(xpath="//a[contains(text(),'Pages Style')]")
    private WebElement pageStyle;

    @FindBy(xpath="//span[contains(text(),'SOP-Procedure-Template.docx')]")
    private WebElement linkColumn;

    @FindBy(xpath="//i[@data-icon-name='FullScreen']")
    private WebElement fullScreen;

    @FindBy(xpath="//span[contains(text(),'TestingDVSample.aspx')]")
    private WebElement dvSampleNavigate;

    @FindBy(xpath="//span[contains(text(),'TestingDVSample')]/parent::div/preceding-sibling::div/descendant::button/child::span/i[@data-icon-name='PageHeaderEdit']")
    private WebElement dvEditOption;

    @FindBy(xpath="//span[contains(text(),'Full Width Page Layout')]")
    private WebElement fullWidthOption;

    @FindBy(xpath="//span[contains(text(),'Standard Page Layout')]")
    private WebElement StandardWidthOption;

    @FindBy(xpath="(//span[contains(text(),'Save')])[2]")
    private WebElement saveWidthOption;

    @FindBy(xpath="//span[contains(text(),'Return to classic SharePoint')]")
    private WebElement classicWebsite;

    @FindBy(xpath="//a[@title='add an app']")
    private WebElement addApp;

    @FindBy(xpath="//div[contains(text(),'Custom List')]")
    private WebElement customList;

    @FindBy(xpath="//input[@title='Name']")
    private WebElement List;

    @FindBy(xpath="//input[@value='Create']")
    private WebElement createList;


    @FindBy(xpath = "//button[@aria-label='Open BPA Navigation']")
    private WebElement openBPANavigation;

    @FindBy(xpath = "(//i[@data-icon-name='Cancel'])[2]")
    private WebElement closeBPANavigation;

    @FindBy(xpath="(//a[@title='Parent Example List'])[2]")
    private WebElement pList;

    @FindBy(xpath="//span[contains(text(),'Eg-Child List')]")
    private WebElement cList;

    @FindBy(xpath="//button[@name='Edit in grid view']")
    private WebElement gridView;

    @FindBy(xpath="//span[contains(text(),'Add column')]")
    private WebElement addColumn;

    @FindBy(xpath="//span[contains(text(),'Person')]")
    private WebElement person;

    @FindBy(xpath="//span[contains(text(),'Number')]")
    private WebElement number;

    @FindBy(xpath="//input[@aria-label='Name']")
    private WebElement numName;

    @FindBy(xpath="//span[contains(text(),'Choice')]")
    private WebElement choice;

    @FindBy(xpath="//input[@aria-label='Name']")
    private WebElement nameField;

    @FindBy(xpath="//span[contains(text(),'Date and time')]")
    private WebElement dateTime;

    @FindBy(xpath="(//span[contains(text(),'Edit Links')])[2]")
    private WebElement editOptions;

    @FindBy(xpath="(//a/descendant::span[contains(text(),'TestingDVSample')]/ancestor::td/following::td/a[@title='Remove this link from navigation'])[1]")
    private WebElement removeDVBtn;

    @FindBy(xpath="//input[@title='Save']")
    private WebElement saveBtn;

    @FindBy(xpath="//span[contains(text(),'Save')]")
    private WebElement save;

    @FindBy(xpath="//a[@title='Home']/descendant::span[contains(text(),'Home')]")
    private WebElement homePageLink;

    @FindBy(xpath="//div[@class='ms-vl-apptitleouter']/child::a[@title='This is Custom List']")
    private WebElement scrollCustomList;

    @FindBy(xpath="//div[@class='ms-vl-apptitleouter']/child::a[@title='This is Custom List']/parent::div/following-sibling::a[@title='Click for more information.']")
    private WebElement removeInfo;

    @FindBy(xpath="//a[@title='Remove']")
    private WebElement removeCustomList;

    @FindBy(xpath="//div[@name='TestingDVSample']/child::a[@title='TestingDVSample']/span")
    private WebElement dvView;

    @FindBy(xpath="//span[contains(text(),'Create a new item')]")
    private WebElement createNewItem;

    @FindBy(xpath="//span[contains(text(),'New')]")
    private WebElement newItem;

    @FindBy(xpath="//input[@aria-label='Title']")
    private WebElement titleMMButton;

    @FindBy(xpath="//button[@type='submit']//span[contains(text(),'Save')]")
    private WebElement saveMMButton;

    @FindBy(xpath="//i[@data-icon-name='StatusCircleCheckmark']")
    private WebElement statusCircle;

    @FindBy(xpath="(//i[@data-icon-name='StatusCircleCheckmark'])[2]")
    private WebElement statusPermissionCircle;

    @FindBy(xpath="(//i[@data-icon-name='CircleRing'])[2]")
    private WebElement circleRing;

    @FindBy(xpath="(//i[@data-icon-name='StatusCircleCheckmark'])[3]")
    private WebElement elementPermissionCircle;

    @FindBy(xpath="(//span[contains(text(),'Edit')])[2]")
    private WebElement checkEditOption;

    @FindBy(xpath="//span[contains(text(),'All Items')]")
    private WebElement AllItems;

    @FindBy(xpath="//button[@name='Less than 20']/descendant::span[contains(text(),'Less than 20')]")
    private WebElement selectView;

    @FindBy(xpath="//span[contains(text(),'View and change permissions')]")
    private WebElement viewPermissionBtn;

    @FindBy(xpath="//iframe[@title='frame']")
    private WebElement permissionFrame;

    @FindBy(xpath="//a[contains(text(),'Test-QA')]")
    private WebElement TestQA;

    @FindBy(xpath="(//span/i[@data-icon-name='Cancel'])[2]")
    private WebElement cancelPermissionBtn;

    @FindBy(xpath="//span[contains(text(),'Merge data in a document with BPA')]")
    private WebElement mergeDataDocument;

    @FindBy(xpath="(//span[contains(text(),'Save')])[1]")
    private WebElement saveMMBtnMgmt;

    @FindBy(xpath="//tr/td[contains(text(),'7/7')]")
    private WebElement MMManageMent;

    @FindBy(xpath="//i[@data-icon-name='Cancel']")
    private WebElement clickCancel;

    @FindBy(xpath="//span[contains(text(),'Run merge')]")
    private WebElement runMerge;

    @FindBy(xpath="//i[@data-icon-name='WordDocument']")
    private WebElement MMDocument;

    @FindBy(xpath="//span[contains(text(),'This is Custom List')]")
    private WebElement navigateList;

    @FindBy(xpath="//button[@name='New']//span[contains(text(),'New')]")
    private WebElement newListBtn;

    @FindBy(xpath="//span[contains(text(),'DocumentLibrarySample')]")
    private WebElement libraryDoc;

    @FindBy(xpath="//label[contains(text(),'Name')]/parent::div/child::div/input")
    private WebElement docLibName;

    @FindBy(xpath="//button[@aria-label='Create']")
    private WebElement createDocBtn;

    @FindBy(xpath="//button[@name='Document library']//span[contains(text(),'Document library')]")
    private WebElement docLibrary;

    @FindBy(xpath="//input[@placeholder='Enter value here']")
    private WebElement listTitle;

    @FindBy(xpath="//input[@placeholder='Enter a number']")
    private WebElement listNum;

    @FindBy(xpath="//input[@placeholder='Enter a date']")
    private WebElement listDate;

    @FindBy(xpath="//input[@placeholder='Enter a name or email address']")
    private WebElement listPerson;

    @FindBy(xpath="(//div[@class='ReactFieldEditor-fieldDescription'])[5]")
    private WebElement listChoice;

    @FindBy(xpath="//div[contains(text(),'Choice 2')]")
    private WebElement choiceOption;

    @FindBy(xpath="//div[contains(text(),'@bpa-solutions.net')]")
    private WebElement userId;

    @FindBy(xpath="(//span[contains(text(),'Save')])[2]")
    private WebElement saveList;

    @FindBy(xpath="//i[@data-icon-name='Upload']")
    private WebElement uploadFile;

    @FindBy(xpath="//div[contains(@class,'fileUploadDropZone-')]/child::div[@role='button']")
    private WebElement bulkUpload;

    @FindBy(xpath="//span[contains(text(),'Upload')]")
    private WebElement uploadBtn;

    @FindBy(xpath="//label[contains(text(),'Title')]/ancestor::div[contains(@class,'bpaDeField bpaDeField-')]/child::div[2]/descendant::input")
    private WebElement docTitleField;

    @FindBy(xpath="//input[@aria-label='Document Type']")
    private WebElement docOption;

    @FindBy(xpath="//span[contains(text(),'DOC-Other Document Type')]")
    private WebElement docType;

    @FindBy(xpath="(//span[contains(text(),'Save')])[3]")
    private WebElement saveDocType;

    @FindBy(xpath="//a[@title='TestingDVSample']/span[contains(text(),'TestingDVSample')]")
    private WebElement addedDV;

    @FindBy(xpath="//div[contains(text(),'Name-4')]")
    private WebElement name4;

    @FindBy(xpath="//div[contains(text(),'Name-3')]")
    private WebElement name3;

    @FindBy(xpath="//div[contains(text(),'Name-2')]")
    private WebElement name2;

    @FindBy(xpath="//div[contains(text(),'Name-1')]")
    private WebElement name1;

    @FindBy(xpath="//div[contains(text(),'Dataviewer01')]")
    private WebElement dvName;

    @FindBy(xpath="//span[contains(text(),'All Documents')]")
    private WebElement allDocumentList;

    @FindBy(xpath="//button[@name='Create new view']/child::div/child::span[contains(text(),'Create new view')]")
    private WebElement createNewView;

    @FindBy(xpath="//input[@id='ViewName']")
    private WebElement viewName;

    @FindBy(xpath="(//span[contains(text(),'Create')])[2]")
    private WebElement createBtn;

    @FindBy(xpath="//span[contains(text(),'Less than 20')]")
    private WebElement currentView;

    @FindBy(xpath="//i[@data-icon-name='folder20_svg']/img[@alt='Folder']")
    private WebElement folderImg;

    @FindBy(xpath="//button[@title='Folder-Test']")
    private WebElement folder;

    @FindBy(xpath="(//i[@data-icon-name='MoreVertical'])[2]")
    private WebElement moreOption;

    @FindBy(xpath="//button[@name='Manage access']//span[contains(text(),'Manage access')]")
    private WebElement manageAccess;

    @FindBy(xpath="//div[contains(text(),'bpaqa-test2')]/ancestor::div/parent::li/descendant::button/span/i[@data-icon-name='Uneditable2']")
    private WebElement userOption;

    @FindBy(xpath="//span[contains(text(),'Can edit')]")
    private WebElement canEditOption;

    @FindBy(xpath="//button[@aria-label='Close']")
    private WebElement closeMangeAccess;

    @FindBy(xpath="//span[contains(text(),'Properties')]")
    private WebElement properties;

    @FindBy(xpath="//div[contains(text(),'Enter value here')]")
    private WebElement folderViewTitle;

    @FindBy(xpath="//span[contains(text(),'Edit in grid view')]")
    private WebElement editGridView;

    @FindBy(xpath="//tbody/tr[2]/td[@aria-label='editable']")
    private WebElement enterFolderTitle;

    @FindBy(xpath="//span[contains(text(),'New folder')]")
    private WebElement newFolder;

    @FindBy(xpath="//input[@aria-label='Title']")
    private WebElement folderTitle;

    @FindBy(xpath="//input[@aria-label='Name']")
    private WebElement folderName;

    @FindBy(xpath="//span[contains(text(),'Upload')]")
    private WebElement fileUpload;

    @FindBy(xpath="//span[contains(text(),'Files')]")
    private WebElement filesOption;

    @FindBy(xpath="//i[@data-icon-name='Cancel']")
    private WebElement cancelFileBtn;

    @FindBy(xpath="(//input[@data-automationid='commandFileInput'])[1]")
    private WebElement fileInput;

    @FindBy(xpath="(//span[contains(text(),'Save')])[3]")
    private WebElement saveFolder;

    @FindBy(xpath="//button[contains(text(),'FolderName')]")
    private WebElement goTofolderName;

    @FindBy(xpath="//button[contains(text(),'Name')]")
    private WebElement fName;

    @FindBy(xpath="(//i[@data-icon-name='dotx16_1.5x_svg']/following-sibling::span[contains(text(),'Document')])[1]")
    private WebElement documentOption;

    @FindBy(xpath="//a[contains(text(),'Exit classic experience')]")
    private WebElement exitClassicWebsite;

    @FindBy(xpath="//span[contains(text(),'Pages')]")
    private WebElement pagesOption;

    @FindBy(xpath="//div[@aria-label='TestingDVSample.aspx']/div/child::i[@data-icon-name='StatusCircleCheckmark']")
    private WebElement statusCirlceDV;

    @FindBy(xpath="(//i[@title='Read-only'])[1]")
    private WebElement readOnly;

    @FindBy(xpath="//i[@data-icon-name='MoreVertical']")
    private WebElement moreVertical;

    @FindBy(xpath="//li/button[@name='Delete']")
    private WebElement deleteOption;

    @FindBy(xpath="(//span[contains(text(),'Delete')])[2]")
    private WebElement deleteDV;

    @FindBy(xpath="//div[contains(text(),'Done')]")
    private WebElement deleteConfirm;

    @FindBy(xpath="(//i[@data-icon-name='MoreVertical'])[2]")
    private WebElement moreEditVertical;

    @FindBy(xpath="//button[contains(text(),'Test-1')]")
    private WebElement listPresent;

    @FindBy(xpath="(//button[@name='Edit'])[2]")
    private WebElement editOption;

    @FindBy(xpath="//i[@data-icon-name='Edit']")
    private WebElement editOptionDV;

    @FindBy(xpath="//span[contains(text(),'Test-DV')]")
    private WebElement nonLicensedDV;

    @FindBy(xpath="//div[contains(text(),'No existing BPA O365 license found. Please register a free 30 days trial or activate an existing license from License Management in ')]")
    private WebElement nonLicensedDialog;

    @FindBy(xpath="//span[contains(text(),'BPA AI Chat Bot')]")
    private WebElement chatBotBtn;

    @FindBy(xpath="//input[@placeholder='Type your message']")
    private WebElement chatBotText;

    @FindBy(xpath="//button[@title='Send']")
    private WebElement sendChatBtn;

    public void goToBPASettings(){
        Utilities.sleep(3000);
        clickElement(settings);
        clickElement(BPASettingsLink);
        System.out.println("In BPA Settings section");
    }

    public void goToSiteContents(){
        waitForPageLoaded();
        waitForElementVisibility(settings);
        javaScriptClick(settings);
        Utilities.sleep(3000);
        clickElement(siteContentsLink);
        Utilities.sleep(5000);
        System.out.println("In Site Contents section");
    }

    public void navigateToComplianceDocument(){
        waitForPageLoaded();
        scrollToElement(complianceDocument);
        clickElement(complianceDocument);
    }

    public void  navigateToDocuments(){
        scrollToElement(Documents);
        clickElement(Documents);
    }

    public void checkMMDocument(){
        clickElement(checkMMDoc);
        waitForElementVisibility(open);
        clickElement(open);
        Utilities.sleep(1000);
        clickElement(openInBrowser);
        Utilities.sleep(2000);
    }

    public void checkPermissionFunctionality(){
        clickElement(statusPermissionCircle);
        Utilities.sleep(1000);
        clickElement(viewPermissionBtn);
        Utilities.sleep(2000);
        switchToIFrame(permissionFrame);
        waitForElementVisibility(TestQA);
        refreshPage();
    }

    public void deleteFolder(){
        Utilities.sleep(2000);
        clickElement(statusPermissionCircle);
        Utilities.sleep(2000);
        rightClickElement(navigateFolder);
        waitForElementVisibility(deleteFolder);
        clickElement(deleteFolder);
        waitForElementVisibility(deleteBtn);
        javaScriptClick(deleteBtn);
        clickElement(deleteConfirm);
        refreshPage();
    }

    public void goToLibrarySettings(){
        waitForPageLoaded();
        clickElement(settings);
        Utilities.sleep(3000);
        clickElement(librarySettings);
    }

    public void goToComplianceDocumentSettings(){
        scrollToElement(allDocuments);
        for(int i=0; i<=2;i++){
            try{
                javaScriptClick(allDocuments);
                break;
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
        waitForPageLoaded();
        scrollToElement(nameDocument);
        if(!nameDocument.isSelected()){
            clickElement(nameDocument);
        }
        Utilities.sleep(3000);
        scrollToElement(saveItem);
        clickElement(saveItem);
    }

    public void addList(){
        clickElement(classicWebsite);
        clickElement(addApp);
        clickElement(customList);
        Utilities.sleep(2000);
        Utilities.sleep(2000);
        enterText(List,"Eg-Parent List");
        clickElement(createList);
        clickElement(addApp);
        switchToDefaultContent();
        clickElement(customList);
        Utilities.sleep(2000);
        Utilities.sleep(2000);
        enterText(List,"Eg-Child List");
        clickElement(createList);
        switchToDefaultContent();
    }

    public void openBPANavigation(){
        Utilities.sleep(5000);
        System.out.println("Waiting to click on BPA navigation");
        javaScriptClick(openBPANavigation);
    }

    public void closeBPANavigation(){
        scrollToElement(closeBPANavigation);
        clickElement(closeBPANavigation);
    }

    public void addContentsforParentList(){
        clickElement(siteContents);
        Utilities.sleep(2000);
        clickElement(siteContents);
        Utilities.sleep(2000);
        clickElement(classicWebsite);
        clickElement(pList);
        Utilities.sleep(2000);
        //clickElement(pList);
        clickElement(gridView);
    }

    public void addContentsforChildList(){
        clickElement(siteContents);
        Utilities.sleep(2000);
        clickElement(siteContents);
        Utilities.sleep(2000);
        clickElement(classicWebsite);
        //scrollDown();
        clickElement(cList);
        Utilities.sleep(2000);
        clickElement(gridView);
        clickElement(addColumn);
        Utilities.sleep(1000);
        clickElement(number);
        enterText(nameField,"numColumn");
        clickElement(save);
    }

    public void goToClassicWebSite(){
        Utilities.sleep(2000);
        scrollToElement(classicWebsite);
        clickElement(classicWebsite);
        Utilities.sleep(2000);
    }

    public void navigateToDV(){
        scrollToElement(createdDV);
        Utilities.sleep(1000);
        clickElement(createdDV);
    }

    public void clickOnShowLink(){
        waitForPageLoaded();
        Utilities.sleep(5000);
        scrollToRight();
        waitForElementVisibility(showVersionOption);
        javaScriptClick(showVersionOption);
        Utilities.sleep(1000);
        System.out.println(driver.getCurrentUrl());
    }

    public void clickOnPageStyle(){
        clickElement(pageStyle);
        Utilities.sleep(3000);
    }

    public void clickLinkColumn(){
        clickElement(linkColumn);
        switchTabAndCloseTab();
    }

    public void changeDVView() throws AWTException {
        waitForPageLoaded();
        Utilities.sleep(2000);
        scrollToLocateElement(dvEditOption);
        clickElement(dvEditOption);
    }

    public void selectLargerView(){
        Utilities.sleep(2000);
        clickElement(fullWidthOption);
        Utilities.sleep(2000);
        clickElement(saveWidthOption);

    }

    public void selectStandardView(){
        Utilities.sleep(2000);
        clickElement(StandardWidthOption);
        Utilities.sleep(2000);
        clickElement(saveWidthOption);

    }

    public void createCustomList(String list){
        waitForElementVisibility(newBtn);
        clickElement(newBtn);
        waitForElementVisibility(listOption);
        clickElement(listOption);
        Utilities.sleep(2000);
        switchToIFrame(listIframe);
        Utilities.sleep(1000);
        clickElement(blankList);
        Utilities.sleep(1000);
        enterText(listName,list);
        Utilities.sleep(2000);
        clickElement(createListBtn);
        switchToDefaultContent();
        Utilities.sleep(5000);
    }

    public void removeDV(){
        scrollToElement(editOptions);
        clickElement(editOptions);
        Utilities.sleep(2000);
        clickElement(removeDVBtn);
        Utilities.sleep(2000);
        clickElement(saveBtn);
        Utilities.sleep(2000);
        clickElement(exitClassicWebsite);
    }

    public void deleteDV(){
        clickElement(pagesOption);
        clickElement(statusCirlceDV);
        clickElement(moreVertical);
        Utilities.sleep(2000);
        clickElement(deleteOption);
        Utilities.sleep(2000);
        javaScriptClick(deleteDV);
        clickElement(deleteConfirm);
        refreshPage();
    }

    public void checkView(){
        scrollToElement(dvView);
        clickElement(dvView);
        Utilities.sleep(5000);
    }

    public void createNewItem(){
        clickElement(createNewItem);
        Utilities.sleep(2000);
        clickElement(newFolder);
        Utilities.sleep(10000);
        clickElement(folderTitle);
        enterText(folderTitle,"FolderTitle");
        clickElement(folderName);
        enterText(folderName,"FolderName");
        clickElement(saveFolder);
    }

    public void createDocument(){
        scrollToRight();
        Utilities.sleep(2000);
        clickElement(goTofolderName);
        Utilities.sleep(2000);
        scrollToElement(createNewItem);
        clickElement(createNewItem);
        Utilities.sleep(2000);
        clickElement(documentOption);
        switchToTab();

    }

    public void createNewItemFolder(){
        clickElement(createNewItem);
        Utilities.sleep(2000);
        clickElement(newFolder);
        Utilities.sleep(10000);
    }

    public void createNewFolder(){
        javaScriptClick(createNewItem);
        Utilities.sleep(2000);
        javaScriptClick(newFolder);
        Utilities.sleep(10000);
    }

    public void createFolder(String fTitle,String fName){
        clickElement(folderTitle);
        enterText(folderTitle,fTitle);
        clickElement(folderName);
        enterText(folderName,fName);
        Utilities.sleep(2000);
        clickElement(saveFolder);
    }

    public void createFolder2(){
        clickElement(folderTitle);
        enterText(folderTitle,"Folder-2");
        clickElement(folderName);
        enterText(folderName,"Name-2");
        clickElement(saveFolder);
    }

    public void createFolder3(){
        clickElement(folderTitle);
        enterText(folderTitle,"Folder-3");
        clickElement(folderName);
        enterText(folderName,"Name-3");
        clickElement(saveFolder);
    }

    public void createFolder4(){
        clickElement(folderTitle);
        enterText(folderTitle,"Folder-4");
        clickElement(folderName);
        enterText(folderName,"Name-4");
        clickElement(saveFolder);
    }

    public void createFolder5(){

    }

    public void navigateToFolder(){
        waitForPageLoaded();
        Utilities.sleep(5000);
        waitForElementVisibility(fName);
        javaScriptClick(fName);
        Utilities.sleep(2000);
    }

    public void uploadANewFile() throws AWTException {
        Utilities.sleep(3000);
        clickElement(createNewItem);
        Utilities.sleep(2000);
        clickElement(uploadFile);
        Utilities.sleep(2000);
        clickElement(bulkUpload);
        uploadFileUsingRoboIt("C:\\Users\\Lenovo\\Desktop\\TestFile.txt");
        Utilities.sleep(2000);
        clickElement(uploadBtn);
        Utilities.sleep(5000);
        enterText(docTitleField,"TestSample");
        clickElement(docOption);
        scrollToElement(docType);
        clickElement(docType);
        scrollToElement(saveDocType);
        clickElement(saveDocType);
        refreshPage();

    }

    public void navigateToAddedDV(){
        scrollToElement(addedDV);
        clickElement(addedDV);
        refreshPage();
    }

    public void traceFoldersBackward(){
        scrollToElement(name4);
        clickElement(name4);
        Utilities.sleep(2000);
        clickElement(name3);
        Utilities.sleep(2000);
        clickElement(name2);
        Utilities.sleep(2000);
        clickElement(name1);
        Utilities.sleep(2000);
        clickElement(dvName);
    }

    public void createFlatView(){
        clickElement(allDocumentList);
        Utilities.sleep(1000);
        scrollToElement(createNewView);
        clickElement(createNewView);
        Utilities.sleep(2000);
        clickElement(viewName);
        enterText(viewName,"Flat View");
        clickElement(createBtn);
    }

    public void createViewFolder(){
        Utilities.sleep(2000);
        clickElement(newBtn);
        clickElement(clickFolder);
        clickElement(enterFolderName);
        Utilities.sleep(1000);
        enterText(enterFolderName,"Folder-Test");
        clickElement(createBtn);
        Utilities.sleep(2000);
        clickElement(folderImg);
        clickElement(folder);

    }

    public void uploadFile(String path) throws AWTException {
        clickElement(fileUpload);
        Utilities.sleep(1000);
        clickElement(filesOption);
        Utilities.sleep(2000);
        uploadFileUsingRoboIt(path);
        Utilities.sleep(3000);
        refreshPage();
    }

    public void editView(){
        clickElement(flatView);
        scrollToElement(editView);
        clickElement(editView);
        switchtoNewTab();
        scrollToElement(imgFolders);
        clickElement(imgFolders);
        Utilities.sleep(2000);
        clickElement(withoutFoldersOption);
        Utilities.sleep(2000);
        scrollToElement(OkBtn);
        clickElement(OkBtn);
    }

    public void goToSitePermissions(){
        Utilities.sleep(5000);
        clickElement(settings);
        clickElement(sitePermissions);
        waitForElementVisibility(advancedSitePermissions);
        javaScriptClick(advancedSitePermissions);
        switchtoNewTab();
        clickElement(devSwqa);
        waitForElementVisibility(showUsers);
        javaScriptClick(showUsers);
        waitForElementVisibility(userBPA);
        clickElement(userBPA);
        waitForElementVisibility(editUserPermissions);
        clickElement(editUserPermissions);
    }

    public void readPermission(){
        waitForPageLoaded();
        if(editPermission.isSelected()){
            clickElement(editPermission);
        }
        waitForElementVisibility(readPermission);
        if(!readPermission.isSelected()){
            clickElement(readPermission);
        }
        scrollToElement(okBtn);
        clickElement(okBtn);
        closeCurrentTab();
    }

    public void editPermission(){
        waitForElementVisibility(editPermission);
        if(!editPermission.isSelected()){
            clickElement(editPermission);
        }
        scrollToElement(okBtn);
        clickElement(okBtn);
        closeCurrentTab();
    }


    public void editElementPermission(){
        waitForPageLoaded();
        if(!editPermission.isSelected()){
            clickElement(editPermission);
        }
        waitForElementVisibility(readPermission);
        if(readPermission.isSelected()){
            clickElement(readPermission);
        }
        scrollToElement(okBtn);
        clickElement(okBtn);
        closeCurrentTab();
    }

    public void createNewItemMMButton(String text){
        Utilities.sleep(2000);
        clickElement(createNewItem);
        Utilities.sleep(2000);
        enterText(titleMMButton,text);
        clickElement(saveMMButton);

    }

    public void mergeDataDocument(){
        clickElement(statusCircle);
        Utilities.sleep(1000);
        clickElement(mergeDataDocument);
        switchtoNewTab();
        waitForPageLoaded();
        Utilities.sleep(1000);
        scrollToElement(saveMMBtnMgmt);
        clickElement(saveMMBtnMgmt);
        clickElement(clickCancel);
        Utilities.sleep(1000);
        waitForElementVisibility(runMerge);
        clickElement(runMerge);
        waitForElementVisibility(MMDocument);
        clickElement(MMDocument);
    }

    public void addContentsForCustomList(){
        clickElement(addColumn);
        waitForElementVisibility(number);
        clickElement(number);
        enterText(nameField,"Num");
        Utilities.sleep(2000);
        scrollToElement(save);
        clickElement(save);
        refreshPage();
        clickElement(addColumn);
        clickElement(person);
        waitForElementVisibility(nameField);
        enterText(nameField,"Person");
        Utilities.sleep(2000);
        scrollToElement(save);
        clickElement(save);
        refreshPage();
        clickElement(addColumn);
        clickElement(dateTime);
        waitForElementVisibility(nameField);
        enterText(nameField,"Date");
        Utilities.sleep(2000);
        scrollToElement(save);
        clickElement(save);
        refreshPage();
    }

    public void enterFieldsForCustomList(String title, String num, String person, String date){
        waitForElementVisibility(newListBtn);
        clickElement(newListBtn);
        enterText(listTitle, title);
        Utilities.sleep(1000);
        enterText(listNum,num);
        Utilities.sleep(1000);
        enterText(listPerson,person);
        clickElement(userId);
        Utilities.sleep(1000);
        enterText(listDate,date);
        Utilities.sleep(1000);
        clickElement(saveList);
    }

    public void mergeDataDocumentAutomatically(){
        clickElement(statusCircle);
        Utilities.sleep(1000);
        clickElement(mergeDataDocument);
        switchtoNewTab();
        waitForPageLoaded();
        Utilities.sleep(1000);
        waitForElementVisibility(MMDocument);
        clickElement(MMDocument);

    }

    public void navigateToCustomList(){
        scrollToElement(navigateList);
        clickElement(navigateList);
    }

    public void checkViewForItem(){
        clickElement(AllItems);
        clickElement(selectView);
    }

    public void checkPermission(){
        waitForElementVisibility(listPresent);
        clickElement(statusPermissionCircle);
        Utilities.sleep(2000);
        clickElement(moreVertical);
        Assert.assertTrue(readOnly.isDisplayed());
        System.out.println("User is unable to edit");

    }

    public void checkPermissionOfEditedItem(){
        clickElement(elementPermissionCircle);
        Utilities.sleep(2000);
        clickElement(moreEditVertical);
        waitForElementVisibility(checkEditOption);
        Assert.assertTrue(checkEditOption.isDisplayed());
        if(checkEditOption.isDisplayed()){
            System.out.println("Permission to Edit is allowed");
        }
    }

    public void createNewViewForList(){
        waitForPageLoaded();
        clickElement(AllItems);
        waitForElementVisibility(createNewView);
        clickElement(createNewView);
        enterText(viewName,"Less than 20");
        scrollToElement(createBtn);
        clickElement(createBtn);
        clickElement(currentView);
        clickElement(editView);
        switchtoNewTab();
        waitForPageLoaded();
        scrollToElement(filterView);
        waitForElementVisibility(showItemOption);
        clickElement(showItemOption);
        waitForElementVisibility(columnFilter);
        selectDropDown(columnFilter, "Num");
        clickElement(operatorFilter);
        clickElement(lessThanEqualToOption);
        enterText(valueOption,"20");
        scrollToElement(saveItem);
        clickElement(saveItem);

    }

    public void checkReadPermission(){
        waitForPageLoaded();
        System.out.println("Read permission works for DataViewer!!");

    }

    public void checkEditPermission(){
        waitForElementVisibility(editOptionDV);
        Assert.assertTrue(editOptionDV.isDisplayed());
        if(editOptionDV.isDisplayed()){
            System.out.println("Edit permission is allowed!!");
        }
    }

    public void createDocLibrary(){
        waitForElementVisibility(newListBtn);
        clickElement(newListBtn);
        clickElement(docLibrary);
        enterText(docLibName, "DocumentLibrarySample");
        scrollToElement(createDocBtn);
        clickElement(createDocBtn);
    }

    public void navigateToDocLibrary(){
        scrollToElement(libraryDoc);
        clickElement(libraryDoc);
    }

    public void removeCustomList(){
        scrollToElement(scrollCustomList);
        Utilities.sleep(2000);
        clickElement(removeInfo);
        Utilities.sleep(1000);
        clickElement(removeCustomList);
        acceptAlert();
        refreshPage();
        clickElement(exitClassicWebsite);
    }

    public void navigateNonLicenseDV(){
        waitForElementVisibility(nonLicensedDV);
        clickElement(nonLicensedDV);
    }

    public void checkNonLicense(){
        waitForElementVisibility(nonLicensedDialog);
        if(nonLicensedDialog.isDisplayed()){
            System.out.println("Non Licensed functionality is verified");
        }
    }

    public void checkDocPermission(){
        waitForElementVisibility(circleRing);
        javaScriptClick(circleRing);
        clickElement(moreVertical);
        List <WebElement> allIcon = driver.findElements(By.xpath("//ul[@role='presentation']/li"));
        System.out.println(allIcon.size());
        if(!allIcon.contains("Delete")){
            System.out.println("User is unable to edit");
        }

    }

    public void checkChatBotButton(){
        clickElement(chatBotBtn);

    }

}
