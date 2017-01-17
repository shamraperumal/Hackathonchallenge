package au.edu.nsw.doe.digital.closed.automation.tests.squiz.squizuat.desktop.interactions;

import au.edu.nsw.doe.digital.closed.automation.pageobjects.squiz.GefShowHide;
import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.setup.LocalSetup;
import au.edu.nsw.doe.digital.closed.automation.tests.squiz.SquizActionMethods;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

/**
 * Created by christopherpigden on 16/1/17.
 */
public class GefShowHideTest extends CapabilitiesBuilder {


    @Test
    public void gefEducationDesktopShowHideTest() throws Exception {

        SquizActionMethods squizAction = new SquizActionMethods(driver);

        squizAction.getPage("gef-education-base", "gef-education-standard");

        squizAction.showHide();

        squizAction.wait(GefShowHide.showHide1);

        try {
            Assert.assertTrue(driver.findElement(GefShowHide.showHide1).getAttribute("aria-expanded").equals("true"));
            System.out.println("aria-expanded equals true");

        }catch(Exception e){
            System.out.println("aria-expanded does not equal true");
            throw e;
        }

        try {
            Assert.assertEquals("SH Content 1", driver.findElement(GefShowHide.showHideContent1).getText());
            System.out.println("Expected text was found");

        }catch(Exception e){
            System.out.println("Expected text was not found");
            throw e;
        }
    }
}
