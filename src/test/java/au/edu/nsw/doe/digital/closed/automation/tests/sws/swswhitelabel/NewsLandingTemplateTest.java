package au.edu.nsw.doe.digital.closed.automation.tests.sws.swswhitelabel;

import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.tests.sws.AemActionMethods;
import au.edu.nsw.doe.digital.closed.automation.tests.sws.AemActions;
import org.junit.Ignore;
import org.junit.Test;

public class NewsLandingTemplateTest extends CapabilitiesBuilder {

    private AemActions action;

    @Override
    public void doSetUp() {
        action = new AemActionMethods(driver);
    }

    @Ignore

    @Test
    public void newsLandingTemplateTest()throws Exception {

        action.setScreenDimensions();

        action.getPage("sws-component-base","sws-news-landing-1");

        eyes.checkWindow(System.getenv("sws-news-landing-page-1"));

        action.getPage("sws-component-base","sws-news-landing-2");

        eyes.checkWindow(System.getenv("sws-news-landing-page-2"));


        eyes.close();

    }
}