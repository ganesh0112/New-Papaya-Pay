package page_objects.components;

import common.BasePage;
import common.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

//Parent class for all Component

public class Component extends BasePage {

    @FindBy (xpath = "//iframe[contains(@id,'DlgFrame')]")
    protected WebElement DlgFrame;

    @FindBy (tagName = "ul")
    private List<WebElement> ul;

    @FindBy(xpath="(//div[contains(@class,'ms-TooltipHost root-')])[2]")
    private WebElement orderOption;



    protected void selectValueFromDropdown(WebElement element,String text){
        element.click();
        enterText(element, text);
        waitTillListLoaded(element);
        List<WebElement> lists =  findElements(valueList());
        for (WebElement list : lists) {
            if (list.getText().equals(text)) {
                list.click();
                break;
            }
        }
    }

    private void waitTillListLoaded(WebElement webElement)  {
        int i = 0;
        do {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
            if (i > 30) {
                break;
            }
        }
        while (webElement.getAttribute("class").contains("ui-autocomplete-loading"));
    }

    private By valueList(){
        String id = "";
        for (WebElement list : ul) {
            if (list.getAttribute("style").contains("display: block;")) {
                id = list.getAttribute("id");
            }
        }
        return By.xpath("//*[@id='" + id + "']/li");
    }


    protected void selectFromDropDown(WebElement webElement,String text){
        scrollToElement(webElement);
        enterText(webElement,text);
        Utilities.sleep(3000);
        clickElement(orderOption);
    }

}
