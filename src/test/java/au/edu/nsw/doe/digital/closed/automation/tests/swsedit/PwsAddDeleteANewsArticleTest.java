package au.edu.nsw.doe.digital.closed.automation.tests.swsedit;

import au.edu.nsw.doe.digital.closed.automation.pageobjects.pws.SwsHomePage;
import au.edu.nsw.doe.digital.closed.automation.pageobjects.pws.SwsPageNotFound;
import au.edu.nsw.doe.digital.closed.automation.setup.LocalSetup;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static org.junit.Assert.assertEquals;


/**
 * Created by cpigden on 8/10/2015.
 */
public class PwsAddDeleteANewsArticleTest extends LocalSetup {

    private PwsActions action;


    @Before
    public void doSetUp() { action = new PwsActionMethods(driver);}

    @Test
    public void testAddDeleteANewsArticle() throws Exception {

        WebDriverWait wait = new WebDriverWait(driver, 30);

        action.ssoLogin();

        action.getPage("SWS-BASE-STAGING", "sws-news", "", "");

        action.killPopup();

        final String newPageA = action.pwsAddNews();

        Thread.sleep(3000);

        action.enterText();

        action.publishPage();

        Thread.sleep(10000);

        action.getPage("SWS-BASE-LIVE", "sws-news", newPageA, "");

        // Asserts that news article is live
        assertEquals(newPageA + " - Automated Regression Testing", driver.getTitle());
        System.out.println("Confirmed " + newPageA + " is live");

        Thread.sleep(10000);

        action.getPage("SWS-BASE-LIVE", "", "", "");

        //Confirms that news article is present on the homepage and is not featured news
        WebElement newStandardNewsArticle = wait.until(ExpectedConditions.elementToBeClickable(SwsHomePage.topNewsArticle));
        System.out.println("News portlet loaded...");
        List<WebElement> list = driver.findElements(By.xpath("//div[@class='newsindex-row newsnormal']//h2[contains(.,'" + newPageA + "')]"));
        Assert.assertTrue(newPageA, list.size() > 0);
        System.out.println("News article " + newPageA + " is present on the homepage");

        action.getPage("SWS-BASE-STAGING", "sws-news", newPageA, "");

        action.deletePage();

        Thread.sleep(10000);

        action.getPage("SWS-BASE-LIVE", "sws-news", newPageA, "");

        //Asserts that news article has been deleted
        action.wait(SwsPageNotFound.pageTitleNotFound);
        assertEquals("Status - Automated Regression Testing", driver.getTitle());
        System.out.println("Confirmed " + newPageA + " has been deleted");

    }
}

