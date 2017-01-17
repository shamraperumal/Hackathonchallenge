package au.edu.nsw.doe.digital.closed.automation.tests.squiz.squizuat.desktop.interactions;

import au.edu.nsw.doe.digital.closed.automation.pageobjects.squiz.GefShowHide;
import au.edu.nsw.doe.digital.closed.automation.pageobjects.squiz.GefTab;
import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.setup.LocalSetup;
import au.edu.nsw.doe.digital.closed.automation.tests.squiz.SquizActionMethods;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by christopherpigden on 16/1/17.
 */
public class GefTabTest extends CapabilitiesBuilder {


    @Test
    public void gefEducationDesktopTabTest() throws Exception {

        SquizActionMethods squizAction = new SquizActionMethods(driver);

       // squizAction.getPage("gef-education-base", "gef-education-standard");
        driver.get("https://uat.education.nsw.gov.au/test-automation/landing/test-1/_nocache");

        squizAction.tab();

        try {
            Assert.assertTrue(driver.findElement(GefTab.tab).getAttribute("aria-expanded").equals("true"));
            System.out.println("aria-expanded equals true");

        }catch(Exception e){
            System.out.println("aria-expanded does not equal true");
            throw e;
        }

        try {
            Assert.assertEquals("Tab 2 Content", driver.findElement(GefTab.tabContent).getText());
            System.out.println("Expected text was found");

        }catch(Exception e){
            System.out.println("Expected text was not found");
            throw e;
        }
    }
}
