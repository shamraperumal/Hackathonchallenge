package au.edu.nsw.doe.digital.closed.automation.tests.aem.swswhitelabel;

import au.edu.nsw.doe.digital.closed.automation.pageobjects.swswhitelabel.GlobalElements;
import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import org.junit.Test;

/**
 * Created by christopherpigden on 8/8/17.
 */
public class StandardPageTest extends CapabilitiesBuilder {

    private AemActions action;

    @Override
    public void doSetUp() {
        action = new AemActionMethods(driver);
    }

    @Test
    public void standardPageTest() throws Exception {
        {
            action.setScreenDimensions();
            action.getPage("sws-component-base","sws-standard");
            eyes.checkWindow(System.getenv("sws-standard-page-template"));

            eyes.close();
        }
    }
}
