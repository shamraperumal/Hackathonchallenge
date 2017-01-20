package au.edu.nsw.doe.digital.closed.automation.pageobjects.squiz;

import org.openqa.selenium.By;

/**
 * Created by cpigden on 14/12/2015.
 */
public class GefCatalogue {

    public static By automationGroup = By.xpath("//li[contains(.,'Automation')]");
    public static By listViewButton = By.xpath("//button[@class='gef-vc-btn uk-icon-list']");
    public static By lowOrder = By.xpath("//option[contains(.,'Price (Lowest to highest)')]");
    public static By highOrder = By.xpath("//option[contains(.,'Price (Highest to lowest)')]");
    public static By azOrder = By.xpath("//option[contains(.,'Name (A to Z)')]");
    public static By zaOrder = By.xpath("//option[contains(.,'Name (Z to A)')]");


}
