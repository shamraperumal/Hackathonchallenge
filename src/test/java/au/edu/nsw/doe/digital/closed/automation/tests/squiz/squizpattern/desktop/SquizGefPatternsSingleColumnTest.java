package au.edu.nsw.doe.digital.closed.automation.tests.squiz.squizpattern.desktop;

import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.tests.squiz.SquizActionMethods;
import org.junit.Test;

/**
 * Created by cpigden on 14/03/2016.
 */
public class SquizGefPatternsSingleColumnTest extends CapabilitiesBuilder {

    @Test
    public void gefPatternsDesktopSingleColumnTest() throws Exception {
        SquizActionMethods squizAction = new SquizActionMethods(driver);

        squizAction.getPage("gef-patterns-base", "gef-patterns-single-column");

        eyes.checkWindow(System.getenv("EYES-GEF-PATTERNS-SINGLE-COLUMN"));

        eyes.close();
    }


}
