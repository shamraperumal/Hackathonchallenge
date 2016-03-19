package au.edu.nsw.doe.digital.closed.automation.tests.swsview.mobile;

import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.tests.swsedit.PwsActionMethods;
import au.edu.nsw.doe.digital.closed.automation.tests.swsedit.PwsActions;
import org.junit.Test;

/**
 * Created by christopherpigden on 18/03/2016.
 */
public class SwsDesign11MobileTest extends CapabilitiesBuilder {

    private PwsActions action;

    @Override
    public void doSetUp() {
        action = new PwsActionMethods(driver);
    }

    @Test
    public void swsDesign11MobileTest() throws Exception {

        action.getPage("SWS-BASE-VIEW", "sws-design-11", "", "");
        eyes.checkWindow(System.getenv("SWS Design 11"));

        eyes.close();

        }
}
