package au.edu.nsw.doe.digital.closed.automation.tests.squiz.squizuat.desktop.interactions;

import au.edu.nsw.doe.digital.closed.automation.pageobjects.squiz.GefEdConnect;
import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.tests.squiz.SquizActionMethods;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by christopherpigden on 7/2/17.
 */
public class GefEdConnectDrawerTest extends CapabilitiesBuilder{

    @Override
    public boolean getForceFullPageScreenshot() {
        return false;
    }

    @Test
    public void gefEducationDesktopEdConnectDrawerTest() throws Exception {


        SquizActionMethods squizAction = new SquizActionMethods(driver);
        squizAction.getPage("gef-education-base", "");
        squizAction.clickWebElement(GefEdConnect.edConnectButton);
        try{
            String ariaExpanded = driver.findElement(GefEdConnect.edConnectButton).getAttribute("aria-expanded");
            Assert.assertEquals("true", ariaExpanded);
            System.out.println("Aria expanded ="+ ariaExpanded);
            eyes.checkRegion(GefEdConnect.edConnect);
        }catch (final Exception e){
            System.out.println("Ed Connect is not expanded");
            throw e;
        }


        }
}
