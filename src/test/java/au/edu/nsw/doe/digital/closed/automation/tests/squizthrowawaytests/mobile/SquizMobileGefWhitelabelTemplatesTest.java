package au.edu.nsw.doe.digital.closed.automation.tests.squizthrowawaytests.mobile;

import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.tests.squiz.SquizActionMethods;
import org.junit.Test;

/**
 * Created by cpigden on 5/02/2016.
 */
public class SquizMobileGefWhitelabelTemplatesTest extends CapabilitiesBuilder {

    @Test
    public void gefWhitelabelTemplatesMobileTest() throws Exception {
        SquizActionMethods squizAction = new SquizActionMethods(driver);

        squizAction.getPage("gef-components-base", "gef-whitelabel-sectionhome");
        eyes.checkWindow(System.getenv("EYES-GEF-WHITELABEL-SECTION-HOME"));

        squizAction.getPage("gef-components-base", "gef-whitelabel-landing");
        eyes.checkWindow(System.getenv("EYES-GEF-WHITELABEL-LANDING"));

        squizAction.getPage("gef-components-base", "gef-whitelabel-standard");
        eyes.checkWindow(System.getenv("EYES-GEF-WHITELABEL-STANDARD"));

        squizAction.getPage("gef-components-base", "gef-whitelabel-catalogue");
        eyes.checkWindow(System.getenv("EYES-GEF-WHITELABEL-CATALOGUE"));

        squizAction.getPage("gef-components-base", "gef-whitelabel-az");
        eyes.checkWindow(System.getenv("EYES-GEF-WHITELABEL-AZ"));

        squizAction.getPage("gef-components-base", "gef-whitelabel-newsindex");
        eyes.checkWindow(System.getenv("EYES-GEF-WHITELABEL-NEWS-INDEX"));

        squizAction.getPage("gef-components-base", "gef-whitelabel-newsarticle");
        eyes.checkWindow(System.getenv("EYES-GEF-WHITELABEL-NEWS-ARTICLE"));

        squizAction.getPage("gef-components-base", "gef-whitelabel-search");
        eyes.checkWindow(System.getenv("EYES-GEF-WHITELABEL-SEARCH"));


        eyes.close();
    }


}


