package au.edu.nsw.doe.digital.closed.automation.tests.squiz.squizwhitelabelcomponents.mobile;

import au.edu.nsw.doe.digital.closed.automation.pageobjects.whitelabel.FullWidth;
import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.tests.squiz.SquizActionMethods;
import org.junit.Test;
import org.openqa.selenium.Dimension;

/**
 * Created by cpigden on 14/03/2016.
 */
public class SquizMobileGefComponentsFullWidthTest extends CapabilitiesBuilder {




        @Test
        public void whitelabelContentBannerTest() throws Exception {
            SquizActionMethods squizAction = new SquizActionMethods(driver);
            Dimension dimension = new Dimension(375, 650);
            driver.manage().window().setSize(dimension);

            squizAction.getPage("gef-components-base", "gef-components-full");
            eyes.checkRegion(FullWidth.contentBanner);

            eyes.close();
        }

        @Test
        public void whitelabelBreadcrumbsTest() throws Exception {
            SquizActionMethods squizAction = new SquizActionMethods(driver);
            Dimension dimension = new Dimension(375, 650);
            driver.manage().window().setSize(dimension);

            squizAction.getPage("gef-components-base", "gef-components-full");
            eyes.checkRegion(FullWidth.breadcrumbs);

            eyes.close();
        }

        @Test
        public void whitelabelTeasersTest() throws Exception {
            SquizActionMethods squizAction = new SquizActionMethods(driver);
            Dimension dimension = new Dimension(375, 650);
            driver.manage().window().setSize(dimension);

            squizAction.getPage("gef-components-base", "gef-components-full");
            eyes.checkRegion(FullWidth.teasers);

            eyes.close();
        }

        @Test
        public void whitelabelLinkGroupTest() throws Exception {
            SquizActionMethods squizAction = new SquizActionMethods(driver);
            Dimension dimension = new Dimension(375, 650);
            driver.manage().window().setSize(dimension);

            squizAction.getPage("gef-components-base", "gef-components-full");
            eyes.checkRegion(FullWidth.linkGroup);

            eyes.close();
        }

        @Test
        public void whitelabelExpandedNav() throws Exception {
            SquizActionMethods squizAction = new SquizActionMethods(driver);
            Dimension dimension = new Dimension(375, 650);
            driver.manage().window().setSize(dimension);

            squizAction.getPage("gef-components-base", "gef-components-full");
            eyes.checkRegion(FullWidth.expandedNav);

            eyes.close();
        }

        @Test
        public void whitelabelAZAnchorsTest() throws Exception {
            SquizActionMethods squizAction = new SquizActionMethods(driver);
            Dimension dimension = new Dimension(375, 650);
            driver.manage().window().setSize(dimension);

            squizAction.getPage("gef-components-base", "gef-components-full");
            eyes.checkRegion(FullWidth.aZAnchors);

            eyes.close();
        }

        @Test
        public void whitelabelAZListTest() throws Exception {
            SquizActionMethods squizAction = new SquizActionMethods(driver);
            Dimension dimension = new Dimension(375, 650);
            driver.manage().window().setSize(dimension);

            squizAction.getPage("gef-components-base", "gef-components-full");
            eyes.checkRegion(FullWidth.aZList);

            eyes.close();
        }

        @Test
        public void whitelabelLandingHeaderTest() throws Exception {
            SquizActionMethods squizAction = new SquizActionMethods(driver);
            Dimension dimension = new Dimension(375, 650);
            driver.manage().window().setSize(dimension);

            squizAction.getPage("gef-components-base", "gef-components-full");
            eyes.checkRegion(FullWidth.landingHeader);

            eyes.close();
        }

        @Test
        public void whitelabelTableOfContentsTest() throws Exception {
            SquizActionMethods squizAction = new SquizActionMethods(driver);
            Dimension dimension = new Dimension(375, 650);
            driver.manage().window().setSize(dimension);

            squizAction.getPage("gef-components-base", "gef-components-full");
            eyes.checkRegion(FullWidth.tableOfContents);

            eyes.close();
        }

        @Test
        public void whitelabelResultsTableTest() throws Exception {
            SquizActionMethods squizAction = new SquizActionMethods(driver);
            Dimension dimension = new Dimension(375, 650);
            driver.manage().window().setSize(dimension);

            squizAction.getPage("gef-components-base", "gef-components-full");
            eyes.checkRegion(FullWidth.resultsTable);

            eyes.close();
        }

        @Test
        public void whitelabelContentContainerTest() throws Exception {
            SquizActionMethods squizAction = new SquizActionMethods(driver);
            Dimension dimension = new Dimension(375, 650);
            driver.manage().window().setSize(dimension);

            squizAction.getPage("gef-components-base", "gef-components-full");
            eyes.checkRegion(FullWidth.contentContainer);

            eyes.close();
        }

        @Test
        public void whitelabelCatalogueTest() throws Exception {
            SquizActionMethods squizAction = new SquizActionMethods(driver);
            Dimension dimension = new Dimension(375, 650);
            driver.manage().window().setSize(dimension);

            squizAction.getPage("gef-components-base", "gef-components-full");
            eyes.checkRegion(FullWidth.catalogue);

            eyes.close();
        }

        @Test
        public void whitelabelDrawerTest() throws Exception {
            SquizActionMethods squizAction = new SquizActionMethods(driver);
            Dimension dimension = new Dimension(375, 650);
            driver.manage().window().setSize(dimension);

            squizAction.getPage("gef-components-base", "gef-components-full");
            eyes.checkRegion(FullWidth.drawer);

            eyes.close();
        }

        @Test
        public void whitelabelEduBannerTest() throws Exception {
            SquizActionMethods squizAction = new SquizActionMethods(driver);
            Dimension dimension = new Dimension(375, 650);
            driver.manage().window().setSize(dimension);

            squizAction.getPage("gef-components-base", "gef-components-full");
            eyes.checkRegion(FullWidth.eduBanner);

            eyes.close();
        }

        @Test
        public void whitelabelNoticeRibbonTest() throws Exception {
            SquizActionMethods squizAction = new SquizActionMethods(driver);
            Dimension dimension = new Dimension(375, 650);
            driver.manage().window().setSize(dimension);

            squizAction.getPage("gef-components-base", "gef-components-full");
            eyes.checkRegion(FullWidth.noticeRibbon);

            eyes.close();
        }
}


