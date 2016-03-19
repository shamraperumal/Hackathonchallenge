package au.edu.nsw.doe.digital.closed.automation.pageobjects.pws;


import org.openqa.selenium.By;


public class CommonLightbox {

    public static By okButton = By.xpath("//span[contains(.,'OK')]");
    public static By containsChildrenNoRadioButton = By.xpath("//input[@class='containsChildrenNo']");
    public static By copyrightYesRadioButton = By.xpath("//input[@class='copyrightYes']");

}