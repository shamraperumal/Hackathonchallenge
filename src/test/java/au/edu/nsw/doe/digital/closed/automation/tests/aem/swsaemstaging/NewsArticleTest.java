package au.edu.nsw.doe.digital.closed.automation.tests.aem.swsaemstaging;

import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.tests.aem.AemActionMethods;
import au.edu.nsw.doe.digital.closed.automation.tests.aem.AemActions;
import org.junit.Test;


public class NewsArticleTest extends CapabilitiesBuilder {

    private AemActions action;

    @Override
    public void doSetUp() {
        action = new AemActionMethods(driver);
    }

    @Test
    public void NewsArticleTest() throws Exception {
        {
            action.setScreenDimensions();

            action.getPage("sws-aem-base-1","news-article-1");
            eyes.checkWindow(System.getenv("sws-aem-news-article-1"));

            eyes.close();
        }
    }
}
