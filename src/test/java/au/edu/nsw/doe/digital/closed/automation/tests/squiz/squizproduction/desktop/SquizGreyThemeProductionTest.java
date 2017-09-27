package au.edu.nsw.doe.digital.closed.automation.tests.squiz.squizproduction.desktop;


import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.tests.squiz.SquizActionMethods;
import org.junit.Test;

/**
 * Created by christopherpigden on 9/09/2015.
 */
public class SquizGreyThemeProductionTest extends CapabilitiesBuilder {

    @Test
    public void greyThemeDesktopProductionEyesTest() throws Exception {

        SquizActionMethods squizAction = new SquizActionMethods(driver);

        squizAction.getPage("greytheme-base", "greytheme-landing");
        eyes.checkWindow(System.getenv("EYES-GREYTHEME-Landing"));

        squizAction.getPage("greytheme-base", "greytheme-standard");
        eyes.checkWindow(System.getenv("EYES-GREYTHEME-Standard"));


        eyes.close();
    }
}