package au.edu.nsw.doe.digital.closed.automation.tests.aem.swsaem;

import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.tests.aem.AemActionMethods;
import au.edu.nsw.doe.digital.closed.automation.tests.aem.AemActions;
import org.junit.Test;


public class ErrorTest extends CapabilitiesBuilder {

    private AemActions action;

    @Override
    public void doSetUp() {
        action = new AemActionMethods(driver);
    }

    @Test
    public void errorTest() throws Exception {
        {
            action.setScreenDimensions();


            action.getPage("sws-aem-base","sws-error-404");
            eyes.checkWindow(System.getenv("sws-aem-404"));


            action.getPage("sws-aem-base","sws-error-403");
            eyes.checkWindow(System.getenv("sws-aem-403"));

            action.getPage("sws-aem-base","sws-error-500");
            eyes.checkWindow(System.getenv("sws-aem-500"));


            eyes.close();
        }
    }
}
