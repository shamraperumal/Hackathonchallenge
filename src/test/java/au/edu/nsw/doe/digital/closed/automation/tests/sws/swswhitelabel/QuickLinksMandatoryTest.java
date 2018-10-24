package au.edu.nsw.doe.digital.closed.automation.tests.sws.swswhitelabel;

import au.edu.nsw.doe.digital.closed.automation.pageobjects.swswhitelabel.GlobalElements;
import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.tests.sws.AemActionMethods;
import au.edu.nsw.doe.digital.closed.automation.tests.sws.AemActions;
import org.junit.Test;

/**
 * Created by christopherpigden on 8/8/17.
 */
public class QuickLinksMandatoryTest extends CapabilitiesBuilder {

    private AemActions action;

    @Override
    public void doSetUp() {
        action = new AemActionMethods(driver);
    }

    @Test
    public void quickLinksMandatoryTest() throws Exception {
        {
            String device = System.getenv("DEVICE");

            action.setScreenDimensions();

            action.getPage("sws-component-base","sws-quick-links-mandatory");


            //Code for desktop tests

            if(device.equals("Desktop")) {

                eyes.checkRegion(GlobalElements.mandatoryQuickLinks);

                eyes.close();
            }

            //Code for tablet and mobile tests. Checks the local header at mobile width on the content template.

            if(device.equals("Mobile")|| device.equals("Tablet")){

                //This component does not display on mobile or tablet.
                //In this case we will end this test if tablet or mobile are selected as the device.

            }


        }
    }
}