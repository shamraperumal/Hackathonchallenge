package au.edu.nsw.doe.digital.closed.automation.tests.pwsview;

import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.tests.swsedit.PwsActionMethods;
import org.junit.Test;

/**
 * Created by cpigden on 12/11/2015.
 */
public class PwsDecVolunteeringTest extends CapabilitiesBuilder {

    @Test
    public void pwsDecVolunteeringTest() throws Exception {

        PwsActionMethods action = new PwsActionMethods(driver);

        action.getPage("DEC-VOLUNTEERING-BASE-LIVE", "", "", "");
        eyes.checkWindow(System.getenv("EYES-DEC-VOLUNTEERING-HOMEPAGE"));

        action.getPage("DEC-VOLUNTEERING-BASE-LIVE", "dec-volunteering-standard-page", "", "");
        eyes.checkWindow(System.getenv("EYES-DEC-VOLUNTEERING-STANDARD"));

        eyes.close();
    }
}