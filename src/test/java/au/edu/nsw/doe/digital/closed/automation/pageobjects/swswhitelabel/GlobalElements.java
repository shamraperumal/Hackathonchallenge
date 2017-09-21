package au.edu.nsw.doe.digital.closed.automation.pageobjects.swswhitelabel;

import org.openqa.selenium.By;

/**
 * Created by christopherpigden on 11/8/17.
 */
public class GlobalElements {

    //Component divs
    public static By globalFooter = By.id("globalfooter");
    public static By globalHeader = By.id("globalheader");
    public static By localHeader = By.id("localheader");
    public static By breadcrumbs = By.id("breadcrumbs");
    public static By globalHeaderLinksDropdown = By.cssSelector(".sws-global-links-dropdown");
    public static By megaMenu = By.id("meganav");
    public static By mandatoryQuickLinks = By.id("globalquicklinkstestcontainer");
    public static By optionalQuickLinksFiveItems = By.id("quicklinks5items");
    public static By optionalQuickLinksTwoItems = By.id("quicklinks2items");
    public static By socialLinksAll = By.id("sociallinks5items");
    public static By socialLinksTwo = By.id("sociallinks2items");



    //Clickable web elements
    public static By loginButton = By.id("logindropdownbtn");
    public static By subMenuLink1 = By.cssSelector(".uk-parent:nth-child(4) .sws-meganav-megalinks");
    public static By subMenuLink2 = By.cssSelector(".uk-parent:nth-child(5) .sws-meganav-megalinks");
    public static By subMenuLink3 = By.cssSelector(".uk-parent:nth-child(7) .sws-meganav-megalinks");
    public static By subMenu = By.cssSelector(".uk-dropdown-bottom");

}


