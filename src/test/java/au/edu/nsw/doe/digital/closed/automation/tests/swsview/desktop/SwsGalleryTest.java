package au.edu.nsw.doe.digital.closed.automation.tests.swsview.desktop;

import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.tests.swsedit.PwsActionMethods;
import au.edu.nsw.doe.digital.closed.automation.tests.swsedit.PwsActions;
import org.junit.Test;

/**
 * Created by cpigden on 25/09/2015.
 */
public class SwsGalleryTest extends CapabilitiesBuilder {

    private PwsActions action;

    @Override
    public void doSetUp() {
        action = new PwsActionMethods(driver);
    }

    @Test
    public void swsGalleryTest() throws Exception {
        {

            action.getPage("SWS-BASE-VIEW", "sws-design-1", "gallery/", "");
            eyes.checkWindow("SWS Design 1 - Gallery");

            action.getPage("SWS-BASE-VIEW", "sws-design-2", "gallery/", "");
            eyes.checkWindow("SWS Design 2 - Gallery");

            action.getPage("SWS-BASE-VIEW", "sws-design-3", "gallery/", "");
            eyes.checkWindow("SWS Design 3 - Gallery");

            action.getPage("SWS-BASE-VIEW", "sws-design-4", "gallery/", "");
            eyes.checkWindow("SWS Design 4 - Gallery");

            action.getPage("SWS-BASE-VIEW", "sws-design-5", "gallery/", "");
            eyes.checkWindow("SWS Design 5 - Gallery");

            action.getPage("SWS-BASE-VIEW", "sws-design-6", "gallery/", "");
            eyes.checkWindow("SWS Design 6 - Gallery");

            action.getPage("SWS-BASE-VIEW", "sws-design-7", "gallery/", "");
            eyes.checkWindow("SWS Design 7 - Gallery");

            action.getPage("SWS-BASE-VIEW", "sws-design-8", "gallery/", "");
            eyes.checkWindow("SWS Design 8 - Gallery");

            action.getPage("SWS-BASE-VIEW", "sws-design-9", "gallery/", "");
            eyes.checkWindow("SWS Design 9 - Gallery");

            action.getPage("SWS-BASE-VIEW", "sws-design-10", "gallery/", "");
            eyes.checkWindow("SWS Design 10 - Gallery");

            action.getPage("SWS-BASE-VIEW", "sws-design-11", "gallery/", "");
            eyes.checkWindow("SWS Design 11 - Gallery");

            eyes.close();
        }
    }
}
