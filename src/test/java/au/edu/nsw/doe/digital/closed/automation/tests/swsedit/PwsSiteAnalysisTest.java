package au.edu.nsw.doe.digital.closed.automation.tests.swsedit;

import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.setup.LocalSetup;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by cpigden on 11/12/2015.
 */
public class PwsSiteAnalysisTest extends LocalSetup {

    private PwsActions action;

    @Before
    public void doSetUp() { action = new PwsActionMethods(driver);}

    @Test
    public void testPwsSiteAnalysis() throws Exception {

        action.ssoLogin();

        action.getPage("SWS-BASE-STAGING", "SWS-SITE-ANALYSIS", "", "");

        action.killPopup();

        eyes.checkWindow(System.getenv("EYES-SWS-SITE-ANALYSIS"));

        eyes.close();

    }
}

