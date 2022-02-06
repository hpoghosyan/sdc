package test.java;

import main.java.pageEvents.HomePageEvents;
import main.java.pageObjects.HomePageElements;
import org.testng.annotations.Test;

public class VerifyBasePageCanvasExistedOrNot extends BaseTest implements HomePageElements {
    @Test
    public void isBasePageCanvasFieldExisted(){
        HomePageEvents homePageEvents = new HomePageEvents();
        homePageEvents.isElementIsDisplayed(canvasField);
    }
}
