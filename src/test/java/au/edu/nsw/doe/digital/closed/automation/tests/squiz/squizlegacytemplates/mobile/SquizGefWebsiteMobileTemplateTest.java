package au.edu.nsw.doe.digital.closed.automation.tests.squiz.squizlegacytemplates.mobile;

import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.tests.squiz.SquizActionMethods;
import org.junit.Test;
import org.openqa.selenium.Dimension;

/**
 * Created by cpigden on 11/02/2016.
 */
public class SquizGefWebsiteMobileTemplateTest extends CapabilitiesBuilder {

    @Test
    public void gefMobileTemplateEyesTest() throws Exception {

        SquizActionMethods squizAction = new SquizActionMethods(driver);

        Dimension dimension = new Dimension(375, 650);

        driver.manage().window().setSize(dimension);

        squizAction.getPage("gef-website-template-base", "gef-website-template-homepage");
        eyes.checkWindow(System.getenv("EYES-GEF-WEBSITE-HOME"));

        squizAction.getPage("gef-website-template-base", "gef-website-template-standardpage");
        eyes.checkWindow(System.getenv("EYES-GEF-WEBSITE-STANDARD"));

        squizAction.getPage("gef-website-template-base", "gef-website-template-digitalfoundationspage");
        eyes.checkWindow(System.getenv("EYES-GEF-WEBSITE-DIGITAL-FOUNDATIONS"));

        squizAction.getPage("gef-website-template-base", "gef-website-template-landingpage");
        eyes.checkWindow(System.getenv("EYES-GEF-WEBSITE-LANDING"));

        squizAction.getPage("gef-website-template-base", "gef-website-template-newsindexpage");
        eyes.checkWindow(System.getenv("EYES-GEF-WEBSITE-NEWS-INDEX"));

        squizAction.getPage("gef-website-template-base", "gef-website-template-newsarticlepage");
        eyes.checkWindow(System.getenv("EYES-GEF-WEBSITE-NEWS-ARTICLE"));

        eyes.close();
    }

}