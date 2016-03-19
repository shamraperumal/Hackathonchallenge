package au.edu.nsw.doe.digital.closed.automation.pageobjects.pws;

import org.openqa.selenium.By;

public class SwsHomePage {

    public static By topNewsArticle = By.cssSelector("a.newslink > h2");
    public static By editAddress = By.id("editaddress");
    public static By editTagline = By.id("edittagline");
    public static By tagLineField = By.xpath("//div[@id='lbTagline']//textarea[@id='tagline']");
    public static By tagLineOkButton = By.xpath("//div[@id='lbTagline']//span[contains(.,'OK')]");
    public static By tagLine = By.xpath("//div[@class='description']");
    public static By editTitle = By.id("editname");
    public static By titleField = By.xpath("//div[@id='lbName']//input[@id='schoolName']");
    public static By titleOkButton = By.xpath("//div[@id='lbName']//span[contains(.,'OK')]");
    public static By editName = By.id("editname");
    public static By editMotto = By.id("editMotto");
    public static By mottoField = By.xpath("//div[@id='lbMotto']//input[@class='mottoName focus']");
    public static By mottoOkButton = By.xpath("//div[@id='lbMotto']//span[contains(.,'OK')]");
    public static By motto = By.xpath("//div[@class='motto txt-primary']");
    public static By calendarPortlet = By.xpath("//div[@class='upevents']");

}
