package au.edu.nsw.doe.digital.closed.automation.tests.squiz.squizhealthyschoolcanteenstemplates.mobile;

import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.tests.squiz.SquizActionMethods;
import org.junit.Test;
import org.openqa.selenium.Dimension;

/**
 * Created by christopherpigden on 21/3/17.
 */
public class SquizHSCMobileTemplateTest extends CapabilitiesBuilder {

    @Test
    public void healthySchoolCanteensMobileTemplateEyesTest() throws Exception {

        SquizActionMethods squizAction = new SquizActionMethods(driver);

        Dimension dimension = new Dimension(375, 650);

        driver.manage().window().setSize(dimension);

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
