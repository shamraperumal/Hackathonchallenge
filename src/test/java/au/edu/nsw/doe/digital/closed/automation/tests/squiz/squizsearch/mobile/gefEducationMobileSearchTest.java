package au.edu.nsw.doe.digital.closed.automation.tests.squiz.squizsearch.mobile;

import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.tests.squiz.SquizActionMethods;
import org.junit.Test;
import org.openqa.selenium.Dimension;

/**
 * Created by christopherpigden on 22/03/2016.
 */
public class gefEducationMobileSearchTest extends CapabilitiesBuilder {

    @Test
    public void gefEducationMobileSearchEyesTest() throws Exception {

        SquizActionMethods squizAction = new SquizActionMethods(driver);

        Dimension dimension = new Dimension(375, 650);

        driver.manage().window().setSize(dimension);

        squizAction.getPage("road-safety-education-domain","");
        squizAction.mobileSearch(System.getenv("SEARCH-INPUT"));
        eyes.checkWindow(System.getenv("EYES-GEF-EDUCATION-SEARCH"));
    }
}
