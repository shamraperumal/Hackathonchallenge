package au.edu.nsw.doe.digital.closed.automation.tests.squiz.squizpreproduction.desktop;


import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.tests.squiz.SquizActionMethods;
import org.junit.Test;

/**
 * Created by christopherpigden on 17/07/2015.
 */

public class SquizWellbeingPreProductionTest extends CapabilitiesBuilder {

    @Test
    public void wellbeingDesktopPreProductionEyesTest() throws Exception {

        SquizActionMethods squizAction = new SquizActionMethods(driver);

        squizAction.getPage("wellbeing-base", "");
        eyes.checkWindow(System.getenv("EYES-WELLBEING-HOME"));

        squizAction.getPage("wellbeing-base", "wellbeing-about");
        eyes.checkWindow(System.getenv("EYES-WELLBEING-ABOUT"));

        squizAction.getPage("wellbeing-base", "wellbeing-connect");
        eyes.checkWindow(System.getenv("EYES-WELLBEING-CONNECT"));

        squizAction.getPage("wellbeing-base", "wellbeing-antibullying");
        eyes.checkWindow(System.getenv("EYES-WELLBEING-ANTI-BULLYING"));

        eyes.close();

    }
}
