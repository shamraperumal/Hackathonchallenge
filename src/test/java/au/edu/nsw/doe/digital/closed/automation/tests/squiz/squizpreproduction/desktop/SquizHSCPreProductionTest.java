package au.edu.nsw.doe.digital.closed.automation.tests.squiz.squizproduction.desktop;


import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.tests.squiz.SquizActionMethods;
import org.junit.Test;

/**
 * Created by christopherpigden on 9/09/2015.
 */
public class SquizHSCPreProductionTest extends CapabilitiesBuilder {

    @Test
    public void hSCDesktopPreProductionEyesTest() throws Exception {

        SquizActionMethods squizAction = new SquizActionMethods(driver);

        squizAction.getPage("hsc-base", "hsc-home");
        eyes.checkWindow(System.getenv("EYES-HSC-HOME"));

        squizAction.getPage("hsc-base", "hsc-landing");
        eyes.checkWindow(System.getenv("EYES-HSC-LANDING"));

        squizAction.getPage("hsc-base", "hsc-standard");
        eyes.checkWindow(System.getenv("EYES-HSC-Standard"));

        squizAction.getPage("hsc-base", "hsc-catalogue");
        eyes.checkWindow(System.getenv("EYES-HSC-CATALOGUE"));


        eyes.close();
    }
}
