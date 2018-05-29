package au.edu.nsw.doe.digital.closed.automation.tests.sws.swswhitelabel;

import au.edu.nsw.doe.digital.closed.automation.pageobjects.swswhitelabel.GlobalElements;
import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.tests.sws.AemActionMethods;
import au.edu.nsw.doe.digital.closed.automation.tests.sws.AemActions;
import org.junit.Test;

/**
 * Created by christopherpigden on 8/8/17.
 */
public class GlobalFooterTest extends CapabilitiesBuilder {

    private AemActions action;

    @Override
    public void doSetUp() {
        action = new AemActionMethods(driver);
    }

    @Test
    public void globalFooterTest() throws Exception {

        String thisTheme = System.getenv("ENVIRONMENT");
        if (thisTheme.equals("White-label")) {

            action.setScreenDimensions();
            action.getPage("sws-component-base", "sws-global-footer");
            eyes.checkRegion(GlobalElements.globalFooter);
            eyes.close();

        } else {//Do nothing and end the test}
        }
    }
}
