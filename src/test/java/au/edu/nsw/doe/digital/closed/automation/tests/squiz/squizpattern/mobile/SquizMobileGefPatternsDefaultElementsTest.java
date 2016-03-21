package au.edu.nsw.doe.digital.closed.automation.tests.squiz.squizpattern.mobile;

import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.tests.squiz.SquizActionMethods;
import org.junit.Test;
import org.openqa.selenium.Dimension;

/**
 * Created by cpigden on 5/02/2016.
 */
public class SquizMobileGefPatternsDefaultElementsTest extends CapabilitiesBuilder {

    @Test
    public void gefPatternsMobileDefaultElementsTest() throws Exception {

        SquizActionMethods squizAction = new SquizActionMethods(driver);

        Dimension dimension = new Dimension(375, 650);

        driver.manage().window().setSize(dimension);

        squizAction.getPage("gef-patterns-base", "gef-patterns-elements");
        eyes.checkWindow(System.getenv("EYES-GEF-PATTERNS-ELEMENTS"));

        eyes.close();
    }
}
