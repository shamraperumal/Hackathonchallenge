package au.edu.nsw.doe.digital.closed.automation.pageobjects.squiz;

import org.openqa.selenium.By;

public class GefConnectWithUs {
    // Used for locate connect with us post
    public static By connectWithuspost = By.className("gef-social-media-post");

    public static By facebookpost =  By.xpath("//a[@class='gef-social-media-post__metadata-facebook']");
    public static By twitterpost =  By.xpath("//a[@class='gef-social-media-post__metadata-twitter']");
    public static By firstsocialmediapost= By.xpath("//a[contains(@class, 'gef-social-media-post__metadata')]");




}
