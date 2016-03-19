package au.edu.nsw.doe.digital.closed.automation.tests.swsedit;

import au.edu.nsw.doe.digital.closed.automation.pageobjects.pws.SwsHomePage;
import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by cpigden on 15/12/2015.
 */
public class PwsUpdateSiteTitleTagLineMottoTest extends CapabilitiesBuilder {

    private PwsActions action;

    @Override
    public void doSetUp() {

        action = new PwsActionMethods(driver);
    }

    @Test
    public void testPwsUpdateTitleMottoTagLine() throws Exception {

        action.ssoLogin();

        action.getPage("SWS-BASE-STAGING", "", "", "");

        action.killPopup();

        String siteTitle1 = System.getenv("SWS-SITE-TITLE-1");
        String siteTitle2 = System.getenv("SWS-SITE-TITLE-2");
        String siteMotto1 = System.getenv("SWS-SITE-MOTTO-1");
        String siteMotto2 = System.getenv("SWS-SITE-MOTTO-2");
        String siteTagLine1 = System.getenv("SWS-SITE-TAGLINE-1");
        String siteTagLine2 = System.getenv("SWS-SITE-TAGLINE-2");

        action.updateTitle(siteTitle1);

        action.updateMotto(siteMotto1);

        action.updateTagLine(siteTagLine1);

        //Pause to allow cache to clear
        Thread.sleep(10000);

        action.getPage("SWS-BASE-LIVE", "", "", "");

        action.wait(SwsHomePage.tagLine);

        action.wait(SwsHomePage.motto);

        assertEquals("Home - " + siteTitle1, driver.getTitle());

        assertTrue(driver.findElement(SwsHomePage.tagLine).getText().contains(siteTagLine1));

        assertTrue(driver.findElement(SwsHomePage.motto).getText().contains(siteMotto1));

        action.getPage("SWS-BASE-STAGING", "", "", "");

        action.updateTitle(siteTitle2);

        action.updateMotto(siteMotto2);

        action.updateTagLine(siteTagLine2);

        Thread.sleep(10000);

        action.getPage("SWS-BASE-LIVE", "", "", "");

        action.wait(SwsHomePage.tagLine);

        action.wait(SwsHomePage.motto);

        assertEquals("Home - " + siteTitle2, driver.getTitle());

        assertTrue(driver.findElement(SwsHomePage.tagLine).getText().contains(siteTagLine2));

        assertTrue(driver.findElement(SwsHomePage.motto).getText().contains(siteMotto2));


    }
}
