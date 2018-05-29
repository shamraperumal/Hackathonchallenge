package au.edu.nsw.doe.digital.closed.automation.tests.sws.swswhitelabel;

import au.edu.nsw.doe.digital.closed.automation.pageobjects.swswhitelabel.ImageElements;
import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.tests.sws.AemActionMethods;
import au.edu.nsw.doe.digital.closed.automation.tests.sws.AemActions;
import org.junit.Test;

public class LatestAlbumsTest extends CapabilitiesBuilder{

    private AemActions action;

    @Override
    public void doSetUp() {
        action = new AemActionMethods(driver);
    }

   
    @Test
    public void latestAlbumLayoutsTest()throws Exception {

        String device = System.getenv("DEVICE");

        action.setScreenDimensions();

        action.getPage("sws-component-base","sws-album-layouts");

        eyes.checkWindow(System.getenv("sws-album"));

        if(device.equals("Desktop")) {

            action.hover(ImageElements.image);

            eyes.checkRegion(ImageElements.image);
        }

        eyes.close();
    }
}

