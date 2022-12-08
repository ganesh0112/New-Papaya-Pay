package stepDefinitions;

import common.BasePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import page_objects.pages.Login;

public class Hooks extends BasePage {

    @Before()
    public void beforeClass(){
        setBrowser();
        getInstance(Login.class).logIntoSPFxSite();
    }


    @After()
    public void endSession(){
       closeDriver();
    }
}

