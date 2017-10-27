package au.edu.nsw.doe.digital.closed.automation.tests.aem.swswhitelabel;

import au.edu.nsw.doe.digital.closed.automation.pageobjects.swswhitelabel.GlobalElements;
import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.tests.aem.AemActionMethods;
import au.edu.nsw.doe.digital.closed.automation.tests.aem.AemActions;
import org.junit.Test;

public class MegaMenuTest extends CapabilitiesBuilder {

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
    public void megaMenuTest() throws Exception {
        {
            String device = System.getenv("DEVICE");

            action.setScreenDimensions();

            action.getPage("sws-component-base","sws-mega-menu");


        // Code for desktop browsers, opens the drop down menu.

            if(device.equals("Desktop")){

            eyes.checkRegion(GlobalElements.megaMenu);

            action.click(GlobalElements.subMenuLink1);

            eyes.checkRegion(GlobalElements.subMenu);

            action.getPage("sws-component-base","sws-mega-menu");

            action.click(GlobalElements.subMenuLink2);

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
