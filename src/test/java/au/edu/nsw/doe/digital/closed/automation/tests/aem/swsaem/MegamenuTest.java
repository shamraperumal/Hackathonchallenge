package au.edu.nsw.doe.digital.closed.automation.tests.aem.swsaem;

import au.edu.nsw.doe.digital.closed.automation.pageobjects.swsaem.GlobalElements;
import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.tests.aem.AemActionMethods;
import au.edu.nsw.doe.digital.closed.automation.tests.aem.AemActions;
import org.junit.Test;


public class MegamenuTest extends CapabilitiesBuilder {

    private AemActions action;

    @Override
    public void doSetUp() {
        action = new AemActionMethods(driver);
    }

    @Test
    public void MegamenuTest() throws Exception {
        {
            String device = System.getenv("DEVICE");

            action.setScreenDimensions();


            action.getPage("sws-aem-base","sws-homepage");


            // Code for desktop browsers, opens the drop down menu.

            if(device.equals("Desktop")){

                eyes.checkRegion(GlobalElements.megaMenu);

                action.click(GlobalElements.subMenuLink1);

                eyes.checkRegion(GlobalElements.subMenu);
                

            }

            //Code for tablet and mobile.

            if(device.equals("Tablet") || device.equals("Mobile")){

                eyes.checkRegion(GlobalElements.megaMobileMenu);

                action.click(GlobalElements.mobileMegaMenu);

                eyes.checkRegion(GlobalElements.mobileNavExpanded);

            }

            eyes.close();
        }
    }
}
