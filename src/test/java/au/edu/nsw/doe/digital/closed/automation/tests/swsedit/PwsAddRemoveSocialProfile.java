package au.edu.nsw.doe.digital.closed.automation.tests.swsedit;

import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by kmason26 on 12/01/2016.
 */
public class PwsAddRemoveSocialProfile extends CapabilitiesBuilder {

    private PwsActions action;

    @Before
    public void doSetUp() { action = new PwsActionMethods(driver);}

    @Test

    public void testPwsAddRemoveSocialProfile() throws Exception {

        action.ssoLogin();

        action.getPage("SWS-BASE-STAGING", "SWS-SOCIAL-PROFILE", "", "");

        action.pwsAddSocial("twitter", "SWS-TWITTER-ACCOUNT");

        action.pwsAddSocial("facebook", "SWS-FACEBOOK-ACCOUNT");

        action.pwsPublishSocialProfile();

        action.getPage("SWS-BASE-LIVE", "", "", "");

        eyes.checkWindow(System.getenv("EYES-SWS-SOCIAL-PROFILE"));

        action.getPage("SWS-BASE-STAGING", "SWS-SOCIAL-PROFILE", "", "");

        action.pwsDeleteSocial();

        action.pwsDeleteSocial();

        action.pwsPublishSocialProfile();

        action.getPage("SWS-BASE-LIVE", "", "", "");

        eyes.checkWindow(System.getenv("EYES-SWS-REMOVED-SOCIAL-PROFILE"));

        eyes.close();
    }
}