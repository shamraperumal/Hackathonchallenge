package au.edu.nsw.doe.digital.closed.automation.tests.squiz.squizwhitelabelcomponents.desktop;

import au.edu.nsw.doe.digital.closed.automation.pageobjects.whitelabel.DefaultElements;
import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.tests.squiz.SquizActionMethods;
import org.junit.Test;

/**
 * Created by cpigden on 5/02/2016.
 */

public class SquizGefComponentsDefaultElementsRegionTest extends CapabilitiesBuilder {

    SquizActionMethods squizAction = new SquizActionMethods(driver);

    @Override
    public boolean getForceFullPageScreenshot() {
        return false;
    }

    @Test
    public void whitelabelLinksTest() throws Exception {

        squizAction.getPage("gef-components-base", "gef-components-elements");
        eyes.checkRegion(DefaultElements.linkList);

        eyes.close();
    }


    @Test
    public void whitelabelTypographyTest() throws Exception {

        squizAction.getPage("gef-components-base", "gef-components-elements");
        eyes.checkRegion(DefaultElements.typography);


        eyes.close();
    }

    @Test
    public void whitelabelBlockQuoteTest() throws Exception {

        squizAction.getPage("gef-components-base", "gef-components-elements");
        eyes.checkRegion(DefaultElements.blockQuote);

        eyes.close();
    }

    @Test
    public void whitelabeliframeTest() throws Exception {

        squizAction.getPage("gef-components-base", "gef-components-elements");
        eyes.checkRegion(DefaultElements.iFrame);

        eyes.close();
    }

    @Test
    public void whitelabelListsTest() throws Exception {

        squizAction.getPage("gef-components-base", "gef-components-elements");
        eyes.checkRegion(DefaultElements.lists);

        eyes.close();
    }

    @Test
    public void whitelabelImageCaptionTest() throws Exception {

        squizAction.getPage("gef-components-base", "gef-components-elements");
        eyes.checkRegion(DefaultElements.imageCaption);

        eyes.close();
    }

    @Test
    public void whitelabelButtonSubmit() throws Exception {

        squizAction.getPage("gef-components-base", "gef-components-elements");
        eyes.checkRegion(DefaultElements.buttonSubmit);

        eyes.close();
    }

    @Test
    public void whitelabelTableTest() throws Exception {

        squizAction.getPage("gef-components-base", "gef-components-elements");
        eyes.checkRegion(DefaultElements.table);

        eyes.close();
    }

}


