package au.edu.nsw.doe.digital.closed.automation.tests.aem.swswhitelabel;

import au.edu.nsw.doe.digital.closed.automation.pageobjects.swswhitelabel.AlbumDetailElements;
import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.tests.aem.AemActionMethods;
import au.edu.nsw.doe.digital.closed.automation.tests.aem.AemActions;
import org.junit.Test;


public class AlbumDetailTest extends CapabilitiesBuilder {

    private AemActions action;

    @Override
    public void doSetUp() {
        action = new AemActionMethods(driver);
    }

    @Test
    public void albumDetailTest() throws Exception {
        {
            action.setScreenDimensions();

            action.getPage("sws-component-base","album-detail");
            Thread.sleep(3000);

            eyes.checkWindow(System.getenv("sws-album-detail"));

            action.click(AlbumDetailElements.image1);
            eyes.checkWindow(System.getenv("sws-image-modal-1"));

            action.click(AlbumDetailElements.next);
            eyes.checkWindow(System.getenv("sws-image-modal-2"));

            eyes.close();
        }
    }
}
