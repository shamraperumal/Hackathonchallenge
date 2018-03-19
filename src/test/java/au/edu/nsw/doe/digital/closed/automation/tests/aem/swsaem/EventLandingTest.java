package au.edu.nsw.doe.digital.closed.automation.tests.aem.swsaem;

import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.tests.aem.AemActionMethods;
import au.edu.nsw.doe.digital.closed.automation.tests.aem.AemActions;
import org.junit.Test;


public class EventLandingTest extends CapabilitiesBuilder {

    private AemActions action;

    @Override
    public void doSetUp() {
        action = new AemActionMethods(driver);
    }

    @Test
    public void eventLandingTest() throws Exception {
        {
            action.setScreenDimensions();

            action.getPage("sws-aem-base","sws-event-landing");
            eyes.checkWindow(System.getenv("sws-aem-event-landing"));


            eyes.close();
        }
    }
}
