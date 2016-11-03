package au.edu.nsw.doe.digital.closed.automation.tests.swsview.desktop;

import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.tests.swsedit.PwsActionMethods;
import au.edu.nsw.doe.digital.closed.automation.tests.swsedit.PwsActions;
import org.junit.Test;

/**
 * Created by cpigden on 25/09/2015.
 */
public class SwsNewsIndexTest extends CapabilitiesBuilder {

    private PwsActions action;

    @Override
    public void doSetUp() {
        action = new PwsActionMethods(driver);
    }

    @Test
    public void swsNewsIndexTest() throws Exception {
        {

            action.getPage("SWS-BASE-VIEW", "sws-design-1", "sws-news-index", "");
            eyes.checkWindow(System.getenv("SWS Design 1 - News Index"));

            action.getPage("SWS-BASE-VIEW", "sws-design-2", "sws-news-index", "");
            eyes.checkWindow(System.getenv("SWS Design 2 - News Index"));

            action.getPage("SWS-BASE-VIEW", "sws-design-3", "sws-news-index", "");
            eyes.checkWindow(System.getenv("SWS Design 3 - News Index"));

            action.getPage("SWS-BASE-VIEW", "sws-design-4", "sws-news-index", "");
            eyes.checkWindow(System.getenv("SWS Design 4 - News Index"));

            action.getPage("SWS-BASE-VIEW", "sws-design-5", "sws-news-index", "");
            eyes.checkWindow(System.getenv("SWS Design 5 - News Index"));

            action.getPage("SWS-BASE-VIEW", "sws-design-6", "sws-news-index", "");
            eyes.checkWindow(System.getenv("SWS Design 6 - News Index"));

            action.getPage("SWS-BASE-VIEW", "sws-design-7", "sws-news-index", "");
            eyes.checkWindow(System.getenv("SWS Design 7 - News Index"));

            action.getPage("SWS-BASE-VIEW", "sws-design-8", "sws-news-index", "");
            eyes.checkWindow(System.getenv("SWS Design 8 - News Index"));

            action.getPage("SWS-BASE-VIEW", "sws-design-9", "sws-news-index", "");
            eyes.checkWindow(System.getenv("SWS Design 9 - News Index"));

            action.getPage("SWS-BASE-VIEW", "sws-design-10", "sws-news-index", "");
            eyes.checkWindow(System.getenv("SWS Design 10 - News Index"));

            action.getPage("SWS-BASE-VIEW", "sws-design-11", "sws-news-index", "");
            eyes.checkWindow(System.getenv("SWS Design 11 - News Index"));

            eyes.close();
        }
    }
}
