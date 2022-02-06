package main.java.pageEvents;

import main.java.utils.Constants;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import static test.java.BaseTest.driver;


public class HomePageEvents {
    // Checking is element displayed on DOM or not

    public boolean isElementIsDisplayed(String xpath){
        boolean elementSelected = driver.findElement(By.xpath(xpath)).isDisplayed();
        return elementSelected;
    }

    public void sleep(int sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void clickOnButton(String currentButtonXpath){
        WebElement currentElement=driver.findElement(By.xpath(currentButtonXpath));
        currentElement.click();
        sleep(3);
    }

    public void clickOnCanvasNode(String canvasXpath){
        WebElement canvas=driver.findElement(By.xpath(canvasXpath));
        new Actions(driver).moveToElement(canvas).click().perform();
        sleep(3);
    }

    public void doubleClickOnCanvasNode(String canvasXpath){
        WebElement canvas=driver.findElement(By.xpath(canvasXpath));
        new Actions(driver).moveToElement(canvas).doubleClick().perform();
        sleep(3);
    }
    public void rightClickOnCanvasNode(String canvasXpath){
        WebElement canvas=driver.findElement(By.xpath(canvasXpath));
        new Actions(driver).moveToElement(canvas).contextClick().perform();
        sleep(3);
    }
    public void clickOnOpenedAlert(){
        Alert alert = driver.switchTo().alert(); // switch to alert
        String alertMessage= driver.switchTo().alert().getText(); // capture alert message
        System.out.println(alertMessage); // Print Alert Message
        sleep(3);
        alert.accept();
        Assert.assertEquals(alertMessage,Constants.contextItemText, "Alert's text doesn't True");
    }
}