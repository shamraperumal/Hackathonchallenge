package au.edu.nsw.doe.digital.closed.automation.tests.squiz.squizproduction.desktop;


import au.edu.nsw.doe.digital.closed.automation.setup.TestBase;
import au.edu.nsw.doe.digital.closed.automation.tests.squiz.SquizActionMethods;
import org.junit.Test;

/**
 * Created by christopherpigden on 17/07/2015.
 */

public class SquizGefWebsiteProductionTest extends TestBase {
    public SquizGefWebsiteProductionTest(String os,
                                   String version, String browser, String deviceName, String deviceOrientation) {
        super(os, version, browser, deviceName, deviceOrientation);
    }
    @Test
    public void gefWebsiteDesktopProductionEyesTest() throws Exception {

        SquizActionMethods squizAction = new SquizActionMethods(driver);

        squizAction.getPage("gef-website-base", "");
        //eyes.checkWindow(System.getenv("EYES-GEF-WEBSITE-HOME"));

        squizAction.getPage("gef-website-base", "gef-website-landing-page");
        //eyes.checkWindow(System.getenv("EYES-GEF-WEBSITE-LANDING"));

        squizAction.getPage("gef-website-base", "gef-website-standard-page");
        //eyes.checkWindow(System.getenv("EYES-GEF-WEBSITE-STANDARD"));

        squizAction.getPage("gef-website-base", "gef-website-digital-ecosystem-education-theme");
        //eyes.checkWindow(System.getenv("EYES-GEF-WEBSITE-DIGITAL-ECO-EDUCATION-THEME"));

        squizAction.getPage("gef-website-base", "gef-website-pattern-library-component");
        //eyes.checkWindow(System.getenv("EYES-GEF-WEBSITE-PATTERN-COMPONENT"));

        //eyes.close();

    }

}
