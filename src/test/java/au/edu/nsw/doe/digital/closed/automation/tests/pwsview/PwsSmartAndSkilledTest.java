package au.edu.nsw.doe.digital.closed.automation.tests.pwsview;

import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.tests.swsedit.PwsActionMethods;
import org.junit.Test;

/**
 * Created by cpigden on 11/11/2015.
 */
public class PwsSmartAndSkilledTest extends CapabilitiesBuilder {
    @Test
    public void pwsSmartAndSkilledTest() throws Exception {

        PwsActionMethods action = new PwsActionMethods(driver);

        action.getPage("SMART-AND-SKILLED-BASE-LIVE", "", "", "");
        eyes.checkWindow(System.getenv("EYES-DEC-SMART-AND-SKILLED-HOMEPAGE"));

        action.getPage("SMART-AND-SKILLED-BASE-LIVE", "smart-and-skilled-section-page", "", "");
        eyes.checkWindow(System.getenv("  EYES-DEC-SMART-AND-SKILLED-SECTION"));

        action.getPage("SMART-AND-SKILLED-BASE-LIVE", "smart-and-skilled-standard-page", "", "");
        eyes.checkWindow(System.getenv("EYES-DEC-SMART-AND-SKILLED-STANDARD"));

        action.getPage("SMART-AND-SKILLED-BASE-LIVE", "smart-and-skilled-find-a-course-page", "", "");
        eyes.checkWindow(System.getenv("EYES-DEC-SMART-AND-SKILLED-FIND-A-COURSE"));

        action.getPage("SMART-AND-SKILLED-BASE-LIVE", "smart-and-skilled-course-page", "", "");
        eyes.checkWindow(System.getenv("EYES-DEC-SMART-AND-SKILLED-COURSE"));

        eyes.close();
    }
}

