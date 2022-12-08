package page_objects.pages;

import common.Utilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Organizations extends SubsitePage {

    @FindBy(xpath = "//button[@name='New']")
    private WebElement New;

    @FindBy(xpath = "//span[contains(@class,'ms-ContextualMenu-itemText') and contains(text(),'Account')]")
    private WebElement Account;

    @FindBy(xpath = "//input[contains(@aria-label,'Name')]")
    private WebElement name;

    @FindBy(xpath = "//i[@data-icon-name='Save']")
    private WebElement Save;

    public void addAccounts(){
        for(int i=1; i<=4; i++){
            clickElement(New);
            clickElement(Account);
            enterText(name,"AutoAccount"+ i);
            clickElement(Save);
            Utilities.sleep(1000);
            System.out.println(i + "Account added");
        }
    }
}
