package au.edu.nsw.doe.digital.closed.automation.tests.squiz.squizpreproduction.desktop;


import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.tests.squiz.SquizActionMethods;
import org.junit.Test;

/**
 * Created by christopherpigden on 9/09/2015.
 */
public class SquizAntibullyingPreProductionTest extends CapabilitiesBuilder {

    @Test
    public void TabTest() throws Exception {

        SquizActionMethods squizAction = new SquizActionMethods(driver);

        squizAction.getPage("antibullying-base", "antibullying-home");
        eyes.checkWindow(System.getenv("EYES-ANTIBULLYING-HOME"));

        squizAction.getPage("antibullying-base", "antibullying-landing");
        eyes.checkWindow(System.getenv("EYES-ANTIBULLYING-LANDING"));

        squizAction.getPage("antibullying-base", "antibullying-standard");
        eyes.checkWindow(System.getenv("EYES-ANTIBULLYING-Standard"));

        squizAction.getPage("antibullying-base", "antibullying-catalogue");
        eyes.checkWindow(System.getenv("EYES-ANTIBULLYING-CATALOGUE"));


        eyes.close();
    }
}
