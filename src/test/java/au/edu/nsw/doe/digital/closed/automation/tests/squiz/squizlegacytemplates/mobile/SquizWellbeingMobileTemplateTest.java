package au.edu.nsw.doe.digital.closed.automation.tests.squiz.squizlegacytemplates.mobile;

import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.tests.squiz.SquizActionMethods;
import org.junit.Test;
import org.openqa.selenium.Dimension;

/**
 * Created by cpigden on 11/02/2016.
 */
public class SquizWellbeingMobileTemplateTest extends CapabilitiesBuilder {

    @Test
    public void wellbeingMobileTemplateEyesTest() throws Exception {

        SquizActionMethods squizAction = new SquizActionMethods(driver);

        Dimension dimension = new Dimension(375, 650);

        driver.manage().window().setSize(dimension);

        squizAction.getPage("wellbeing-template-base", "wellbeing-template-homepage");
        eyes.checkWindow(System.getenv("EYES-WELLBEING-HOME"));

        squizAction.getPage("wellbeing-template-base", "wellbeing-template-about");
        eyes.checkWindow(System.getenv("EYES-WELLBEING-ABOUT"));

        squizAction.getPage("wellbeing-template-base", "wellbeing-template-connect");
        eyes.checkWindow(System.getenv("EYES-WELLBEING-CONNECT"));

        squizAction.getPage("wellbeing-template-base", "wellbeing-template-antibullying");
        eyes.checkWindow(System.getenv("EYES-WELLBEING-ANTIBULLYING"));

        squizAction.getPage("wellbeing-template-base", "wellbeing-template-search");
        eyes.checkWindow(System.getenv("EYES-WELLBEING-SEARCH"));

        eyes.close();
    }
}

