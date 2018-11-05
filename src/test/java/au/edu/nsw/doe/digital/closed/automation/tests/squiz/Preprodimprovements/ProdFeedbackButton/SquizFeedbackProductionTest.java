package au.edu.nsw.doe.digital.closed.automation.tests.squiz.Preprodimprovements.ProdFeedbackButton;

import au.edu.nsw.doe.digital.closed.automation.pageobjects.squiz.GefSearch;
import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.tests.squiz.SquizActionMethods;
import org.junit.Test;

public class SquizFeedbackProductionTest extends CapabilitiesBuilder {

    @Test
    public void gefPoliciesDesktopPreProductionEyesTest() throws Exception {

        SquizActionMethods squizAction = new SquizActionMethods(driver);
        squizAction.getPage("gef-feedback-base", "gef-feedback-department-contacts");
        System.out.println("Page is launched succesfully");
        Thread.sleep(2000);

        if ( squizAction.iswebelementpresent()==true)
            System.out.println("Feedback button is displayed. Test Passed");
        else
            System.out.println("Feedback button is not displayed. Test failed");

        squizAction.getPage("gef-feedback-base", "gef-feedback-parents-carers");

        System.out.println("Search page is launched succesfully");
        Thread.sleep(2000);

        if ( squizAction.iswebelementpresent()==true)
            System.out.println("Feedback button is displayed. Test Passed");
        else
            System.out.println("Feedback button is not displayed. Test failed");


        }
}
