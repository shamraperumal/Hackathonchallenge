package au.edu.nsw.doe.digital.closed.automation.tests.aem.swswhitelabel;

import au.edu.nsw.doe.digital.closed.automation.pageobjects.swswhitelabel.GlobalElements;
import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import org.junit.Test;

/**
 * Created by christopherpigden on 8/8/17.
 */
public class LocalHeaderTest extends CapabilitiesBuilder {

    private AemActions action;

    @Override
    public void doSetUp() {
        action = new AemActionMethods(driver);
    }

    @Test
    public void localHeaderTest() throws Exception {
        {
            action.setScreenDimensions("DEVICE");
            action.getPage("sws-component-base","sws-local-header");
            eyes.checkRegion(GlobalElements.localHeader);

            eyes.close();
        }
    }
}
