package au.edu.nsw.doe.digital.closed.automation.pageobjects.pws;

import org.openqa.selenium.By;


public class SwsGalleryPage {

    public static By addAlbumButton = By.id("addAlbum");
    public static By albumTitleField = By.xpath("//input[@id='title']");
    public static By albumDescriptionField = By.xpath("//textarea[@id='desc']");
    public static By albumNextButton = By.xpath("//span[contains(.,'Next')]");
    public static By albumUploadText = By.xpath("//label[@class='active']");
    public static By albumUpload = By.xpath("//input[@name='qqfile']");
    public static By albumSubmitButton = By.xpath("//span[contains(.,'Upload images')]");
    public static By albumUploadDoneButton = By.xpath("//span[contains(.,'Done')]");

}
