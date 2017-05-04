package au.edu.nsw.doe.digital.closed.automation.tests.squiz.squizpreproduction.mobile;


import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.tests.squiz.SquizActionMethods;
import org.junit.Test;
import org.openqa.selenium.Dimension;

/**
 * Created by christopherpigden on 17/07/2015.
 */

public class SquizTeachMobilePreProductionTest extends CapabilitiesBuilder {

    @Test
    public void teachMobilePreProductionEyesTest() throws Exception {

        SquizActionMethods squizAction = new SquizActionMethods(driver);

        Dimension dimension = new Dimension(375, 650);

        driver.manage().window().setSize(dimension);

        squizAction.getPage("teach-base", "");
        eyes.checkWindow(System.getenv("EYES-TEACH-HOME"));

        squizAction.getPage("teach-base", "teach-landing-page");
        eyes.checkWindow(System.getenv("EYES-TEACH-LANDING"));

        squizAction.getPage("teach-base", "teach-standard-page");
        eyes.checkWindow(System.getenv("EYES-TEACH-STANDARD"));

        squizAction.getPage("teach-base", "teach-get-paid-to-study-page");
        eyes.checkWindow(System.getenv("EYES-TEACH-GET-PAID-TO-STUDY"));

        squizAction.getPage("teach-base", "teach-program-page");
        eyes.checkWindow(System.getenv("EYES-TEACH-SCHOLARSHIP"));

        squizAction.getPage("teach-base", "teach-faq-page");
        eyes.checkWindow(System.getenv("EYES-TEACH-FAQ"));

        eyes.close();
    }

}