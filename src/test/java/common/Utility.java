package common;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class Utility extends BasePage {

    public static long implicitWait = 50;
    public static long webDriverWait = 30;

    
    public static void waitForElementVisible(WebElement webEle) {
        try {
            wait.until(ExpectedConditions.visibilityOf(webEle));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void clickElement(WebElement element) {
        try {
            element.click();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
