package au.edu.nsw.doe.digital.closed.automation.pageobjects.sso;

import org.openqa.selenium.By;

/**
 * Created by NEDGIP on 17/06/2015.
 */
public class SsoLogin {

    public static By username = By.id("IDToken1");
    public static By password = By.id("IDToken2");
    public static By submitButton = By.xpath("//input[@name='Login.Submit']");

}

