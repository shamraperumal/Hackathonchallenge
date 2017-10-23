package au.edu.nsw.doe.digital.closed.automation.tests.aem.swswhitelabel;

import au.edu.nsw.doe.digital.closed.automation.pageobjects.swswhitelabel.GlobalElements;
import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.tests.aem.AemActionMethods;
import au.edu.nsw.doe.digital.closed.automation.tests.aem.AemActions;
import org.junit.Test;
/**
 * Created by christopherpigden on 18/8/17.
 */
public class BreadcrumbTest extends CapabilitiesBuilder {

    private AemActions action;

    @Override
    public void doSetUp() {
        action = new AemActionMethods(driver);
    }

    @Test
    public void breadcrumbsTest() throws Exception {

        action.setScreenDimensions();
        action.getPage("sws-component-base","sws-breadcrumbs");
        eyes.checkRegion(GlobalElements.breadcrumbs);

        eyes.close();
    }
}




