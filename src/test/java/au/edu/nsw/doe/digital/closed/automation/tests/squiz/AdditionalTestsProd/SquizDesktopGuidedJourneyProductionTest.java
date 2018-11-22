package au.edu.nsw.doe.digital.closed.automation.tests.squiz.AdditionalTestsProd;

import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.tests.squiz.SquizActionMethods;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SquizDesktopGuidedJourneyProductionTest extends CapabilitiesBuilder {

    @Test    public void GuidedJourneyTest() throws Exception {

        SquizActionMethods squizAction = new SquizActionMethods(driver);

        //1. Test case 01
        squizAction.getPage("gef-education-homepage", "gef-guided-journey");

        System.out.println("Page is launched");
        Thread.sleep(12000);

        if(squizAction.Desktopguidedjourneynavigate())
        {
            System.out.println("Guided Journey page is loaded successfully");
        }
        else
        {
            System.out.println("Error loading or Navigating the steps on the page");
        }

        }
    }
