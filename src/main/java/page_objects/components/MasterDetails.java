package page_objects.components;

import common.Utilities;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static com.sun.activation.registries.LogSupport.log;

public class MasterDetails  extends Component{

    @FindBy(xpath = "//span[contains(text(),'Open Configurator')]")
    private WebElement openConfigurator;

    @FindBy(xpath = "(//input[@type='text'])[2  ]")
    private WebElement configurationTitle;

    @FindBy(xpath = "(//input[@type='text'])[3]")
    private WebElement webPartTitle;

    @FindBy(xpath ="//div[@class='ms-BasePicker']")
    private WebElement mainList;

    @FindBy(xpath = "//div[contains(text(),'This is Custom List')]")
    private WebElement listItem;

    @FindBy(xpath ="(//div[@class='ms-SelectionZone'])[2]")
    private WebElement mainView;

    @FindBy(xpath="//div[contains(text(),'All Documents')]")
    private WebElement mainViewDocument;

    @FindBy(xpath="(//div[@class='ms-SelectionZone'])[15]")
    private WebElement mainViewSecondChildList;

    @FindBy(xpath="//div[contains(text(),'All Documents')]")
    private WebElement mainViewSecondChildListOptn;

    @FindBy(xpath="(//input[@aria-label='SP picker'])[3]")
    private WebElement mainViewChildList1;

    @FindBy(xpath="//div[contains(text(),'All Items')]")
    private WebElement mainViewOptn;

    @FindBy(xpath="(//input[@aria-label='SP picker'])[1]")
    private WebElement listMain;

    @FindBy(xpath="//div[contains(text(),'This is Custom List')]")
    private WebElement customList;

    @FindBy(xpath="//div[contains(text(),'Compliance Documents')]")
    private WebElement complianceDoc;


    @FindBy(xpath="//div[contains(text(),'All Documents')]")
    private WebElement docViewOptn;

    @FindBy(xpath="//div[contains(text(),'Detail view - Actions')]")
    private WebElement detailViewActions;

    @FindBy(xpath="(//button[@name='Add new'])[2]")
    private WebElement addButton;

    @FindBy(xpath ="(//div[@tabindex='0']/child::span[2]/i[@data-icon-name='ChevronDown'])[3]")
    private WebElement enterButton;

    @FindBy(xpath ="(//div[@tabindex='0']/child::span[2]/i[@data-icon-name='ChevronDown'])[3]")
    private WebElement enterCustomButton;

    @FindBy(xpath ="(//div[@tabindex='0']/child::span[2]/i[@data-icon-name='ChevronDown'])[4]")
    private WebElement enterButtonDetailView;

    @FindBy(xpath="(//span[contains(text(),'New item')])[2]")
    private WebElement newItemDetailViewButton;

    @FindBy(xpath ="(//div[@tabindex='0']/child::span[2]/i[@data-icon-name='ChevronDown'])[5]")
    private WebElement enterButton2;

    @FindBy(xpath="(//span[contains(text(),'Edit')])")
    private WebElement editButtonDetailView;

    @FindBy(xpath ="(//div[@tabindex='0']/child::span[2]/i[@data-icon-name='ChevronDown'])[6]")
    private WebElement enterButton3;

    @FindBy(xpath="//span[contains(text(),'Delete')]")
    private WebElement deleteButtonDetailView;

    @FindBy(xpath ="(//div[@tabindex='0']/child::span[2]/i[@data-icon-name='ChevronDown'])[8]")
    private WebElement enterButton4;


    @FindBy(xpath="(//span[contains(text(),'New item')])[2]")
    private WebElement newItemBtn;

    @FindBy(xpath = "//span[contains(text(),'Edit')]")
    private WebElement editButton;

    @FindBy(xpath="//span[contains(text(),'Delete')]")
    private WebElement deleteButton;

    @FindBy(xpath="//span[contains(text(),'Delete']")
    private WebElement uploadButton;

    @FindBy(xpath="//button[@aria-label='Master View']/descendant::div[contains(text(),'Master View')]")
    private  WebElement masterView;

    @FindBy(xpath="//div[contains(text(),'Detail view - Details & Tabs')]")
    private WebElement detailView;

    @FindBy(xpath="(//label[contains(text(),'Primary field')]/parent::div/following-sibling::div/descendant::input)[1]")
    private WebElement primaryField;

    @FindBy(xpath="(//label[contains(text(),'Primary field')]/parent::div/following-sibling::div/descendant::input)")
    private WebElement primaryFieldDetailView;

    @FindBy(xpath="(//div[contains(text(),'Title')])[3]")
    private WebElement titleOption;

    @FindBy(xpath="(//label[contains(text(),'Secondary field')]/parent::div/following-sibling::div/descendant::input)[1]")
    private WebElement secondaryField;

    @FindBy(xpath="(//label[contains(text(),'Secondary field')]/parent::div/following-sibling::div/descendant::input)")
    private WebElement secondaryFieldDetailView;

    @FindBy(xpath="(//div[contains(text(),'ID')])[2]")
    private WebElement IDOption;

    @FindBy(xpath="(//button[@name='Add new']/descendant::span[contains(text(),'Add new')])[3]")
    private WebElement addNew;

    @FindBy(xpath="(//span[contains(text(),'Add new')])")
    private WebElement addNewButtonMasterView;

    @FindBy(xpath="(//input[@inputmode='text'])[7]")
    private WebElement tabTitle;

    @FindBy(xpath="(//input[contains(@id,'combobox-id_')])[2]")
    private WebElement view;

    @FindBy(xpath="//button[@title='Detail view - Child lists']")
    private WebElement childList;

    @FindBy(xpath="(//button[@name='Add new'])[4]")
    private WebElement addNewChildList;

    @FindBy(xpath="(//input[@type='text'])[9]")
    private WebElement configurationTitleChildList;

    @FindBy(xpath="(//input[@type='text'])[16]")
    private WebElement configurationTitleSecondChildList;

    @FindBy(xpath="(//input[@type='text'])[10]")
    private WebElement WebPartTitleChildList;

    @FindBy(xpath="(//input[@type='text'])[17]")
    private WebElement WebPartTitleSecondChildList;

    @FindBy(xpath="(//input[@aria-label='SP picker'])[3]")
    private WebElement mainChildList;

    @FindBy(xpath="(//input[@aria-label='SP picker'])[5]")
    private WebElement mainSecondChildList;

    @FindBy(xpath="//div[contains(text(),'Compliance Documents')]")
    private WebElement secondChildListOption;

    @FindBy(xpath="(//div[@class='ms-SelectionZone'])[11]")
    private WebElement mainChildListView;

    @FindBy(xpath="//button[@title='Actions']")
    private WebElement actionButtonChildList;

    @FindBy(xpath="(//button[@name='Add new'])[5]")
    private WebElement addNewButtonChildList;

    @FindBy(xpath="(//span[contains(text(),'New item')])[2]")
    private WebElement newItemChildListButton;

    @FindBy(xpath="//span[contains(text(),'New item')]")
    private WebElement newItemMasterView;

    @FindBy(xpath="(//span[contains(text(),'Edit')])[2]")
    private  WebElement editChildListButton;

    @FindBy(xpath="(//span[contains(text(),'Delete')])[2]")
    private WebElement deleteChildListButton;

    @FindBy(xpath="(//span[contains(text(),'Upload file')])")
    private  WebElement uploadFileChildListButton;

    @FindBy(xpath = "//i[@data-icon-name='SaveAndClose']")
    private WebElement saveAndClose;

    @FindBy(xpath="(//span[contains(text(),'AutoCustomButtonTitle')])")
    private WebElement customButton;

    @FindBy(xpath="//button[@name='Edit']/span/child::i[@data-icon-name='Edit']")
    private WebElement editMD;

    @FindBy(xpath="//i[@data-icon-name='Info']")
    private WebElement infoWebPart;

    @FindBy(xpath="//i[@data-icon-name='Edit']")
    private WebElement editMDPart;

    @FindBy(xpath = "(//i[@data-icon-name='Add'])[2]")
    private WebElement addWebPart;

    @FindBy(xpath="//div[contains(text(),'BPA Master-Detail (SPFx) web part')]")
    private WebElement navigateMD;

    @FindBy(xpath = "//h2[contains(text(),'Component is not configured')]")
    private WebElement componentIsNotConfigured;

    @FindBy(xpath = "(//i[@data-icon-name='Edit'])[1]")
    private WebElement editWebPart;

    @FindBy(xpath="(//div[@tabindex='0']/child::span[2]/i[@data-icon-name='ChevronDown'])[7]")
    private WebElement enterFirstButtonChildList;

    @FindBy(xpath="(//span[contains(text(),'New item')])[3]")
    private WebElement newItemButtonChildList;

    @FindBy(xpath="(//span[contains(text(),'...')])[5]")
    private WebElement newItemButtonAutoblid;

    @FindBy(xpath="//label[contains(text(),'autobind')]/preceding-sibling::button")
    private WebElement autobindOption;

    @FindBy(xpath="//label[contains(text(),'Autobound field')]/parent::div/following::div/descendant::input")
    private WebElement autoBindField;

    @FindBy(xpath="//div[contains(@class,'suggestionSecondaryInfo-')]")
    private WebElement lookUp;

    @FindBy(xpath="//span[contains(text(),'Save And Close')]")
    private WebElement saveAutoBindField;

    @FindBy(xpath="(//div[@tabindex='0']/child::span[2]/i[@data-icon-name='ChevronDown'])[8]")
    private WebElement enterSecondButtonChildList;

    @FindBy(xpath="(//span[contains(text(),'Edit')])[2]")
    private WebElement editButtonChildList;

    @FindBy(xpath="(//div[@tabindex='0']/child::span[2]/i[@data-icon-name='ChevronDown'])[9]")
    private WebElement enterThirdButtonChildList;

    @FindBy(xpath="(//span[contains(text(),'Delete')])[2]")
    private WebElement deleteButtonChildList;

    @FindBy(xpath="(//div[@tabindex='0']/child::span[2]/i[@data-icon-name='ChevronDown'])[10]")
    private WebElement enterFourthButtonChildList;

    @FindBy(xpath="//span[contains(text(),'Upload file')]")
    private WebElement uploadButtonChildList;

    @FindBy(xpath="(//div[@tabindex='0']/child::span[2]/i[@data-icon-name='ChevronDown'])[11]")
    private WebElement enterFifthButtonChildList;

    @FindBy(xpath="//span[contains(text(),'Alert me')]")
    private WebElement alertMeButtonChildList;

   /* @FindBy(xpath="(//span[contains(text(),'Add new')])[5]/ancestor::div[@data-automation-id='visibleContent']/ancestor::div[contains(@class,'ms-Stack css-')][1]/child::div[3]/descendant::div[@draggable='true']")
    private WebElement extraButtons;
*/
    @FindBy(xpath="(//span[contains(text(),'Remove selected')])[5]")
    private WebElement removeButtonsChildList;

    @FindBy(xpath="(//input[@aria-haspopup='listbox'])[3]")
    private WebElement filterField;

    @FindBy(xpath="(//span[contains(text(),'AutoCustomButtonTitle')])")
    private WebElement verifyCustomButton;

    @FindBy(xpath="(//i[@data-icon-name='StatusCircleCheckmark'])[1]")
    private WebElement statusCircle;

    @FindBy(xpath="(//span[contains(text(),'Create a new item')])[2]")
    private WebElement actionButton1;

    @FindBy(xpath="//span[contains(text(),'Edit an item')]")
    private WebElement actionButton2;

    @FindBy(xpath="//span[contains(text(),'Delete an item')]")
    private WebElement actionButton3;

    @FindBy(xpath="(//span[contains(text(),'Button 1')])[2]")
    private WebElement detailActionButton1;

    @FindBy(xpath="//span[contains(text(),'Button 2')]")
    private WebElement detailActionButton2;

    public void configureMasterDetailForCustomButton(String configTitle, String dvTitle, String list, String view){
        Utilities.sleep(2000);
        clickElement(openConfigurator);
        enterText(configurationTitle,configTitle);
        enterText(webPartTitle,dvTitle);
        clickElement(mainList);
        Utilities.sleep(1000);
        enterText(listMain,list);
        clickElement(customList);
        Utilities.sleep(1000);
        clickElement(mainView);
        waitForElementVisibility(mainViewOptn);
        clickElement(mainViewOptn);
    }

    public void addButtonsInDetailView(){
        clickElement(detailViewActions);
    }

    public void addCustomButtonInDetailViewAction(){
        clickElement(addButton);
        scrollToElement(enterButtonDetailView);
        javaScriptClick(enterButtonDetailView);
        List<WebElement> element = driver.findElements(By.xpath("(//span[contains(text(),'AutoCustomButtonTitle')])"));
        for(int i=0; i<element.size(); i++){
            if(i==1){
               element.get(i).click();
               break;
            }
        }
//        scrollToElement(customButton);
//        javaScriptClick(customButton);

    }

    public void addFirstButton(){
        clickElement(addButton);
        scrollToElement(enterButtonDetailView);
        javaScriptClick(enterButtonDetailView);
        waitForElementVisibility(newItemDetailViewButton);
        clickElement(newItemDetailViewButton);
    }

   public void newItemButton(){
        clickElement(newItemBtn);
   }

   public void addSecondButton(){
       clickElement(addButton);
       scrollToElement(enterButton2);
       javaScriptClick(enterButton2);
       waitForElementVisibility(editButtonDetailView);
       javaScriptClick(editButtonDetailView);
   }

   public void editButton(){
        clickElement(editButton);
   }

   public void addThirdButton(){
       clickElement(addButton);
       scrollToElement(enterButton3);
       javaScriptClick(enterButton3);
       waitForElementVisibility(deleteButtonDetailView);
       clickElement(deleteButtonDetailView);
   }

   public void deleteButton(){
        clickElement(deleteButton);
   }

   public void addFourthButton(){
       clickElement(addButton);
       scrollToElement(enterButton4);
       javaScriptClick(enterButton4);
   }

   public void uploadButton(){
        clickElement(uploadButton);
   }

   public void masterView(){
        clickElement(masterView);
        clickElement(primaryField);
        waitForElementVisibility(titleOption);
        javaScriptClick(titleOption);
        clickElement(secondaryField);
        waitForElementVisibility(IDOption);
        javaScriptClick(IDOption);

   }

   public void addNewButtonInMasterView(){
        scrollToElement(addNewButtonMasterView);
        clickElement(addNewButtonMasterView);
   }

   public void addCustomButtonInMasterView(){
       scrollToElement(enterCustomButton);
       javaScriptClick(enterCustomButton);
       Utilities.sleep(2000);
       scrollToElement(customButton);
       javaScriptClick(customButton);
   }

   public void addNewItemButtonInMasterView(){
        waitForElementVisibility(enterButton);
        scrollToElement(enterButton);
        javaScriptClick(enterButton);
        waitForElementVisibility(newItemMasterView);
        javaScriptClick(newItemMasterView);
        Utilities.sleep(3000);

   }

   public void detailView(){
        clickElement(detailView);
        waitForElementVisibility(primaryFieldDetailView);
        clickElement(primaryFieldDetailView);
        Utilities.sleep(5000);
        waitForElementVisibility(titleOption);
        javaScriptClick(titleOption);
        clickElement(secondaryFieldDetailView);
        Utilities.sleep(5000);
        waitForElementVisibility(IDOption);
        javaScriptClick(IDOption);

   }

   public void addNewTabInDetailView(){
        scrollToElement(addNew);
        clickElement(addNew);
        waitForElementVisibility(tabTitle);
        scrollToElement(tabTitle);
        clickElement(tabTitle);
        enterText(tabTitle,"Tab-1");
        clickElement(view);
        enterText(view,"All Items");
        clickElement(mainViewOptn);
   }

   public void addChildListInDetailView(){
        scrollToElement(childList);
        clickElement(childList);

   }

    public void configureDataviewerForChildList(String configTitle, String dvTitle, String list, String view) {
        waitForElementVisibility(addNewChildList);
        scrollToElement(addNewChildList);
        clickElement(addNewChildList);
        enterText(configurationTitleChildList, configTitle);
        enterText(WebPartTitleChildList, dvTitle);
        scrollToElement(mainChildList);
        Utilities.sleep(1000);
        enterText(mainChildList, list);
        clickElement(complianceDoc);
        Utilities.sleep(1000);
        clickElement(mainChildListView);
        waitForElementVisibility(mainViewDocument);
        javaScriptClick(mainViewDocument);
    }

     public void configureComplianceDocumentForChildList(String configTitle, String dvTitle, String list, String view){
         waitForElementVisibility(addNewChildList);
         scrollToElement(addNewChildList);
         clickElement(addNewChildList);
         enterText(configurationTitleSecondChildList, configTitle);
         enterText(WebPartTitleSecondChildList, dvTitle);
         scrollToElement(mainSecondChildList);
         Utilities.sleep(1000);
         enterText(mainSecondChildList, list);
         waitForElementVisibility(secondChildListOption);
         clickElement(secondChildListOption);
         Utilities.sleep(2000);
         clickElement(mainViewSecondChildList);
         waitForElementVisibility(mainViewSecondChildListOptn);
         clickElement(mainViewSecondChildListOptn);
     }

    public void configureCustomListForMasterDetailChildList(String configTitle, String dvTitle, String list, String view){
        waitForElementVisibility(addNewChildList);
        scrollToElement(addNewChildList);
        clickElement(addNewChildList);
        enterText(configurationTitleChildList, configTitle);
        enterText(WebPartTitleChildList, dvTitle);
        scrollToElement(mainChildList);
        Utilities.sleep(1000);
        enterText(mainChildList, list);
        clickElement(customList);
        Utilities.sleep(1000);
        clickElement(mainChildListView);
        Utilities.sleep(2000);
        clickElement(mainViewChildList1);
        waitForElementVisibility(mainViewOptn);
        clickElement(mainViewOptn);
    }


    public void newActionButtonsInChildList(){
        scrollToElement(actionButtonChildList);
        clickElement(actionButtonChildList);
    }

    public void addFirstChildListButton(){
        scrollToElement(addNewButtonChildList);
        clickElement(addNewButtonChildList);
        scrollToElement(enterButton);
        javaScriptClick(enterButton);
        waitForElementVisibility(newItemChildListButton);
        Utilities.sleep(2000);
        clickElement(newItemChildListButton);
    }

    public void addSecondChildListButton(){
        scrollToElement(addNewButtonChildList);
        clickElement(addNewButtonChildList);
        scrollToElement(enterButton2);
        javaScriptClick(enterButton2);
        waitForElementVisibility(editChildListButton);
        Utilities.sleep(2000);
        javaScriptClick(editChildListButton);
    }

    public void addThirdChildListButton(){
        scrollToElement(addNewButtonChildList);
        clickElement(addNewButtonChildList);
        scrollToElement(enterButton3);
        javaScriptClick(enterButton3);
        waitForElementVisibility(deleteChildListButton);
        Utilities.sleep(2000);
        javaScriptClick(deleteChildListButton);
    }

    public void addFourthChildListButton(){
        scrollToElement(addNewButtonChildList);
        clickElement(addNewButtonChildList);
        scrollToElement(enterButton4);
        javaScriptClick(enterButton4);
        waitForElementVisibility(uploadFileChildListButton);
        Utilities.sleep(2000);
        javaScriptClick(uploadFileChildListButton);
    }

    public void saveAndCloseMDPage(){
        scrollToElement(saveAndClose);
        clickElement(saveAndClose);
        Utilities.sleep(5000);
    }

    public void checkCustomButtonOnMD(){
        waitForElementVisibility(customButton);
        Assert.assertTrue(customButton.isDisplayed());

    }

    public void editMDPage() {
        refreshPage();
        clickElement(editMD);
       /* clickElement(addWebPart);
        waitForElementVisibility(componentIsNotConfigured);
        clickElement(editMDPart);
        clickElement(openConfigurator);*/
      /*  clickElement(editMD);
        waitForElementVisibility(componentIsNotConfigured);
        clickElement(editWebPart);*/

    }

    public void addFirstButtonInChildList(){
        clickElement(addNewButtonChildList);
        Utilities.sleep(2000);
        scrollToElement(enterFirstButtonChildList);
        javaScriptClick(enterFirstButtonChildList);
        waitForElementVisibility(newItemButtonChildList);
//        staleElementRefresh(newItemButtonChildList);
        javaScriptClick(newItemButtonChildList);
      /*  javaScriptClick(newItemButtonAutoblid);
        String value= autobindOption.getAttribute("aria-checked");
        if(value.equals("false"))
        {
            javaScriptClick(autobindOption);

        }
        enterText(autoBindField,"Lookup");
        javaScriptClick(autoBindField);
//        javaScriptClick(lookUp);
        scrollToElement(saveAutoBindField);
        javaScriptClick(saveAutoBindField);*/
    }

    public void addSecondButtonInChildList() {
        clickElement(addNewButtonChildList);
        Utilities.sleep(2000);
        scrollToElement(enterSecondButtonChildList);
        javaScriptClick(enterSecondButtonChildList);
        Utilities.sleep(2000);
        waitForElementVisibility(editButtonChildList);
        javaScriptClick(editButtonChildList);
        Utilities.sleep(2000);
    }

    public void addThirdButtonInChildList(){
        clickElement(addNewButtonChildList);
        Utilities.sleep(2000);
        scrollToElement(enterThirdButtonChildList);
        javaScriptClick(enterThirdButtonChildList);
        waitForElementVisibility(deleteButtonChildList);
        javaScriptClick(deleteButtonChildList);
    }

    public void addFourthButtonInChildList(){
        clickElement(addNewButtonChildList);
        Utilities.sleep(2000);
        scrollToElement(enterFourthButtonChildList);
        javaScriptClick(enterFourthButtonChildList);
        waitForElementVisibility(uploadButtonChildList);
        javaScriptClick(uploadButtonChildList);
    }

    public void addFifthButtonInChildList(){
        clickElement(addNewButtonChildList);
        Utilities.sleep(2000);
        scrollToElement(enterFifthButtonChildList);
        javaScriptClick(enterFifthButtonChildList);
        waitForElementVisibility(alertMeButtonChildList);
        javaScriptClick(alertMeButtonChildList);
    }

    public void removeButtonsInChildList(){
        List<WebElement> childListButtons = findElements((By.xpath("(//span[contains(text(),'Add new')])[5]/ancestor::div[@data-automation-id='visibleContent']/ancestor::div[contains(@class,'ms-Stack css-')][1]/child::div[3]/descendant::div[@draggable='true']")));
        if(childListButtons.size()>5) {
            log("Extra buttons added");
            for (int i = 1; i <= 5; i++) {
                scrollToElement(removeButtonsChildList);
                javaScriptClick(removeButtonsChildList);
            }
        }
    }

    public void selectFilterField() {
        enterText(filterField,"Lookup");
        javaScriptClick(filterField);

    }

    public void verifyCustomButtonOnMDPage(){
        waitForElementVisibility(verifyCustomButton);
        if(verifyCustomButton.isDisplayed()){
            javaScriptClick(verifyCustomButton);
            System.out.println("Custom Button is Displayed on MD page");
        }
    }

    public void checkOrder(){
        waitForElementVisibility(statusCircle);
        scrollToElement(statusCircle);
        waitForElementVisibility(statusCircle);
        javaScriptClick(statusCircle);
        waitForElementVisibility(actionButton1);
        System.out.println("The Order of the buttons before reordering");
        System.out.println(actionButton1.getText());
        System.out.println(actionButton2.getText());
        System.out.println(actionButton3.getText());
    }

    public void reorderActionButton(){
        Utilities.sleep(2000);
        clickElement(openConfigurator);
        Utilities.sleep(3000);
        scrollToElement(detailViewActions);
        clickElement(detailViewActions);
        Utilities.sleep(3000);
        dragAndDrop(detailActionButton1,detailActionButton2);

    }

    public void checkReOrder(){
        scrollToElement(statusCircle);
        javaScriptClick(statusCircle);
        waitForElementVisibility(actionButton1);
        System.out.println("The Order of the buttons after reordering");
        System.out.println(actionButton3.getText());
        System.out.println(actionButton2.getText());
        System.out.println(actionButton1.getText());
    }

}
