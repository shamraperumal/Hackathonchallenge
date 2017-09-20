package au.edu.nsw.doe.digital.closed.automation.tests.aem.swswhitelabel;

import au.edu.nsw.doe.digital.closed.automation.pageobjects.swswhitelabel.NewsElements;
import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import org.junit.Test;

public class NewsTest extends CapabilitiesBuilder{

    private AemActions action;

    @Override
    public void doSetUp() {
        action = new AemActionMethods(driver);
    }

    @Test
    public void newsComponentsTest()throws Exception {

        action.setScreenDimensions();

        action.getPage("sws-component-base","sws-news-components");

        //News headline
        eyes.checkRegion(NewsElements.newsHeader);

        //News with image
        eyes.checkRegion(NewsElements.newsImage);

        //News without image
        eyes.checkRegion(NewsElements.newsNoImage);

        //News headline only
        eyes.checkRegion(NewsElements.newsCategory);

        action.getPage("sws-component-base","sws-news-layouts");

        //News full width 3 images
        eyes.checkRegion(NewsElements.newsFullWidthFullImage);

        //News full width
        eyes.checkRegion(NewsElements.newsFullWidth);

        //News 66%
        eyes.checkRegion(NewsElements.newsTwoColumn);

        //News 33%
        eyes.checkRegion(NewsElements.newsOneColumn);

        eyes.close();
    }
}

