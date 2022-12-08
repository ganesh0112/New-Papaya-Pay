package page_objects.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Settings extends SubsitePage{

    @FindBy(xpath = "//a[@href='#/customButtons']")
    private WebElement customButtons;


    @FindBy(xpath = "//span[contains(text(),'New')]")
    private WebElement newButton;


    @FindBy(xpath = "//a[@href='#/fr_configurations']")
    private WebElement fieldReplication;

    @FindBy(xpath = "//span[text()='New fields replication']")
    private WebElement newFieldReplication;

    @FindBy(xpath = "//a[@href='#/quicklinks']")
    private WebElement navigationLinks;



    public void clickOnCustomButton(){
        clickElement(customButtons);
        System.out.println("Clicked on custom button link");
    }

    public void clickOnNewButton(){
        clickElement(newButton);
        System.out.println("Clicked on new button link");
    }

    public void clickOnFieldReplication(){
        clickElement(fieldReplication);
        System.out.println("Clicked on Field Replications link");
    }

    public void clickOnNewFieldReplication(){
        clickElement(newFieldReplication);
    }

    public void clickOnNavigationLinks(){
        clickElement(navigationLinks);
        System.out.println("Clicked on Navigation links");
    }

}
