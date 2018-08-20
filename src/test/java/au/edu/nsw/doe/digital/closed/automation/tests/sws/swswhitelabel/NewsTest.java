package au.edu.nsw.doe.digital.closed.automation.tests.sws.swswhitelabel;

import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.tests.sws.AemActionMethods;
import au.edu.nsw.doe.digital.closed.automation.tests.sws.AemActions;
import org.junit.Test;

public class NewsTest extends CapabilitiesBuilder{

    private AemActions action;

    @Override
    public void doSetUp() {
        action = new AemActionMethods(driver);
    }

    @Test
    public void newsLayoutsTest()throws Exception {

        action.setScreenDimensions();

        action.getPage("sws-component-base","sws-news-layouts");

        eyes.checkWindow(System.getenv("sws-news"));

        eyes.close();
    }
}

