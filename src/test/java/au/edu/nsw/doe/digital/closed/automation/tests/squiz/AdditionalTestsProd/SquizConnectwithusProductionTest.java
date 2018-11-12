package au.edu.nsw.doe.digital.closed.automation.tests.squiz.AdditionalTestsProd;

import au.edu.nsw.doe.digital.closed.automation.pageobjects.squiz.GefHomepage;
import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.tests.squiz.SquizActionMethods;
import org.junit.Test;

public class SquizConnectwithusProductionTest extends CapabilitiesBuilder {

    @Test
    public void ConnectwitUsTest() throws Exception {

        SquizActionMethods squizAction = new SquizActionMethods(driver);

        //1. Test case 01
        squizAction.getPage("gef-education-base", "");

        System.out.println("Page is launched");
        Thread.sleep(8000);

        if ( squizAction.SocialMedia())

                System.out.println("Social media posts are displayed. Test Passed");
        else
            System.out.println("Feedback button is not displayed. Test failed\n");


        }
}
