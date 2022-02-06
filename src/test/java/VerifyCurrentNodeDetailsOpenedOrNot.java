package test.java;

import main.java.pageEvents.HomePageEvents;
import main.java.pageObjects.HomePageElements;
import org.testng.annotations.Test;

public class VerifyCurrentNodeDetailsOpenedOrNot extends BaseTest implements HomePageElements {

    @Test
    public void isCurrentNodeDetailsExist(){
        HomePageEvents homePageEvents = new HomePageEvents();
        homePageEvents.clickOnButton(addNodeButton);
        homePageEvents.clickOnCanvasNode(canvasField);
        homePageEvents.isElementIsDisplayed(currentNodeDetails);

    }

}
