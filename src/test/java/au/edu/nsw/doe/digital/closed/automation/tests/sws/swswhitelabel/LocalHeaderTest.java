package au.edu.nsw.doe.digital.closed.automation.tests.sws.swswhitelabel;

import au.edu.nsw.doe.digital.closed.automation.pageobjects.swswhitelabel.GlobalElements;
import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.tests.sws.AemActionMethods;
import au.edu.nsw.doe.digital.closed.automation.tests.sws.AemActions;
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

            action.getPage("sws-component-base", "sws-local-header");

            //Code for desktop tests

            if(device.equals("Desktop")) {

                eyes.checkRegion(GlobalElements.localHeader);

                eyes.close();
            }

            //Code for tablet and mobile tests. Checks the local header at mobile width on the content template.

            if(device.equals("Tablet") || device.equals("Mobile")){

                //This component wraps in to the mobile meganav component and is tested there.
                //In this case we will end this test if tablet or mobile are selected as the device.

            }


        }
    }
}
