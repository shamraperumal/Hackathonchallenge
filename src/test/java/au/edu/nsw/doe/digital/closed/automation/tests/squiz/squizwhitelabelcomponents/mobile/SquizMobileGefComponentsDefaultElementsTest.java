package au.edu.nsw.doe.digital.closed.automation.tests.squiz.squizwhitelabelcomponents.mobile;

import au.edu.nsw.doe.digital.closed.automation.pageobjects.whitelabel.DefaultElements;
import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.tests.squiz.SquizActionMethods;
import org.junit.Test;
import org.openqa.selenium.Dimension;

/**
 * Created by cpigden on 5/02/2016.
 */
public class SquizMobileGefComponentsDefaultElementsTest extends CapabilitiesBuilder {




        @Test
        public void whitelabelMobileLinksTest() throws Exception {
            SquizActionMethods squizAction = new SquizActionMethods(driver);
            Dimension dimension = new Dimension(375, 650);

            driver.manage().window().setSize(dimension);

            squizAction.getPage("gef-components-base", "gef-components-elements");
            eyes.checkRegion(DefaultElements.linkList);

            eyes.close();
        }


        @Test
        public void whitelabelMobileTypographyTest() throws Exception {
            SquizActionMethods squizAction = new SquizActionMethods(driver);
            Dimension dimension = new Dimension(375, 650);

            driver.manage().window().setSize(dimension);

            squizAction.getPage("gef-components-base", "gef-components-elements");
            eyes.checkRegion(DefaultElements.typography);


            eyes.close();
        }

        @Test
        public void whitelabelMobileBlockQuoteTest() throws Exception {
            SquizActionMethods squizAction = new SquizActionMethods(driver);
            Dimension dimension = new Dimension(375, 650);

            driver.manage().window().setSize(dimension);

            squizAction.getPage("gef-components-base", "gef-components-elements");
            eyes.checkRegion(DefaultElements.blockQuote);

            eyes.close();
        }

        @Test
        public void whitelabelMobileiframeTest() throws Exception {
            SquizActionMethods squizAction = new SquizActionMethods(driver);
            Dimension dimension = new Dimension(375, 650);

            driver.manage().window().setSize(dimension);

            squizAction.getPage("gef-components-base", "gef-components-elements");
            eyes.checkRegion(DefaultElements.iFrame);

            eyes.close();
        }

        @Test
        public void whitelabelMobileListsTest() throws Exception {
            SquizActionMethods squizAction = new SquizActionMethods(driver);
            Dimension dimension = new Dimension(375, 650);

            driver.manage().window().setSize(dimension);

            squizAction.getPage("gef-components-base", "gef-components-elements");
            eyes.checkRegion(DefaultElements.lists);

            eyes.close();
        }

        @Test
        public void whitelabelMobileImageCaptionTest() throws Exception {
            SquizActionMethods squizAction = new SquizActionMethods(driver);
            Dimension dimension = new Dimension(375, 650);

            driver.manage().window().setSize(dimension);

            squizAction.getPage("gef-components-base", "gef-components-elements");
            eyes.checkRegion(DefaultElements.imageCaption);

            eyes.close();
        }

        @Test
        public void whitelabelMobileButtonSubmit() throws Exception {
            SquizActionMethods squizAction = new SquizActionMethods(driver);
            Dimension dimension = new Dimension(375, 650);

            driver.manage().window().setSize(dimension);

            squizAction.getPage("gef-components-base", "gef-components-elements");
            eyes.checkRegion(DefaultElements.buttonSubmit);

            eyes.close();
        }

        @Test
        public void whitelabelMobileTableTest() throws Exception {
            SquizActionMethods squizAction = new SquizActionMethods(driver);
            Dimension dimension = new Dimension(375, 650);

            driver.manage().window().setSize(dimension);

            squizAction.getPage("gef-components-base", "gef-components-elements");
            eyes.checkRegion(DefaultElements.table);

            eyes.close();
        }
}
