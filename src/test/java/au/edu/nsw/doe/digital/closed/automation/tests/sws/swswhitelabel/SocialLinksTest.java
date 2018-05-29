package au.edu.nsw.doe.digital.closed.automation.tests.sws.swswhitelabel;

import au.edu.nsw.doe.digital.closed.automation.pageobjects.swswhitelabel.GlobalElements;
import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.tests.sws.AemActionMethods;
import au.edu.nsw.doe.digital.closed.automation.tests.sws.AemActions;
import org.junit.Test;

/**
 * Created by christopherpigden on 8/8/17.
 */
public class SocialLinksTest extends CapabilitiesBuilder {

    private AemActions action;

    @Override
    public void doSetUp() {
        action = new AemActionMethods(driver);
    }

    @Test
    public void socialLinksTest() throws Exception {
        {
            action.setScreenDimensions();
            action.getPage("sws-component-base","sws-social-links");
            Thread.sleep(5000);
            eyes.checkRegion(GlobalElements.socialLinksAll);
            eyes.checkRegion(GlobalElements.socialLinksTwo);

            eyes.close();
        }
    }
}
