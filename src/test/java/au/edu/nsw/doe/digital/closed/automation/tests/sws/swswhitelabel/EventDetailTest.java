package au.edu.nsw.doe.digital.closed.automation.tests.sws.swswhitelabel;

import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.tests.sws.AemActionMethods;
import au.edu.nsw.doe.digital.closed.automation.tests.sws.AemActions;
import org.junit.Test;


public class EventDetailTest extends CapabilitiesBuilder {

    private AemActions action;

    @Override
    public void doSetUp() {
        action = new AemActionMethods(driver);
    }

    @Test
    public void eventDetailTest() throws Exception {
        {
            action.setScreenDimensions();
            action.getPage("sws-component-base","event-detail");
            eyes.checkWindow(System.getenv("sws-event-detail"));

            action.getPage("sws-component-base","event-detail-new");
            eyes.checkWindow(System.getenv("sws-event-detail-new"));

            eyes.close();
        }
    }
}
