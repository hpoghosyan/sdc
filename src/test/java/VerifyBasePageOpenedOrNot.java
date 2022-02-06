package test.java;

import main.java.pageEvents.HomePageEvents;
import org.testng.annotations.Test;
import main.java.pageObjects.HomePageElements;

public class VerifyBasePageOpenedOrNot extends BaseTest implements HomePageElements {
    @Test
    public void isBasePageAddNodeButtonExisted(){
        HomePageEvents homePageEvents = new HomePageEvents();
        homePageEvents.isElementIsDisplayed(addNodeButton);
    }

}
