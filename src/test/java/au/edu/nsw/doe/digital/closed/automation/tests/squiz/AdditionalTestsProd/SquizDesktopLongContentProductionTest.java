package au.edu.nsw.doe.digital.closed.automation.tests.squiz.AdditionalTestsProd;

import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.tests.squiz.SquizActionMethods;
import org.junit.Test;

public class SquizDesktopLongContentProductionTest extends CapabilitiesBuilder {

    @Test
    public void LongContentTest() throws Exception {

        SquizActionMethods squizAction = new SquizActionMethods(driver);

        //1. Test case 01
        squizAction.getPage("gef-education-homepage", "gef-long-content");

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

        String[] keystrokes = {"TAB","TAB","TAB","ENTER"};

        for(int i=0;i<keystrokes.length;i++)
        {
            if(squizAction.keyboardnavigation(keystrokes[i]))
            {
                System.out.println(keystrokes[i] + " is successful");
            }
            else
            {
                System.out.println("Error encountered while keyboard navigation. Check sauce-labs for logs");
                break;
            }
        }

        }
    }
