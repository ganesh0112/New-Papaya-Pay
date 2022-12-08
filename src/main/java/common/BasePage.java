package common;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Coordinates;
import org.openqa.selenium.interactions.Locatable;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import static org.junit.Assert.fail;

public class BasePage {
    private  static final ThreadLocal<WebDriver> dr= new ThreadLocal<>();
    protected static WebDriver driver;
    protected static Properties prop;
    private WebDriverWait wait;
    private static final String browserName;
    protected static JavascriptExecutor js;

    static {
        ConfigReader configReader = new ConfigReader();
        prop = configReader.init_prop();
        browserName = prop.getProperty("browser");
    }

    public static WebDriver getDriver()
    {
        return dr.get();
    }

    public static void setDriver(WebDriver driverref) {
        dr.set(driverref);
    }

    public static void unload() {
        dr.remove();
    }

    public void setBrowser() {
        if (browserName.equals("chrome")) {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--incognito");
            options.addArguments("--disable-gpu");
            System.setProperty("webdriver.chrome.silentOutput", "true");
            options.addArguments("--disable-crash-reporter");
            options.addArguments("--disable-extensions");
            options.addArguments("--disable-in-process-stack-traces");
            options.addArguments("--disable-logging");
            options.addArguments("--disable-dev-shm-usage");
            options.addArguments("--log-level=3");
            options.addArguments("--output=/dev/null");
            System.setProperty("webdriver.chrome.verboseLogging", "false");
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/driver/chromedriver.exe");
            driver = new ChromeDriver();
        }
        driver.manage().window().maximize();
    }

    public void setBrowserIncognito(){
        if (browserName.equals("chrome")) {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--incognito");
            options.addArguments("--disable-gpu");
            System.setProperty("webdriver.chrome.silentOutput", "true");
            options.addArguments("--disable-crash-reporter");
            options.addArguments("--disable-extensions");
            options.addArguments("--disable-in-process-stack-traces");
            options.addArguments("--disable-logging");
            options.addArguments("--disable-dev-shm-usage");
            options.addArguments("--log-level=3");
            options.addArguments("--output=/dev/null");
            System.setProperty("webdriver.chrome.verboseLogging", "false");
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/driver/chromedriver.exe");
            driver = new ChromeDriver(options);
        }
        driver.manage().window().maximize();
    }

    public void clickElement(WebElement webElement) {
        waitForElementVisibility(webElement);
        webElement.click();

    }

    public void coordinateClick(WebElement webElement){
        Actions builder = new Actions(driver);
        builder.moveToElement(webElement, webElement.getLocation().getX(),webElement.getLocation().getY() ).click().build().perform();
    }

    public void waitClickElement(WebElement webElement){
        waitForElementVisibility(webElement);
        new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(webElement)).click();
    }


    public void selectDropDown(WebElement webElement, String value){
        Select columnFilter = new Select(webElement);
        Utilities.sleep(3000);
        columnFilter.selectByVisibleText(value);

    }

    public void enterText(WebElement webElement, String text) {
        waitForElementVisibility(webElement);
        webElement.sendKeys(text);
    }

    public void doubleClick(WebElement webElement) {
        waitForElementVisibility(webElement);
        new Actions(driver).doubleClick(webElement).build().perform();
    }

    public boolean checkElement(WebElement webElement){
        List<WebElement> dynamicElement =  driver.findElements((By) webElement);
        if(dynamicElement.size() == 0) {
            System.out.println("Element not present");
            return true;
        }
        else return false;
    }

    public void clearText(WebElement webElement) {
        waitForElementVisibility(webElement);
        webElement.sendKeys(Keys.CONTROL, "a");
        webElement.sendKeys(Keys.DELETE);
        //webElement.clear();
    }

    public void ctrlAndZ(WebElement webElement) {
        waitForElementVisibility(webElement);
        webElement.sendKeys(Keys.CONTROL, "z");
    }

    public void enterTextKeys(WebElement webElement, String text) {
        webElement.sendKeys(text);
    }

    protected <TPage extends BasePage> TPage getInstance(Class<TPage> pageInstance) {
        try {
            return PageFactory.initElements(driver, pageInstance);
        } catch (Exception e) {
            throw new RuntimeException("Error while creating new page instance", e);
        }
    }

    public void IFrameActions(WebElement element, String value) {
        enterText(element, value);
    }

    public String getIdAttribute(WebElement webElement) {
        return webElement.getAttribute("id");
    }

    public String getValueAttribute(WebElement webElement) {
        return webElement.getAttribute("value");
    }

    public void switchToIFrame(WebElement webElement) {
        waitForElementVisibility(webElement);
        driver.switchTo().frame(webElement);
    }

    public void JSExecutor(WebElement element, String text) {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("document.evaluate(element , document, null, 9, null).singleNodeValue.innerHTML=" + text);
    }

    public void switchToDefaultContent() {
        driver.switchTo().defaultContent();
    }

    public void navigateToURL(String URL){
        driver.navigate().to(URL);
    }

    public static  void waitForElementVisibility(WebElement webElement) {
        try {
             waitForPageLoaded();
            WebDriverWait wait = new WebDriverWait(driver, 60);
            wait.until(ExpectedConditions.visibilityOf(webElement));
        } catch (Exception e) {
            System.out.println("Time limit exceeded for waiting the element " + webElement);
            e.printStackTrace();
        }
    }
    public static void staleElementRefresh(WebElement webElement){
       /* WebDriverWait wait =   new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.refreshed(ExpectedConditions.stalenessOf(webElement)));*/
        for(int i=0; i<=2;i++){
            try{
                webElement.click();
                break;
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }

    public void loadUrl(String url) {
        driver.get(url);
        waitForPageLoaded();
    }

    public void moveToElementClick(WebElement webElement) {
        Actions actions = new Actions(driver);
        actions.moveToElement(webElement);
        actions.click().build().perform();
    }

    public void acceptAlert() {
        try {
            wait = new WebDriverWait(driver, 60);
            wait.until(ExpectedConditions.alertIsPresent());
            driver.switchTo().alert().accept();
            driver.switchTo().defaultContent();
        } catch (NoAlertPresentException noAlert) {
            noAlert.printStackTrace();
        }
    }

    public void ifAlertPresent() {
        try {
            wait = new WebDriverWait(driver, 60);
            wait.until(ExpectedConditions.alertIsPresent());
        } catch (NoAlertPresentException noAlert) {
            noAlert.printStackTrace();
        }
    }

    public void dragAndDrop(WebElement fromElement, WebElement toElement){
        Actions builder = new Actions(driver);
        Action dragAndDrop = builder.clickAndHold(fromElement)
                .moveToElement(toElement)
                .release(toElement)
                .build();
    }

    public void scrollToElement(WebElement webElement) {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView();", webElement);
    }

    public void uploadFileUsingJS(WebElement webElement,String path){
        WebElement element =webElement;
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.display='none';", element);
        webElement.sendKeys(path);
        webElement.sendKeys(Keys.ENTER);
    }


    public void setClipBoard(String file){
        StringSelection obj = new StringSelection(file);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(obj,null);

    }

    public void uploadFileUsingRoboIt(String filePath) throws AWTException {
        setClipBoard(filePath);

        // creating object of Robot class
        Robot rb = new Robot();

        // press Contol+V for pasting
        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_V);

        // release Contol+V for pasting
        rb.keyRelease(KeyEvent.VK_CONTROL);
        rb.keyRelease(KeyEvent.VK_V);

        // for pressing and releasing Enter
        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);

    }


    public void scrollToRight(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(6500,50)");
    }

    public void scrollExtremeRight(WebElement webElement){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView()", webElement);
    }


    public void scrollToLocateElement(WebElement webElement){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollTo(arguments[0],arguments[1])",webElement.getLocation().getX(), webElement.getLocation().getY());
    }


    public boolean isElementPresent(WebElement webElement) {
        waitForElementVisibility(webElement);
        return webElement.isDisplayed();
    }

    public void closeDriver() {
        driver.close();
        driver.quit();

    }

    public Set<String> getWindows() {
        return driver.getWindowHandles();
    }

    public String getCurrentWindow() {
        return driver.getWindowHandle();
    }

    public void switchToWindow(String windowId) {
        driver.switchTo().window(windowId);
    }

    public void switchToTab() {
        String currentHandle = driver.getWindowHandle();
        Set<String> handles = driver.getWindowHandles();
        System.out.println("Total no of tabs are " + handles.size());
        for (String actual : handles) {
            if (!actual.equalsIgnoreCase(currentHandle)) {
                driver.switchTo().window(actual);
                WebDriverWait wait = new WebDriverWait(driver, 100 );
                if(wait.until(ExpectedConditions.alertIsPresent())==null){
                    System.out.println("No alert is present");
                }
                else{
                    acceptAlert();
                }
                System.out.println("New Tab URL" + driver.getTitle());
                Utilities.sleep(2000);
                driver.close();
                Utilities.sleep(2000);
                driver.switchTo().window(currentHandle);
            }
        }
    }

    public void switchtoNewTab(){
        String currentHandle = driver.getWindowHandle();
//        driver.close();
        Set<String> handles = driver.getWindowHandles();
        for (String actual : handles) {
            if (!actual.equalsIgnoreCase(currentHandle)) {
                driver.switchTo().window(actual);
                System.out.println("New Tab URL" + driver.getTitle());
                Utilities.sleep(2000);
            }
        }
    }

    public void switchTabAndCloseTab(){
        String currentHandle = driver.getWindowHandle();
        Set<String> handles = driver.getWindowHandles();
        for (String actual : handles) {
            if (!actual.equalsIgnoreCase(currentHandle)) {
                driver.switchTo().window(actual);
                System.out.println("New Tab URL" + driver.getTitle());
                Utilities.sleep(2000);
            }
        }
        driver.navigate().to(prop.getProperty("spfxURL"));
    }


    public void closeCurrentTab(){
        driver.close();
    }

    public void closeCurrentWindow(String windowId) {
        driver.switchTo().window(windowId);
        driver.close();
        for (String w : getWindows()) {
            if (!w.equals(windowId)) {
                switchToWindow(w);
                break;
            }
        }
    }

    public static void waitForPageLoaded() {
        ExpectedCondition<Boolean> expectation = driver -> ((JavascriptExecutor) driver).executeScript("return document.readyState").toString().equals("complete");
        try {
            WebDriverWait wait = new WebDriverWait(driver, 60);
            wait.until(expectation);
        } catch (Throwable error) {
            fail("Timeout waiting for Page Load Request to complete.");
        }
    }

    protected void scrollDown(WebElement element) {
        try {
            js = (JavascriptExecutor)driver;
            js.executeScript("arguments[0].scrollIntoView();", element);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void scrollUsingSendKeys(WebElement element){
        Utilities.sleep(2000);
        //element.sendKeys(Keys.CONTROL, Keys.END);
        element.sendKeys(Keys.DOWN);
    }

    public void  scrollUsingRoboIT() throws AWTException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_PAGE_DOWN);
        robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
    }

    public void clickUsingRobo(int x, int y) throws AWTException {
        Robot robot = new Robot();
        robot.mouseMove(x,y);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }

    public void scrollUsingActions(WebElement element){
        Actions dragger = new Actions(driver);

        dragger.moveToElement(element).click();
        dragger.sendKeys(Keys.PAGE_DOWN).perform();
    }

    public void  infiniteScroll(WebElement element){
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeAsyncScript("window.scrollTo(0, document.body.scrollHeight);");
    }

    public void  scrollAutomatically(WebElement element){
        WebElement webElement = element;
        Coordinates coordinate = ((Locatable)element).getCoordinates();
        System.out.println(coordinate.onPage());
        System.out.println(coordinate.inViewPort());

    }

    public void scrollBar(){
        try {
            js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getCurrentURL() {
        waitForPageLoaded();
        return driver.getCurrentUrl();
    }

    public String getText(WebElement webElement) {
        return webElement.getText();
    }

    public Select allOptions(WebElement webElement) {
        return new Select(webElement);
    }

    public void checkCheckboxTrue(WebElement webElement, WebElement chkBox) {
        if (!chkBox.isSelected()) {
            javaScriptClick(chkBox);
        }
    }
    public void checkCheckboxFalse(WebElement webElement, WebElement chkBox) {
        if (webElement.getAttribute("aria-checked").equals("true")) {
            chkBox.click();
        }
    }
    public void javaScriptClick(WebElement webElement) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", webElement);
    }

    public List<WebElement> findElements(By path) {
        return driver.findElements(path);
    }


    public void javascriptEvaluateClick(WebElement webElement){
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("document.getElementById('imgViewFilter').click()");

    }

    public void clickByEvaluate(WebElement webElement){
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("return document.evaluate(\""+ webElement  +"\" , document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null)");
    }


    public void javaScriptText(WebElement element, String value){
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].value= '\" + value + \"'" , element);
        String text = (String) executor.executeScript("return arguments[0].value", element);
        System.out.println(text);
    }


    public void refreshPage() {
        driver.navigate().refresh();
    }

    public void  rightClickElement(WebElement webelement){
        Actions action = new Actions(driver);
        action.contextClick(webelement).perform();
    }

    public void setCheckbox(WebElement webElement, boolean b){
        String value =webElement.getAttribute("checked");
        if(value==null && b){
            clickElement(webElement);
        }
    }


    public void mouseover(WebElement webElement){
        Actions action = new Actions(driver);
        action.moveToElement(webElement).click().build().perform();
    }

}
