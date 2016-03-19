package au.edu.nsw.doe.digital.closed.automation.tests.squiz.squizlegacytemplates.desktop;

import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.tests.squiz.SquizActionMethods;
import org.junit.Test;

/**
 * Created by cpigden on 11/02/2016.
 */
public class SquizTeachTemplateTest extends CapabilitiesBuilder {

    @Test
    public void teachDesktopTemplateEyesTest() throws Exception {

        SquizActionMethods squizAction = new SquizActionMethods(driver);

        squizAction.getPage("teach-template-base", "teach-template-homepage", "", "");
        eyes.checkWindow(System.getenv("EYES-TEACH-HOME"));

        squizAction.getPage("teach-template-base", "teach-template-contactpage", "", "");
        eyes.checkWindow(System.getenv("EYES-TEACH-CONTACT"));

        squizAction.getPage("teach-template-base", "teach-template-landingpage", "", "");
        eyes.checkWindow(System.getenv("EYES-TEACH-LANDING"));

        squizAction.getPage("teach-template-base", "teach-template-getpaidtostudypage", "", "");
        eyes.checkWindow(System.getenv("EYES-TEACH-GET-PAID-TO-STUDY"));

        squizAction.getPage("teach-template-base", "teach-template-programpage", "", "");
        eyes.checkWindow(System.getenv("EYES-TEACH-PROGRAM"));

        squizAction.getPage("teach-template-base", "teach-template-searchpage", "", "");
        eyes.checkWindow(System.getenv("EYES-TEACH-SEARCH"));

        squizAction.getPage("teach-template-base", "teach-template-standardpage", "", "");
        eyes.checkWindow(System.getenv("EYES-TEACH-STANDARD"));

        squizAction.getPage("teach-template-base", "teach-template-faqpage", "", "");
        eyes.checkWindow(System.getenv("EYES-TEACH-FAQ"));

        squizAction.getPage("teach-template-base", "teach-template-groupfaqpage", "", "");
        eyes.checkWindow(System.getenv("EYES-TEACH-FAQ GROUPED"));

        eyes.close();
    }

}



