package au.edu.nsw.doe.digital.closed.automation.tests.squiz.squizuat.desktop.interactions;

import au.edu.nsw.doe.digital.closed.automation.pageobjects.squiz.GefHomepage;
import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.setup.LocalSetup;
import au.edu.nsw.doe.digital.closed.automation.tests.squiz.SquizActionMethods;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by christopherpigden on 16/1/17.
 */
public class GefProvideFeedbackButtonTest extends LocalSetup {


    @Test
    public void gefEducationProvideFeedbackButtonTest() throws Exception {

        SquizActionMethods squizAction = new SquizActionMethods(driver);

        squizAction.getPage("gef-education-base", "");
        driver.get("https://uat.education.nsw.gov.au/test-automation");
        squizAction.clickWebElement(GefHomepage.provideFeedbackButton);
        driver.switchTo().frame("atlwdg-frame");
        Assert.assertEquals("Got feedback?",driver.findElement(GefHomepage.provideFeedbackDialogue).getText());


    }
}
