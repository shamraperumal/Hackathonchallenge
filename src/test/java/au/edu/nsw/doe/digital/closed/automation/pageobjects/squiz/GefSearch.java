package au.edu.nsw.doe.digital.closed.automation.pageobjects.squiz;

import org.openqa.selenium.By;

/**
 * Created by cpigden on 14/12/2015.
 * Updated by Shravan on 30/11/2018 for Elastic Search development
 */
public class GefSearch {

    public static By searchField = By.id("q");
    public static By searchSubmitButton = By.id("btnSearch17");
    public static By pagination = By.xpath("//span[@ng-show='pagination.current == 1']");
    public static By mobileSearchButton = By.xpath("//button[@id='global-search-button']");
    public static By insidetheDeptSearch=By.id("search");
    //public static By InsidetheDeptsearchSubmitButton = By.id("btnSearch14");
    public static By InsidetheDeptSearchbuttontwo=By.id("btnSearch");

}
