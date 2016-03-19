package au.edu.nsw.doe.digital.closed.automation.tests.pwsview;

import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.tests.swsedit.PwsActionMethods;
import org.junit.Test;

/**
 * Created by cpigden on 12/11/2015.
 */
public class PwsDecInternationalTest extends CapabilitiesBuilder {

    @Test
    public void pwsDecInternationalTest() throws Exception {

        PwsActionMethods action = new PwsActionMethods(driver);

        action.getPage("DEC-INTERNATIONAL-BASE-LIVE", "", "", "");
        eyes.checkWindow(System.getenv("EYES-DEC-INTERNATIONAL-HOMEPAGE"));

        action.searchPwsDecInternationalSchoolSearch();
        eyes.checkWindow(System.getenv("EYES-DEC-INTERNATIONAL-SCHOOL-SEARCH"));

        action.getPage("DEC-INTERNATIONAL-BASE-LIVE", "dec-international-section-page", "", "");
        eyes.checkWindow(System.getenv("EYES-DEC-INTERNATIONAL-SECTION"));

        action.searchPwsDecInternationalSearch();
        eyes.checkWindow(System.getenv("EYES-DEC-INTERNATIONAL-GSA-SEARCH"));

        action.getPage("DEC-INTERNATIONAL-BASE-LIVE", "dec-international-standard-page", "", "");
        eyes.checkWindow(System.getenv("EYES-DEC-INTERNATIONAL-STANDARD"));

        eyes.close();
    }
}


