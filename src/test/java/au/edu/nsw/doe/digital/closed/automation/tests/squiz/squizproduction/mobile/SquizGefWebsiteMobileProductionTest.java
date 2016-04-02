package au.edu.nsw.doe.digital.closed.automation.tests.squiz.squizproduction.mobile;


import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.tests.squiz.SquizActionMethods;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.Dimension;

/**
 * Created by christopherpigden on 17/07/2015.
 */

public class SquizGefWebsiteMobileProductionTest extends CapabilitiesBuilder {
    @Ignore
    @Test
    public void gefWebsiteMobileProductionEyesTest() throws Exception {

        SquizActionMethods squizAction = new SquizActionMethods(driver);

        Dimension dimension = new Dimension(375, 650);

        driver.manage().window().setSize(dimension);

        squizAction.getPage("gef-website-base", "");
        eyes.checkWindow(System.getenv("EYES-GEF-WEBSITE-HOME"));

        squizAction.getPage("gef-website-base", "gef-website-landing-page");
        eyes.checkWindow(System.getenv("EYES-GEF-WEBSITE-LANDING"));

        squizAction.getPage("gef-website-base", "gef-website-standard-page");
        eyes.checkWindow(System.getenv("EYES-GEF-WEBSITE-STANDARD"));

        squizAction.getPage("gef-website-base", "gef-website-digital-ecosystem-education-theme");
        eyes.checkWindow(System.getenv("EYES-GEF-WEBSITE-DIGITAL-ECO-EDUCATION-THEME"));

        squizAction.getPage("gef-website-base", "gef-website-pattern-library-component");
        eyes.checkWindow(System.getenv("EYES-GEF-WEBSITE-PATTERN-COMPONENT"));

        eyes.close();

    }

}
