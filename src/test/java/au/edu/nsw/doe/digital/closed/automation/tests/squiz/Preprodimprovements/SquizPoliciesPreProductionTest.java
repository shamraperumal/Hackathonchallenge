package au.edu.nsw.doe.digital.closed.automation.tests.squiz.Preprodimprovements;


import au.edu.nsw.doe.digital.closed.automation.pageobjects.squiz.GefSearch;
import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.tests.squiz.SquizActionMethods;
import org.junit.Test;


public class SquizPoliciesPreProductionTest extends CapabilitiesBuilder {

    @Test
    public void gefPoliciesDesktopPreProductionEyesTest() throws Exception {

        SquizActionMethods squizAction = new SquizActionMethods(driver);

        squizAction.getPage("gef-policies-base", "");


        squizAction.getPage("gef-policies-base", "gef-policies-lms");


        squizAction.getPage("gef-policies-base", "gef-policies-AZ");


        squizAction.getPage("gef-policies-base", "gef-policies-topic");


        squizAction.getPage("gef-policies-base", "gef-policies-Policy");


        squizAction.getPage("gef-policies-base", "gef-policies-document-history");


        squizAction.getPage("gef-policies-base", "gef-policies-private-policy");


        squizAction.getPage("gef-policies-base", "gef-policies-search");

        // Added below to wait until all the search results are displayed and Next,Previous buttons appear
        squizAction.wait(GefSearch.pagination);
      

        // Need to do changes here

        eyes.close();
    }
}
