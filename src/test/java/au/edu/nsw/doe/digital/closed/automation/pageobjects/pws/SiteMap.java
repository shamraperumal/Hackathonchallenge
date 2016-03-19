package au.edu.nsw.doe.digital.closed.automation.pageobjects.pws;

import org.openqa.selenium.By;


public class SiteMap {

    public static By ourSchoolButton = By.xpath("//a[@title='Our school']");
    public static By flyOut = By.xpath("//div[@id='optionPanel']");
    public static By addSiteMapPageButton = By.id("btnAdd");
    public static By addSiteMapPageTitleField = By.xpath("//div[@id='addBox']/div/input");
    public static By siteMapOkButton = By.xpath("//a[@id='btnOkAdd']/span");
    public static By siteMapOkConfirmationButton = By.xpath("//a[@class='OkButton btnC btnActive']/span");
    public static By siteMapExpand = By.className("expand");
    public static By siteMapDeleteButton = By.id("btnDelete");
    public static By siteMapRenameButton = By.id("btnRename");
    public static By siteMapRenameTitleField = By.xpath("//input[@id='pageTitle']");

}
