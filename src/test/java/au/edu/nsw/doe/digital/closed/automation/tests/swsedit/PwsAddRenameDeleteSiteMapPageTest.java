package au.edu.nsw.doe.digital.closed.automation.tests.swsedit;

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
public class PwsAddRenameDeleteSiteMapPageTest extends CapabilitiesBuilder {

    private PwsActions action;

    @Before
    public void doSetUp() { action = new PwsActionMethods(driver);}


    @Test
    public void testAddRenameDeleteSiteMapPage() throws Exception {

        action = new PwsActionMethods(driver);

        action.ssoLogin();

        action.getPage("SWS-BASE-STAGING", "sws-sitemap", "", "");

        final String newPageA = action.pwsAddPageOnSitemap();

        Thread.sleep(3000);

        action.getPage("SWS-BASE-STAGING", "sws-ourschool", newPageA, "");

        //Asserts new page was succesfully created
        assertEquals(newPageA + " - Automated Regression Testing", driver.getTitle());
        System.out.println("New sitemap page created");


        action.getPage("SWS-BASE-STAGING", "sws-sitemap", "", "");

        action.pwsExpandSiteMap();

        // locates new page in sitemap
        action.wait(By.xpath("//a[@title='" + newPageA + "']"));
        System.out.println("Found new page");

        //clicks on new page within sitemap
        driver.findElement(By.xpath("//a[@title='" + newPageA + "']")).click();
        System.out.println("Clicked on new page");


        final String newPageB = action.pwsSiteMapRenamePage();

        //Pause to allow cache to clear
        Thread.sleep(3000);

        action.getPage("SWS-BASE-STAGING", "sws-ourschool", "", newPageA);

        //Asserts page was renamed succesfully
        assertEquals(newPageB + " - Automated Regression Testing", driver.getTitle());
        System.out.println("Sitemap page renamed succesfully");


        action.getPage("SWS-BASE-STAGING", "sws-sitemap", "", "");

        action.pwsExpandSiteMap();

        // locates renamed page in sitemap
        action.wait(By.xpath("//a[@title='" + newPageB + "']"));

        driver.findElement(By.xpath("//a[@title='" + newPageB + "']")).click();
        System.out.println("Clicked on new page");


        action.pwsDeletePageOnSitemap();

        //Pause to allow cache to clear
        Thread.sleep(1000);

        //Asserts that renamed page is deleted from sitemap
        List<WebElement> list = driver.findElements(By.xpath("//a[@title='" + newPageB + "']"));
        Assert.assertTrue(newPageA, list.size() < 1);
        System.out.println("New page deleted from sitemap");

        action.getPage("SWS-BASE-STAGING", "sws-ourschool", "", newPageA);

        //Asserts that renamed page no longer exists
        assertEquals("Status - liferay.com", driver.getTitle());
        System.out.println("New page susccessfully deleted");

    }

}

