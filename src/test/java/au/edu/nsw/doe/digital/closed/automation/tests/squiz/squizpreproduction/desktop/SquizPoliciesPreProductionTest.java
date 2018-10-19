package au.edu.nsw.doe.digital.closed.automation.tests.squiz.squizpreproduction.desktop;


import au.edu.nsw.doe.digital.closed.automation.pageobjects.squiz.GefSearch;
import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.tests.squiz.SquizActionMethods;
import org.junit.Test;


public class SquizPoliciesPreProductionTest extends CapabilitiesBuilder {

    @Test
    public void gefPoliciesDesktopPreProductionEyesTest() throws Exception {

        SquizActionMethods squizAction = new SquizActionMethods(driver);

        squizAction.getPage("gef-policies-base", "");
        eyes.checkWindow(System.getenv("EYES-GEF-POLICIES-POLICY-GROUP"));

        squizAction.getPage("gef-policies-base", "gef-policies-lms");
        eyes.checkWindow(System.getenv("EYES-GEF-POLICIES-LMS"));

        squizAction.getPage("gef-policies-base", "gef-policies-AZ");
        eyes.checkWindow(System.getenv("EYES-GEF-POLICIES-AZ"));

        squizAction.getPage("gef-policies-base", "gef-policies-topic");
        eyes.checkWindow(System.getenv("EYES-GEF-POLICIES-TOPIC"));

        squizAction.getPage("gef-policies-base", "gef-policies-Policy");
        eyes.checkWindow(System.getenv("EYES-GEF-POLICIES-POLICY"));

        squizAction.getPage("gef-policies-base", "gef-policies-document-history");
        eyes.checkWindow(System.getenv("EYES-GEF-POLICIES-DOCUMENT-HISTORY"));

        squizAction.getPage("gef-policies-base", "gef-policies-private-policy");
        eyes.checkWindow(System.getenv("EYES-GEF-POLICIES-PRIVATE-POLICY"));

        squizAction.getPage("gef-policies-base", "gef-policies-search");

        // Added below to wait until all the search results are displayed and Next,Previous buttons appear
        squizAction.wait(GefSearch.pagination);
        eyes.checkWindow(System.getenv("EYES-GEF-POLICIES-SEARCH"));

        // Need to do changes here

        eyes.close();
    }
}
