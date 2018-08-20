package au.edu.nsw.doe.digital.closed.automation.tests.squiz.squizdepricatedtests;


import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.tests.squiz.SquizActionMethods;
import org.junit.Test;

/**
 * Created by christopherpigden on 9/09/2015.
 */
public class SquizSchoolInfrastructurePreProductionTest extends CapabilitiesBuilder {

    @Test
    public void schoolInfrastructureDesktopPreProductionEyesTest() throws Exception {

        SquizActionMethods squizAction = new SquizActionMethods(driver);

        squizAction.getPage("si-base", "si-home");
        eyes.checkWindow(System.getenv("EYES-SI-HOME"));

        squizAction.getPage("si-base", "si-projects");
        eyes.checkWindow(System.getenv("EYES-SI-PROJECTS"));

        squizAction.getPage("si-base", "si-search-results");
        eyes.checkWindow(System.getenv("EYES-SI-SEARCH-RESULTS"));

        squizAction.getPage("si-base", "si-standard");
        eyes.checkWindow(System.getenv("EYES-SI-STANDARD"));


        eyes.close();
    }
}
