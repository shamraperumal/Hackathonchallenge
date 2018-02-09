package au.edu.nsw.doe.digital.closed.automation.tests.aem.swswhitelabel;

import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.tests.aem.AemActionMethods;
import au.edu.nsw.doe.digital.closed.automation.tests.aem.AemActions;
import org.junit.Test;


public class EventsLandingPageTest extends CapabilitiesBuilder {

    private AemActions action;

    @Override
    public void doSetUp() {
        action = new AemActionMethods(driver);
    }

    @Test
    public void eventLandingPageTemplateTest() throws Exception {
        {
            action.setScreenDimensions();
            action.getPage("sws-component-base","event-landing-template");
            eyes.checkWindow(System.getenv("sws-event-landing-template"));

            eyes.close();
        }
    }
}
