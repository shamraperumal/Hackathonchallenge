package au.edu.nsw.doe.digital.closed.automation.tests.swsview.desktop;

import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.tests.swsedit.PwsActionMethods;
import au.edu.nsw.doe.digital.closed.automation.tests.swsedit.PwsActions;
import org.junit.Test;

/**
 * Created by cpigden on 25/09/2015.
 */
public class SwsWeekTest extends CapabilitiesBuilder {

    private PwsActions action;

    @Override
    public void doSetUp() {
        action = new PwsActionMethods(driver);
    }

    @Test
    public void swsWeekTest() throws Exception {
        {

            action.getPage("SWS-BASE-VIEW", "sws-design-1", "calendar/-/calendar/view/week/3-11-2016", "");
            eyes.checkWindow("SWS Design 1 - Week");

            action.getPage("SWS-BASE-VIEW", "sws-design-2", "calendar/-/calendar/view/week/3-11-2016", "");
            eyes.checkWindow("SWS Design 2 - Week");

            action.getPage("SWS-BASE-VIEW", "sws-design-3", "calendar/-/calendar/view/week/3-11-2016", "");
            eyes.checkWindow("SWS Design 3 - Week");

            action.getPage("SWS-BASE-VIEW", "sws-design-4", "calendar/-/calendar/view/week/3-11-2016", "");
            eyes.checkWindow("SWS Design 4 - Week");

            action.getPage("SWS-BASE-VIEW", "sws-design-5", "calendar/-/calendar/view/week/3-11-2016", "");
            eyes.checkWindow("SWS Design 5 - Week");

            action.getPage("SWS-BASE-VIEW", "sws-design-6", "calendar/-/calendar/view/week/3-11-2016", "");
            eyes.checkWindow("SWS Design 6 - Week");

            action.getPage("SWS-BASE-VIEW", "sws-design-7", "calendar/-/calendar/view/week/3-11-2016", "");
            eyes.checkWindow("SWS Design 7 - Week");

            action.getPage("SWS-BASE-VIEW", "sws-design-8", "calendar/-/calendar/view/week/3-11-2016", "");
            eyes.checkWindow("SWS Design 8 - Week");

            action.getPage("SWS-BASE-VIEW", "sws-design-9", "calendar/-/calendar/view/week/3-11-2016", "");
            eyes.checkWindow("SWS Design 9 - Week");

            action.getPage("SWS-BASE-VIEW", "sws-design-10", "calendar/-/calendar/view/week/3-11-2016", "");
            eyes.checkWindow("SWS Design 10 - Week");

            action.getPage("SWS-BASE-VIEW", "sws-design-11", "calendar/-/calendar/view/week/3-11-2016", "");
            eyes.checkWindow("SWS Design 11 - Week");

            eyes.close();
        }
    }
}
