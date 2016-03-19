package au.edu.nsw.doe.digital.closed.automation.tests.pwsview;

import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.tests.swsedit.PwsActionMethods;
import org.junit.Test;

/**
 * Created by cpigden on 12/11/2015.
 */
public class PwsDecScanTest extends CapabilitiesBuilder {
    @Test
    public void pwsDecScanTest() throws Exception {

        PwsActionMethods action = new PwsActionMethods(driver);

        action.getPage("DEC-SCAN-BASE-LIVE", "", "", "");
        eyes.checkWindow(System.getenv("EYES-DEC-SCAN-HOMEPAGE"));

        action.getPage("DEC-SCAN-BASE-LIVE", "dec-scan-standard-page", "", "");
        eyes.checkWindow(System.getenv("EYES-DEC-SCAN-STANDARD"));

        eyes.close();
    }
}