package au.edu.nsw.doe.digital.closed.automation.tests.swsedit;

import au.edu.nsw.doe.digital.closed.automation.pageobjects.pws.SwsHomePage;
import au.edu.nsw.doe.digital.closed.automation.pageobjects.pws.SwsNewsIndexPage;
import au.edu.nsw.doe.digital.closed.automation.pageobjects.pws.SwsPageNotFound;
import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.junit.Assert.assertEquals;


/**
 * Created by cpigden on 8/10/2015.
 */
public class PwsAddDeleteAFeaturedNewsArticleTest extends CapabilitiesBuilder {

    private PwsActions action;

    @Before
    public void doSetUp() { action = new PwsActionMethods(driver);}

    @Test
    public void testAddDeleteAFeaturedNewsArticle() throws Exception {

        action.ssoLogin();

        action.getPage("SWS-BASE-STAGING", "sws-news", "", "");

        action.killPopup();

        final String newPageA = action.pwsAddFeaturedNews();

        //Pause to allow cache to clear
        Thread.sleep(3000);

        action.enterText();

        action.publishPage();

        action.getPage("SWS-BASE-LIVE", "sws-news", newPageA, "");

        //Asserts that news article is live
        assertEquals(newPageA + " - Automated Regression Testing", driver.getTitle());
        System.out.println("Confirmed " + newPageA + " is live");

        //Pause to allow cache to clear
        Thread.sleep(10000);

        action.getPage("SWS-BASE-LIVE", "sws-news", "", "");

        //Asserts that news article is featured on the news index page
        action.wait(SwsNewsIndexPage.featuredNewsBorder);
        System.out.println("Featured news section loaded");
        List<WebElement> list1 = driver.findElements(By.xpath("//div[@class='newsindex-row newsfeatured bdr-primary']//h2[contains(.,'" + newPageA + "')]"));
        Assert.assertTrue(newPageA, list1.size() > 0);
        System.out.println("Confirmed " + newPageA + " is a featured news page");

        //Pause to allow cache to clear
        Thread.sleep(10000);

        action.getPage("SWS-BASE-LIVE", "", "", "");

        //Asserts that news article is featured on the homepage
        action.wait(SwsHomePage.topNewsArticle);
        System.out.println("News portlet loaded...");
        List<WebElement> list2 = driver.findElements(By.xpath("//div[@class='newsindex-row newsfeatured bdr-primary']//h2[contains(.,'" + newPageA + "')]"));
        Assert.assertTrue(newPageA, list2.size() > 0);
        System.out.println("Featured news article " + newPageA + " is present on the homepage");


        action.getPage("SWS-BASE-STAGING", "sws-news", newPageA, "");

        action.deletePage();

        //Pause to allow cache to clear
        Thread.sleep(10000);

        action.getPage("SWS-BASE-LIVE", "sws-news", newPageA, "");

        // Asserts that news article has been deleted
        action.wait(SwsPageNotFound.pageTitleNotFound);
        assertEquals("Status - Automated Regression Testing", driver.getTitle());
        System.out.println("Confirmed " + newPageA + " has been deleted");

    }



}

