package au.edu.nsw.doe.digital.closed.automation.tests.aem.swsaemstaging;

import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.tests.aem.AemActionMethods;
import au.edu.nsw.doe.digital.closed.automation.tests.aem.AemActions;
import org.junit.Test;


public class HomepageTest extends CapabilitiesBuilder {

    private AemActions action;

    @Override
    public void doSetUp() {
        action = new AemActionMethods(driver);
    }

    @Test
    public void HomepageTest() throws Exception {
        {
            action.setScreenDimensions();

            action.getPage("sws-aem-base-1","homepage-1");
            eyes.checkWindow(System.getenv("sws-aem-homepage-1"));
            
            eyes.close();
        }
    }
}