package au.edu.nsw.doe.digital.closed.automation.pageobjects.pws;

import org.openqa.selenium.By;


public class AddPage {

    public static By addPageButton = By.xpath("//span[contains(.,'add page')]\");");
    public static By standardPageTitleField = By.xpath("//input[@id='pageName']");
    public static By addSectionPageButton = By.id("cmsframeworkAddSection");
    public static By sectionPageTitleField = By.id("sectionName");
    public static By addNewsArticleButton = By.id("cmsframeworkAddNews");
    public static By newsArticleTitleField = By.id("pageName");
    public static By featuredRadioButtonYes = By.xpath("(//input[@name='feature'])[2]");

}