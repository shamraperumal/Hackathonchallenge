package au.edu.nsw.doe.digital.closed.automation.tests.squiz.squizuat.desktop.interactions;

import au.edu.nsw.doe.digital.closed.automation.pageobjects.squiz.GefHeroBanner;
import au.edu.nsw.doe.digital.closed.automation.pageobjects.squiz.GefTab;
import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.setup.LocalSetup;
import au.edu.nsw.doe.digital.closed.automation.tests.squiz.SquizActionMethods;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

/**
 * Created by christopherpigden on 16/1/17.
 */
public class GefHeroBannerTest extends CapabilitiesBuilder {


    @Test
    public void gefEducationHeroBannerButtonTest() throws Exception {

        SquizActionMethods squizAction = new SquizActionMethods(driver);

        squizAction.getPage("gef-education-base", "");
        squizAction.clickWebElement(GefHeroBanner.heroBannerButton);
        Assert.assertEquals("https://uat.education.nsw.gov.au/test-automation/lorem-ipsum",driver.getCurrentUrl());


    }
}
