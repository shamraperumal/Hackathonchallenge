package au.edu.nsw.doe.digital.closed.automation.tests.aem.swswhitelabel;

import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.tests.aem.AemActionMethods;
import au.edu.nsw.doe.digital.closed.automation.tests.aem.AemActions;
import org.junit.Test;

/**
 * Created by christopherpigden on 8/8/17.
 */
public class ContactTest extends CapabilitiesBuilder {

    private AemActions action;

    @Override
    public void doSetUp() {
        action = new AemActionMethods(driver);
    }

    @Test
    public void contactTest() throws Exception {
        {
            action.setScreenDimensions();

            action.getPage("sws-component-base","sws-contact-single");
            eyes.checkWindow(System.getenv("sws-contact-single-template"));

            action.getPage("sws-component-base","sws-contact-multi");
            eyes.checkWindow(System.getenv("sws-contact-multi-template"));

            eyes.close();
        }
    }
}
