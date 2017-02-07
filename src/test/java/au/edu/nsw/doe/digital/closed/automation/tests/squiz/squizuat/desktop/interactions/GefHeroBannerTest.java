package au.edu.nsw.doe.digital.closed.automation.tests.squiz.squizuat.desktop.interactions;

import au.edu.nsw.doe.digital.closed.automation.pageobjects.squiz.GefGlobalFooter;
import au.edu.nsw.doe.digital.closed.automation.pageobjects.squiz.GefHomepage;
import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.setup.LocalSetup;
import au.edu.nsw.doe.digital.closed.automation.tests.squiz.SquizActionMethods;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by christopherpigden on 16/1/17.
 */
public class GefHeroBannerTest extends LocalSetup {


    @Test
    public void gefEducationDesktopHeroBannerButtonTest() throws Exception {

        SquizActionMethods squizAction = new SquizActionMethods(driver);

        squizAction.getPage("gef-education-base", "");
        squizAction.clickWebElement(GefHomepage.heroBannerButton);
        squizAction.wait(GefGlobalFooter.doELogo);
        Assert.assertEquals("https://uat.education.nsw.gov.au/test-automation/lorem-ipsum",driver.getCurrentUrl());


    }
}
