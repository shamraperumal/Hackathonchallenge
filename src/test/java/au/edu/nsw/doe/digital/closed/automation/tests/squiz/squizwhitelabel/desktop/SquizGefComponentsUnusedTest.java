package au.edu.nsw.doe.digital.closed.automation.tests.squiz.squizwhitelabel.desktop;

import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.tests.squiz.SquizActionMethods;
import org.junit.Test;

/**
 * Created by cpigden on 14/03/2016.
 */
public class SquizGefComponentsUnusedTest extends CapabilitiesBuilder {

    @Test
    public void gefComponentsDesktopUnusedTest() throws Exception {
        SquizActionMethods squizAction = new SquizActionMethods(driver);

        squizAction.getPage("gef-components-base", "gef-components-unused-column");

        eyes.checkWindow(System.getenv("EYES-GEF-COMPONENTS-UNUSED"));

        eyes.close();
    }


}
