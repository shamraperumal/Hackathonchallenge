package au.edu.nsw.doe.digital.closed.automation.tests.squiz.squizpreproduction.mobile;


import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.tests.squiz.SquizActionMethods;
import org.junit.Test;


public class SquizPoliciesMobilePreProductionTest extends CapabilitiesBuilder {

    @Test
    public void gefPoliciesMobilePreProductionEyesTest() throws Exception {

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
        eyes.checkWindow(System.getenv("EYES-GEF-POLICIES-SEARCH"));

        eyes.close();
    }
}
