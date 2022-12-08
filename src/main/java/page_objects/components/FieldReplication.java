package page_objects.components;

import common.Utilities;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class  FieldReplication extends Component {

    private final Map<String, Integer> childListData = new HashMap<>();

    @FindBy(xpath = "//input[@type='checkbox']")
    private WebElement active;

    @FindBy(xpath = "//i[@data-icon-name='CheckMark']")
    private WebElement checkmark;

    @FindBy(xpath = "//div[@class='ms-Dropdown-container']")
    private WebElement operationDropdown;

    @FindBy(xpath = "//button[@data-index='2']")
    private WebElement sameValue;

    //@FindBy(xpath = "//button[@title='Sum']")
    @FindBy(xpath="//div[@data-bpa-value='Sum']")
    private WebElement Sum;

    @FindBy(xpath = "//span[contains(text(),'Minimal value')]")
    private WebElement Minimum;

    @FindBy(xpath = "//span[contains(text(),'Average')]")
    private WebElement Average;

    @FindBy(xpath = "//span[contains(text(),'Maximal value')]")
    private WebElement Maximum;

    @FindBy(xpath = "//span[contains(text(),'Count')]")
    private WebElement Count;

    @FindBy(xpath = "//span[contains(text(),'Last')]")
    private WebElement Last;

    @FindBy(xpath = "//span[contains(text(),'First')]")
    private WebElement First;

    @FindBy(xpath = "(//input[contains(@class,'ms-BasePicker-input')])[1]")
    private WebElement parentListPicker;

    @FindBy(xpath = "(//input[contains(@class,'ms-BasePicker-input')])[3]")
    private WebElement parentFieldPicker;

    @FindBy(xpath="//div[contains(@class,'suggestionTitle-')]")
    private WebElement fieldOption;

    @FindBy(xpath="//div[contains(text(),'PText')]")
    private WebElement parentField;

    @FindBy(xpath = "(//input[contains(@class,'ms-BasePicker-input')])[4]")
    private WebElement childListPicker;

    @FindBy(xpath = "(//input[contains(@class,'ms-BasePicker-input')])[6]")
    private WebElement childFieldPicker;

    @FindBy(xpath="//div[contains(text(),'CText')]")
    private WebElement childField;

    @FindBy(xpath = "(//input[contains(@class,'ms-BasePicker-input')])[2]")
    private WebElement parentListView;

    @FindBy(xpath="//div[contains(text(),'All Items')]")
    private WebElement listView;

    @FindBy(xpath = "(//input[contains(@class,'ms-BasePicker-input')])[5]")
    private WebElement childListView;

    @FindBy(xpath = "(//input[contains(@class,'ms-BasePicker-input')])[7]")
    private WebElement childLookupPicker;

    @FindBy(xpath="//div[contains(text(),'ParentLookup')]")
    private WebElement lookUpField;

    @FindBy(xpath = "(//input[contains(@class,'ms-BasePicker-input')])[8]")
    private WebElement firstLastOrder;

    @FindBy(xpath = "(//span[contains(text(),'Save')])[2]")
    private WebElement Save;


    @FindBy(xpath="//div[contains(text(),'ParentList')]")
    private WebElement parentList;

    @FindBy(xpath="(//span[contains(text(),'ParentList')])[1]")
    private WebElement navigateParentList;

    @FindBy(xpath="//iframe[@id='o365shellwcssframe']")
    private WebElement listFrame;

    @FindBy(xpath = "//div[contains(text(),'ChildList')]")
    private WebElement childList;

    @FindBy(xpath="//span[contains(text(),'ChildList')]")
    private WebElement navigateChildList;

    @FindBy(xpath = "//span[contains(text(),'New')]")
    private WebElement New;

    @FindBy(xpath = "//input[contains(@aria-label,'Title')]")
    private WebElement title;

    @FindBy(xpath = "//input[contains(@aria-label,'Text')]")
    private WebElement text;

    @FindBy(xpath = "//i[@data-icon-name='Edit']")
    private WebElement editIcon;

    @FindBy(xpath = "//div[@class='rooster-editor']")
    private WebElement multiText;

    @FindBy(xpath = "(//span[contains(text(),'Save')])[3]")
    private WebElement saveMultiText;

    @FindBy(xpath = "//div[@id='displayView-displayDiv-PChoiceD']")
    private WebElement pChoiceD;

    @FindBy(xpath = "//div[@title='PDrop-Down #1']")
    private WebElement dropdown1;

    @FindBy(xpath = "//div[@title='PDrop-Down #2']")
    private WebElement dropdown2;

    @FindBy(xpath = "//input[contains(@id,'PRadio Button #1')]")
    private WebElement radio1;

    @FindBy(xpath = "//input[contains(@id,'PRadio Button #2')]")
    private WebElement radio2;

    @FindBy(xpath = "//div[@id='displayView-displayDiv-PChoiceCHK']")
    private WebElement pChoiceCHK;

    @FindBy(xpath = "//div[@title='PCheckbox #1']")
    private WebElement chk1;

    @FindBy(xpath = "//div[@title='PCheckbox #2']")
    private WebElement chk2;

    @FindBy(xpath = "//input[contains(@aria-label,'Number')]")
    private WebElement number;

    @FindBy(xpath = "//input[contains(@aria-label,'Currency')]")
    private WebElement currency;

    @FindBy(xpath="//input[@aria-label='PDateTime']")
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

    @FindBy(xpath = "//div[contains(@class,'od-FieldRenderer-text')]")
    private List<WebElement> reflectedValues;

    @FindBy(xpath = "(//div[contains(@class,'od-FieldRenderer-text')])[2]")
    private WebElement reflectedValues2;

    @FindBy(xpath = "(//i[@data-icon-name='StatusCircleCheckmark'])[1]")
    private WebElement selectAll;

    @FindBy(xpath = "//button[@name='Delete']")
    private WebElement delete;

    @FindBy(xpath = "//div[@data-automationid='DetailsRow']")
    private List<WebElement> allFR;

    @FindBy(xpath = "//button[@data-automationid='confirmbutton']")
    private WebElement confirmation;

    @FindBy(xpath = "//a[@href='#/fr_configurations']")
    private WebElement fieldReplication;

    @FindBy(xpath ="//button[@aria-label='Contacts']")
    private WebElement parentListElement;

    @FindBy(xpath = "//a[@id='BPASettings']")
    private WebElement BPASettingsLink;

    @FindBy(xpath = "//button[@id='O365_MainLink_Settings']")
    private WebElement settings;

    @FindBy(xpath="(//input[contains(@class,'ms-BasePicker-input')])[3]")
    private WebElement removePField;

    @FindBy(xpath="//i[@data-icon-name='Add']")
    private WebElement newFieldReplication;

    @FindBy(xpath = "(//input[contains(@class,'ms-BasePicker-input')])[6]")
    private WebElement removeCField;

    @FindBy(xpath = "(//i[@data-icon-name='Edit'])[3]")
    private WebElement editFR;

    @FindBy(xpath="//span[contains(text(),'None')]")
    private WebElement operation_sum;

    @FindBy(xpath = "//span[contains(@class,'ms-DetailsHeader-cellName')]")
    private List<WebElement> headers;

    @FindBy(xpath = "//div[contains(@class,'ms-DetailsRow-fields')]")
    private List<WebElement> rows;

    @FindBy(xpath = "//span[@data-automationid='TitleSpan' and contains(text(),'ParentList')]")
    private WebElement parentListButton;

    @FindBy(xpath = "//span[@data-automationid='TitleSpan' and contains(text(),'ChildList')]")
    private WebElement childListButton;

    @FindBy(xpath = "//input[contains(@aria-label,'CNo1')]")
    private WebElement cNo1;

    @FindBy(xpath = "//input[contains(@aria-label,'CNo2')]")
    private WebElement cNo2;

    @FindBy(xpath = "//input[contains(@aria-label,'CCur1')]")
    private WebElement cCur1;

    @FindBy(xpath = "//input[contains(@aria-label,'CCur2')]")
    private WebElement cCur2;


    public void addFieldReplication(String operation, String pListName, String pFieldName, String cListName, String cFName, String childLookup) {
        waitForElementVisibility(active);
        if(!active.isSelected())
        {
            javaScriptClick(active);

        }
        selectOperation(operation);
        enterText(parentListPicker,pListName);
        waitForElementVisibility(parentList);
        clickElement(parentList);
        enterText(parentListView, "All Items");
        clickElement(listView);
        enterText(parentFieldPicker, pFieldName);
        clickElement(parentField);
        enterText(childListPicker, cListName);
        waitForElementVisibility(childList);
        clickElement(childList);
        enterText(childListView, "All Items");
        waitForElementVisibility(listView);
        clickElement(listView);
        scrollToElement(childFieldPicker);
        enterText(childFieldPicker, cFName);
        waitForElementVisibility(childField);
        clickElement(childField);
        enterText(childLookupPicker, childLookup);
        waitForElementVisibility(lookUpField);
        clickElement(lookUpField);
        scrollToElement(Save);
        clickElement(Save);
        Utilities.sleep(5000);
    }

    private void selectOperation(String operation) {
        clickElement(operationDropdown);
        switch (operation) {
            case "Same value":
                waitForElementVisibility(sameValue);
                clickElement(sameValue);
                break;
            case "Sum":
                waitForElementVisibility(Sum);
                clickElement(Sum);
                break;
            case "Minimum":
                waitForElementVisibility(Minimum);
                clickElement(Minimum);
                break;
            case "Average":
                waitForElementVisibility(Average);
                javaScriptClick(Average);
                break;
            case "Maximum":
                waitForElementVisibility(Maximum);
                clickElement(Maximum);
                break;
            case "Count":
                waitForElementVisibility(Count);
                clickElement(Count);
                break;
            case "Last":
                waitForElementVisibility(Last);
                clickElement(Last);
                selectFromDropDown(firstLastOrder, "CDateTime");
                break;
            case "First":
                waitForElementVisibility(First);
                clickElement(First);
                break;
            default:
                break;
        }
    }

    public void addDataIntoParentList() throws AWTException {
        waitForPageLoaded();
        for(int i=0; i<=2;i++) {
            try {
                javaScriptClick(navigateParentList);
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        for (int i = 1; i <= 2; i++) {
            waitForElementVisibility(New);
            clickElement(New);
            waitForElementVisibility(title);
            clickElement(title);
            enterText(title, "PTitle" + i);
            enterText(text, "PText" + i);
            clickElement(editIcon);
            enterText(multiText, "PMultiText" + i);
            clickElement(saveMultiText);
            switch (i) {
                case 1:
                    doubleClick(pChoiceD);
                    clickElement(dropdown1);
                    javaScriptClick(radio1);
                    doubleClick(pChoiceCHK);
                    clickElement(chk1);
                    clickElement(text);
                    enterText(number, "1000");
                    enterText(currency, "1000");
                    enterText(dateTime,"9/9/2022");
                    selectFromDropDown(user, "Abhijeet Divate");
                    enterText(url, "https://www.google.com");
                    break;
                case 2:
                    doubleClick(pChoiceD);
                    clickElement(dropdown2);
                    javaScriptClick(radio2);
                    doubleClick(pChoiceCHK);
                    clickElement(chk2);
                    clickElement(text);
                    enterText(number, "2000");
                    enterText(currency, "2000");
                    javaScriptClick(booleanInput);
                    enterText(dateTime,"9/9/2022");
                    selectFromDropDown(user, "Varsha Chavan");
                    enterText(url, "https://www.swqaindia.com");
                    break;
            }
            clickElement(save);
            switchToDefaultContent();
        }
    }

    public void verifySameValueFieldReplication() {
        editFieldReplication("", "PText", "CText");
        waitForElementVisibility(navigateChildList);
        clickElement(navigateChildList);
        enterChildListTitleAndSelectLookup();
        verifyParentValueReplicatedInChildList("CText");
        deleteListRows();
        refreshPage();
        editFieldReplication("", "PMultiText", "CMultiText");
        clickElement(navigateChildList);
        enterChildListTitleAndSelectLookup();
        verifyParentValueReplicatedInChildList("CMultiText");
        deleteListRows();
        refreshPage();
        editFieldReplication("", "PDateTime", "CDateTime");
        clickElement(navigateChildList);
        enterChildListTitleAndSelectLookup();
        verifyParentValueReplicatedInChildList("CDate");
        deleteListRows();
        refreshPage();

        //TODO: do the same steps for remaining columns for the same value operation
    }

    private void enterChildListTitleAndSelectLookup() {
        for (int i = 1; i <= 2; i++) {
            clickElement(New);
            enterText(title, "CTitle" + i);
            clickElement(lookupOption);
            switch (i) {
                case 1:
                    clickElement(ptitle1);
                    break;
                case 2:
                    clickElement(ptitle2);
                    break;
            }
            clickElement(save);
        }
        Utilities.sleep(5000);
        refreshPage();
        waitForPageLoaded();
    }

    private void deleteListRows() {
        javaScriptClick(selectAll);
        clickElement(delete);
        clickElement(confirmation);
    }

    public void deleteExistingChildData() {
        waitForElementVisibility(navigateChildList);
        javaScriptClick(navigateChildList);
        deleteListRows();
    }

    private void verifyParentValueReplicatedInChildList(String columnName) {
        waitForElementVisibility(reflectedValues2);
        switch (columnName) {
            case "CText":
                Assert.assertEquals("PText1", reflectedValues.get(0).getText());
                Assert.assertEquals("PText2", reflectedValues.get(1).getText());
                break;
            case "CMultiText":
                Assert.assertEquals("PMultiText1", reflectedValues.get(0).getText());
                Assert.assertEquals("PMultiText2", reflectedValues.get(1).getText());
                break;
            case "CNumber":
                Assert.assertEquals("1,000", reflectedValues.get(0).getText());
                Assert.assertEquals("2,000", reflectedValues.get(1).getText());
                break;
            case "CDateTime":
                Assert.assertEquals("9/9/2022", reflectedValues.get(0).getText());
                Assert.assertEquals("9/9/2022", reflectedValues.get(1).getText());
                break;
            case "CUser":
                Assert.assertEquals("Abhijeet Divate", reflectedValues.get(0).getText());
                Assert.assertEquals("Varsha Chavan", reflectedValues.get(1).getText());
                break;
            case "CURL":
                Assert.assertEquals("https://www.google.com/", reflectedValues.get(0).getText());
                Assert.assertEquals("https://www.swqaindia.com/", reflectedValues.get(1).getText());
                break;

        }
    }

    public void editFieldReplication(String operation, String pFieldName, String cFieldName) {
        clickElement(settings);
        clickElement(BPASettingsLink);
        clickElement(fieldReplication);
        clickElement(editFR);
        Utilities.sleep(2000);
        selectOperation(operation);
        clearText(removePField);
        Utilities.sleep(2000);
        waitForElementVisibility(parentFieldPicker);
        enterText(parentFieldPicker,pFieldName);
        clickElement(fieldOption);
        clearText(removeCField);
        Utilities.sleep(2000);
        enterText(childFieldPicker,cFieldName);
        clickElement(fieldOption);
        scrollToElement(Save);
        clickElement(Save);
        Utilities.sleep(5000);
    }

    public Map<String, Integer> addDataInChildList(String columnName) {
        int pNumber1 = 0, pNumber2 = 0, numberColumnValue = 0, currencyColumnValue = 0;
        javaScriptClick(navigateChildList);
        waitForPageLoaded();
        waitForElementVisibility(childListButton);
        Utilities.sleep(2000);
        for (int i = 1; i <= 5; i++) {
            clickElement(New);
            enterText(title, "CTitle" + i);
            if (columnName.equals("CNumber")) {
                enterText(number, i + "0000");
                numberColumnValue = Integer.parseInt(getValueAttribute(number));
            }
            if (columnName.equals("CCurrency")) {
                enterText(currency, i + "0000");
                currencyColumnValue = Integer.parseInt(getValueAttribute(currency));
            }
            clickElement(lookupOption);
            switch (i) {
                case 1:
                    clickElement(ptitle1);
                    if (columnName.equals("CNumber")) {
                        pNumber1 = pNumber1 + numberColumnValue;
                    }
                    if (columnName.equals("CCurrency")) {
                        pNumber1 = pNumber1 + currencyColumnValue;
                    }
                    clickElement(Save);
                    break;
                case 2:
                    clickElement(ptitle2);
                    if (columnName.equals("CNumber")) {
                        pNumber2 = pNumber2 + numberColumnValue;
                    }
                    if (columnName.equals("CCurrency")) {
                        pNumber2 = pNumber2 + currencyColumnValue;
                    }
                    clickElement(Save);
                    break;
                case 3:
                    clickElement(ptitle2);
                    if (columnName.equals("CNumber")) {
                        pNumber2 = pNumber2 + numberColumnValue;
                        System.out.println("Sum should be for PNumber column of PTitle2=" + pNumber2);
                    }
                    if (columnName.equals("CCurrency")) {
                        pNumber2 = pNumber2 + currencyColumnValue;
                        System.out.println("Sum should be for PCurrency column of PTitle2=" + pNumber2);
                    }
                    childListData.put("PTitle2", pNumber2);
                    clickElement(Save);
                    break;
                case 4:
                case 5:
                    clickElement(ptitle1);
                    if (columnName.equals("CNumber")) {
                        pNumber1 = pNumber1 + numberColumnValue;
                        System.out.println("Sum should be for PNumber column of PTitle1=" + pNumber1);
                    }
                    if (columnName.equals("CCurrency")) {
                        pNumber1 = pNumber1 + currencyColumnValue;
                        System.out.println("Sum should be for PCurrency column of PTitle1=" + pNumber1);
                    }
                    childListData.put("PTitle1", pNumber1);
                    clickElement(Save);
                    break;
            }
        }
        System.out.println(childListData);
        return childListData;
    }

    public void verifyNumericField(Map<String, Integer> expectedChildListData) {
        javaScriptClick(parentList);
        waitForPageLoaded();
        waitForElementVisibility(parentListButton);
        Utilities.sleep(3000);
        Map<String, String> actualParentListData = getActualDataFromList("Title", "PNumber");
        boolean result = false;
        System.out.println("Actual Number Field Data=" + actualParentListData);
        System.out.println("Expected Number Field Data=" + expectedChildListData);
        List<String> expectedTitles = new ArrayList<>(expectedChildListData.keySet());
        for (String title : expectedTitles) {
            if (expectedChildListData.get(title) == Integer.parseInt(actualParentListData.get(title).replaceAll(",", ""))) {
                System.out.println(title + " has " + actualParentListData.get(title) + " verified");
                result = true;
            }
        }
        Assert.assertTrue(result);
    }

    public void verifyCurrencyField(Map<String, Integer> expectedChildListData) {
        javaScriptClick(parentList);
        waitForElementVisibility(parentListButton);
        Utilities.sleep(3000);
        Map<String, String> actualParentListData = getActualDataFromList("Title", "PCurrency");
        boolean result = false;
        System.out.println("Actual Number Field Data=" + actualParentListData);
        System.out.println("Expected Number Field Data=" + expectedChildListData);
        List<String> expectedTitles = new ArrayList<>(expectedChildListData.keySet());
        for (String title : expectedTitles) {
            String actualCurrency = actualParentListData.get(title).substring(1, actualParentListData.get(title).indexOf("."));
            if (expectedChildListData.get(title) == Integer.parseInt(actualCurrency.replaceAll(",", ""))) {
                System.out.println(title + " has " + actualParentListData.get(title) + " verified");
                result = true;
            }
        }
        Assert.assertTrue(result);
    }

    private Map<String, String> getActualDataFromList(String columnName1, String columnName2) {
        Map<String, String> actualParentData = new HashMap<>();
        int column1Index = getColumnIndex(columnName1);
        int column2Index = getColumnIndex(columnName2);
        int j = 2;
        for (int i = 0; i < rows.size(); i++) {
            String lookupColumn = "", replicatedValue = "";
            lookupColumn = getText(driver.findElement(By.xpath("(//div[@aria-colindex='" + column1Index + "'])[" + j + "]")));
            replicatedValue = getText(driver.findElement(By.xpath("(//div[@aria-colindex='" + column2Index + "'])[" + j + "]")));
            actualParentData.put(lookupColumn, replicatedValue);
            j++;
        }
        return actualParentData;
    }

    private int getColumnIndex(String columnName) {
        int columnIndex = 0;
        for (int i = 0; i < headers.size(); i++) {
            String headerName = headers.get(i).getText().trim();
            if (headerName.equals(columnName)) {
                columnIndex = i;
                System.out.println(columnName + " column index is " + columnIndex);
                break;
            }
        }
        return columnIndex + 2;
    }

    public Map<String, Integer> addDataIntoChildList(String columnName1, String columnName2, String operation, int count) {
        int minValue = 0, maxValue = 0, value, total = 0;
        javaScriptClick(navigateChildList);
        waitForPageLoaded();
        Utilities.sleep(2000);
        waitForElementVisibility(childListButton);
        for (int i = 1; i <= count; i++) {
            System.out.println("Waiting to click on New Button");
            clickElement(New);
            Utilities.sleep(1000);
            enterText(title, "CTitle" + i);
            if (columnName1.equals("CNumber")) {
                switch (i) {
                    case 1:
                        enterText(number, i + "4456");
                        minValue = Integer.parseInt(getValueAttribute(number));
                        break;
                    case 2:
                        enterText(number, i + "678");
                        int value2 = Integer.parseInt(getValueAttribute(number));
                        if (value2 < minValue) {
                            minValue = value2;
                        } else {
                            maxValue = value2;
                        }
                        break;
                    case 3:
                        enterText(number, i + "8600404");
                        int value3 = Integer.parseInt(getValueAttribute(number));
                        if (value3 < minValue) {
                            minValue = value3;
                        } else {
                            maxValue = value3;
                        }
                        if (operation.equals("Min")) {
                            childListData.clear();
                            System.out.println("Minimum value is=" + minValue);
                            childListData.put("PTitle2", minValue);
                        }
                        if (operation.equals("Max")) {
                            childListData.clear();
                            System.out.println("Maximum value is=" + maxValue);
                            childListData.put("PTitle2", maxValue);
                        }
                        break;
                }
                System.out.println(columnName1 + " filled in childList");
            }
            if (columnName1.equals("CCurrency")) {
                switch (i) {
                    case 1:
                        enterText(currency, i + "994553");
                        minValue = Integer.parseInt(getValueAttribute(currency));
                        maxValue = minValue;
                        break;
                    case 2:
                        enterText(currency, i + "90567984");
                        int value2 = Integer.parseInt(getValueAttribute(currency));
                        if (value2 < minValue) {
                            minValue = value2;
                        } else {
                            maxValue = value2;
                        }
                        break;
                    case 3:
                        enterText(currency, i + "67954");
                        int value3 = Integer.parseInt(getValueAttribute(currency));
                        if (value3 < minValue) {
                            minValue = value3;
                        } else {
                            maxValue = value3;
                        }

                        if (operation.equals("Min")) {
                            childListData.clear();
                            System.out.println("Minimum value is=" + minValue);
                            childListData.put("PTitle1", minValue);
                        }
                        if (operation.equals("Max")) {
                            childListData.clear();
                            System.out.println("Maximum value is=" + maxValue);
                            childListData.put("PTitle1", maxValue);
                        }
                        break;
                }
                System.out.println(columnName1 + " filled in childList");
            }
            if (columnName1.equals("CNo1")) {
                enterText(cNo1, i + "4456");
                value = Integer.parseInt(getValueAttribute(cNo1));
                total = total + value;
                System.out.println(columnName1 + " filled in childList");
            }
            if (columnName2.equals("CNo2")) {
                enterText(cNo2, i + "436456");
                System.out.println(columnName2 + " filled in childList");
            }
            if (columnName1.equals("CCur1")) {
                enterText(cCur1, i + "78695");
                value = Integer.parseInt(getValueAttribute(cCur1));
                total = total + value;
                System.out.println(columnName1 + " filled in childList");
            }
            if (columnName2.equals("CCur2")) {
                enterText(cCur2, i + "4567280");
                System.out.println(columnName2 + " filled in childList");
            }
            if (columnName1.contains("Number") || columnName1.contains("No")) {
                clickElement(lookupOption);
                clickElement(ptitle2);
                clickElement(Save);
                Utilities.sleep(2000);
            }
            if (columnName1.contains("Currency") || columnName1.contains("Cur")) {
                clickElement(lookupOption);
                clickElement(ptitle1);
                clickElement(Save);
                Utilities.sleep(2000);
            }
        }
        if (columnName1.equals("CNo1") && operation.equals("Avg")) {
            childListData.put("PTitle2", total / count);
            System.out.println("Expected Average of Number Field=" + total / count + " In PTitle2");
        }
        if (columnName1.equals("CCur1") && operation.equals("Avg")) {
            childListData.put("PTitle1", total / count);
            System.out.println("Expected Average of Currency Field=" + total / count + " In PTitle1");
        }
        return childListData;
    }

    public Map<String, Integer> getCalculatedFieldsActualData(String columnName, String operation) {
        Map<String, Integer> expectedTotal = new HashMap<>();
        String lookupFieldSelected = "";
        int value = 0;
        List<Integer> values = new ArrayList<>();
        int columnIndex = getColumnIndex(columnName);
        int lookupColumnIndex = getColumnIndex("ParentLookup");
        int j = 2;
        for (int i = 0; i < rows.size(); i++) {
            if (columnName.equals("CAddition")) {
                value = value + Integer.parseInt(getText(driver.findElement(By.xpath("(//div[@aria-colindex='" + columnIndex + "'])[" + j + "]"))).replaceAll(",", ""));
                values.add(Integer.parseInt(getText(driver.findElement(By.xpath("(//div[@aria-colindex='" + columnIndex + "'])[" + j + "]"))).replaceAll(",", "")));
            }
            if (columnName.equals("CCurAddition")) {
                String elementText = getText(driver.findElement(By.xpath("(//div[@aria-colindex='" + columnIndex + "'])[" + j + "]")));
                String currencyAdditionValue = elementText.substring(1, elementText.indexOf("."));
                value = value + Integer.parseInt(currencyAdditionValue.replaceAll(",", ""));
                values.add(Integer.parseInt(currencyAdditionValue.replaceAll(",", "")));
            }
            lookupFieldSelected = getText(driver.findElement(By.xpath("(//div[@aria-colindex='" + lookupColumnIndex + "'])[" + j + "]")));
            j++;
        }
        if (operation.equals("Sum")) {
            expectedTotal.put(lookupFieldSelected, value);
            System.out.println("Expected total of calculated Fields = " + value + " in " + lookupFieldSelected);
            System.out.println("Expected total of calculated Fields=" + value + " in " + lookupFieldSelected);
        }
        if (operation.equals("Min")) {
            int minValue = values.get(0);
            for (int i = 1; i < values.size(); i++) {
                if (values.get(i) < minValue) {
                    minValue = values.get(i);
                }
            }
            expectedTotal.put(lookupFieldSelected, minValue);
            System.out.println("Expected Minimum value of calculated Fields=" + minValue + " in " + lookupFieldSelected);
        }
        if (operation.equals("Avg")) {
            expectedTotal.put(lookupFieldSelected, value / rows.size());
            System.out.println("Expected Average value of calculated Fields=" + value / rows.size() + " in " + lookupFieldSelected);
        }
        if (operation.equals("Max")) {
            int maxValue = values.get(0);
            for (int i = 1; i < values.size(); i++) {
                if (values.get(i) > maxValue) {
                    maxValue = values.get(i);
                }
            }
            expectedTotal.put(lookupFieldSelected, maxValue);
            System.out.println("Expected Maximum value of calculated Fields=" + maxValue + " in " + lookupFieldSelected);
        }
        return expectedTotal;
    }

    public Map<String, Integer> selectLookupFieldsInChildList() {
        int parent1Count = 0, parent2Count = 0;
        javaScriptClick(navigateChildList);
        for (int i = 1; i <= 9; i++) {
            clickElement(New);
            enterText(title, "CTitle" + i);
            if (i % 2 == 0) {
                clickElement(lookupOption);
                clickElement(ptitle1);
                parent1Count++;
            } else {
                clickElement(lookupOption);
                clickElement(ptitle2);
                parent2Count++;
            }
            enterText(number, i + "000");
            clickElement(Save);
        }
        System.out.println("Expected Count of PTitle1=" + parent1Count);
        System.out.println("Expected Count of PTitle2=" + parent2Count);
        childListData.put("PTitle1", parent1Count);
        childListData.put("PTitle2", parent2Count);
        Utilities.sleep(5000);
        return childListData;
    }

    public void verifyCountOperationWithMultipleChildItems(Map<String, Integer> expectedLookupCount) {
        javaScriptClick(parentList);
        waitForElementVisibility(parentListButton);
        Utilities.sleep(5000);
        Map<String, String> actualParentListData = getActualDataFromList("Title", "PNumber");
        List<String> expectedTitles = new ArrayList<>(expectedLookupCount.keySet());
        for (String title : expectedTitles) {
            if (expectedLookupCount.get(title).equals(Integer.parseInt(actualParentListData.get(title)))) {
                System.out.println(title + " has count in ParentList are " + actualParentListData.get(title) + " as Expected");
            } else {
                Assert.fail("Actual count is=" + actualParentListData.get(title) + ",Expected count is =" + expectedLookupCount.get(title));
            }
        }
    }

    public Map<String, String> addDatesIntoChildList(List<List<String>> dates, String operation) {
        Map<String, String> childDate = new HashMap<>();
        javaScriptClick(navigateChildList);
        waitForPageLoaded();
        waitForElementVisibility(childListButton);
        for (int i = 1; i <= dates.get(0).size()-1; i++) {
            clickElement(New);
            enterText(title,  "CTitle" + i);
            clickElement(cDateTime);
            enterText(cDateTime, dates.get(0).get(i - 1));
            if (operation.equals("Last")) {
                clickElement(lookupOption);
                clickElement(ptitle1);
                childDate.put("PTitle1", "6/8/2019");
                clickElement(Save);
            }
            if (operation.equals("First")) {
                clickElement(lookupOption);
                clickElement(ptitle2);
                childDate.put("PTitle2", "7/5/2000");
                clickElement(Save);
            }
        }
        Utilities.sleep(5000);
        return childDate;
    }

    public void verifyLastFirstOperationWithMultipleChildItems(Map<String, String> expectedDate) {
        javaScriptClick(parentList);
        waitForElementVisibility(parentListButton);
        Map<String, String> actualParentListData = getActualDataFromList("Title", "PDateTime");
        List<String> expectedTitles = new ArrayList<>(expectedDate.keySet());
        for (String title : expectedTitles) {
            if (expectedDate.get(title).equals(actualParentListData.get(title))) {
                System.out.println(title + " has Date in ParentList is " + actualParentListData.get(title) + " as Expected");
            } else {
                Assert.fail("Actual Date is=" + actualParentListData.get(title) + ",Expected Date is =" + expectedDate.get(title));
            }
        }
    }
}
