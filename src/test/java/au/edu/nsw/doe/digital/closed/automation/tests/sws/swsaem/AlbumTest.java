package au.edu.nsw.doe.digital.closed.automation.tests.aem.swsaem;

import au.edu.nsw.doe.digital.closed.automation.pageobjects.swsaem.GlobalElements;
import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.tests.aem.AemActionMethods;
import au.edu.nsw.doe.digital.closed.automation.tests.aem.AemActions;
import org.junit.Test;


public class AlbumTest extends CapabilitiesBuilder {

    private AemActions action;

    @Override
    public void doSetUp() {
        action = new AemActionMethods(driver);
    }

    @Test
    public void albumTest() throws Exception {
        {
            action.setScreenDimensions();

            //With view more
            action.getPage("sws-aem-base","sws-album-with-view-more");
            action.wait(GlobalElements.globalLogo);
            eyes.checkWindow(System.getenv("sws-aem-album-with-view-more"));

            //Without view more
            action.getPage("sws-aem-base","sws-album-without-view-more");
            eyes.checkWindow(System.getenv("sws-aem-album-without-view-more"));

            eyes.close();
        }
    }
}
