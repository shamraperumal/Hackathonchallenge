package au.edu.nsw.doe.digital.closed.automation.tests.swsedit;

import au.edu.nsw.doe.digital.closed.automation.pageobjects.pws.SwsCalendarPage;
import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by cpigden on 5/01/2016.
 */
public class PwsAddDeleteACalendarEventTest extends CapabilitiesBuilder {

    private PwsActions action;

    @Before
    public void doSetUp() { action = new PwsActionMethods(driver);}

    @Test
    public void testAddEditDeleteACalendarEvent() throws Exception {

        action.ssoLogin();

        action.getPage("SWS-BASE-STAGING", "SWS-CALENDAR", "", "");

        final String newEventA = action.pwsAddEvent();

        Thread.sleep(10000);

        action.getPage("SWS-BASE-LIVE", "", "", "");

        final String eventUrlLive = action.pwsGetCalendarEventUrl(newEventA, "SWS-BASE-LIVE");

        List<WebElement> list = driver.findElements(By.xpath("//h2[contains(.,'" + newEventA + "')]"));

        Assert.assertTrue(newEventA, list.size() > 0);

        action.getPage("SWS-BASE-STAGING", "", "", "");

        final String eventUrlStaging = action.pwsGetCalendarEventUrl(newEventA, "SWS-BASE-STAGING");

        action.pwsDeleteEvent();

        Thread.sleep(10000);

        driver.get(eventUrlLive);

        String error = driver.findElement(SwsCalendarPage.eventError).getText();

        Assert.assertTrue(error, true);


    }
}

