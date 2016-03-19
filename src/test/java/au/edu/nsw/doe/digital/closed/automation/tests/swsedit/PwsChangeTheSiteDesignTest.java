package au.edu.nsw.doe.digital.closed.automation.tests.swsedit;

import au.edu.nsw.doe.digital.closed.automation.pageobjects.pws.SwsDesignPage;
import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Created by cpigden on 26/11/2015.
 */
public class PwsChangeTheSiteDesignTest extends CapabilitiesBuilder {

    private PwsActions action;

    @Override
    public void doSetUp() {
        action = new PwsActionMethods(driver);
    }

    @Ignore
    @Test
    public void testChangeTheSiteDesign() throws Exception {
        action.ssoLogin();
        action.getPage("SWS-BASE-STAGING", "sws-design", "", "");
        action.killPopup();
        action.pwsChangeSiteDesign(SwsDesignPage.design4, SwsDesignPage.primaryColour1, SwsDesignPage.secondaryColour1);
        Thread.sleep(15000);
        action.getPage("SWS-BASE-LIVE", "", "", "");
        eyes.checkWindow("SWS Change Site Design Test - Design 4");
        action.getPage("SWS-BASE-STAGING", "sws-design", "", "");
        action.pwsChangeSiteDesign(SwsDesignPage.design7, SwsDesignPage.primaryColour2, SwsDesignPage.secondaryColour2);
        Thread.sleep(15000);
        action.getPage("SWS-BASE-LIVE", "", "", "");
        eyes.checkWindow("SWS Change Site Design Test - Design 7");
        eyes.close();
    }

}