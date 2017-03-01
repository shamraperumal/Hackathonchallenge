package au.edu.nsw.doe.digital.closed.automation.pageobjects.whitelabel;

import org.openqa.selenium.By;

/**
 * Created by christopherpigden on 1/3/17.
 */
public class DefaultElements {
    public static By linkList = By.cssSelector("#Links0+ ul li");
    public static By typography = By.cssSelector("p:nth-child(21) , h6+ p , strong , h6 , h5 , h4 , h3 , #Header2 , .uk-margin-small-top , h1");
    public static By blockQuote = By.cssSelector("blockquote");
    public static By iFrame = By.cssSelector("iframe");
    public static By bulletLists = By.cssSelector("#Lists5+ ul li");
    public static By numberLists = By.cssSelector("ol+ p , ol li");
    public static By imageCaption = By.cssSelector("figcaption , .gef-image-with-caption img");
    public static By buttonSubmit = By.cssSelector(".gef-button-submit");
    public static By table = By.cssSelector("td , th");
}
