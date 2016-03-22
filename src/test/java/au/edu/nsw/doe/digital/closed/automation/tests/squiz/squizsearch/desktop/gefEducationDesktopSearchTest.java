package au.edu.nsw.doe.digital.closed.automation.tests.squiz.squizsearch.desktop;

import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.tests.squiz.SquizActionMethods;
import org.junit.Test;

/**
 * Created by christopherpigden on 22/03/2016.
 */
public class gefEducationDesktopSearchTest extends CapabilitiesBuilder {

        @Test
        public void gefEducationDesktopSearchEyesTest() throws Exception {

            SquizActionMethods squizAction = new SquizActionMethods(driver);

            squizAction.getPage("road-safety-education-domain", "");
            squizAction.search(System.getenv("SEARCH-INPUT"));
            eyes.checkWindow(System.getenv("EYES-GEF-EDUCATION-SEARCH"));
        }
    }
