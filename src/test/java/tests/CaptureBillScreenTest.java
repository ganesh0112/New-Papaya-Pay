package tests;

import common.BasePage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.PageObjects;

import java.io.IOException;
import java.lang.reflect.Method;

import static utils.extentreports.ExtentTestManager.startTest;

public class CaptureBillScreenTest extends BasePage {

    PageObjects pgObj = new PageObjects();

    @BeforeMethod
    public void setUp() throws IOException {
        initialization();
        pgObj = new PageObjects();
    }

    @Test(priority = 1)
    public void signUp (Method method) {
        startTest(method.getName(), "This test is for sign up.");

        pgObj.clickPayBillBTN();
        pgObj.clickTakePictBTN();
        pgObj.clickCancalBTN();
        pgObj.clickMyAcctBTN();
        pgObj.clickEmailIDBTN();
        pgObj.clickPassBTN();
        pgObj.clickConfirmPassBTN();
        pgObj.clickOnSignUpBTN();
    }

//     @Test (priority = 2)
//     public void signIn (Method method) {
//         startTest(method.getName(), "This test is for sign in.");

//         pgObj.clickPayBillBTN();
//         pgObj.clickTakePictBTN();
//         pgObj.clickCancalBTN();
//         pgObj.clickMyAcctBTN();
//         pgObj.clickHaveAnAcctBTN();
//         pgObj.clickEmailIdBTN();
//         pgObj.clickPasswordBTN();
//         pgObj.clickSignInBTN();
//     }

//     @Test(priority = 3)
//     public void resetPassword (Method method) {
//         startTest(method.getName(), "This test is for reset password.");

//         pgObj.clickPayBillBTN();
//         pgObj.clickTakePictBTN();
//         pgObj.clickCancalBTN();
//         pgObj.clickMyAcctBTN();
//         pgObj.clickHaveAnAcctBTN();
//         pgObj.clickForgotPasswordBTN();
//         pgObj.clickEnterEmailBTN();
//         pgObj.clickResetPasswordBTN();

//     }

//     @Test (priority = 4)
//     public void deletePaymentMethod (Method method) {
//         startTest(method.getName(), "This test is for delete payment method");

//         pgObj.clickPayBillBTN();
//         pgObj.clickPhotoLibBTN();
//         pgObj.clickGallBTN();
//         pgObj.clickGalPhotoBTN();
//         pgObj.clickPicPillBTN();
//         pgObj.selectBill();
//         pgObj.clickEnterAmountBTN();
//         pgObj.clickContiBTN();
//         pgObj.clickContinuBTN();
//         pgObj.clickBankAcctBTN();
//         pgObj.clickUseRoutBTN();
//         pgObj.AddBankAcctDetail();
//         pgObj.clickNextBTN();
//         pgObj.BillingAddrsDetail();
//         pgObj.clickTermsBTN();
//         pgObj.clickSaveDebitCardBTN();
//         pgObj.clickPayBTN();
//         pgObj.clickContBTN();
//         pgObj.clickMyAcctBTN();
//         pgObj.clickPaymntMethdBTN();
//         pgObj.clickEditBTN();
//         pgObj.clicRedBTN();
//         pgObj.clickDeleteBTN();

//     }

//     @Test (priority = 5)
//     public void addPaymentMethodThroughCreditCard (Method method) {
//         startTest(method.getName(), "This test is for add payment method through through credit card.");

//         pgObj.clickPayBillBTN();
//         pgObj.clickTakePictBTN();
//         pgObj.clickCancalBTN();
//         pgObj.clickMyAcctBTN();
//         pgObj.clickPaymntMethdBTN();
//         pgObj.clickAddCreditCardBTN();
//         pgObj.AddCreditcardDetail();
//         pgObj.clickNextBTN();
//     }

//     @Test (priority = 6)
//     public void addPaymentMethodThroughDebitCard (Method method) {
//         startTest(method.getName(), "This test is for add payment method through through debit card.");

//         pgObj.clickPayBillBTN();
//         pgObj.clickTakePictBTN();
//         pgObj.clickCancalBTN();
//         pgObj.clickMyAcctBTN();
//         pgObj.clickPaymntMethdBTN();
//         pgObj.clickAddDebitCardBTN();
//         pgObj.AddDebitCardsDetail();
//         pgObj.clickNextBTN();
//     }

//     @Test (priority = 7)
//     public void payBillThroughLibrary (Method method) {
//         startTest(method.getName(), "This test is for pay bill through library.");

//         pgObj.clickPayBillBTN();
//         pgObj.clickPhotoLibBTN();
//         pgObj.clickGallBTN();
//         pgObj.clickGalPhotoBTN();
//         pgObj.clickPicPillBTN();
//         pgObj.selectBill();
//         pgObj.clickEnterAmountBTN();
//         pgObj.clickContiBTN();
//         pgObj.clickContinuBTN();
//         pgObj.clickBankAcctBTN();
//         pgObj.clickUseRoutBTN();
//         pgObj.AddBankAcctDetail();
//         pgObj.clickNextBTN();
//         pgObj.BillingAddrsDetail();
//         pgObj.clickTermsBTN();
//         pgObj.clickSaveDebitCardBTN();
//         pgObj.clickPayBTN();
//         pgObj.clickContBTN();
//     }

//     @Test (priority = 8)
//     public void cancelBillThroughMyBill(Method method) {
//         startTest(method.getName(), "This test is for cancel bill through my bill");

//         pgObj.clickPayBillBTN();
//         pgObj.clickPhotoLibBTN();
//         pgObj.clickGallBTN();
//         pgObj.clickGalPhotoBTN();
//         pgObj.clickPicPillBTN();
//         pgObj.selectBill();
//         pgObj.clickEnterAmountBTN();
//         pgObj.clickContiBTN();
//         pgObj.clickContinuBTN();
//         pgObj.clickBankAcctBTN();
//         pgObj.clickUseRoutBTN();
//         pgObj.AddBankAcctDetail();
//         pgObj.clickNextBTN();
//         pgObj.BillingAddrsDetail();
//         pgObj.clickTermsBTN();
//         pgObj.clickSaveDebitCardBTN();
//         pgObj.clickPayBTN();
//         pgObj.clickContBTN();
//         pgObj.clickMyBillBTN();
//         pgObj.clickArrowBTN();
//         pgObj.clickYourBillBTN();
//         pgObj.clickImageCrossBTN();
//         pgObj.clickOptionBTN();
//         pgObj.clickCancelPaymntBTN();
//         pgObj.clickChangePaymntMethodBTN();
//     }

//     @Test (priority = 9)
//     public void changeBillPaymentMethodOfAnAlreadyPaidBill(Method method) {
//         startTest(method.getName(), "This test is for Change Bill payment method of an already paid bill");

//         pgObj.clickPayBillBTN();
//         pgObj.clickPhotoLibBTN();
//         pgObj.clickGallBTN();
//         pgObj.clickGalPhotoBTN();
//         pgObj.clickPicPillBTN();
//         pgObj.selectBill();
//         pgObj.clickEnterAmountBTN();
//         pgObj.clickContiBTN();
//         pgObj.clickContinuBTN();
//         pgObj.clickBankAcctBTN();
//         pgObj.clickUseRoutBTN();
//         pgObj.AddBankAcctDetail();
//         pgObj.clickNextBTN();
//         pgObj.BillingAddrsDetail();
//         pgObj.clickTermsBTN();
//         pgObj.clickSaveDebitCardBTN();
//         pgObj.clickPayBTN();
//         pgObj.clickContBTN();
//         pgObj.clickMyBillBTN();
//         pgObj.clickArrowBTN();
//         pgObj.clickYourBillBTN();
//         pgObj.clickImageCrossBTN();
//         pgObj.clickOptionBTN();
//         pgObj.clickChangePaymentMethodBTN();
//         pgObj.clickPaymentMethodCheckingBTN();
//         pgObj.clickAddCreditCardsBTN();
//         pgObj.CreditcardDetail();
//         pgObj.clickNextBTN();
//         pgObj.BillingAddrsDetail();
//         pgObj.clickSaveCardBTN();
//         pgObj.clickVisaBTN();
//         pgObj.clickBackArrowBTN();
//         pgObj.clickPayBilBTN();
//         pgObj.clickContnBTN();
//     }

    @Test (priority = 10)
    public void logOut (Method method) {
        startTest(method.getName(), "This test is for log out.");

        pgObj.clickPayBillBTN();
        pgObj.clickTakePictBTN();
        pgObj.clickCancalBTN();
        pgObj.clickMyAcctBTN();
        pgObj.clickHaveAnAcctBTN();
        pgObj.LogInDetail();
        pgObj.clickSignInBTN();
        pgObj.clickSignOutBTN();

    }

    @Test (priority = 11)
    public void failTest (Method method) {
        startTest(method.getName(), "This test is for log out.");

        pgObj.clickPayBillBTN();
        pgObj.clickTakePictBTN();
        pgObj.clickCancalBTN();
        pgObj.clickMyAcctBTN();
        pgObj.clickHaveAnAcctBTN();
        pgObj.invalidLogInDetail();
        pgObj.clickSignInBTN();
        pgObj.clickSignOutBTN();

    }

    @AfterMethod
    public void tearDown() {
        closeDriver();
    }
}





