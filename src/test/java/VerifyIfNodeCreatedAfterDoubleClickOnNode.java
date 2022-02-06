package test.java;

import main.java.pageEvents.HomePageEvents;
import main.java.pageObjects.HomePageElements;
import org.testng.annotations.Test;

public class VerifyIfNodeCreatedAfterDoubleClickOnNode extends BaseTest implements HomePageElements {
    @Test
    public void isCurrentNodeIsCreatedAfterDoubleClick(){
        HomePageEvents homePageEvents = new HomePageEvents();
        homePageEvents.clickOnButton(addNodeButton);
        homePageEvents.doubleClickOnCanvasNode(canvasField);
    }
}
