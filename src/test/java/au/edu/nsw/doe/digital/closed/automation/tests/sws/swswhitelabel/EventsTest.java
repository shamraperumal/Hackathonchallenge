package au.edu.nsw.doe.digital.closed.automation.tests.sws.swswhitelabel;

import au.edu.nsw.doe.digital.closed.automation.pageobjects.swswhitelabel.EventElements;
import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.tests.sws.AemActionMethods;
import au.edu.nsw.doe.digital.closed.automation.tests.sws.AemActions;
import org.junit.Test;

/**
 * Created by christopherpigden on 21/8/17.
 */
public class EventsTest extends CapabilitiesBuilder {

    private AemActions action;
    
    @Override
    public boolean getForceFullPageScreenshot() {
        return false;
    }

    @Override
    public void doSetUp() {
        action = new AemActionMethods(driver);
    }

    @Test
public void eventsTest() throws Exception {
        {
            action.setScreenDimensions();

            action.getPage("sws-component-base","sws-events");

            eyes.checkRegion(EventElements.eventFull);

            eyes.checkRegion(EventElements.eventSixtySix);

            eyes.checkRegion(EventElements.eventThirtyThree);

            eyes.close();
        }
    }
}