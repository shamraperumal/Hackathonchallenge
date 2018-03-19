package au.edu.nsw.doe.digital.closed.automation.tests.aem.swsaem;

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
    public void newsArticleTest() throws Exception {
        {
            action.setScreenDimensions();

            action.getPage("sws-aem-base","sws-news-article-with-image");
            eyes.checkWindow(System.getenv("sws-aem-news-article-with-image"));

            action.getPage("sws-aem-base","sws-news-article-without-image");
            eyes.checkWindow(System.getenv("sws-aem-news-article-without-image"));

            eyes.close();
        }
    }
}
