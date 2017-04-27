package au.edu.nsw.doe.digital.closed.automation.tests.squiz.squizproduction.mobile;


import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.tests.squiz.SquizActionMethods;
import org.junit.Test;

/**
 * Created by christopherpigden on 9/09/2015.
 */
public class SquizHSCMobileProductionTest extends CapabilitiesBuilder {

    @Test
    public void squizHSCMobileProductionEyesTest() throws Exception {

        SquizActionMethods squizAction = new SquizActionMethods(driver);

        squizAction.getPage("hsc-template-base", "hsc-template-home");
        eyes.checkWindow(System.getenv("EYES-HSC-HOME"));

        squizAction.getPage("hsc-template-base", "hsc-template-landing");
        eyes.checkWindow(System.getenv("EYES-HSC-LANDING"));

        squizAction.getPage("hsc-template-base", "hsc-template-standard");
        eyes.checkWindow(System.getenv("EYES-HSC-Standard"));

        squizAction.getPage("hsc-template-base", "hsc-template-catalogue");
        eyes.checkWindow(System.getenv("EYES-HSC-CATALOGUE"));


        eyes.close();
    }
}
