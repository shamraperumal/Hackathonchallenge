package au.edu.nsw.doe.digital.closed.automation.tests.aem.swswhitelabel;

import au.edu.nsw.doe.digital.closed.automation.pageobjects.swswhitelabel.GlobalElements;
import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import org.junit.Test;

/**
 * Created by christopherpigden on 8/8/17.
 */
public class LocalHeaderTest extends CapabilitiesBuilder {

    private AemActions action;

    @Override
    public void doSetUp() {
        action = new AemActionMethods(driver);
    }

    @Test
    public void localHeaderTest() throws Exception {
        {
            String device = System.getenv("DEVICE");

            action.setScreenDimensions();

            //Code for desktop tests

            if(device.equals("Desktop")) {

                action.getPage("sws-component-base", "sws-local-header");

                eyes.checkRegion(GlobalElements.localHeader);
            }

            //Code for tablet and mobile tests. Checks the local header at mobile width on the content template.

            if(device.equals("Tablet") || device.equals("Mobile")){

                action.getPage("sws-component-base","sws-content");

                eyes.checkRegion(GlobalElements.mobileLocalHeader);

            }
            eyes.close();
        }
    }
}
