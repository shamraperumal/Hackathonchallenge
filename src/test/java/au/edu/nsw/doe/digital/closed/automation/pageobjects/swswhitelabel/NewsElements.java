package au.edu.nsw.doe.digital.closed.automation.pageobjects.swswhitelabel;

import org.openqa.selenium.By;

public class NewsElements {

    public static By newsHeader = By.id("newsHeader");
    public static By newsImage = By.id("newsImage");
    public static By newsNoImage = By.id("newsOnly");
    public static By newsCategory = By.id("newsHeading");

    //layouts
    public static By newsFullWidthFullImage = By.id("newsTemplate1");
    public static By newsFullWidth = By.id("newsTemplate2");
    public static By newsTwoColumn = By.id("newsTemplate3");
    public static By newsOneColumn = By.id("newsTemplate4");
}
