package page_objects.pages;

import common.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import page_objects.components.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class SiteContents extends Component {

    @FindBy(xpath = "//button[@name='New']")
    private WebElement New;

    @FindBy(xpath = "//input[contains(@aria-label,'Title')]")
    private WebElement title;

    @FindBy(xpath = "//input[contains(@aria-label,'Text')]")
    private WebElement text;

    @FindBy(xpath = "//i[@data-icon-name='Edit']")
    private WebElement editIcon;

    @FindBy(xpath = "//span[contains(@class,'ms-ContextualMenu-itemText') and contains(text(),'List')]")
    private WebElement List;

    @FindBy(xpath = "//div[@class='rooster-editor']")
    private WebElement multiText;

    @FindBy(xpath = "(//span[contains(text(),'Save')])[3]")
    private WebElement saveMultiText;

    @FindBy(xpath = "//div[@id='displayView-displayDiv-ChoiceD']")
    private WebElement ChoiceD;

    @FindBy(xpath = "//div[@title='CDrop-Down #1']")
    private WebElement dropdown1;

    @FindBy(xpath = "//div[@title='CDrop-Down #2']")
    private WebElement dropdown2;

    @FindBy(xpath = "//input[contains(@id,'CRadio Button #1')]")
    private WebElement radio1;

    @FindBy(xpath = "//input[contains(@id,'CRadio Button #2')]")
    private WebElement radio2;

    @FindBy(xpath = "//div[@id='displayView-displayDiv-ChoiceCHK']")
    private WebElement ChoiceCHK;

    @FindBy(xpath = "//div[@title='CCheckbox #1']")
    private WebElement chk1;

    @FindBy(xpath = "//div[@title='CCheckbox #2']")
    private WebElement chk2;

    @FindBy(xpath = "//input[contains(@aria-label,'Number')]")
    private WebElement number;

    @FindBy(xpath = "//input[contains(@aria-label,'Currency')]")
    private WebElement currency;

    @FindBy(xpath="//input[@aria-label='DateTime']")
    private WebElement dateTime;

    @FindBy(xpath = "//button[@title='Calendar']")
    private WebElement dateInput;

    @FindBy(xpath = "//tr[3]/td[@class='ms-picker-today']/a")
    private WebElement today;

    @FindBy(xpath = "//input[contains(@aria-label,'Boolean')]")
    private WebElement booleanInput;

    @FindBy(xpath = "//input[contains(@aria-label,'CDateTime')]")
    private WebElement cDateTime;

    @FindBy(xpath = "//input[@placeholder='Enter a name or email address']")
    private WebElement user;

    @FindBy(xpath = "//input[@placeholder='Enter a URL']")
    private WebElement url;

    @FindBy(xpath = "//button[@name='Save']")
    private WebElement save;

    @FindBy(xpath = "//input[@placeholder='Select an option']")
    private WebElement lookupOption;

    @FindBy(xpath = "(//div[@class='ms-LookupChoice-container'])[1]")
    private WebElement ptitle1;

    @FindBy(xpath = "(//div[@class='ms-LookupChoice-container'])[2]")
    private WebElement ptitle2;

    @FindBy(xpath = "//iframe[@id='createListFrame']")
    private WebElement createListFrame;

    @FindBy(xpath="//i[@data-icon-name='GlobalNavButton']")
    private WebElement globalNavButton;

    @FindBy(xpath="//span[contains(text(),'New')]")
    private WebElement newList;


    @FindBy(xpath="//i[@data-icon-name='Add']")
    private WebElement blankList;

    @FindBy(xpath = "//input[@id='listNameInput']")
    private WebElement listName;

    @FindBy(xpath = "//input[@id='listDescriptionInput']")
    private WebElement listDescription;

    @FindBy(xpath = "//a[@title='Organizations']")
    private WebElement organizations;

    @FindBy(xpath = "//a[@title='Contacts']")
    private WebElement Contacts;

    @FindBy(xpath = "//button[@data-automationid='createListButton']")
    private WebElement createList;

    @FindBy(xpath="//button[@data-automationid='createListButton']/descendant::span[contains(text(),'Create')]")
    private WebElement createListParent;

    @FindBy(xpath="//i[@data-icon-name='ChevronLeft']")
    private WebElement back;

    @FindBy(xpath="//i[@data-icon-name='Cancel']")
    private WebElement cancelList;

    @FindBy(xpath = "(//span[contains(text(),'ParentList')])[1]")
    private WebElement parentList;

    @FindBy(xpath = "(//span[contains(text(),'ChildList')])[1]")
    private WebElement childList;

    @FindBy(xpath = "//div[@data-item-key='addColumn']")
    private WebElement addColumn;

    @FindBy(xpath = "//span[contains(text(),'More...')]")
    private WebElement more;

    @FindBy(xpath = "//*[@id='onetidFldEditGuts3']/table/tbody/tr/td/table/tbody/tr")
    private List<WebElement> columnTypes;

    @FindBy(xpath = "//*[contains(@id,'idColName')]")
    private WebElement cName;

    @FindBy(xpath = "//*[@id='idChoices']")
    private WebElement choices;

    @FindBy(xpath="//*[contains(@id,'onetidSaveItem')]")
    private WebElement saveColumn;

    @FindBy(xpath = "//*[@id='onetidChoiceRadio']")
    private WebElement radio;

    @FindBy(xpath = "//*[@id='onetidChoiceCheck']")
    private WebElement checkbox;

    @FindBy(xpath = "//*[contains(@id,'_DdlLookupFieldTargetList')]")
    private WebElement targetList;

    @FindBy(xpath = "//*[contains(@id,'_DdlLookupFieldTargetField')]")
    private WebElement targetField;

    @FindBy(xpath = "//input[contains(@id,'BtnCancel')]")
    private WebElement BtnCancel;

    @FindBy(xpath = "//*[contains(@id,'onetidPercentage')]")
    private WebElement showPercentage;

    @FindBy(xpath = "//textarea[@class='ms-formula']")
    private WebElement formula;

    @FindBy(xpath = "//input[@id='onetidTypeCurrency1']")
    private WebElement currencyType1;

    @FindBy(xpath = "//input[@id='onetidTypeNumber1']")
    private WebElement numberType1;

    @FindBy(xpath = "//a[@title= 'Site contents']")
    private WebElement siteContents;

    @FindBy(xpath = "//a[@title='Actions (Act)']")
    private WebElement actionsAct;

    @FindBy(xpath = "//a[@title='Departments']")
    private WebElement departments;

    @FindBy(xpath = "//a[@title='Graphics List']")
    private WebElement graphicsList;

    @FindBy(xpath = "//a[@title='Jobs']")
    private WebElement jobs;

    @FindBy(xpath = "//a[@title='Processes']")
    private WebElement processes;

    @FindBy(xpath="//span[contains(text(),'New')]")
    private WebElement newBtn;

    @FindBy(xpath="//button[@name='List']/div/span[contains(text(),'List')]")
    private WebElement listOption;

    @FindBy(xpath="//iframe[@name='createListFrame']")
    private WebElement listIframe;

    @FindBy(xpath="//button[@data-automationid='createListButton']")
    private WebElement createListBtn;


    public void clickOnContactsList(){
        String currentPage = getCurrentWindow();
        clickElement(Contacts);
        switchToListPage(currentPage);
    }

    public void scrollUpToOrganizationsList(){
        String currentPage = getCurrentWindow();
        Utilities.sleep(500);
        scrollToElement(actionsAct);
        Utilities.sleep(500);
        scrollToElement(departments);
        Utilities.sleep(500);
        scrollToElement(graphicsList);
        Utilities.sleep(500);
        scrollToElement(jobs);
        Utilities.sleep(500);
        scrollToElement(organizations);
        Utilities.sleep(500);
    }
    public void clickOnOrganizationsList(){
        String currentPage = getCurrentWindow();
        // TODO: add scroll to method to scroll till organization list
        clickElement(organizations);
        switchToListPage(currentPage);
    }

    private void switchToListPage(String basePage){
        Utilities.sleep(2000);
        for(String w: getWindows()){
            if(!w.equals(basePage)){
                switchToWindow(w);
                break;
            }
        }
    }

    public void createParentList(String parentList){
        waitForElementVisibility(newBtn);
        clickElement(newBtn);
        waitForElementVisibility(listOption);
        clickElement(listOption);
        Utilities.sleep(2000);
        switchToIFrame(listIframe);
        Utilities.sleep(1000);
        clickElement(blankList);
        Utilities.sleep(1000);
        enterText(listName,parentList);
        Utilities.sleep(2000);
        clickElement(createListBtn);
        switchToDefaultContent();
        Utilities.sleep(5000);
    }

    public void createChildList(String childList){
        waitForElementVisibility(newBtn);
        clickElement(newBtn);
        waitForElementVisibility(listOption);
        clickElement(listOption);
        Utilities.sleep(2000);
        switchToIFrame(listIframe);
        Utilities.sleep(1000);
        clickElement(blankList);
        Utilities.sleep(1000);
        enterText(listName,childList);
        Utilities.sleep(2000);
        clickElement(createListBtn);
        //clickElement(cancelBtn);
        switchToDefaultContent();
        Utilities.sleep(5000);
    }


    public void goToList(String listName){
        waitForPageLoaded();
        String currentPage = getCurrentWindow();
        clickElement(driver.findElement(By.xpath("//a[@title='"+listName+"']")));
        System.out.println(listName +" list clicked");
        Utilities.sleep(2000);
        for(String w: getWindows()){
            if(!w.equals(currentPage)){
                switchToWindow(w);
                System.out.println("on "+ listName +" page");
                break;
            }
        }
    }

    public void createParentList(String listName,boolean lookup, String infoSource){
        String sourceInfoFrom = "";
        if (lookup) {
            sourceInfoFrom = infoSource;
        }

        waitForElementVisibility(newBtn);
        clickElement(newBtn);
        waitForElementVisibility(listOption);
        clickElement(listOption);
        Utilities.sleep(2000);
        switchToIFrame(listIframe);
        Utilities.sleep(1000);
        clickElement(blankList);
        Utilities.sleep(1000);
        enterText(this.listName,listName);
        Utilities.sleep(2000);
        clickElement(createListBtn);
        switchToDefaultContent();
        Utilities.sleep(5000);

        HERE:
        for (int i = 1; i <= 10; i++) {
            clickElement(addColumn);
            clickElement(more);
            String typeText = columnTypes.get(i-1).findElement(By.tagName("input")).getAttribute("id").substring(10);
            System.out.println(typeText);
            columnTypes.get(i-1).findElement(By.tagName("input")).click();
            waitForPageLoaded();
            String columnName = listName.charAt(0) + typeText;
            if (i == 3) {
                columnName = columnName + "D";
            }
            if (i == 7 && lookup) {
                columnName = "ParentLookup";
            }
            if (i == 7 && !lookup) {
                columnName = "";
            }
            enterText(cName,columnName);
            switch(i){
                case 3:
                    replaceText(columnName.charAt(0) + "Drop-Down");
                    clickElement(saveColumn);
                    for (int j = 1; j <= 2; j++) {
                        clickElement(addColumn);
                        clickElement(more);
                        columnTypes.get(i-1).findElement(By.tagName("input")).click();
                        switch(j){
                            case 1:
                                enterText(cName,columnName.replace("D","R"));
                                clickElement(radio);
                                replaceText(columnName.charAt(0) + "Radio Button");
                                break;
                            case 2:
                                enterText(cName,columnName.replace("D","CHK"));
                                clickElement(checkbox);
                                replaceText(columnName.charAt(0) + "Checkbox");
                                break;

                        }
                        clickElement(saveColumn);
                    }
                    continue HERE;
                case 7:
                    if (lookup) {
                        Select lists = allOptions(targetList);
                        lists.selectByVisibleText(sourceInfoFrom);
                        Select fields = allOptions(targetField);
                        fields.selectByVisibleText("Title");
                        System.out.println(columnName + " column created in " + listName);
                        break;
                    }
                    if (!lookup) {
                        clickElement(BtnCancel);
                    }
                    continue HERE;

            }
            clickElement(saveColumn);
        }
    }

    public void createChildList(String listName,boolean lookup, String infoSource) {
        String sourceInfoFrom = "";
        if (lookup) {
            sourceInfoFrom = infoSource;
        }
        waitForElementVisibility(newBtn);
        clickElement(newBtn);
        waitForElementVisibility(listOption);
        clickElement(listOption);
        Utilities.sleep(2000);
        switchToIFrame(listIframe);
        Utilities.sleep(1000);
        clickElement(blankList);
        Utilities.sleep(1000);
        enterText(this.listName,listName);
        Utilities.sleep(2000);
        clickElement(createListBtn);
        switchToDefaultContent();
        Utilities.sleep(5000);


        HERE:
        for (int i = 1; i <= 10; i++) {
            clickElement(addColumn);
            clickElement(more);
            String typeText = columnTypes.get(i-1).findElement(By.tagName("input")).getAttribute("id").substring(10);
            System.out.println(typeText);
            columnTypes.get(i-1).findElement(By.tagName("input")).click();
            waitForPageLoaded();
            String columnName = listName.charAt(0) + typeText;
            if (i == 3) {
                columnName = columnName + "D";
            }
            if (i == 7 && lookup) {
                columnName = "ParentLookup";
            }
            if (i == 7 && !lookup) {
                columnName = "";
            }
            enterText(cName,columnName);
            switch(i){
                case 3:
                    replaceText(columnName.charAt(0) + "Drop-Down");
                    clickElement(saveColumn);
                    for (int j = 1; j <= 2; j++) {
                        clickElement(addColumn);
                        clickElement(more);
                        columnTypes.get(i-1).findElement(By.tagName("input")).click();
                        switch(j){
                            case 1:
                                enterText(cName,columnName.replace("D","R"));
                                clickElement(radio);
                                replaceText(columnName.charAt(0) + "Radio Button");
                                break;
                            case 2:
                                enterText(cName,columnName.replace("D","CHK"));
                                clickElement(checkbox);
                                replaceText(columnName.charAt(0) + "Checkbox");
                                break;

                        }
                        clickElement(saveColumn);
                    }
                    continue HERE;
                case 7:
                    if (lookup) {
                        Select lists = allOptions(targetList);
                        lists.selectByVisibleText(sourceInfoFrom);
                        Select fields = allOptions(targetField);
                        fields.selectByVisibleText("Title");
                        System.out.println(columnName + " column created in " + listName);
                        break;
                    }
                    if (!lookup) {
                        clickElement(BtnCancel);
                    }
                    continue HERE;

            }
            clickElement(saveColumn);
        }

    }

    private void replaceText(String replaceWith) {
        String defaultText = getText(choices);
        String text = defaultText.replace("Enter Choice", replaceWith);
        choices.clear();
        enterText(choices, text);
    }

    public void addExtraColumnsInList(String listName, Map<String, String> columns) {
        waitForPageLoaded();
        javaScriptClick(childList);
        List<String> columnNames = new ArrayList<>(columns.keySet());
        for (String columnName : columnNames) {
            createColumnInList(listName, columnName, columns.get(columnName), "");
        }
    }

    private void createColumnInList(String listName, String columnName, String columnType, String infoSource) {
        clickElement(addColumn);
        waitForElementVisibility(more);
        javaScriptClick(more);
        enterText(cName, columnName);
        for (WebElement column : columnTypes) {
            if (column.getText().contains(columnType)) {
                column.findElement(By.tagName("input")).click();
                Utilities.sleep(1000);
                break;
            }
        }
        if (columnName.equals("Percentage")) {
            setCheckbox(showPercentage,true);
        }
        if (!infoSource.equals("") && columnType.equals("Lookup")) {
            Select information = allOptions(targetList);
            information.selectByVisibleText(infoSource);
            Select tarField = allOptions(targetField);
            if (infoSource.equals("AutoCustomField")) {
                tarField.selectByVisibleText("Title");
            }
        }
        if (columnType.equals("Calculated")) {
            if (columnName.equals("CAddition")) {
                enterText(formula, "[CNo1]+[CNo2]");
                clickElement(numberType1);
            }
            if (columnName.equals("CCurAddition")) {
                enterText(formula, "[CCur1]+[CCur2]");
                clickElement(currencyType1);
            }
            if (columnName.equals("CalColumn")) {
                enterText(formula, "=IF([columnName8]=FALSE,\"NoValue\",[columnName4])");
                clickElement(numberType1);
                setCheckbox(showPercentage,true);
            }
        }
        clickElement(saveColumn);
        System.out.println(columnName + " column created in " + listName);
    }

    public void addColumnsInCustomList(String listName,boolean lookup, String infoSource){
        String sourceInfoFrom = "";
        if (lookup) {
            sourceInfoFrom = infoSource;
        }
        HERE:
        for (int i = 1; i <= 10; i++) {
            clickElement(addColumn);
            clickElement(more);
            String typeText = columnTypes.get(i-1).findElement(By.tagName("input")).getAttribute("id").substring(10);
            System.out.println(typeText);
            columnTypes.get(i-1).findElement(By.tagName("input")).click();
            waitForPageLoaded();
            String columnName =  typeText;
            if (i == 3) {
                columnName = columnName + "D";
            }
            if (i == 7 && lookup) {
                columnName = "Lookup";
            }
            if (i == 7 && !lookup) {
                columnName = "";
            }
            enterText(cName,columnName);
            switch(i){
                case 3:
                    replaceText(columnName.charAt(0) + "Drop-Down");
                    clickElement(saveColumn);
                    for (int j = 1; j <= 2; j++) {
                        clickElement(addColumn);
                        clickElement(more);
                        columnTypes.get(i-1).findElement(By.tagName("input")).click();
                        switch(j){
                            case 1:
                                enterText(cName,columnName.replace("D","R"));
                                clickElement(radio);
                                replaceText(columnName.charAt(0) + "Radio Button");
                                break;
                            case 2:
                                enterText(cName,columnName.replace("D","CHK"));
                                clickElement(checkbox);
                                replaceText(columnName.charAt(0) + "Checkbox");
                                break;

                        }
                        clickElement(saveColumn);
                    }
                    continue HERE;
                case 7:
                    if (lookup) {
                        Select lists = allOptions(targetList);
                        lists.selectByVisibleText(sourceInfoFrom);
                        Select fields = allOptions(targetField);
                        fields.selectByVisibleText("Title");
                        System.out.println(columnName + " column created in " + listName);
                        break;
                    }
                    if (!lookup) {
                        clickElement(BtnCancel);
                    }
                    continue HERE;

            }
            clickElement(saveColumn);
        }
    }

    public void addDataIntoCustomList(){
        for (int i = 1; i <= 15; i++) {
            waitForElementVisibility(New);
            clickElement(New);
            waitForElementVisibility(title);
            clickElement(title);
            enterText(title, "Title" + i);
            enterText(text, "Text" + i);
            clickElement(editIcon);
            enterText(multiText, "MultiText" + i);
            clickElement(saveMultiText);
            if (i % 2 == 0) {
                doubleClick(ChoiceD);
                clickElement(dropdown1);
                javaScriptClick(radio1);
                doubleClick(ChoiceCHK);
                clickElement(chk1);
                clickElement(text);
                enterText(number, "1000");
                enterText(currency, "1000");
                enterText(dateTime,"9/9/2022");
                selectFromDropDown(user, "Abhijeet Divate");
                enterText(url, "https://www.google.com");
            }
            else{
                doubleClick(ChoiceD);
                clickElement(dropdown2);
                javaScriptClick(radio2);
                doubleClick(ChoiceCHK);
                clickElement(chk2);
                clickElement(text);
                enterText(number, "2000");
                enterText(currency, "2000");
                javaScriptClick(booleanInput);
                enterText(dateTime,"9/9/2022");
                selectFromDropDown(user, "Varsha Chavan");
                enterText(url, "https://www.swqaindia.com");
            }
            clickElement(save);
            switchToDefaultContent();
        }
    }
}
