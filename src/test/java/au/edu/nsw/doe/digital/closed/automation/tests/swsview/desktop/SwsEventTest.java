package au.edu.nsw.doe.digital.closed.automation.tests.swsview.desktop;

import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.tests.swsedit.PwsActionMethods;
import au.edu.nsw.doe.digital.closed.automation.tests.swsedit.PwsActions;
import org.junit.Test;

/**
 * Created by cpigden on 25/09/2015.
 */
public class SwsEventTest extends CapabilitiesBuilder {

    private PwsActions action;

    @Override
    public void doSetUp() {
        action = new PwsActionMethods(driver);
    }

    @Test
    public void swsEventTest() throws Exception {
        {

            action.getPage("SWS-BASE-VIEW", "sws-design-1", "sws-event", "");
            eyes.checkWindow(System.getenv("SWS Design 1 - Event"));

            action.getPage("SWS-BASE-VIEW", "sws-design-2", "sws-event", "");
            eyes.checkWindow(System.getenv("SWS Design 2 - Event"));

            action.getPage("SWS-BASE-VIEW", "sws-design-3", "sws-event", "");
            eyes.checkWindow(System.getenv("SWS Design 3 - Event"));

            action.getPage("SWS-BASE-VIEW", "sws-design-4", "sws-event", "");
            eyes.checkWindow(System.getenv("SWS Design 4 - Event"));

            action.getPage("SWS-BASE-VIEW", "sws-design-5", "sws-event", "");
            eyes.checkWindow(System.getenv("SWS Design 5 - Event"));

            action.getPage("SWS-BASE-VIEW", "sws-design-6", "sws-event", "");
            eyes.checkWindow(System.getenv("SWS Design 6 - Event"));

            action.getPage("SWS-BASE-VIEW", "sws-design-7", "sws-event", "");
            eyes.checkWindow(System.getenv("SWS Design 7 - Event"));

            action.getPage("SWS-BASE-VIEW", "sws-design-8", "sws-event", "");
            eyes.checkWindow(System.getenv("SWS Design 8 - Event"));

            action.getPage("SWS-BASE-VIEW", "sws-design-9", "sws-event", "");
            eyes.checkWindow(System.getenv("SWS Design 9 - Event"));

            action.getPage("SWS-BASE-VIEW", "sws-design-10", "sws-event", "");
            eyes.checkWindow(System.getenv("SWS Design 10 - Event"));

            action.getPage("SWS-BASE-VIEW", "sws-design-11", "sws-event", "");
            eyes.checkWindow(System.getenv("SWS Design 11 - Event"));

            eyes.close();
        }
    }
}
