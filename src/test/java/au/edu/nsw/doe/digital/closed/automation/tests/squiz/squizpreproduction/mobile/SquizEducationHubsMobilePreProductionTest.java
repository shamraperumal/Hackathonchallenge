package au.edu.nsw.doe.digital.closed.automation.tests.squiz.squizpreproduction.mobile;

import au.edu.nsw.doe.digital.closed.automation.pageobjects.squiz.GefInsideTheDepartment;
import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.tests.squiz.SquizActionMethods;
import org.junit.Test;

/**
 * Created by christopherpigden on 9/09/2015.
 */
public class SquizEducationHubsMobilePreProductionTest extends CapabilitiesBuilder {

    @Test
    public void educationHubsMobilePreProductionEyesTest() throws Exception {

        SquizActionMethods squizAction = new SquizActionMethods(driver);

        squizAction.getPage("education-base", "");
        eyes.checkWindow(System.getenv("EYES-EDUCATION-HOME"));

        squizAction.ssoLoginEntry();
        squizAction.wait(GefInsideTheDepartment.searchButton);
        eyes.checkWindow(System.getenv("EYES-EDUCATION-PRIVATE-PRIMARY-HUB"));

        squizAction.getPage("education-base", "education-primary-hub");
        eyes.checkWindow(System.getenv("EYES-EDUCATION-PRIVATE-PRIMARY-HUB"));

        squizAction.getPage("education-base", "education-secondary-hub");
        eyes.checkWindow(System.getenv("EYES-EDUCATION-SECONDARY-HUB"));

        squizAction.getPage("education-base", "education-news-hub");
        eyes.checkWindow(System.getenv("EYES-EDUCATION-NEWS-HUB"));

        squizAction.getPage("education-base", "education-secretary-hub");
        eyes.checkWindow(System.getenv("EYES-EDUCATION-SECRETARY-HUB"));

        eyes.close();
    }
    }
