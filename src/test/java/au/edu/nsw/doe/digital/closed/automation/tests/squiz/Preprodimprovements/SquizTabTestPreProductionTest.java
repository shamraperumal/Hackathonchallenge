package au.edu.nsw.doe.digital.closed.automation.tests.squiz.Preprodimprovements;


import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.tests.squiz.SquizActionMethods;
import org.junit.Test;

/**
 * Created by Shravan on 26/10/2018.
 */
public class SquizTabTestPreProductionTest extends CapabilitiesBuilder {

    @Test
    public void TabtestDesktopPreProductionEyesTest() throws Exception {

        SquizActionMethods squizAction = new SquizActionMethods(driver);

          squizAction.getPage("gef-education-base", "gef-education-tab");

          squizAction.getPage("gef-education-base", "gef-education-standard");

        
    }
}
