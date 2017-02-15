package au.edu.nsw.doe.digital.closed.automation.tests.squiz.squizuat.desktop.interactions;

import au.edu.nsw.doe.digital.closed.automation.pageobjects.squiz.GefEdConnect;
import au.edu.nsw.doe.digital.closed.automation.pageobjects.squiz.GefHomepage;
import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.setup.LocalSetup;
import au.edu.nsw.doe.digital.closed.automation.tests.squiz.SquizActionMethods;
import org.junit.Assert;
import org.junit.Test;
import au.edu.nsw.doe.digital.closed.automation.setup.Setup;

/**
 * Created by christopherpigden on 7/2/17.
 */
public class GefEdConnectDrawerTest extends CapabilitiesBuilder{


    @Test
    public void gefEducationDesktopEdConnectDrawerTest() throws Exception {

        SquizActionMethods squizAction = new SquizActionMethods(driver);
        squizAction.getPage("gef-education-base", "");
//        squizAction.maximiseWindow();
//        driver.get("https://uat.education.nsw.gov.au/test-automation");

        squizAction.clickWebElement(GefEdConnect.edConnectButton);
        try{
            String ariaExpanded = driver.findElement(GefEdConnect.edConnectButton).getAttribute("aria-expanded");
            Assert.assertEquals("true", ariaExpanded);
            eyes.setForceFullPageScreenshot(false);
            eyes.checkRegion(GefEdConnect.edConnect);
            eyes.close();
            System.out.println("Aria expanded ="+ariaExpanded);

        }catch (final Exception e){
            System.out.println("Ed Connect is not expanded");
            throw e;
        }


        }
}
