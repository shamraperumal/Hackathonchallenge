package au.edu.nsw.doe.digital.closed.automation.tests.swsview.desktop;

import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.tests.swsedit.PwsActionMethods;
import au.edu.nsw.doe.digital.closed.automation.tests.swsedit.PwsActions;
import org.junit.Test;

/**
 * Created by cpigden on 25/09/2015.
 */
public class SwsAlbumTest extends CapabilitiesBuilder {

    private PwsActions action;

    @Override
    public void doSetUp() {
        action = new PwsActionMethods(driver);
    }

    @Test
    public void swsAlbumTest() throws Exception {
        {

            action.getPage("SWS-BASE-VIEW", "sws-design-1", "sws-album", "");
            eyes.checkWindow(System.getenv("SWS Design 1 - Album"));

            action.getPage("SWS-BASE-VIEW", "sws-design-2", "sws-album", "");
            eyes.checkWindow(System.getenv("SWS Design 2 - Album"));

            action.getPage("SWS-BASE-VIEW", "sws-design-3", "sws-album", "");
            eyes.checkWindow(System.getenv("SWS Design 3 - Album"));

            action.getPage("SWS-BASE-VIEW", "sws-design-4", "sws-album", "");
            eyes.checkWindow(System.getenv("SWS Design 4 - Album"));

            action.getPage("SWS-BASE-VIEW", "sws-design-5", "sws-album", "");
            eyes.checkWindow(System.getenv("SWS Design 5 - Album"));

            action.getPage("SWS-BASE-VIEW", "sws-design-6", "sws-album", "");
            eyes.checkWindow(System.getenv("SWS Design 6 - Album"));

            action.getPage("SWS-BASE-VIEW", "sws-design-7", "sws-album", "");
            eyes.checkWindow(System.getenv("SWS Design 7 - Album"));

            action.getPage("SWS-BASE-VIEW", "sws-design-8", "sws-album", "");
            eyes.checkWindow(System.getenv("SWS Design 8 - Album"));

            action.getPage("SWS-BASE-VIEW", "sws-design-9", "sws-album", "");
            eyes.checkWindow(System.getenv("SWS Design 9 - Album"));

            action.getPage("SWS-BASE-VIEW", "sws-design-10", "sws-album", "");
            eyes.checkWindow(System.getenv("SWS Design 10 - Album"));

            action.getPage("SWS-BASE-VIEW", "sws-design-11", "sws-album", "");
            eyes.checkWindow(System.getenv("SWS Design 11 - Album"));

            eyes.close();
        }
    }
}
