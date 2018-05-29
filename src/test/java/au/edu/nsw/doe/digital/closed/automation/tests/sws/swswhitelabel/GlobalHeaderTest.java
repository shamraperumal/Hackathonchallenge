package au.edu.nsw.doe.digital.closed.automation.tests.aem.swswhitelabel;

import au.edu.nsw.doe.digital.closed.automation.pageobjects.swswhitelabel.GlobalElements;
import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.tests.aem.AemActionMethods;
import au.edu.nsw.doe.digital.closed.automation.tests.aem.AemActions;
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

        String thisTheme = System.getenv("ENVIRONMENT");
        if (thisTheme.equals("White-label")) {

            action.setScreenDimensions();
            action.getPage("sws-component-base", "sws-global-header");
            eyes.checkRegion(GlobalElements.globalHeader);

            action.click(GlobalElements.loginButton);
            eyes.checkRegion(GlobalElements.globalHeaderLinksDropdown);

            eyes.close();
        } else {//Do nothing and end the test}
        }
    }
}
