package au.edu.nsw.doe.digital.closed.automation.tests.aem.swswhitelabel;

import au.edu.nsw.doe.digital.closed.automation.pageobjects.swswhitelabel.GlobalElements;
import au.edu.nsw.doe.digital.closed.automation.pageobjects.swswhitelabel.ImageElements;
import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import org.junit.Ignore;
import org.junit.Test;

public class LatestAlbumsTest extends CapabilitiesBuilder{

    private AemActions action;

    @Override
    public void doSetUp() {
        action = new AemActionMethods(driver);
    }

   
    @Test
    public void latestAlbumLayoutsTest()throws Exception {

        action.setScreenDimensions();

        action.getPage("sws-component-base","sws-album-layouts");

        eyes.checkWindow(System.getenv("sws-album"));

        action.hover(ImageElements.image);

        eyes.checkRegion(ImageElements.image);

        eyes.close();
    }
}

