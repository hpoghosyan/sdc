package test.java;

import main.java.pageEvents.HomePageEvents;
import main.java.pageObjects.HomePageElements;
import org.testng.annotations.Test;

public class VerifyAfterClickingContextItemAlertIsOpenedOrNot extends BaseTest implements HomePageElements {
    @Test
    public void isCurrentNodeContextOpenedAfterRightClick(){
        HomePageEvents homePageEvents = new HomePageEvents();
        homePageEvents.clickOnButton(addNodeButton);
        homePageEvents.rightClickOnCanvasNode(canvasField);
        homePageEvents.clickOnButton(currentNodeContextMenuItem);
        homePageEvents.clickOnOpenedAlert();
    }
}
