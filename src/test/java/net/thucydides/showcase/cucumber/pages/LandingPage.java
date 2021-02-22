package net.thucydides.showcase.cucumber.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class LandingPage extends ExtendedPageObject{
    public void openURL() throws InterruptedException {
        waitForPageLoaded();
        waitForPageLoaded();
//        String url = "https://frontend.qa.operr.net/#/login";
        String url = "https://kaberaclinics.com/";
//        String url = System.getProperty("URL");
//        if (url == null) {
//            throw new InterruptedException("URL is null");
//        }
//        getDriver().get(url);

        getDriver().get(url);
        Thread.sleep(1999);
        getDriver().manage().window().maximize();
    }

    public void closeChatBot() throws InterruptedException{
        waitForPageLoaded();
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeAsyncScript("document.getElementsByClassName('og-chat-cross')[0].click()");
    }

    public void quitBrowser()  {
        getDriver().close();
    }

    @FindBy(xpath = "//input[@placeholder='Username/Email']")
    WebElementFacade email;

    public void setEmail(String strUsername) throws InterruptedException {
        waitForPageLoaded();
        waitForPageLoaded();
        withTimeoutOf(120, TimeUnit.SECONDS).waitForPresenceOf(By.xpath("//input[@placeholder='Username/Email']"));
        email.sendKeys(strUsername);
        //getDriver().findElement(By.name("username")).sendKeys(strUsername);
    }

    @FindBy(xpath = "//input[@type='password']")
    WebElementFacade pass;

    public void setPassword(String strPasss) throws InterruptedException {
        waitForPageLoaded();
        pass.sendKeys(strPasss);
        Thread.sleep(999);
        //getDriver().findElement(By.name("password")).sendKeys(strPasss);
    }

    @FindBy(xpath = "//span[text()='Login']")
    WebElement btn;

    public void clickLoginBtn() throws InterruptedException {
        waitForPageLoaded();
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].scrollIntoView();", btn);
        getDriver().findElement(By.xpath("//button[@type='submit']")).click();
        waitForPageLoaded();
    }


    public String getTxt() throws InterruptedException {
        waitForPageLoaded();
        withTimeoutOf(120, TimeUnit.SECONDS).waitForPresenceOf(By.xpath("//span[contains(text(),'Theme Settings')]"));
        Thread.sleep(9999);
        waitForPageLoaded();
        getDriver().manage().window().maximize();
        return getDriver().findElement(By.xpath("//span[contains(text(),'Theme Settings')]")).getText();
//        System.out.println("url is " + str);
//        return str;

    }

    @FindBy(xpath = "//span[text()='Base Agreement']")
    WebElementFacade head;
    @FindBy(xpath = "//span[text()='Agree']")
    WebElementFacade agreeBtn;
    public void getTxt1() throws InterruptedException {
        waitForPageLoaded();
        if(head.isPresent()){
            agreeBtn.click();
        }
//        withTimeoutOf(120, TimeUnit.SECONDS).waitForPresenceOf(org.openqa.selenium.By.xpath("//span[contains(text(),'Theme Settings')]"));
//        Thread.sleep(9999);
//        waitForPageLoaded();
//        getDriver().manage().window().maximize();
//        return getDriver().findElement(By.xpath("//span[contains(text(),'Theme Settings')]")).getText();
//        System.out.println("url is " + str);
//        return str;
    }

    public String getDashboardText() throws InterruptedException {
        waitForPageLoaded();
        Thread.sleep(9999);
        String adminTxt = getDriver().findElement(By.cssSelector(".topbar-item-name.profile-name")).getText();
        return adminTxt;
    }

    public void selectLoginType(String loginType) throws InterruptedException {
        waitForPageLoaded();
        waitForPageLoaded();
        getDriver().findElement(By.cssSelector(".ng-tns-c4-1.ui-dropdown-label.ui-inputtext.ui-corner-all.ng-star-inserted")).click();
        Thread.sleep(999);
        int len = getDriver().findElements(By.cssSelector(".ui-dropdown-item.ui-corner-all")).size();
        System.out.println("size " + len);
        for (int i = 0; i < len; i++) {
            String str = getDriver().findElements(By.cssSelector(".ui-dropdown-item.ui-corner-all")).get(i).getText();
            System.out.println("Login type for index " + i + " type " + str);
            if (str.equals(loginType)) {
                System.out.println("in if condition with index ");
                getDriver().findElements(By.cssSelector(".ui-dropdown-item.ui-corner-all")).get(i).click();
                break;
            }
        }
    }

    public String getErrorMsg() throws InterruptedException {
        waitForPageLoaded();
        Thread.sleep(1999);
        return getDriver().findElements(By.cssSelector(".text-danger.ng-star-inserted")).get(0).getText();
    }

    @FindBy(xpath = "//span[text()='Theme Settings']")
    WebElementFacade theme_setting;

    public String getPageTitle() throws InterruptedException {
        withTimeoutOf(120, TimeUnit.SECONDS).waitForPresenceOf(By.xpath("//span[text()='Theme Settings']"));
        Thread.sleep(1999);
        return theme_setting.getText();
    }

    @FindBy(xpath = "//h1[text()='Admin Dashboard']")
    WebElementFacade admin_dashbaord_heading;

    public String getAdminDashBoardText() throws InterruptedException {
        withTimeoutOf(30, TimeUnit.SECONDS).waitForPresenceOf(By.xpath("//h1[text()='Admin Dashboard']"));
        return admin_dashbaord_heading.getText();
    }

    @FindBy(xpath = "//a[text()='Report']")
    WebElementFacade report_page_heading;

    public String getReportPageHeading() throws InterruptedException {
        waitForPageLoaded();
        withTimeoutOf(30, TimeUnit.SECONDS).waitForPresenceOf(By.xpath("//*[text()='Trip History']"));
        return report_page_heading.getText();
    }

    public String getPageText() throws InterruptedException {
        waitForPageLoaded();
        withTimeoutOf(30, TimeUnit.SECONDS).waitForPresenceOf(By.className("fa-user"));
        return getDriver().findElements(By.className("col-lg-12")).get(1).getText();
    }

    @FindBy(className = "text-danger")
    WebElementFacade pop_up_message;

    public String getErrorPopUpMessage() throws InterruptedException {
        waitForPageLoaded();
        withTimeoutOf(30, TimeUnit.SECONDS).waitForPresenceOf(By.className("text-danger"));
        return pop_up_message.getText();
    }

    @FindBy(name = "email")
    WebElementFacade email_field;

    public void enterEmailAddress(String email) {
        withTimeoutOf(30, TimeUnit.SECONDS).waitForPresenceOf(By.name("phone"));
        email_field.sendKeys(email);
    }

    @FindBy(className = "text-success")
    WebElementFacade popup_message;

    public String getSuccessPopUpMessage() throws InterruptedException {
        waitForPageLoaded();
        withTimeoutOf(30, TimeUnit.SECONDS).waitForPresenceOf(By.className("text-success"));
        return popup_message.getText();
    }

    @FindBy(xpath = "//span[text()='Sign Contract']")
    WebElementFacade sign_Contract_button;

    @FindBy(css = "input[type='password']")
    List<WebElementFacade> password_input;

    @FindBy(xpath = "//span[text()='Submit']")
    WebElementFacade submit_button;

    public void openSignContractForm() throws InterruptedException {
        sign_Contract_button.click();
        waitForTextToAppear("Close");
        password_input.get(1).sendKeys("6465801627");
        submit_button.click();
        waitForPageLoaded();
    }

    public boolean isLoginPageDisplayed() throws InterruptedException {
        waitForPageLoaded();
        withTimeoutOf(60, TimeUnit.SECONDS).waitForPresenceOf(By.xpath("//span[text()='Login']"));
        int len = getDriver().findElements(By.xpath("//span[text()='Login']")).size();
        if (len > 0) {
            return true;
        } else {
            return false;
        }

    }

    @FindBy(xpath = "(//a[@href='#/app/system/dashboard'])[2]")
    WebElementFacade homeLink;
    @FindBy(xpath = "//a[contains(text(),'Dashboard')]")
    WebElementFacade dashboardHead;
    @FindBy(xpath = "//i[contains(text(),'notifications')]")
    WebElementFacade notificationIcon;
    public void clickOnDashBoardIcon()throws InterruptedException{
        waitForPageLoaded();
        waitForPageLoaded();
//        JavascriptExecutor js = (JavascriptExecutor) getDriver();
//        js.executeScript("document.getElementsByClassName('material-icons')[82].click()");
        homeLink.click();
    }

    public String getDashBoard()throws InterruptedException{
        waitForPageLoaded();
        waitForPageLoaded();
        waitForPageLoaded();
        waitForTextToAppear("Dashboard");
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        String str=(String)js.executeScript("return document.getElementsByClassName('layout-breadcrumb')[0].innerText");
        return str;
    }

    public boolean isNotificationIconDisplayed()throws InterruptedException{
        waitForPageLoaded();
        waitForPageLoaded();
        return notificationIcon.isDisplayed();
    }

    @FindBy(xpath = "//input[@type='checkbox']")
    WebElementFacade rememberMe;
    public void clickOnRememberMeCheckbox()throws InterruptedException{
        waitForPageLoaded();
        rememberMe.click();
    }

    public String getUsername()throws InterruptedException{
        waitForPageLoaded();
        return email.getValue();
    }

    public String getPassword()throws InterruptedException{
        waitForPageLoaded();
        String password = pass.getValue();
        System.out.println("PAss" +password);
        return password;
    }

    @FindBy(xpath = "//div[contains(text(),'Messages & Notifications')]")
    WebElementFacade messageAndNotificationHead;
    @FindBy(xpath = "//div[1]/p-header/div/div[2]/button")
    WebElementFacade readAlreadyBtn;
    @FindBy(xpath = "//button[contains(text(),'All Message')]")
    WebElementFacade allMessageBtn;
    public boolean isMessageAndNotificationSectionDisplayed()throws InterruptedException{
        waitForPageLoaded();
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].scrollIntoView();", messageAndNotificationHead);
        return messageAndNotificationHead.isDisplayed();
    }

    public void clickOnReadAlreadyBtn()throws InterruptedException{
        waitForPageLoaded();
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].scrollIntoView();", messageAndNotificationHead);
        js.executeScript("document.getElementsByClassName('button-notification')[0].click()");
//        readAlreadyBtn.click();
    }

    public String getAllMessageBtn()throws InterruptedException{
        waitForPageLoaded();
        JavascriptExecutor js=(JavascriptExecutor) getDriver();
        String str=(String)js.executeScript("return document.getElementsByClassName('button-notification')[0].innerText");
        System.out.println("table is "+str);
        return str;

    }

    public String getSuccessMsg()throws InterruptedException{
        JavascriptExecutor js=(JavascriptExecutor) getDriver();
        String str=(String)js.executeScript("return document.getElementsByClassName('ui-shadow ui-growl-message-success')[0].innerText");
        System.out.println("table is "+str);
        return str;
//        return getDriver().findElement(By.xpath("//p[contains(text(),'"+msg+"')]")).isDisplayed();
//        waitForTextToAppear(msg);
    }

}
