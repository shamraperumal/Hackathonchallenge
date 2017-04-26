package au.edu.nsw.doe.digital.closed.automation.tests.squiz.squizhealthyschoolcanteenstemplates.desktop;

import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.tests.squiz.SquizActionMethods;
import org.junit.Test;

/**
 * Created by christopherpigden on 21/3/17.
 */
public class SquizHSCTemplateTest extends CapabilitiesBuilder {

    @Test
    public void healthySchoolCanteensTemplateEyesTest() throws Exception {

        SquizActionMethods squizAction = new SquizActionMethods(driver);

        squizAction.getPage("hsc-template-base", "hsc-template-home");
        eyes.checkWindow(System.getenv("EYES-HSC-HOME"));

        squizAction.getPage("hsc-template-base", "hsc-template-landing");
        eyes.checkWindow(System.getenv("EYES-HSC-LANDING"));

        squizAction.getPage("hsc-template-base", "hsc-template-standard");
        eyes.checkWindow(System.getenv("EYES-HSC-Standard"));

        squizAction.getPage("hsc-template-base", "hsc-template-search");
        eyes.checkWindow(System.getenv("EYES-HSC-SEARCH"));

        squizAction.getPage("hsc-template-base", "hsc-template-news-index");
        eyes.checkWindow(System.getenv("EYES-HSC-NEWS-INDEX"));

        squizAction.getPage("hsc-template-base", "hsc-template-news-article");
        eyes.checkWindow(System.getenv("EYES-HSC-NEWS-ARTICLE"));

        squizAction.getPage("hsc-template-base", "hsc-template-catalogue");
        eyes.checkWindow(System.getenv("EYES-HSC-CATALOGUE"));


        eyes.close();

    }
};
