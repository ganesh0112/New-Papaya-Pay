package page_objects.pages;

import common.Utilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Contacts extends SubsitePage{

    @FindBy(xpath = "//button[@name='New']")
    private WebElement New;

    @FindBy(xpath = "//span[contains(@class,'ms-ContextualMenu-itemText') and contains(text(),'Contact')]")
    private WebElement Contact;

    @FindBy(xpath = "//input[contains(@aria-label,'Last Name')]")
    private WebElement lastName;

    @FindBy(xpath = "//input[contains(@aria-label,'First Name')]")
    private WebElement firstName;

    @FindBy(xpath = "//input[contains(@aria-label,'Full Name')]")
    private WebElement fullName;

    @FindBy(xpath = "//i[@data-icon-name='Save']")
    private WebElement Save;

    public void addContacts(){
        for(int i=1; i<=4; i++){
            clickElement(New);
            clickElement(Contact);
            enterText(lastName,"AutoLName"+ i);
            enterText(firstName,"AutoFName"+ i);
            enterText(fullName,"AutoFName"+ i +" "+"AutoLName"+ i);
            clickElement(Save);
            Utilities.sleep(1000);
            System.out.println(i + "contact added");
        }
    }

}
