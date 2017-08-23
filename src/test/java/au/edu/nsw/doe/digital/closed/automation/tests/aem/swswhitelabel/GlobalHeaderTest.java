package au.edu.nsw.doe.digital.closed.automation.tests.aem.swswhitelabel;

import au.edu.nsw.doe.digital.closed.automation.pageobjects.swswhitelabel.GlobalElements;
import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import org.junit.Test;

/**
 * Created by christopherpigden on 21/8/17.
 */
public class GlobalHeaderTest extends CapabilitiesBuilder {

    private AemActions action;

    @Override
    public void doSetUp() {
        action = new AemActionMethods(driver);
    }

    @Test
    public void globalHeaderTest() throws Exception {
        {
            action.setScreenDimensions();
            action.getPage("sws-component-base","sws-global-header");
            eyes.checkRegion(GlobalElements.globalHeader);

            action.click(GlobalElements.loginButton);
            eyes.checkRegion(GlobalElements.globalHeader);

            eyes.close();
        }
    }
}
