package au.edu.nsw.doe.digital.closed.automation.tests.swsedit;

import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by cpigden on 23/11/2015.
 */
public class PwsAddDeleteAnAlbumTest extends CapabilitiesBuilder {

    private PwsActions action;

    @Override
    public void doSetUp() {
        action = new PwsActionMethods(driver);
    }

    @Ignore

    @Test
    public void testAddDeleteAnAlbum() throws Exception {

        action.ssoLogin();

        action.getPage("SWS-BASE-STAGING", "sws-gallery", "", "");

        action.killPopup();

        final String newPageA = action.pwsAddAlbum();

        action.publishPage();

        //Pause to allow cache to clear
        Thread.sleep(10000);

        action.getPage("SWS-BASE-LIVE", "sws-gallery", newPageA, "");

        assertEquals(newPageA + " - Automated Regression Testing", driver.getTitle());
        System.out.println("New album is live");

        action.getPage("SWS-BASE-STAGING", "sws-gallery", newPageA, "");

        action.deletePage();

        //Pause to allow cache to clear
        Thread.sleep(10000);

        action.getPage("SWS-BASE-LIVE", "sws-gallery", newPageA, "");

        assertEquals(newPageA + " - Automated Regression Testing", driver.getTitle());
        System.out.println("New album has been deleted");


    }
}
