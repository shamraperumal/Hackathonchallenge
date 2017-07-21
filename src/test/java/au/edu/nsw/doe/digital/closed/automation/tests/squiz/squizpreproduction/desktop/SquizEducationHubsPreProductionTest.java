package au.edu.nsw.doe.digital.closed.automation.tests.squiz.squizpreproduction.desktop;

import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.tests.squiz.SquizActionMethods;
import au.edu.nsw.doe.digital.closed.automation.tests.swsedit.PwsActionMethods;
import au.edu.nsw.doe.digital.closed.automation.tests.swsedit.PwsActions;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by christopherpigden on 9/09/2015.
 */
public class SquizEducationHubsPreProductionTest extends CapabilitiesBuilder {

    private PwsActions action;

    @Before
    public void doSetUp() { action = new PwsActionMethods(driver);}

    @Test
    public void educationHubsDesktopPreProductionEyesTest() throws Exception {

        SquizActionMethods squizAction = new SquizActionMethods(driver);
        
        squizAction.getPage("education-base", "");
        eyes.checkWindow(System.getenv("EYES-EDUCATION-HOME"));

        action.ssoLoginEntry();

        eyes.checkWindow(System.getenv("EYES-EDUCATION-PRIVATE-PRIMARY-HUB"));

        squizAction.getPage("education-base", "education-primary-hub");
        eyes.checkWindow(System.getenv("EYES-EDUCATION-PRIVATE-PRIMARY-HUB"));

        squizAction.getPage("education-base", "education-secondary-hub");
        eyes.checkWindow(System.getenv("EYES-EDUCATION-SECONDARY-HUB"));

        eyes.close();
    }
    }
