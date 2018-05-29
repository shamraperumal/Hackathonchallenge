package au.edu.nsw.doe.digital.closed.automation.tests.aem.swsaem;

import au.edu.nsw.doe.digital.closed.automation.pageobjects.swsaem.GlobalElements;
import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.tests.aem.AemActionMethods;
import au.edu.nsw.doe.digital.closed.automation.tests.aem.AemActions;
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

            action.getPage("sws-aem-base","sws-event-detail-v1");
            action.wait(GlobalElements.globalLogo);
            eyes.checkWindow(System.getenv("sws-aem-event-detail-v1"));

            action.getPage("sws-aem-base","sws-event-detail-v2");
            eyes.checkWindow(System.getenv("sws-aem-event-detail-v2"));

            action.getPage("sws-aem-base","sws-event-detail-v3");
            eyes.checkWindow(System.getenv("sws-aem-event-detail-v3"));

            action.getPage("sws-aem-base","sws-event-detail-v4");
            eyes.checkWindow(System.getenv("sws-aem-event-detail-v4"));

            action.getPage("sws-aem-base","sws-event-detail-v5");
            eyes.checkWindow(System.getenv("sws-aem-event-detail-v5"));


            eyes.close();
        }
    }
}
