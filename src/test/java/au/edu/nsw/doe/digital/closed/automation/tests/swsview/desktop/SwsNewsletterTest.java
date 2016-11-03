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

            action.getPage("SWS-BASE-VIEW", "sws-design-1", "sws-newsletter", "");
            eyes.checkWindow(System.getenv("SWS Design 1 - Newsletter"));

            action.getPage("SWS-BASE-VIEW", "sws-design-2", "sws-newsletter", "");
            eyes.checkWindow(System.getenv("SWS Design 2 - Newsletter"));

            action.getPage("SWS-BASE-VIEW", "sws-design-3", "sws-newsletter", "");
            eyes.checkWindow(System.getenv("SWS Design 3 - Newsletter"));

            action.getPage("SWS-BASE-VIEW", "sws-design-4", "sws-newsletter", "");
            eyes.checkWindow(System.getenv("SWS Design 4 - Newsletter"));

            action.getPage("SWS-BASE-VIEW", "sws-design-5", "sws-newsletter", "");
            eyes.checkWindow(System.getenv("SWS Design 5 - Newsletter"));

            action.getPage("SWS-BASE-VIEW", "sws-design-6", "sws-newsletter", "");
            eyes.checkWindow(System.getenv("SWS Design 6 - Newsletter"));

            action.getPage("SWS-BASE-VIEW", "sws-design-7", "sws-newsletter", "");
            eyes.checkWindow(System.getenv("SWS Design 7 - Newsletter"));

            action.getPage("SWS-BASE-VIEW", "sws-design-8", "sws-newsletter", "");
            eyes.checkWindow(System.getenv("SWS Design 8 - Newsletter"));

            action.getPage("SWS-BASE-VIEW", "sws-design-9", "sws-newsletter", "");
            eyes.checkWindow(System.getenv("SWS Design 9 - Newsletter"));

            action.getPage("SWS-BASE-VIEW", "sws-design-10", "sws-newsletter", "");
            eyes.checkWindow(System.getenv("SWS Design 10 - Newsletter"));

            action.getPage("SWS-BASE-VIEW", "sws-design-11", "sws-newsletter", "");
            eyes.checkWindow(System.getenv("SWS Design 11 - Newsletter"));

            eyes.close();
        }
    }
}
