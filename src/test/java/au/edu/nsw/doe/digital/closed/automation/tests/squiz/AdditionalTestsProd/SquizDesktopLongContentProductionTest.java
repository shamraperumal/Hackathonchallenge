package au.edu.nsw.doe.digital.closed.automation.tests.squiz.AdditionalTestsProd;

import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.tests.squiz.SquizActionMethods;
import org.junit.Test;

public class SquizDesktopLongContentProductionTest extends CapabilitiesBuilder {

    @Test
    public void LongContentTest() throws Exception {

        SquizActionMethods squizAction = new SquizActionMethods(driver);

        //1. Test case 01
        squizAction.getPage("gef-education-homepage", "gef-guided-journey");

        System.out.println("Page is launched");
        Thread.sleep(12000);

        if(squizAction.longcontentnavigate())
        {
            System.out.println("H2 and H3's are clickable");
        }
        else
        {
            System.out.println("Error while Navigating the steps on the page");
        }

        if(squizAction.keyboardnavigation("TAB"))
        {
            System.out.println("First tab is successful");
        }

        }
    }
