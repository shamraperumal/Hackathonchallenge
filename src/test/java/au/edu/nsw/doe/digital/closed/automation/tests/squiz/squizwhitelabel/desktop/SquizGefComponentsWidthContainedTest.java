package au.edu.nsw.doe.digital.closed.automation.tests.squiz.squizwhitelabel.desktop;

import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.tests.squiz.SquizActionMethods;
import org.junit.Test;

/**
 * Created by cpigden on 14/03/2016.
 */
public class SquizGefComponentsWidthContainedTest extends CapabilitiesBuilder {

    @Test
    public void gefComponentsDesktopWidthContainedTest() throws Exception {
        SquizActionMethods squizAction = new SquizActionMethods(driver);

        squizAction.getPage("gef-components-base", "gef-components-width-contained");

        eyes.checkWindow(System.getenv("EYES-GEF-COMPONENTS-WIDTH-CONTAINED"));

        eyes.close();
    }


}
