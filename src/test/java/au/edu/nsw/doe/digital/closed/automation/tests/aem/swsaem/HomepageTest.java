package au.edu.nsw.doe.digital.closed.automation.tests.aem.swsaem;

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
    public void homePageTest() throws Exception {
        {
            action.setScreenDimensions();

            action.getPage("sws-aem-base","sws-homepage");
            eyes.checkWindow(System.getenv("sws-aem-homepage"));
            
            eyes.close();
        }
    }
}
