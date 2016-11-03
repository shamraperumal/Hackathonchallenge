package au.edu.nsw.doe.digital.closed.automation.tests.swsview.desktop;

import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.tests.swsedit.PwsActionMethods;
import au.edu.nsw.doe.digital.closed.automation.tests.swsedit.PwsActions;
import org.junit.Test;

/**
 * Created by cpigden on 25/09/2015.
 */
public class SwsNewsletterTest extends CapabilitiesBuilder {

    private PwsActions action;

    @Override
    public void doSetUp() {
        action = new PwsActionMethods(driver);
    }

    @Test
    public void swsNewsletterTest() throws Exception {
        {

            action.getPage("SWS-BASE-VIEW", "sws-design-1", "newsletters/", "");
            eyes.checkWindow("SWS Design 1 - Newsletter");

            action.getPage("SWS-BASE-VIEW", "sws-design-2", "newsletters/", "");
            eyes.checkWindow("SWS Design 2 - Newsletter");

            action.getPage("SWS-BASE-VIEW", "sws-design-3", "newsletters/", "");
            eyes.checkWindow("SWS Design 3 - Newsletter");

            action.getPage("SWS-BASE-VIEW", "sws-design-4", "newsletters/", "");
            eyes.checkWindow("SWS Design 4 - Newsletter");

            action.getPage("SWS-BASE-VIEW", "sws-design-5", "newsletters/", "");
            eyes.checkWindow("SWS Design 5 - Newsletter");

            action.getPage("SWS-BASE-VIEW", "sws-design-6", "newsletters/", "");
            eyes.checkWindow("SWS Design 6 - Newsletter");

            action.getPage("SWS-BASE-VIEW", "sws-design-7", "newsletters/", "");
            eyes.checkWindow("SWS Design 7 - Newsletter");

            action.getPage("SWS-BASE-VIEW", "sws-design-8", "newsletters/", "");
            eyes.checkWindow("SWS Design 8 - Newsletter");

            action.getPage("SWS-BASE-VIEW", "sws-design-9", "newsletters/", "");
            eyes.checkWindow("SWS Design 9 - Newsletter");

            action.getPage("SWS-BASE-VIEW", "sws-design-10", "newsletters/", "");
            eyes.checkWindow("SWS Design 10 - Newsletter");

            action.getPage("SWS-BASE-VIEW", "sws-design-11", "newsletters/", "");
            eyes.checkWindow("SWS Design 11 - Newsletter");

            eyes.close();
        }
    }
}
