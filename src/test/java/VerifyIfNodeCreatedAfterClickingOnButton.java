package test.java;

import main.java.pageEvents.HomePageEvents;
import main.java.pageObjects.HomePageElements;
import org.testng.annotations.Test;

public class VerifyIfNodeCreatedAfterClickingOnButton extends BaseTest implements HomePageElements {
    @Test
    public void IsNodeExistedAfterClickingOnButton(){
        HomePageEvents homePageEvents = new HomePageEvents();
        homePageEvents.clickOnButton(addNodeButton);
    }
}