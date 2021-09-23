package Pages;

import Utilities.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;
import java.util.Random;

public class Parent {
    public void sendKeysFunction(WebElement element, String value) {

        waitUntilVisible(element);
        scrollToElement(element);
        element.clear();
        element.sendKeys(value);


    }

    public void clickFunction(WebElement element) {
        waitUntilClickable(element);
        scrollToElement(element);
        element.click();

    }

    public static void waitUntilVisible(WebElement element) {
        WebDriverWait wait = new WebDriverWait(BaseDriver.getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) BaseDriver.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public void scrollToUpElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) BaseDriver.getDriver();
        js.executeScript("arguments[0].setAttribute('style', 'top:0px')", element);
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public void select(WebElement element, int index) {
        Select slc = new Select(element);
        slc.selectByIndex(index);}

    public void waitUntilClickable(WebElement element) {
        WebDriverWait wait = new WebDriverWait(BaseDriver.getDriver(), 30);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    public List<WebElement> waitVisibleListAllElement(List<WebElement> elementList) {
        WebDriverWait wait = new WebDriverWait(BaseDriver.getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfAllElements(elementList));
        return elementList;
    }


    public static void delay(int second) {
        try {
            Thread.sleep(1000 * second);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void verifyContainsText(WebElement element, String msg) {
        waitUntilVisible(element);//element clickable kadar bekle.
        Assert.assertTrue(element.getText().toLowerCase().contains(msg.toLowerCase()));

    }

    public void waitnumberOfElementsToBeLessThan(By selector, int number) {
        WebDriverWait wait = new WebDriverWait(BaseDriver.getDriver(), 20);
        wait.until(ExpectedConditions.numberOfElementsToBeLessThan(selector, number));
    }

    public void ListSelect(List<WebElement> userList, String option) {
        for (WebElement user : userList) {
            if (user.getText().contains(option)) {
                user.click();
                break;
            }
        }

    }

    public void ESCClick() {
        try {

            Actions actions = new Actions(BaseDriver.getDriver());
            Action action = actions.sendKeys(Keys.ESCAPE).build();
            action.perform();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public static void JavascriptExClick(WebElement element){
        JavascriptExecutor js = (JavascriptExecutor)BaseDriver.getDriver();
        js.executeScript("arguments[0].click()", element);
    }
}
