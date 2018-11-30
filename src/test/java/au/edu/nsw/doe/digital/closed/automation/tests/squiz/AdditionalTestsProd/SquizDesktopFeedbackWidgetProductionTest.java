package au.edu.nsw.doe.digital.closed.automation.tests.squiz.AdditionalTestsProd;

import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.tests.squiz.SquizActionMethods;
import org.junit.Test;

public class SquizDesktopFeedbackWidgetProductionTest extends CapabilitiesBuilder {
    @Test
    public void FeedbackButtonTest() throws Exception {

        SquizActionMethods squizAction = new SquizActionMethods(driver);

        //1. Test case 01
        squizAction.getPage("gef-feedback-base", "gef-feedback-department-contacts");

        System.out.println("Page is launched");
        Thread.sleep(8000);

        if ( squizAction.FeedbackWidget())
            System.out.println("Feedback button is displayed. Test Passed");
        else
            System.out.println("Feedback button is not displayed. Test failed\n");


        // 2. Test case 02
        squizAction.getPage("gef-feedback-base", "gef-feedback-parents-carers");

        System.out.println("\nParents and Carers page is launched");
        Thread.sleep(8000);

        if ( squizAction.FeedbackWidget())
            System.out.println("Feedback button is displayed. Test Passed");
        else
            System.out.println("Feedback button is not displayed. Test failed");


    }
}
