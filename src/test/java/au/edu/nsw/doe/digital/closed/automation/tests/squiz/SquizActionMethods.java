package au.edu.nsw.doe.digital.closed.automation.tests.squiz;

import au.edu.nsw.doe.digital.closed.automation.pageobjects.squiz.GefCatalogue;
import au.edu.nsw.doe.digital.closed.automation.pageobjects.squiz.GefSearch;
import au.edu.nsw.doe.digital.closed.automation.pageobjects.squiz.GefShowHide;
import au.edu.nsw.doe.digital.closed.automation.pageobjects.squiz.GefTab;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SquizActionMethods implements SquizActions {


    protected WebDriver driver;


    public SquizActionMethods(WebDriver driver) {
        this.driver = driver;

    }

    public void wait(final By element) throws Exception {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 90);
            By thisElement = element;
            wait.until(ExpectedConditions.elementToBeClickable(thisElement));
        } catch (final Exception e) {
            throw e;

        }
    }

    public void getPage(final String domain, final String pageUrl, final String newPageA, final String newPageB) throws Exception {
        try {
            String thisPageUrl = System.getenv(pageUrl);
            String thisNewPageA = newPageA;
            String thisNewPageB = newPageB;
            driver.get(System.getenv(domain) + (thisPageUrl == null ? "" : thisPageUrl) + (thisNewPageA == null ? "" : thisNewPageA) + (thisNewPageB == null ? "" : thisNewPageB));
            System.out.println("Loaded domain url");

        } catch (final Exception e) {
            System.out.println("Failed to load page");
            throw e;

        }
    }


    public void search(final String searchInput) throws Exception {
        try {
            wait(GefSearch.searchField);
            wait(GefSearch.searchSubmitButton);
            String thisSearchInput = searchInput;
            driver.findElement(GefSearch.searchField).clear();
            driver.findElement(GefSearch.searchField).sendKeys(thisSearchInput == "SEARCH-INPUT" ? "test" : thisSearchInput);
            driver.findElement(GefSearch.searchSubmitButton).click();
            wait(GefSearch.pagination);
        } catch (final Exception e) {
            throw e;
        }
    }


    public void mobileSearch(final String searchInput) throws Exception {
        try {
            wait(GefSearch.mobileSearchButton);
            driver.findElement(GefSearch.mobileSearchButton).click();
            wait(GefSearch.searchField);
            wait(GefSearch.searchSubmitButton);
            String thisSearchInput = searchInput;
            driver.findElement(GefSearch.searchField).clear();
            driver.findElement(GefSearch.searchField).sendKeys(thisSearchInput == "SEARCH-INPUT" ? "test" : thisSearchInput);
            driver.findElement(GefSearch.searchSubmitButton).click();
            wait(GefSearch.pagination);
        } catch (final Exception e) {
            throw e;
        }
    }

    public void tab() throws Exception {

        try {
            wait(GefTab.tab);
            driver.findElement(GefTab.tab).click();
            Thread.sleep(500);
        } catch (final Exception e) {
            throw e;
        }
    }

    public void showHide() throws Exception {
        try {
            wait(GefShowHide.showHide1);
            wait(GefShowHide.showHide2);
            wait(GefShowHide.showHide3);
            driver.findElement(GefShowHide.showHide1).click();
        } catch (final Exception e) {
            throw e;
        }
    }

    public void catalogueListView() throws Exception {
        try {
            wait(GefCatalogue.listViewButton);
            driver.findElement(GefCatalogue.listViewButton).click();
            Thread.sleep(500);
        } catch (final Exception e) {
            throw e;
        }
    }


}




