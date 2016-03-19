package au.edu.nsw.doe.digital.closed.automation.tests.pwsview;

import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.tests.swsedit.PwsActionMethods;
import org.junit.Test;

/**
 * Created by cpigden on 12/11/2015.
 */
public class PwsDecSchoolAToZTest extends CapabilitiesBuilder {

    @Test
    public void pwsDecSchoolAToZTest() throws Exception {

        PwsActionMethods action = new PwsActionMethods(driver);

        action.getPage("DEC-SCHOOLS-A-TO-Z-BASE-LIVE", "", "", "");
        eyes.checkWindow(System.getenv("Dec School A - Z Production Homepage"));

        action.getPage("DEC-SCHOOLS-A-TO-Z-BASE-LIVE", "dec-schools-a-to-z-standard-page", "", "");
        eyes.checkWindow(System.getenv("EYES-DEC-SCHOOL-A-Z-STANDARD"));

        action.getPage("DEC-SCHOOLS-A-TO-Z-BASE-LIVE", "dec-schools-a-to-z-index", "", "");
        eyes.checkWindow(System.getenv("EYES-DEC-SCHOOL-A-Z-INDEX"));

        action.getPage("DEC-SCHOOLS-A-TO-Z-BASE-LIVE", "dec-schools-a-to-z-index-child-page", "", "");
        eyes.checkWindow(System.getenv("EYES-DEC-SCHOOL-A-Z-INDEX-CHILD"));

        action.getPage("DEC-SCHOOLS-A-TO-Z-BASE-LIVE", "dec-schools-a-to-z-glossary-index", "", "");
        eyes.checkWindow(System.getenv("EYES-DEC-SCHOOL-A-Z-GLOSSARY-INDEX"));

        action.getPage("DEC-SCHOOLS-A-TO-Z-BASE-LIVE", "dec-schools-a-to-z-glossary-article", "", "");
        eyes.checkWindow(System.getenv("EYES-DEC-SCHOOL-A-Z-GLOSSARY-ARTICLE"));
        eyes.close();
    }
}

