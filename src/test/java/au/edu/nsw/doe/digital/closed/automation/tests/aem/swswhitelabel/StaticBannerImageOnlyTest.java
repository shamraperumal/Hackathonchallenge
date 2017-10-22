package au.edu.nsw.doe.digital.closed.automation.tests.aem.swswhitelabel;

import au.edu.nsw.doe.digital.closed.automation.pageobjects.swswhitelabel.GlobalElements;
import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import org.junit.Test;
/**
 * Created by kristinamason 13/10/17.
 */
public class StaticBannerImageOnlyTest extends CapabilitiesBuilder {

    private AemActions action;

    @Override
    public void doSetUp() {
        action = new AemActionMethods(driver);
    }

    @Test
    public void staticBannerImageOnlyTest() throws Exception {
        {
            action.setScreenDimensions();
            action.getPage("sws-component-base","sws-static-banner");
            eyes.checkRegion(GlobalElements.bannerStaticImageOnly);


            eyes.close();
        }
    }
}