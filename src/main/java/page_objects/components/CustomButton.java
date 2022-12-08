package page_objects.components;

import common.Utilities;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CustomButton extends Component {

    @FindBy(xpath="//span[contains(text(),'New Custom button')]")
    private WebElement customBtn;

    @FindBy(xpath = "//input[@placeholder='Button ID']")
    private WebElement buttonId;

    @FindBy(xpath = "//button[@aria-label='New Button']")
    private WebElement newButton;

    @FindBy(xpath = "//button[@aria-label='Button Icon']")
    private WebElement buttonIcon;

    @FindBy(xpath = "//i[@data-icon-name='MailForward']")
    private WebElement mailForwardIcon;

    @FindBy(xpath = "//span[contains(text(),'Close')]")
    private WebElement closeButton;

    @FindBy(xpath = "//input[@placeholder='Button URL']")
    private WebElement buttonURL;

    @FindBy(xpath = "//input[@placeholder='Button title']")
    private WebElement buttonTitle;

    @FindBy(xpath = "//input[@placeholder='Button description']")
    private WebElement buttonDescription;

    @FindBy(xpath = "//span[@class='ms-ChoiceFieldLabel' and contains(text(),'Same window')]")
    private WebElement sameWindow;

    @FindBy(xpath = "//span[@class='ms-ChoiceFieldLabel' and contains(text(),'New window')]")
    private WebElement newWindow;

    @FindBy(xpath = "(//span[contains(text(),'Save')])[2]")
    private WebElement saveButton;

    @FindBy(xpath = "//span[contains(text(),'Cancel')]")
    private WebElement cancelButton;

    @FindBy(xpath = "//i[@data-icon-name='Unknown']")
    private WebElement unknownIcon;

    @FindBy(xpath="//button[@title='Icon Picker']")
    private WebElement iconPicker;

    @FindBy(xpath="//input[@placeholder='Filter...']")
    private WebElement filter;

    @FindBy(xpath="//i[@data-icon-name='CustomList']")
    private WebElement customList;

    @FindBy(xpath="(//i[@data-icon-name='GlobalNavButton'])[1]")
    private WebElement globalIcon;

    @FindBy(xpath = "(//i[@data-icon-name='Settings'])[1]")
    private WebElement settingsIcon;

    @FindBy(xpath = "//span[text()='Close']")
    private WebElement clsBtnIcon;

    @FindBy(xpath = "//span[contains(text(),'AutoCustomButtonTitle')]")
    private WebElement customButton;

    @FindBy(xpath = "(//i[@data-icon-name='Edit'])[2]")
    private WebElement editIcon;

    @FindBy(xpath = "//p[contains(@class,'errorMessage-')]/span")
    private WebElement errorMessage;

    @FindBy(xpath = "//i[@data-icon-name='Delete']")
    private WebElement deleteIcon;

    @FindBy(xpath = "//span[contains(text(),'Yes, delete')]")
    private WebElement yesDelete;

    @FindBy(xpath="//span[contains(text(),'AutoCustomButton')]/parent::div/child::i[@data-icon-name='Delete']")
    private WebElement deleteButton;

    @FindBy(xpath="//span[contains(text(),'Yes, delete')]")
    private WebElement confirmDelete;



    public void addNewCustomButton(String bId, String bTitle, String url, String description, String sameWindowOption) {
        clickElement(customBtn);  // added by Ankit
        enterText(buttonId, bId);
        enterText(buttonTitle, bTitle);
        changeIcon(); //TODO: change existing ICon and verify
        enterText(buttonURL, url);
        enterText(buttonDescription, description);
        if (sameWindowOption.equals("Same window")) {
            clickElement(sameWindow);
        } else {
            clickElement(newWindow);
        }
        clickElement(saveButton);
    }

    public void verifyCustomButtonConfiguredInDataviewer(){
        waitForPageLoaded();
        assertTrue(isElementPresent(customButton));
    }

    public void verifyCustomButtonURLOpensInSameWindow(){
        clickElement(customButton);
        waitForPageLoaded();
        assertEquals(1,getWindows().size());
    }

    public void verifyCurrentURLisSameAsConfiguredWithCustomButton(String expectedURL){
        assertEquals(expectedURL,getCurrentURL());

    }
    public void editButtonId(){
        clearText(buttonId);
        Utilities.sleep(1000);
        clickElement(saveButton);
        Utilities.sleep(1000);
    }
    public void verifyButtonIdMandatory(){
        Assert.assertEquals("The option Button ID is required",getText(errorMessage));
        ctrlAndZ(buttonId);
    }

    public void editButtonTitle(){
        clearText(buttonTitle);
        Utilities.sleep(1000);
        clickElement(saveButton);
        Utilities.sleep(1000);
    }
    public void verifyButtonTitleMandatory(){
        Assert.assertEquals("The option Button title is required",getText(errorMessage));
        ctrlAndZ(buttonTitle);
    }

    public void editButtonURL(){
        clearText(buttonURL);
        Utilities.sleep(1000);
        clickElement(saveButton);
        Utilities.sleep(1000);
    }
    public void verifyButtonURLMandatory(){
        Assert.assertEquals("The option Button URL is required",getText(errorMessage));
        ctrlAndZ(buttonURL);
    }
    public void selectNewWindow(){
        clickElement(newWindow);
        clickElement(saveButton);
    }

    public void verifyCustomButtonEdited(){
        clickElement(customButton);
        waitForPageLoaded();
        Assert.assertEquals("URl not opened in new Window",2, getWindows().size());
    }

    private void changeIcon(){
        clickElement(unknownIcon);
//        enterText(filter ,"button");
        waitForElementVisibility(globalIcon);
        javaScriptClick(globalIcon);
        scrollToElement(clsBtnIcon);
        javaScriptClick(clsBtnIcon);
    }

    public void clickEditButton(){
        clickElement(editIcon);
    }

    public void clickDeleteButton(){
        clickElement(deleteIcon);
        clickElement(yesDelete);
    }

    public void deleteCustomButton(){
        clickElement(deleteButton);
        waitForElementVisibility(confirmDelete);
        clickElement(confirmDelete);
    }

    public void verifyCustomButtonIconEdited(){
            Assert.assertFalse("Icon has been edited", !globalIcon.isDisplayed());

    }

    public void changeCustomButtonIcon(){
        waitForElementVisibility(globalIcon);
        javaScriptClick(globalIcon);
        enterText(filter ,"settings");
        for(int i=0; i<=2;i++){
            try{
                waitForElementVisibility(settingsIcon);
                javaScriptClick(settingsIcon);
                break;
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
        clickElement(clsBtnIcon);
        clickElement(saveButton);

    }
}
