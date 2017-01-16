package au.edu.nsw.doe.digital.closed.automation.tests.squiz.squizwhitelabelcomponents.desktop;

import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.tests.squiz.SquizActionMethods;
import org.junit.Test;

/**
 * Created by cpigden on 14/03/2016.
 */
public class SquizGefComponentsFullWidthTest extends CapabilitiesBuilder {

    @Test
    public void gefComponentsDesktopFullWidthTest() throws Exception {
        SquizActionMethods squizAction = new SquizActionMethods(driver);

        squizAction.getPage("gef-components-base", "gef-components-full");
        eyes.checkWindow(System.getenv("EYES-GEF-COMPONENTS-FULL"));

        eyes.close();
    }


}