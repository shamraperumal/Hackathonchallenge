package au.edu.nsw.doe.digital.closed.automation.tests.sws.swsaem;

import au.edu.nsw.doe.digital.closed.automation.pageobjects.swsaem.GlobalElements;
import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.tests.sws.AemActionMethods;
import au.edu.nsw.doe.digital.closed.automation.tests.sws.AemActions;
import org.junit.Test;


public class NewsLandingTest extends CapabilitiesBuilder {

    private AemActions action;

    @Override
    public void doSetUp() {
        action = new AemActionMethods(driver);
    }

    @Test
    public void newsLandingTest() throws Exception {
        {
            action.setScreenDimensions();

            action.getPage("sws-sws-base","sws-news-landing");
            action.wait(GlobalElements.globalLogo);
            eyes.checkWindow(System.getenv("sws-sws-news-landing"));


            eyes.close();
        }
    }
}
