package au.edu.nsw.doe.digital.closed.automation.pageobjects.pws;

import org.openqa.selenium.By;


public class SwsCalendarPage {

    public static By addEventButton = By.id("addEvent");
    public static By eventTitleField = By.xpath("//input[@id='eventTitle']");
    public static By eventDetails = By.xpath("//textarea[@id='eventDescription']");
    public static By startTime = By.xpath("//input[@id='eventStartTime']");
    public static By eventOkButton = By.cssSelector("#saveeventbtn");
    public static By radioButton1 = By.xpath("//input[@id='rdNameN']");
    public static By radioButton2 = By.xpath("//input[@id='rdAbidY']");
    public static By eventPublishConfirmation = By.cssSelector("a.btnA.btnActive>span");
    public static By calendarPortlet = By.xpath("//table[@class='det-calendar-table']");
    public static By deleteEventButton = By.xpath("//span[contains(.,'Delete event')]");
    public static By deleteOkButton = By.xpath("//div[@id='lbDeleteEvent']//a[@class='confirm btnA']");
    public static By deleteConfirmationButton = By.xpath("//div[@id='lbEventDeleted_Container']//a[@class='confirm btnA']");
    public static By eventError = By.xpath("//section[@id='portlet_eppvanillacalendarportlet_WAR_eppvanilladefaultportlet']//div[contains(.,'Error found')]");

}
