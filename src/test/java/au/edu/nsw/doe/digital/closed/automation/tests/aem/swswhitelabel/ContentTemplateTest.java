package au.edu.nsw.doe.digital.closed.automation.tests.aem.swswhitelabel;

import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.tests.aem.AemActionMethods;
import au.edu.nsw.doe.digital.closed.automation.tests.aem.AemActions;
import org.junit.Test;

public class ContentTemplateTest extends CapabilitiesBuilder{

    private AemActions action;

    @Override
    public void doSetUp() {
        action = new AemActionMethods(driver);
    }

   
    @Test
    public void contentTemplateTest()throws Exception {

        action.setScreenDimensions();

        action.getPage("sws-component-base","sws-content");

        eyes.checkWindow(System.getenv("sws-content-page"));

        eyes.close();

    }
}

