package net.thucydides.showcase.cucumber.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class Dashboard extends ExtendedPageObject{
    public void clickOnGivenButton(String arg1) throws InterruptedException {
        waitForPageLoaded();
        String xpathExpression = "//button[text()='"+arg1+"']";
        System.out.println(xpathExpression);
        withTimeoutOf(10, TimeUnit.SECONDS).waitForPresenceOf(By.xpath(xpathExpression));
        getDriver().findElement(By.xpath(xpathExpression)).click();
    }

    public void clickOnGivenButton1(String arg1) throws InterruptedException {
        waitForPageLoaded();
        String xpathExpression = "(//button[text()='"+arg1+"'])[2]";
        System.out.println(xpathExpression);
        withTimeoutOf(10, TimeUnit.SECONDS).waitForPresenceOf(By.xpath(xpathExpression));
        getDriver().findElement(By.xpath(xpathExpression)).click();
    }

    public void clickPanel1(String arg1) throws InterruptedException {
        waitForPageLoaded();
        waitForPageLoaded();
        Thread.sleep(2999);
        String xpathExpression = "//li[text()='" + arg1 + "']";
        returnTheVisibleOne(By.xpath(xpathExpression)).click();
    }

    public void clickOnLink(String arg1) throws InterruptedException {
        waitForPageLoaded();
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        String xpathExpression = "//a[text()='"+arg1+"']";
        WebElement element = getDriver().findElement(By.xpath(xpathExpression));
        if(element.isDisplayed()){
            returnTheVisibleOne(By.xpath(xpathExpression)).click();
        }


        else {
            js.executeScript("arguments[0].scrollIntoView();", element);
            returnTheVisibleOne(By.xpath(xpathExpression)).click();
        }
    }

    public void clickOnHeadLink(String arg1) throws InterruptedException {
        waitForPageLoaded();

        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        String xpath = "//div[@class='cnsult_box']";
        WebElement element = getDriver().findElement(By.xpath(xpath));
        int index = 0;
        if(arg1.equals("Personalized Consultation")){
            index = 1;
        }

        else if(arg1.equals("Talk To Our Doctors")){
            index = 2;
        }

        else if(arg1.equals("Kabera Clinics Guidelines")){
            index = 3;
        }

        else if(arg1.equals("What We Do?")){
            index = 4;
        }

//        else {
        js.executeScript("arguments[0].scrollIntoView();", element);
        Thread.sleep(4999);
//            returnTheVisibleOne(By.xpath(xpathExpression)).click();
//        }
        String xpathExpression = "(//div[@class='cnsult_box'])["+index+"]";
        System.out.println(xpathExpression);
//        String xpathExpression = "//div[4]/div[4]/div/div/div/div[1]/div/div["+index+"]/div/a";
//        String xpathExpression = "//div[1]/div[4]/div[4]/div/div/div/div[1]/div/div[1]/div/a";
        getDriver().findElement(By.xpath(xpathExpression)).click();
    }


    public void sendValueByPlaceHolder(String placeHolder,String value)throws InterruptedException{
        waitForPageLoaded();
        String xpathExpression = "(//input[@placeholder='" + placeHolder + "'])";
        int xpathCount = getDriver().findElements(By.xpath(xpathExpression)).size();
        System.out.println("number of field found "+xpathCount);
        returnTheVisibleOne(By.xpath(xpathExpression)).sendKeys(value);
        Thread.sleep(2000);
    }
    public void sendValueByPlaceHolder2(String placeHolder,String value)throws InterruptedException{
        waitForPageLoaded();
        String xpathExpression = "(//input[@placeholder='" + placeHolder + "'])";
        int xpathCount = getDriver().findElements(By.xpath(xpathExpression)).size();
        System.out.println("number of field found "+xpathCount);
        if(xpathCount>1){
            String xpathExpression1 = "(//input[@placeholder='" + placeHolder + "'])[2]";
            returnTheVisibleOne(By.xpath(xpathExpression1)).sendKeys(value);
            Thread.sleep(2000);
        }
        else {
            returnTheVisibleOne(By.xpath(xpathExpression)).sendKeys(value);
            Thread.sleep(2000);
        }
    }

    public void sendValueByPlaceHolder1(String placeHolder,String value)throws InterruptedException{
        waitForPageLoaded();
        String xpathExpression = "(//textarea[@placeholder='" + placeHolder + "'])";
//        (//input[@placeholder="First Name"])[2]
        int xpathCount = getDriver().findElements(By.xpath(xpathExpression)).size();
        System.out.println("number of field found "+xpathCount);
//        if(xpathCount>1){
//            String xpathExpression1 = "(//textarea[@placeholder='" + placeHolder + "'])[2]";
//            returnTheVisibleOne(By.xpath(xpathExpression1)).sendKeys(value);
//            Thread.sleep(2000);
//        }
//        else {
        returnTheVisibleOne(By.xpath(xpathExpression)).sendKeys(value);
        Thread.sleep(2000);
//        }
    }

    public void clickOnTab(String arg1) throws InterruptedException {
        waitForPageLoaded();
        Thread.sleep(2999);
        String xpathExpression = "//span[text()='" + arg1 + "']";
        returnTheVisibleOne(By.xpath(xpathExpression)).click();

    }
    public void clickOnGivenDate(String arg1)throws InterruptedException{
        waitForPageLoaded();
        Thread.sleep(2999);
        String xpathExpression = "//a[text()='" + arg1 + "']";
        returnTheVisibleOne(By.xpath(xpathExpression)).click();
    }

    public void clickOnGivenSection(String section)throws InterruptedException{
        withTimeoutOf(10, TimeUnit.SECONDS).waitForPresenceOf(net.serenitybdd.core.annotations.findby.By.xpath("//button//span[text()='Profile']"));
        String xpathExpression="//button//span[text()='"+section+"']";
        getDriver().findElement(By.xpath(xpathExpression)).click();
    }

    public boolean isGivenPageDisplayed(String pageName)throws InterruptedException{
        waitForPageLoaded();
        String xpathExpression="//*[text()='"+pageName+"']";
        withTimeoutOf(10, TimeUnit.SECONDS).waitForPresenceOf(net.serenitybdd.core.annotations.findby.By.xpath(xpathExpression));
        int len= getDriver().findElements(By.xpath(xpathExpression)).size();
        if(len>0){
            return true;
        }
        else {
            return false;
        }
    }

    public String getPageTitle(String arg) {
        withTimeoutOf(180, TimeUnit.SECONDS).waitForPresenceOf(net.serenitybdd.core.annotations.findby.By.xpath("//a[text()='"+arg+"']"));
        WebElement page_title=getDriver().findElement(By.xpath("//a[text()='"+arg+"']"));
        return page_title.getText();

    }
    @FindBy(xpath = "//button[@label='Profile']")
    WebElementFacade profile_button;
    @FindBy(xpath = "//button[@label='Trip History']")
    WebElementFacade triphistory_button;
    @FindBy(xpath = "//button[@label='My Vehicles']")
    WebElementFacade myvehicles_button;
    @FindBy(xpath = "//button[@label='Earnings']")
    WebElementFacade earnings_button;

    public boolean isDriverDashboardDisplayed() {

        if ((profile_button.isDisplayed()) && (triphistory_button.isDisplayed()) && (myvehicles_button.isDisplayed()) && (earnings_button.isDisplayed())) {
            return true;

        } else {
            return false;
        }
    }
}
