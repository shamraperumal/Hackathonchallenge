package au.edu.nsw.doe.digital.closed.automation.tests.pwsview;

import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.tests.swsedit.PwsActionMethods;
import org.junit.Test;

/**
 * Created by cpigden on 12/11/2015.
 */
public class PwsDecClicTest extends CapabilitiesBuilder {

    @Test
    public void pwsDecClicTest() throws Exception {

        PwsActionMethods action = new PwsActionMethods(driver);

        action.getPage("DEC-CLIC-BASE-LIVE", "", "", "");
        eyes.checkWindow(System.getenv("EYES-DEC-CLIC-HOMEPAGE"));

        action.getPage("DEC-CLIC-BASE-LIVE", "dec-clic-standard-page", "", "");
        eyes.checkWindow(System.getenv("EYES-DEC-CLIC-STANDARD"));

        action.getPage("DEC-CLIC-BASE-LIVE", "dec-clic-blog-index-page", "", "");
        eyes.checkWindow(System.getenv("EYES-DEC-CLIC-BLOG-INDEX"));

        action.getPage("DEC-CLIC-BASE-LIVE", "dec-clic-blog-article-page", "", "");
        eyes.checkWindow(System.getenv("EYES-DEC-CLIC-BLOG-ARTICLE"));

        eyes.close();
    }
}

