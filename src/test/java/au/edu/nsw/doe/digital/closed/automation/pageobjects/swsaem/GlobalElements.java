package au.edu.nsw.doe.digital.closed.automation.pageobjects.swsaem;

import org.openqa.selenium.By;

public class GlobalElements {

    public static By megaMenu = By.xpath("//div[@class='sws-mega-menu uk-visible-large']");
    public static By megaMobileMenu = By.xpath("//nav[@class='uk-width-1-1 uk-container uk-container-center uk-flex uk-flex-center uk-flex-space-between']");


    //Clickable web elements
    public static By loginButton = By.id("logindropdownbtn");
    public static By subMenuLink1 = By.cssSelector(".uk-parent:nth-child(4) .sws-meganav-megalinks");
    public static By subMenuLink2 = By.cssSelector(".uk-parent:nth-child(5) .sws-meganav-megalinks");
    public static By subMenuLink3 = By.cssSelector(".uk-parent:nth-child(7) .sws-meganav-megalinks");
    public static By subMenu = By.cssSelector(".uk-dropdown-bottom");
    public static By mobileMegaMenu = By.xpath("//button[@class='uk-navbar-toggle sws-local-mobile-nav__icon--nav']");
    public static By mobileNavExpanded = By.id("mobile-nav-container");
}
