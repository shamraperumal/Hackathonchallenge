package au.edu.nsw.doe.digital.closed.automation.tests.swsview.desktop;

import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.tests.swsedit.PwsActionMethods;
import au.edu.nsw.doe.digital.closed.automation.tests.swsedit.PwsActions;
import org.junit.Test;

/**
 * Created by cpigden on 25/09/2015.
 */
public class SwsStandardPageTest extends CapabilitiesBuilder {

    private PwsActions action;

    @Override
    public void doSetUp() {
        action = new PwsActionMethods(driver);
    }

    @Test
    public void swsStandardPageTest() throws Exception {
        {

            action.getPage("SWS-BASE-VIEW", "sws-design-1", "sws-standard-page", "");
            eyes.checkWindow(System.getenv("SWS Design 1 - Standard"));

            action.getPage("SWS-BASE-VIEW", "sws-design-2", "sws-standard-page", "");
            eyes.checkWindow(System.getenv("SWS Design 2 - Standard"));

            action.getPage("SWS-BASE-VIEW", "sws-design-3", "sws-standard-page", "");
            eyes.checkWindow(System.getenv("SWS Design 3 - Standard"));

            action.getPage("SWS-BASE-VIEW", "sws-design-4", "sws-standard-page", "");
            eyes.checkWindow(System.getenv("SWS Design 4 - Standard"));

            action.getPage("SWS-BASE-VIEW", "sws-design-5", "sws-standard-page", "");
            eyes.checkWindow(System.getenv("SWS Design 5 - Standard"));

            action.getPage("SWS-BASE-VIEW", "sws-design-6", "sws-standard-page", "");
            eyes.checkWindow(System.getenv("SWS Design 6 - Standard"));

            action.getPage("SWS-BASE-VIEW", "sws-design-7", "sws-standard-page", "");
            eyes.checkWindow(System.getenv("SWS Design 7 - Standard"));

            action.getPage("SWS-BASE-VIEW", "sws-design-8", "sws-standard-page", "");
            eyes.checkWindow(System.getenv("SWS Design 8 - Standard"));

            action.getPage("SWS-BASE-VIEW", "sws-design-9", "sws-standard-page", "");
            eyes.checkWindow(System.getenv("SWS Design 9 - Standard"));

            action.getPage("SWS-BASE-VIEW", "sws-design-10", "sws-standard-page", "");
            eyes.checkWindow(System.getenv("SWS Design 10 - Standard"));

            action.getPage("SWS-BASE-VIEW", "sws-design-11", "sws-standard-page", "");
            eyes.checkWindow(System.getenv("SWS Design 11 - Standard"));

            eyes.close();
        }
    }
}
