package au.edu.nsw.doe.digital.closed.automation.pageobjects.squiz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

/**
 * Created by ShravanNagareddi on 22/10/18.
 * Adding elements for Guided Journey
 */
public class GefGuidedJourney {
    public static By guidedJourneySideMenu=By.xpath("li[@class='gefSideMenu__item']");
    public static By previousButton = By.xpath("//button[@class='uk-button gef-button gef-button--alt1 gef-button-x-large gef-pagination__prev']");
    public static By nextButton = By.xpath("//button[@class='uk-button gef-button gef-button-x-large gef-pagination__next']");
    public static By goToSectionButton = By.xpath("//button[@class='uk-button gef-button']");


}

