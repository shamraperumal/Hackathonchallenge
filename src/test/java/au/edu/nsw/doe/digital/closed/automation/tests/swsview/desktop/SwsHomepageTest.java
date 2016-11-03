package au.edu.nsw.doe.digital.closed.automation.tests.swsview.desktop;

import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.tests.swsedit.PwsActions;
import au.edu.nsw.doe.digital.closed.automation.tests.swsedit.PwsActionMethods;
import org.junit.Test;

/**
 * Created by cpigden on 25/09/2015.
 */
public class SwsHomepageTest extends CapabilitiesBuilder {

    private PwsActions action;

    @Override
    public void doSetUp() {
        action = new PwsActionMethods(driver);
    }

    @Test
    public void swsHomepageTest() throws Exception {
        {

            action.getPage("SWS-BASE-VIEW", "sws-design-1", "", "");
            eyes.checkWindow("SWS Design 1");

            action.getPage("SWS-BASE-VIEW", "sws-design-2", "", "");
            eyes.checkWindow("SWS Design 2");

            action.getPage("SWS-BASE-VIEW", "sws-design-3", "", "");
            eyes.checkWindow("SWS Design 3");

            action.getPage("SWS-BASE-VIEW", "sws-design-4", "", "");
            eyes.checkWindow("SWS Design 4");

            action.getPage("SWS-BASE-VIEW", "sws-design-5", "", "");
            eyes.checkWindow("SWS Design 5");

            action.getPage("SWS-BASE-VIEW", "sws-design-6", "", "");
            eyes.checkWindow("SWS Design 6");

            action.getPage("SWS-BASE-VIEW", "sws-design-7", "", "");
            eyes.checkWindow("SWS Design 7");

            action.getPage("SWS-BASE-VIEW", "sws-design-8", "", "");
            eyes.checkWindow("SWS Design 8");

            action.getPage("SWS-BASE-VIEW", "sws-design-9", "", "");
            eyes.checkWindow("SWS Design 9");

            action.getPage("SWS-BASE-VIEW", "sws-design-10", "", "");
            eyes.checkWindow("SWS Design 10");

            action.getPage("SWS-BASE-VIEW", "sws-design-11", "", "");
            eyes.checkWindow("SWS Design 11");

            eyes.close();
        }
    }
}
