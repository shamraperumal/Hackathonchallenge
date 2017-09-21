package au.edu.nsw.doe.digital.closed.automation.tests.aem.swswhitelabel;

import au.edu.nsw.doe.digital.closed.automation.pageobjects.swswhitelabel.GlobalElements;
import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import org.junit.Test;

/**
 * Created by christopherpigden on 8/8/17.
 */
public class QuickLinksMandatoryTest extends CapabilitiesBuilder {

    private AemActions action;

    @Override
    public void doSetUp() {
        action = new AemActionMethods(driver);
    }

    @Test
    public void quickLinksMandatoryTest() throws Exception {
        {
            action.setScreenDimensions();
            action.getPage("sws-component-base","sws-quick-links-mandatory");
            eyes.checkRegion(GlobalElements.mandatoryQuickLinks);

            eyes.close();
        }
    }
}
