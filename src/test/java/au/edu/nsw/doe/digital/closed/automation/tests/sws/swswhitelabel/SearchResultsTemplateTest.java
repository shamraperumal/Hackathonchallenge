package au.edu.nsw.doe.digital.closed.automation.tests.aem.swswhitelabel;

import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.tests.aem.AemActionMethods;
import au.edu.nsw.doe.digital.closed.automation.tests.aem.AemActions;
import org.junit.Test;


public class SearchResultsTemplateTest extends CapabilitiesBuilder {

    private AemActions action;

    @Override
    public void doSetUp() {
        action = new AemActionMethods(driver);
    }

    @Test
    public void searchResultsTemplateTest() throws Exception {
        {
            action.setScreenDimensions();
            action.getPage("sws-component-base","search-results-template");
            eyes.checkWindow(System.getenv("search-results-template"));

            eyes.close();
        }
    }
}
