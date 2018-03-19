package au.edu.nsw.doe.digital.closed.automation.tests.aem.swsaem;

import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.tests.aem.AemActionMethods;
import au.edu.nsw.doe.digital.closed.automation.tests.aem.AemActions;
import org.junit.Ignore;
import org.junit.Test;


public class GalleryLandingTest extends CapabilitiesBuilder {

    private AemActions action;

    @Override
    public void doSetUp() {
        action = new AemActionMethods(driver);
    }
    @Ignore

    @Test
    public void galleryLandingTest() throws Exception {
        {
            action.setScreenDimensions();

            action.getPage("sws-aem-base","sws-gallery-landing");
            eyes.checkWindow(System.getenv("sws-aem-gallery-landing"));


            eyes.close();
        }
    }
}
