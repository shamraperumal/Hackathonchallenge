package au.edu.nsw.doe.digital.closed.automation.tests.swsview.desktop;

import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.tests.swsedit.PwsActionMethods;
import au.edu.nsw.doe.digital.closed.automation.tests.swsedit.PwsActions;
import org.junit.Test;

/**
 * Created by cpigden on 25/09/2015.
 */
public class SwsCalendarTest extends CapabilitiesBuilder {

    private PwsActions action;

    @Override
    public void doSetUp() {
        action = new PwsActionMethods(driver);
    }

    @Test
    public void swsCalendarTest() throws Exception {
        {

            action.getPage("SWS-BASE-VIEW", "sws-design-1", "calendar/", "");
            eyes.checkWindow("SWS Design 1 - Calendar");

            action.getPage("SWS-BASE-VIEW", "sws-design-2", "calendar/", "");
            eyes.checkWindow("SWS Design 2 - Calendar");

            action.getPage("SWS-BASE-VIEW", "sws-design-3", "calendar/", "");
            eyes.checkWindow("SWS Design 3 - Calendar");

            action.getPage("SWS-BASE-VIEW", "sws-design-4", "calendar/", "");
            eyes.checkWindow("SWS Design 4 - Calendar");

            action.getPage("SWS-BASE-VIEW", "sws-design-5", "calendar/", "");
            eyes.checkWindow("SWS Design 5 - Calendar");

            action.getPage("SWS-BASE-VIEW", "sws-design-6", "calendar/", "");
            eyes.checkWindow("SWS Design 6 - Calendar");

            action.getPage("SWS-BASE-VIEW", "sws-design-7", "calendar/", "");
            eyes.checkWindow("SWS Design 7 - Calendar");

            action.getPage("SWS-BASE-VIEW", "sws-design-8", "calendar/", "");
            eyes.checkWindow("SWS Design 8 - Calendar");

            action.getPage("SWS-BASE-VIEW", "sws-design-9", "calendar/", "");
            eyes.checkWindow("SWS Design 9 - Calendar");

            action.getPage("SWS-BASE-VIEW", "sws-design-10", "calendar/", "");
            eyes.checkWindow("SWS Design 10 - Calendar");

            action.getPage("SWS-BASE-VIEW", "sws-design-11", "calendar/", "");
            eyes.checkWindow("SWS Design 11 - Calendar");

            eyes.close();
        }
    }
}
