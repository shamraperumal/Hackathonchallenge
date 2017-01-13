package au.edu.nsw.doe.digital.closed.automation.tests.squiz.squizwhitelabelcomponents.desktop;

import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.tests.squiz.SquizActionMethods;
import org.junit.Test;

/**
 * Created by cpigden on 5/02/2016.
 */
public class SquizGefComponentsDefaultElementsTest extends CapabilitiesBuilder {

    @Test
    public void gefComponentsDesktopDefaultElementsTest() throws Exception {
        SquizActionMethods squizAction = new SquizActionMethods(driver);

        squizAction.getPage("gef-components-base", "gef-components-elements");
        eyes.checkWindow(System.getenv("EYES-GEF-COMPONENTS-ELEMENTS"));

        eyes.close();
    }


}


