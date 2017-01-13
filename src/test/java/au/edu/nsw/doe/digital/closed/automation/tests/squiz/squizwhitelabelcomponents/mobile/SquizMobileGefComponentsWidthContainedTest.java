package au.edu.nsw.doe.digital.closed.automation.tests.squiz.squizwhitelabelcomponents.mobile;

import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.tests.squiz.SquizActionMethods;
import org.junit.Test;
import org.openqa.selenium.Dimension;

/**
 * Created by cpigden on 14/03/2016.
 */
public class SquizMobileGefComponentsWidthContainedTest extends CapabilitiesBuilder {

    @Test
    public void gefComponentsMobileWidthContainedTest() throws Exception {

        SquizActionMethods squizAction = new SquizActionMethods(driver);

        Dimension dimension = new Dimension(375, 650);

        driver.manage().window().setSize(dimension);

        squizAction.getPage("gef-components-base", "gef-components-width-contained");
        eyes.checkWindow(System.getenv("EYES-GEF-COMPONENTS-WIDTH-CONTAINED"));

        eyes.close();
    }
}

