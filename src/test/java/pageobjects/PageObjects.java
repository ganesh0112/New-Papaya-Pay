package pageobjects;

import common.BasePage;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.logs.Log;

import static common.Utility.clickElement;
import static common.Utility.waitForElementVisible;

public class PageObjects extends BasePage {
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText\n")
    public WebElement emailIDBTN;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText\n")
    public WebElement passBTN;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.EditText\n")
    public WebElement confirmpassBTN;

    @FindBy(xpath = "//android.widget.Button[@content-desc=\"Sign Up\"]\n")
    public WebElement signupBTN;

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Already have an account?\"]\n")
    public WebElement haveanacctBTN;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText\n")
    public WebElement emailIdBTN;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText\n")
    public WebElement passwordBTN;

    @FindBy(xpath = "//android.widget.Button[@content-desc=\"Sign In\"]\n")
    public WebElement signinBTN;

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Add Credit Card\"]\n")
    public WebElement addcreditcardBTN;

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Add Debit Card\"]\n")
    public WebElement adddebitcardBTN;

    @FindBy(xpath = "(//android.widget.Button[@content-desc=\"@2132018372\"])[1]\n")
    public WebElement changepaymentmethodBTN;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.TextView[1]\n")
    public WebElement paymentmethodcheckBTN;
    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Add Credit Card\"]\n")
    public WebElement addcreditcardsBTN;

    @FindBy(id = "com.snappays.debug:id/card_edt_phone")
    public WebElement phnoBTN;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText\n")
    public WebElement mailidBTN;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.FrameLayout/android.widget.EditText\n")
    public WebElement cardholderBTN;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText\n")
    public WebElement cardNumBTN;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[5]/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText\n")
    public WebElement expiDtBTN;

//    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText\n")
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.AutoCompleteTextView")
    public WebElement edtaddrBTN;

//    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText\n")
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText")
    public WebElement edtcityBTN;

//    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText\n")
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText")
    public WebElement edtzipBTN;

//    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.Spinner/android.widget.CheckedTextView\n")
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.Spinner/android.widget.CheckedTextView")
    public WebElement edtstateBTN;

//    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[6]\n")
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[8]\n")
    public WebElement ctBTN;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button\n")
    public WebElement savecardBTN;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.TextView[2]\n")
    public WebElement visaBTN;

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Navigate up\"]\n")
    public WebElement backarrowBTN;


    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.RelativeLayout\n")
    public WebElement paybBTN;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[6]\n")
    public WebElement contnBTN;


    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[3]\n")
    public WebElement signoutBTN;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button\n")
    public WebElement nextBTN;


   @FindBy(id = "com.snappays.debug:id/big_button")
//    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button\n")
    public WebElement payabillBTN;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ImageView[1]\n")
    public WebElement takePicBTN;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.Button\n")
    public WebElement cancalBTN;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText\n")
    public WebElement phonenoBTN;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText\n")
    public WebElement emailBTN;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.FrameLayout/android.widget.EditText\n")
    public WebElement cardholdernameBTN;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText\n")
    public WebElement cardnoBTN;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[5]/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText\n")
    public WebElement cvvBTN;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[5]/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText\n")
    public WebElement expdateBTN;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button\n")
    public WebElement savedebitcardBTN;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.RelativeLayout\n")
    public WebElement payBTN;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[6]\n")
    public WebElement contBTN;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ImageView[2]\n")
    public WebElement photoLibBTN;

    @FindBy(xpath = "(//android.widget.ImageView[@content-desc=\"Select a photo from gallery\"])[1]")
    public WebElement selectPhotoBTN;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.ListView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.ImageView\n")
    public WebElement gallBTN;

//    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.TabHost/android.widget.LinearLayout/android.widget.FrameLayout/com.android.internal.widget.ViewPager/android.widget.RelativeLayout/com.android.internal.widget.RecyclerView/android.widget.LinearLayout/android.widget.LinearLayout[2]")
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.TabHost/android.widget.LinearLayout/android.widget.FrameLayout/com.android.internal.widget.ViewPager/android.widget.RelativeLayout/com.android.internal.widget.RecyclerView/android.widget.LinearLayout/android.widget.LinearLayout[1]")
    public WebElement photoBTN1;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.TextView[1]\n")
    public WebElement galphotoBTN;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]")
    public WebElement photoBTN2;

    @FindBy(xpath = "(//android.widget.FrameLayout[@content-desc=\"Button\"])[1]/android.widget.FrameLayout/android.widget.ImageView\n")
    public WebElement picbillBTN;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Photo taken on Aug 18, 2022 6:23:24 PM\"]")
    public WebElement picBill;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.EditText\n")
    public WebElement enteramountBTN;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.Button\n")
    public WebElement contiBTN;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[1]\n")
    public WebElement continuBTN;

    @FindBy(xpath = "(//android.widget.ImageView[@content-desc=\"Arrow Right\"])[1]\n")
    public WebElement bankacctBTN;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.LinearLayout/android.widget.TextView[1]\n")
    public WebElement useroutBTN;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText\n")
    public WebElement phonenuBTN;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText\n")
    public WebElement emailaddrsBTN;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RadioGroup[1]/android.widget.RadioButton[2]\n")
    public WebElement savingBTN;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.EditText\n")
    public WebElement acctholdnameBTN;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.FrameLayout/android.widget.EditText\n")
    public WebElement routingnuBTN;

    @FindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[5]/android.widget.FrameLayout/android.widget.EditText\n" )
    public WebElement confirmroutnuBTN;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[6]/android.widget.FrameLayout/android.widget.EditText\n")
    public WebElement acctnuBTN;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[7]/android.widget.FrameLayout/android.widget.EditText\n")
    public WebElement confirmacctnuBTN;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.RelativeLayout/android.widget.Switch\n")
    public WebElement termsBTN;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText\n")
    public WebElement phonnuBTN;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText\n")
    public WebElement emailidBTN;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.FrameLayout/android.widget.EditText\n")
    public WebElement cardholdnameBTN;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText\n")
    public WebElement cardnuBTN;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[5]/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText\n")
    public WebElement CVVBTN;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[5]/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText\n")
    public WebElement expdtBTN;

    @FindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"My Account\"]/android.view.ViewGroup/android.widget.TextView\n")
    public WebElement myacctBTN;

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Payment Methods\"]\n")
    public WebElement paymntmethdBTN;

    @FindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"My Bills\"]/android.widget.FrameLayout/android.widget.ImageView\n")
    public WebElement mybillBTN;

    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Arrow Right\"]\n")
    public WebElement arrowBTN;

    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Image\"]\n")
    public WebElement yourbillBTN;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.ImageButton\n")
    public WebElement imagecrossBTN;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.Button\n")
    public WebElement optionBTN;

    @FindBy(xpath = "(//android.widget.Button[@content-desc=\"Modify\"])[1]\n")
    public WebElement cancelpaymntBTN;

   @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[5]\n")
    public WebElement cancelreasonBTN;

   @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Forgot your password?\"]\n")
   public WebElement forgotpasswordBTN;

   @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText\n")
   public WebElement enteremailBTN;

   @FindBy(xpath = "//android.widget.Button[@content-desc=\"Reset password\"]\n")
   public WebElement resetpwdBTN;

   @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.Button\n")
   public WebElement editBTN;

   @FindBy(xpath = "(//android.widget.ImageView[@content-desc=\"Image\"])[1]\n")
   public WebElement redBTN;

   @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]\n")
   public WebElement deleteBTN;


    public PageObjects() {
        PageFactory.initElements(driver, this);
    }

    public void clickPayBillBTN() {
        try {
            waitForElementVisible(payabillBTN);
            clickElement(payabillBTN);
        } catch (NoSuchElementException | StaleElementReferenceException ignored) {
        }
        Log.info("Clicked on Pay Bill.");
    }

    public void clickTakePictBTN() {
        try {
            waitForElementVisible(takePicBTN);
            clickElement(takePicBTN);
        } catch (NoSuchElementException | StaleElementReferenceException ignored) {
        }
        Log.info("Clicked on Take Picture.");
    }

    public void clickCancalBTN() {
        try {
            waitForElementVisible(cancalBTN);
            clickElement(cancalBTN);
        } catch (NoSuchElementException | StaleElementReferenceException ignored) {
        }
        Log.info("Clicked on Cancel.");
    }

    public void AddDebitCardsDetail() {
        try {
            Thread.sleep(3000);
            waitForElementVisible(phonenoBTN);
            phonenoBTN.sendKeys("7385848505");
            waitForElementVisible(emailBTN);
            emailBTN.sendKeys("amit.rawat+07072201@papayapay.com");
            waitForElementVisible(cardholdernameBTN);
            cardholdernameBTN.sendKeys("Lena Porina");
            waitForElementVisible(cardnoBTN);
            cardnoBTN.sendKeys("4111 2222 3333 4448");
            waitForElementVisible(cvvBTN);
            cvvBTN.sendKeys("177");
            waitForElementVisible(expdateBTN);
            expdateBTN.sendKeys("02/25");
        } catch (NoSuchElementException | StaleElementReferenceException | InterruptedException ignored) {
        }
    }

    public void clickSaveDebitCardBTN() {
        try {
            waitForElementVisible(savedebitcardBTN);
            clickElement(savedebitcardBTN);
        } catch (NoSuchElementException | StaleElementReferenceException ignored) {
        }
    }

    public void clickPayBTN() {
        try {
            waitForElementVisible(payBTN);
            clickElement(payBTN);
        } catch (NoSuchElementException | StaleElementReferenceException ignored) {
        }
    }

    public void clickContBTN() {
        try {
            waitForElementVisible(contBTN);
            clickElement(contBTN);
        } catch (NoSuchElementException | StaleElementReferenceException ignored) {
        }
    }

    public void clickPhotoLibBTN() {
        try {
            Thread.sleep(4000);
            waitForElementVisible(photoLibBTN);
            clickElement(photoLibBTN);
            Thread.sleep(4000);
        } catch (NoSuchElementException | StaleElementReferenceException | InterruptedException ignored) {
        }
    }

    public void clickSelectPhotoBTN() {
        try {
            Thread.sleep(4000);
            waitForElementVisible(selectPhotoBTN);
            clickElement(selectPhotoBTN);
            Thread.sleep(4000);
        } catch (NoSuchElementException | StaleElementReferenceException | InterruptedException ignored) {
        }
    }

    public void clickGallBTN() {
        try {
            waitForElementVisible(gallBTN);
            clickElement(gallBTN);
        } catch (NoSuchElementException | StaleElementReferenceException ignored) {
        }
    }

    public void clickphotoBTN1() {
        try {
            waitForElementVisible(photoBTN1);
            clickElement(photoBTN1);
        } catch (NoSuchElementException | StaleElementReferenceException ignored) {
        }
    }

    public void clickGalPhotoBTN() {
        try {
            waitForElementVisible(galphotoBTN);
            clickElement(galphotoBTN);
        } catch (NoSuchElementException | StaleElementReferenceException ignored) {
        }
    }

    public void clickphotoBTN2() {
        try {
            waitForElementVisible(photoBTN2);
            clickElement(photoBTN2);
        } catch (NoSuchElementException | StaleElementReferenceException ignored) {
        }
    }

    public void clickPicPillBTN() {
        try {
            waitForElementVisible(picbillBTN);
            clickElement(picbillBTN);
        } catch (NoSuchElementException | StaleElementReferenceException ignored) {
        }
    }

    public void selectBill() {
        try {
            waitForElementVisible(picBill);
            clickElement(picBill);
        } catch (NoSuchElementException | StaleElementReferenceException ignored) {
        }
    }

    public void clickEnterAmountBTN() {
        try {
            waitForElementVisible(enteramountBTN);
            enteramountBTN.sendKeys("5.00");
        } catch (NoSuchElementException | StaleElementReferenceException ignored) {
        }
    }

    public void clickContiBTN() {
        try {
            waitForElementVisible(contiBTN);
            clickElement(contiBTN);
        } catch (NoSuchElementException | StaleElementReferenceException ignored) {
        }
    }

    public void clickContinuBTN() {
        try {
            waitForElementVisible(continuBTN);
            clickElement(continuBTN);
        } catch (NoSuchElementException | StaleElementReferenceException ignored) {
        }
    }

    public void clickBankAcctBTN() {
        try {
            waitForElementVisible(bankacctBTN);
            clickElement(bankacctBTN);
        } catch (NoSuchElementException | StaleElementReferenceException ignored) {
        }
    }
    public void clickUseRoutBTN() {
        try {
            waitForElementVisible(useroutBTN);
            clickElement(useroutBTN);
        } catch (NoSuchElementException | StaleElementReferenceException ignored) {
        }
    }

    public void AddBankAcctDetail() {
        try {
           waitForElementVisible(phonenuBTN);
            phonenuBTN.sendKeys("7385848505");
            Thread.sleep(3000);
           waitForElementVisible(emailaddrsBTN);
            emailaddrsBTN.sendKeys("amit.rawat+07072022@papayapay.com");
            waitForElementVisible(savingBTN);
            clickElement(savingBTN);
            waitForElementVisible(acctholdnameBTN);
            acctholdnameBTN.sendKeys("Ganesh Bankar");
            waitForElementVisible(routingnuBTN);
            routingnuBTN.sendKeys("061234569");
            waitForElementVisible(confirmroutnuBTN);
            confirmroutnuBTN.sendKeys("061234569");
            waitForElementVisible(acctnuBTN);
            acctnuBTN.sendKeys("1234567");
            waitForElementVisible(confirmacctnuBTN);
            confirmacctnuBTN.sendKeys("1234567");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickTermsBTN() {
        try {
            waitForElementVisible(termsBTN);
            clickElement(termsBTN);

        } catch (NoSuchElementException | StaleElementReferenceException ignored) {
        }
    }

    public void AddCreditcardDetail() {
        try {
            waitForElementVisible(phonnuBTN);
            phonnuBTN.sendKeys("8767079480");
            waitForElementVisible(emailidBTN);
            emailidBTN.sendKeys("amit.rawat+12072022@gmail.com");
            waitForElementVisible(cardholdnameBTN);
            cardholdnameBTN.sendKeys("Ganesh Bankar");
            waitForElementVisible(cardnuBTN);
            cardnuBTN.sendKeys("4111 1111 1111 1111");
            waitForElementVisible(CVVBTN);
            CVVBTN.sendKeys("177");
            waitForElementVisible(expdtBTN);
            expdtBTN.sendKeys("02/25");
        } catch (NoSuchElementException | StaleElementReferenceException ignored) {
        }
    }
    public void clickNextBTN() {
        try {
            waitForElementVisible(nextBTN);
            clickElement(nextBTN);
        } catch (NoSuchElementException | StaleElementReferenceException ignored) {
        }
    }

    public void clickMyAcctBTN() {
        try {
            waitForElementVisible(myacctBTN);
            clickElement(myacctBTN);
        } catch (NoSuchElementException | StaleElementReferenceException ignored) {
        }
        Log.info("Clicked on My Account.");
    }

    public void clickPaymntMethdBTN() {
        try {
            waitForElementVisible(paymntmethdBTN);
            clickElement(paymntmethdBTN);
        } catch (NoSuchElementException | StaleElementReferenceException ignored) {
        }
    }

    public void clickMyBillBTN() {
        try {
            waitForElementVisible(mybillBTN);
            clickElement(mybillBTN);
        } catch (NoSuchElementException | StaleElementReferenceException ignored) {
        }
    }

    public void clickArrowBTN() {
        try {
            waitForElementVisible(arrowBTN);
            clickElement(arrowBTN);
        } catch (NoSuchElementException | StaleElementReferenceException ignored) {
        }
    }

    public void clickYourBillBTN() {
        try {
            waitForElementVisible(yourbillBTN);
            clickElement(yourbillBTN);
        } catch (NoSuchElementException | StaleElementReferenceException ignored) {
        }
    }

    public void clickImageCrossBTN () {
        try {
            waitForElementVisible(imagecrossBTN);
            clickElement(imagecrossBTN);
        } catch (NoSuchElementException | StaleElementReferenceException ignored) {
        }
    }

    public void clickOptionBTN() {
        try {
            waitForElementVisible(optionBTN);
            clickElement(optionBTN);
        } catch (NoSuchElementException | StaleElementReferenceException ignored) {
        }
    }
    public void clickCancelPaymntBTN() {
        try {
            waitForElementVisible(cancelpaymntBTN);
            clickElement(cancelpaymntBTN);
        } catch (NoSuchElementException | StaleElementReferenceException ignored) {
        }
    }

    public void clickChangePaymntMethodBTN() {
        try {
            waitForElementVisible(cancelreasonBTN);
            clickElement(cancelreasonBTN);
        } catch (NoSuchElementException | StaleElementReferenceException ignored) {
        }
    }

    public void clickEmailIDBTN () {
        try {
            waitForElementVisible(emailIDBTN);
            emailIDBTN.sendKeys("amit.rawat+07072022@papayapay.com");
        } catch (NoSuchElementException | StaleElementReferenceException ignored) {
        }
        Log.info("Provided valid email credential.");
    }

    public void clickPassBTN () {
        try {
            waitForElementVisible(passBTN);
            passBTN.sendKeys("Pass1234");
        } catch (NoSuchElementException | StaleElementReferenceException ignored) {
        }
        Log.info("Provided valid password credential.");
    }

    public void clickConfirmPassBTN () {
        try {
            waitForElementVisible(confirmpassBTN);
            confirmpassBTN.sendKeys("Pass1234");
        } catch (NoSuchElementException | StaleElementReferenceException ignored) {
        }
        Log.info("Provided valid password credential to confirm.");
    }

    public void clickOnSignUpBTN() {
        try {
            waitForElementVisible(signupBTN);
            clickElement(signupBTN);
        } catch (NoSuchElementException | StaleElementReferenceException ignored) {
        }
        Log.info("Clicked on sign up button.");
    }


    public void clickHaveAnAcctBTN() {
        try {
            waitForElementVisible(haveanacctBTN);
            clickElement(haveanacctBTN);
        } catch (NoSuchElementException | StaleElementReferenceException ignored) {
        }
        Log.info("Clicked on Have an account.");
    }

        public void clickEmailIdBTN () {
        try {
            waitForElementVisible(emailIdBTN);
            emailIdBTN.sendKeys("amit.rawat+07072022@papayapay.com");
        } catch (NoSuchElementException | StaleElementReferenceException ignored) {
        }
    }

    public void clickPasswordBTN () {
        try {
            waitForElementVisible(passwordBTN);
            passwordBTN.sendKeys("Pass1234");
        } catch (NoSuchElementException | StaleElementReferenceException ignored) {
        }
    }

    public void LogInDetail() {
        try {
            waitForElementVisible(emailIdBTN);
            emailIdBTN.sendKeys("amit.rawat+072600@papayapay.com");
            waitForElementVisible(passwordBTN);
            passwordBTN.sendKeys("pass1234");
        } catch (NoSuchElementException | StaleElementReferenceException ignored) {
        }
        Log.info("Provided valid login credentials.");
    }

    public void invalidLogInDetail() {
        try {
            waitForElementVisible(emailIdBTN);
            emailIdBTN.sendKeys("amit.rawat+072600@papayapay.com");
            waitForElementVisible(passwordBTN);
            passwordBTN.sendKeys("pass1234789");
            Assert.assertEquals(passwordBTN.getText(),"pass1234");
        } catch (NoSuchElementException | StaleElementReferenceException ignored) {
        }
    }

    public void clickSignInBTN () {
        try {
            waitForElementVisible(signinBTN);
            clickElement(signinBTN);
        } catch (NoSuchElementException | StaleElementReferenceException ignored) {
        }
        Log.info("Clicked on Sign in.");
    }

    public void clickAddCreditCardBTN () {
        try {
            waitForElementVisible(addcreditcardBTN);
            clickElement(addcreditcardBTN);
        } catch (NoSuchElementException | StaleElementReferenceException ignored) {
        }
    }

    public void clickAddDebitCardBTN() {
        try {
            waitForElementVisible(adddebitcardBTN);
            clickElement(adddebitcardBTN);
        } catch (NoSuchElementException | StaleElementReferenceException ignored) {
        }
    }

    public void clickChangePaymentMethodBTN() {
        try {
            waitForElementVisible(changepaymentmethodBTN);
            clickElement(changepaymentmethodBTN);
        } catch (NoSuchElementException | StaleElementReferenceException ignored) {
        }
    }
    public void clickPaymentMethodCheckingBTN() {
        try {
            waitForElementVisible(paymentmethodcheckBTN);
            clickElement(paymentmethodcheckBTN);
        } catch (NoSuchElementException | StaleElementReferenceException ignored) {
        }
    }

    public void clickAddCreditCardsBTN() {
        try {
            waitForElementVisible(addcreditcardsBTN);
            clickElement(addcreditcardsBTN);
        } catch (NoSuchElementException | StaleElementReferenceException ignored) {
        }
    }

    public void CreditcardDetail() {
        try {
            waitForElementVisible(phnoBTN);
            phnoBTN.sendKeys("8767079480");
            waitForElementVisible(mailidBTN);
            mailidBTN.sendKeys("ganeshbankar55@gmail.com");
            waitForElementVisible(cardholderBTN);
            cardholderBTN.sendKeys("Amit");
            waitForElementVisible(cardNumBTN);
            cardNumBTN.sendKeys("5105 1051 0510 5100");
            waitForElementVisible(CVVBTN);
            CVVBTN.sendKeys("177");
            waitForElementVisible(expiDtBTN);
            expiDtBTN.sendKeys("02/25");
        } catch (NoSuchElementException | StaleElementReferenceException  ignored) {
        }
    }

    public void BillingAddrsDetail() {
        try {
            waitForElementVisible(edtaddrBTN);
            edtaddrBTN.sendKeys("med. chowk , Nagpur");
            waitForElementVisible(edtcityBTN);
            edtcityBTN.sendKeys("Nagpur");
            waitForElementVisible(edtzipBTN);
            edtzipBTN.sendKeys("12345");
            waitForElementVisible(edtstateBTN);
            clickElement(edtstateBTN);
            waitForElementVisible(ctBTN);
                clickElement(ctBTN);
        } catch (NoSuchElementException | StaleElementReferenceException ignored) {
        }
    }

    public void clickSignOutBTN() {
        try {
            waitForElementVisible(signoutBTN);
            clickElement(signoutBTN);
            Thread.sleep(2000);
        } catch (NoSuchElementException | StaleElementReferenceException | InterruptedException ignored) {
        }
        Log.info("Clicked on sign out.");
    }

    public void clickSaveCardBTN() {
        try {
            waitForElementVisible(savecardBTN);
            clickElement(savecardBTN);
        } catch (NoSuchElementException | StaleElementReferenceException ignored) {
        }
    }

    public void clickVisaBTN() {
        try {
            waitForElementVisible(visaBTN);
            clickElement(visaBTN);
        } catch (NoSuchElementException | StaleElementReferenceException ignored) {
        }
    }

    public void clickBackArrowBTN() {
        try {
            waitForElementVisible(backarrowBTN);
            clickElement(backarrowBTN);
        } catch (NoSuchElementException | StaleElementReferenceException ignored) {
        }
    }

    public void clickPayBilBTN() {
        try {
            waitForElementVisible(paybBTN);
            clickElement(paybBTN);
        } catch (NoSuchElementException | StaleElementReferenceException ignored) {
        }
    }

    public void clickContnBTN() {
        try {
            waitForElementVisible(contnBTN);
            clickElement(contnBTN);
        } catch (NoSuchElementException | StaleElementReferenceException ignored) {
        }
    }

    public void clickForgotPasswordBTN() {
        try {
            waitForElementVisible(forgotpasswordBTN);
            clickElement(forgotpasswordBTN);
        } catch (NoSuchElementException | StaleElementReferenceException ignored) {
        }
    }

    public void clickEnterEmailBTN() {
        try {
            waitForElementVisible(enteremailBTN);
            enteremailBTN.sendKeys("amit.rawat+112233@papayapay.com");
        } catch (NoSuchElementException | StaleElementReferenceException ignored) {
        }
    }

    public void clickResetPasswordBTN() {
        try {
            waitForElementVisible(resetpwdBTN);
            clickElement(resetpwdBTN);
        } catch (NoSuchElementException | StaleElementReferenceException ignored) {
        }
    }

    public void clickEditBTN() {
        try {
            waitForElementVisible(editBTN);
            clickElement(editBTN);
        } catch (NoSuchElementException | StaleElementReferenceException ignored) {
        }
    }

    public void clicRedBTN() {
        try {
            Thread.sleep(4000);
            waitForElementVisible(redBTN);
            clickElement(redBTN);
        } catch (NoSuchElementException | StaleElementReferenceException | InterruptedException ignored) {
        }
    }

    public void clickDeleteBTN() {
        try {
            Thread.sleep(5000);
            waitForElementVisible(deleteBTN);
            clickElement(deleteBTN);
            Thread.sleep(5000);
        } catch (NoSuchElementException | StaleElementReferenceException | InterruptedException ignored) {
        }
    }
}







