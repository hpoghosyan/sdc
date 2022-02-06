package test.java;

import main.java.pageEvents.HomePageEvents;
import main.java.pageObjects.HomePageElements;
import org.testng.annotations.Test;

public class VerifyTwoNodesConnectedLineExistedOrNot extends BaseTest implements HomePageElements {
    @Test
    public void isNodesConnectedLineIsExist() {
        HomePageEvents homePageEvents = new HomePageEvents();
        homePageEvents.clickOnButton(addNodeButton);
        homePageEvents.doubleClickOnCanvasNode(canvasField);
        homePageEvents.clickOnButton(canvasField);
    }
}
