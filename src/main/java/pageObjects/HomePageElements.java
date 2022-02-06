package main.java.pageObjects;

public interface HomePageElements {

    // get "Add Node" button for creating Nodes
    String addNodeButton = "//button[contains(text(), 'Add Node')]";

    // canvas field's XPATH
    String canvasField = "//div/canvas[@id = 'KeyLines-chart-1']";

    // selected Node details on right bottom corner
    String currentNodeDetails = "//div[@id = 'selection_info']";

    // opened lists after the right click on "Node1"
    String currentNodeContextMenu = "//ul[@id = 'contextmenu']";

    // context menu items
    String currentNodeContextMenuItem = "//ul/li[1]";

}
