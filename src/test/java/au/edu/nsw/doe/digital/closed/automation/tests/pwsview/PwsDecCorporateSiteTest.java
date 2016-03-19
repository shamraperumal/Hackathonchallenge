package au.edu.nsw.doe.digital.closed.automation.tests.pwsview;

import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.tests.swsedit.PwsActionMethods;
import org.junit.Test;

/**
 * Created by cpigden on 11/11/2015.
 */
public class PwsDecCorporateSiteTest extends CapabilitiesBuilder {

    @Test
    public void pwsDecCorporateSiteTest() throws Exception {

        PwsActionMethods action = new PwsActionMethods(driver);

        action.getPage("DEC-CORPORATE-SITE-BASE-LIVE", "", "", "");
        eyes.checkWindow(System.getenv("EYES-DEC-CORPORATE-HOMEPAGE"));

        action.searchPwsDecCorporateSite();
        eyes.checkWindow(System.getenv("EYES-DEC-CORPORATE-SEARCH-RESULTS"));

        action.getPage("DEC-CORPORATE-SITE-BASE-LIVE", "dec-corporate-site-section-page", "", "");
        eyes.checkWindow(System.getenv("EYES-DEC-CORPORATE-SECTION"));

        action.getPage("DEC-CORPORATE-SITE-BASE-LIVE", "dec-corporate-site-standard-page", "", "");
        eyes.checkWindow(System.getenv("EYES-DEC-CORPORATE-STANDARD"));

        action.getPage("DEC-CORPORATE-SITE-BASE-LIVE", "dec-corporate-site-dg-blog-index", "", "");
        eyes.checkWindow(System.getenv("EYES-DEC-CORPORATE-DGBLOG-INDEX"));

        action.searchPwsDecCorporateSiteDgBlog();
        eyes.checkWindow(System.getenv("EYES-DEC-CORPORATE-BLOG-SEARCH"));

        action.getPage("DEC-CORPORATE-SITE-BASE-LIVE", "dec-corporate-site-dg-blog-article", "", "");
        eyes.checkWindow(System.getenv("EYES-DEC-CORPORATE-BLOG-ARTICLE"));

        eyes.close();
    }
}

