package au.edu.nsw.doe.digital.closed.automation.pageobjects.pws;

import org.openqa.selenium.By;

public class SwsSocialProfile {

    public static By addTwitterLink = By.cssSelector("button.btnAdd");
    public static By addFacebookLink = By.cssSelector("li.Facebook > div.addBtnEnabled > button.btnAdd");
    public static By addYoutubeLink = By.cssSelector("li.YouTube > div.addBtnEnabled > button.btnAdd");
    public static By addVimeoLink = By.cssSelector("li.Vimeo > div.addBtnEnabled > button.btnAdd");
    public static By socialProfileNameField = By.xpath("//input[@class='ng-pristine ng-valid']");
    public static By youtubeProfileNameField = By.cssSelector("li.YouTube > div.addBtnEnabled > div.modal-container > #lbSessionWarning_Container > #lbSessionWarning > div.lbContent > input.ng-valid.ng-dirty");
    public static By vimeoProfileNameField = By.cssSelector("li.Vimeo > div.addBtnEnabled > div.modal-container > #lbSessionWarning_Container > #lbSessionWarning > div.lbContent > input.ng-valid.ng-dirty");
    public static By socialProfileOkButton = By.xpath("//div[@id='lbSessionWarning']//span[@class='btn btnA']/span[contains(.,'Save')]");
    public static By publishButton = By.xpath("//span[@class='btn btnA']//span[contains(.,'Publish')]");
    public static By removeSocialMediaButton = By.xpath("//span[@class='icon remove-icon']");
    public static By confirmDeleteSocialMediaButton = By.xpath("//span[contains(@ng-show,'!loader')]");

}
