package au.edu.nsw.doe.digital.closed.automation.tests.squiz.squizpreproduction.mobile;


import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.tests.squiz.SquizActionMethods;
import org.junit.Test;
import org.openqa.selenium.Dimension;

/**
 * Created by christopherpigden on 17/07/2015.
 */

public class SquizWellbeingMobilePreProductionTest extends CapabilitiesBuilder {

    @Test
    public void wellbeingMobilePreProductionEyesTest() throws Exception {

        SquizActionMethods squizAction = new SquizActionMethods(driver);

        Dimension dimension = new Dimension(375, 650);

        driver.manage().window().setSize(dimension);

        squizAction.getPage("wellbeing-base", "");
        eyes.checkWindow("Wellbeing Mobile Production Home");

        squizAction.getPage("wellbeing-base", "wellbeing-about");
        eyes.checkWindow("Wellbeing Mobile Production About");

        squizAction.getPage("wellbeing-base", "wellbeing-connect");
        eyes.checkWindow("Wellbeing Mobile Production Connect");

        squizAction.getPage("wellbeing-base", "wellbeing-antibullying");
        eyes.checkWindow("Welbeing Mobile Production Anti-Bullying");

        eyes.close();

    }
}
