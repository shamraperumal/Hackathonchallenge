package au.edu.nsw.doe.digital.closed.automation.tests.aem.swsaemstaging;

import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.tests.aem.AemActionMethods;
import au.edu.nsw.doe.digital.closed.automation.tests.aem.AemActions;
import org.junit.Ignore;
import org.junit.Test;


public class GalleryIndexTest extends CapabilitiesBuilder {

    private AemActions action;

    @Override
    public void doSetUp() {
        action = new AemActionMethods(driver);
    }
    @Ignore

    @Test
    public void GalleryIndexTest() throws Exception {
        {
            action.setScreenDimensions();

            action.getPage("sws-aem-base-1","homepage-1");
            eyes.checkWindow(System.getenv("sws-aem-homepage-1"));

            action.getPage("sws-aem-base-1","homepage-2");
            eyes.checkWindow(System.getenv("sws-aem-homepage-2"));

            eyes.close();
        }
    }
}
