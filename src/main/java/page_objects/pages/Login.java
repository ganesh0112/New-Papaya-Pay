package page_objects.pages;

import common.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login extends BasePage {
    @FindBy (xpath = "//input[@type='email']")
    private  WebElement emailInput;

    @FindBy (xpath = "//input[@type='submit']")
    private  WebElement next;

    @FindBy (xpath = "//input[@name='passwd']")
    private  WebElement password;

    @FindBy (xpath = "//input[@type='submit']")
    private  WebElement signIn;

    @FindBy (xpath = "//input[@type='submit']")
    private  WebElement yes;

    public  void logIntoSPFxSite(){
        loadUrl(prop.getProperty("spfxURL"));
        enterText(emailInput,prop.getProperty("spfxUsername"));
        clickElement(next);
        for(int i=0; i<=2;i++){
            try{
                waitForElementVisibility(password);
                enterText(password,prop.getProperty("spfxPassword"));
                break;
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }

        clickElement(signIn);
        clickElement(yes);
        System.out.println("Successfully logged into subsite");
    }

    public void logIntoSPFxSiteWithPermissionCredntials(){
        loadUrl(prop.getProperty("spfxURL"));
        enterText(emailInput,prop.getProperty("permissionUsername"));
        clickElement(next);
        for(int i=0; i<=2;i++){
            try{
                waitForElementVisibility(password);
                enterText(password,prop.getProperty("permissionPassword"));
                break;
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }

        clickElement(signIn);
        clickElement(yes);
        System.out.println("Successfully logged into subsite");
    }

    public void logIntoSPFxSiteForNonLicensedUser(){
        loadUrl(prop.getProperty("spfxNon-License-dev"));
        enterText(emailInput,prop.getProperty("spfxUsername"));
        clickElement(next);
        for(int i=0; i<=2;i++){
            try{
                waitForElementVisibility(password);
                enterText(password,prop.getProperty("spfxPassword"));
                break;
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }

        clickElement(signIn);
        clickElement(yes);
        System.out.println("Successfully logged into subsite");
    }

  public void logIntoSPFxSiteForExpiredLicensed(){
      loadUrl(prop.getProperty("spfxExpired_License-dev"));
      enterText(emailInput,prop.getProperty("spfxUsername"));
      clickElement(next);
      for(int i=0; i<=2;i++){
          try{
              waitForElementVisibility(password);
              enterText(password,prop.getProperty("spfxPassword"));
              break;
          }
          catch(Exception e){
              System.out.println(e.getMessage());
          }
      }

      clickElement(signIn);
      clickElement(yes);
      System.out.println("Successfully logged into subsite");
  }

    public void logIntoSPFxSiteMaxUser(){
        loadUrl(prop.getProperty("spfxMax_User-dev"));
        enterText(emailInput,prop.getProperty("spfxUsername"));
        clickElement(next);
        for(int i=0; i<=2;i++){
            try{
                waitForElementVisibility(password);
                enterText(password,prop.getProperty("spfxPassword"));
                break;
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }

        clickElement(signIn);
        clickElement(yes);
        System.out.println("Successfully logged into subsite");
    }
}
