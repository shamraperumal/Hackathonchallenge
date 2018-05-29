package au.edu.nsw.doe.digital.closed.automation.tests.sws.swswhitelabel;

import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.tests.sws.AemActionMethods;
import au.edu.nsw.doe.digital.closed.automation.tests.sws.AemActions;
import org.junit.Test;

public class NewsArticleTemplateTest extends CapabilitiesBuilder{

    private AemActions action;

    @Override
    public void doSetUp() {
        action = new AemActionMethods(driver);
    }

   
    @Test
    public void newsArticleTemplateTest()throws Exception {

        action.setScreenDimensions();

        action.getPage("sws-component-base","sws-news-article");

        eyes.checkWindow(System.getenv("sws-news-article-page"));

        eyes.close();

    }
}

