package common;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.logs.Log;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BasePage {

    public static Properties prop;
    public static WebDriverWait wait;
    public static AndroidDriver<AndroidElement> driver;
    public static String userName = "ganeshbankar_UqwpAP";
    public static String accessKey = "Bo65czprnpfyrt8HWVSB";

    public BasePage(){ }

    public void initialization() throws IOException {
        prop = new Properties();
        FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "/src/test/resources" + "/android.properties");
        prop.load(ip);
        String device = prop.getProperty("deviceAndroidOrBrowserStack");

        if (device.equals("Android")) {

            try {
                DesiredCapabilities cap = new DesiredCapabilities();
                cap.setCapability("deviceName", prop.getProperty("deviceName"));
                cap.setCapability("udid", prop.getProperty("udid"));
                cap.setCapability("platformName", prop.getProperty("platformName"));
                cap.setCapability("platformVersion", prop.getProperty("platformVersion"));
                cap.setCapability("appPackage", prop.getProperty("appPackage"));
                cap.setCapability("appActivity", prop.getProperty("appActivity"));
                cap.setCapability("autoGrantPermissions", true);

                cap.setCapability("automationName", "UiAutomator2");

                URL url = new URL("http://0.0.0.0:4723/wd/hub");
                driver = new AndroidDriver<AndroidElement>(url, cap);

                Log.info("Papaya Pay app started.....");
                Thread.sleep(3000);

            } catch (Exception e) {
                System.out.println("Exception occurred.....");
                e.printStackTrace();
            }

            driver.manage().timeouts().implicitlyWait(Utility.implicitWait, TimeUnit.SECONDS);
            wait = new WebDriverWait(driver, Utility.webDriverWait);
        }

        else if (device.equals("BrowserStack")) {
            DesiredCapabilities cap = new DesiredCapabilities();
            try {
                cap.setCapability("device", prop.getProperty("device"));
                cap.setCapability("os_version", prop.getProperty("os_version"));
                cap.setCapability("project", prop.getProperty("project"));
                cap.setCapability("build", prop.getProperty("build"));
                cap.setCapability("name", prop.getProperty("name"));
                cap.setCapability("app", prop.getProperty("app"));
                cap.setCapability("autoGrantPermissions", true);
                cap.setCapability("unicodeKeyboard", true);
                cap.setCapability("resetKeyboard", true);
                driver = new AndroidDriver<AndroidElement>(new URL("https://"+userName+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub"), cap);
            } catch (Exception e) {
                e.printStackTrace();
            }

            driver.manage().timeouts().implicitlyWait(Utility.implicitWait, TimeUnit.SECONDS);
            wait = new WebDriverWait(driver, Utility.webDriverWait);
            Log.info("In BrowserStack.................");
        }

    }

    protected void closeDriver(){
        if(driver!= null) {
            assert driver != null;
            driver.quit();
        }
    }
}
