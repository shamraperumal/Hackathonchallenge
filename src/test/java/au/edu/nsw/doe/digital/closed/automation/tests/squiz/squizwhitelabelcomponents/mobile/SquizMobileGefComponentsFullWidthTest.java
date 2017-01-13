package au.edu.nsw.doe.digital.closed.automation.tests.squiz.squizwhitelabelcomponents.mobile;

import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.tests.squiz.SquizActionMethods;
import org.junit.Test;
import org.openqa.selenium.Dimension;

/**
 * Created by cpigden on 14/03/2016.
 */
public class SquizMobileGefComponentsFullWidthTest extends CapabilitiesBuilder {

    @Test
    public void gefComponentsMobileFullWidthTest() throws Exception {

        SquizActionMethods squizAction = new SquizActionMethods(driver);

        Dimension dimension = new Dimension(375, 650);

        driver.manage().window().setSize(dimension);

        squizAction.getPage("gef-components-base", "gef-components-full");
        eyes.checkWindow(System.getenv("EYES-GEF-COMPONENTS-FULL"));

        eyes.close();
    }
}


