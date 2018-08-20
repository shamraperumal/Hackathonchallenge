package au.edu.nsw.doe.digital.closed.automation.tests.sws.swswhitelabel;

import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.tests.sws.AemActionMethods;
import au.edu.nsw.doe.digital.closed.automation.tests.sws.AemActions;
import org.junit.Test;

/**
 * Created by kristinamason on 10/10/17.
 */
public class GlobalTemplateTest extends CapabilitiesBuilder {

    private AemActions action;

    @Override
    public void doSetUp() {
        action = new AemActionMethods(driver);
    }

    @Test
    public void globalTemplateTest() throws Exception {
        {
            action.setScreenDimensions();
            action.getPage("sws-component-base","global-template");
            eyes.checkWindow(System.getenv("sws-global-template"));

            eyes.close();
        }
    }
}
