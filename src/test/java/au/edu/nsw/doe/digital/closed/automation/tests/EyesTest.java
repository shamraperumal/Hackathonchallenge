package au.edu.nsw.doe.digital.closed.automation.tests;

import au.edu.nsw.doe.digital.closed.automation.setup.LocalSetup;
import au.edu.nsw.doe.digital.closed.automation.tests.swsedit.PwsActionMethods;
import au.edu.nsw.doe.digital.closed.automation.tests.swsedit.PwsActions;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by christopherpigden on 23/03/2016.
 */
public class EyesTest extends LocalSetup {

    private PwsActions action;

    @Before
    public void doSetUp() { action = new PwsActionMethods(driver);}

    @Test
    public void testEyesTest() throws Exception {
        action.getPage("http://studionedgip", "", "", "");
        eyes.checkWindow("Homepage");
        eyes.close();
    }
}
