package au.edu.nsw.doe.digital.closed.automation.tests.squiz.squizpattern.desktop;

import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.tests.squiz.SquizActionMethods;
import org.junit.Test;

/**
 * Created by cpigden on 5/02/2016.
 */
public class SquizGefPatternsDefaultElementsTest extends CapabilitiesBuilder {

    @Test
    public void gefPatternsDesktopDefaultElementsTest() throws Exception {
        SquizActionMethods squizAction = new SquizActionMethods(driver);

        squizAction.getPage("gef-patterns-base", "gef-patterns-elements", "", "");
        eyes.checkWindow(System.getenv("EYES-GEF-PATTERNS-ELEMENTS"));

        eyes.close();
    }


}


