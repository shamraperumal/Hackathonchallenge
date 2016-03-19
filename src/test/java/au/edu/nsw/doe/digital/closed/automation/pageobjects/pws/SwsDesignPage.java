package au.edu.nsw.doe.digital.closed.automation.pageobjects.pws;

import org.openqa.selenium.By;


public class SwsDesignPage {

    public static By design4 = By.id("4");
    public static By design7 = By.id("7");
    public static By primaryColour1 = By.xpath("//li[5]/label");
    public static By primaryColour2 = By.xpath("//li[3]/label");
    public static By secondaryColour1 = By.xpath("//ul[@id='sec']/li[22]/label");
    public static By secondaryColour2 = By.xpath("//ul[@id='sec']/li[1]/label");
    public static By designSubmitButton = By.xpath("//div[@class='bottomText']//span[contains(.,'Save and apply design')]");
    public static By designSubmitConfirmationButton = By.xpath("id('Site-setup-finish')//span");

}