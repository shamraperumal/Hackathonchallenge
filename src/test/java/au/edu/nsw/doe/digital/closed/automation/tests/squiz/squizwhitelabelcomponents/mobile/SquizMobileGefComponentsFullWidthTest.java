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

    @Override
    public boolean getForceFullPageScreenshot() {
        return false;
    }

        @Test
        public void whitelabelMobileContentBannerTest() throws Exception {
            SquizActionMethods squizAction = new SquizActionMethods(driver);
            Dimension dimension = new Dimension(375, 650);
            driver.manage().window().setSize(dimension);

            squizAction.getPage("gef-components-base", "gef-components-full");
            eyes.checkRegion(FullWidth.contentBanner);

            eyes.close();
        }

        @Test
        public void whitelabelMobileBreadcrumbsTest() throws Exception {
            SquizActionMethods squizAction = new SquizActionMethods(driver);
            Dimension dimension = new Dimension(375, 650);
            driver.manage().window().setSize(dimension);

            squizAction.getPage("gef-components-base", "gef-components-full");
            eyes.checkRegion(FullWidth.breadcrumbs);

            eyes.close();
        }

        @Test
        public void whitelabelMobileTeasersTest() throws Exception {
            SquizActionMethods squizAction = new SquizActionMethods(driver);
            Dimension dimension = new Dimension(375, 650);
            driver.manage().window().setSize(dimension);

            squizAction.getPage("gef-components-base", "gef-components-full");
            eyes.checkRegion(FullWidth.teasers);

            eyes.close();
        }

        @Test
        public void whitelabelMobileLinkGroupTest() throws Exception {
            SquizActionMethods squizAction = new SquizActionMethods(driver);
            Dimension dimension = new Dimension(375, 650);
            driver.manage().window().setSize(dimension);

            squizAction.getPage("gef-components-base", "gef-components-full");
            eyes.checkRegion(FullWidth.linkGroup);

            eyes.close();
        }

        @Test
        public void whitelabelMobileExpandedNav() throws Exception {
            SquizActionMethods squizAction = new SquizActionMethods(driver);
            Dimension dimension = new Dimension(375, 650);
            driver.manage().window().setSize(dimension);

            squizAction.getPage("gef-components-base", "gef-components-full");
            eyes.checkRegion(FullWidth.expandedNav);

            eyes.close();
        }

        @Test
        public void whitelabelMobileAZAnchorsTest() throws Exception {
            SquizActionMethods squizAction = new SquizActionMethods(driver);
            Dimension dimension = new Dimension(375, 650);
            driver.manage().window().setSize(dimension);

            squizAction.getPage("gef-components-base", "gef-components-full");
            eyes.checkRegion(FullWidth.aZAnchors);

            eyes.close();
        }

        @Test
        public void whitelabelMobileAZListTest() throws Exception {
            SquizActionMethods squizAction = new SquizActionMethods(driver);
            Dimension dimension = new Dimension(375, 650);
            driver.manage().window().setSize(dimension);

            squizAction.getPage("gef-components-base", "gef-components-full");
            eyes.checkRegion(FullWidth.aZList);

            eyes.close();
        }

        @Test
        public void whitelabelMobileLandingHeaderTest() throws Exception {
            SquizActionMethods squizAction = new SquizActionMethods(driver);
            Dimension dimension = new Dimension(375, 650);
            driver.manage().window().setSize(dimension);

            squizAction.getPage("gef-components-base", "gef-components-full");
            eyes.checkRegion(FullWidth.landingHeader);

            eyes.close();
        }

        @Test
        public void whitelabelMobileTableOfContentsTest() throws Exception {
            SquizActionMethods squizAction = new SquizActionMethods(driver);
            Dimension dimension = new Dimension(375, 650);
            driver.manage().window().setSize(dimension);

            squizAction.getPage("gef-components-base", "gef-components-full");
            eyes.checkRegion(FullWidth.tableOfContents);

            eyes.close();
        }

        @Test
        public void whitelabelMobileResultsTableTest() throws Exception {
            SquizActionMethods squizAction = new SquizActionMethods(driver);
            Dimension dimension = new Dimension(375, 650);
            driver.manage().window().setSize(dimension);

            squizAction.getPage("gef-components-base", "gef-components-full");
            eyes.checkRegion(FullWidth.resultsTable);

            eyes.close();
        }

        @Test
        public void whitelabelMobileContentContainerTest() throws Exception {
            SquizActionMethods squizAction = new SquizActionMethods(driver);
            Dimension dimension = new Dimension(375, 650);
            driver.manage().window().setSize(dimension);

            squizAction.getPage("gef-components-base", "gef-components-full");
            eyes.checkRegion(FullWidth.contentContainer);

            eyes.close();
        }

        @Test
        public void whitelabelMobileCatalogueTest() throws Exception {
            SquizActionMethods squizAction = new SquizActionMethods(driver);
            Dimension dimension = new Dimension(375, 650);
            driver.manage().window().setSize(dimension);

            squizAction.getPage("gef-components-base", "gef-components-full");
            eyes.checkRegion(FullWidth.catalogue);

            eyes.close();
        }

        @Test
        public void whitelabelMobileDrawerTest() throws Exception {
            SquizActionMethods squizAction = new SquizActionMethods(driver);
            Dimension dimension = new Dimension(375, 650);
            driver.manage().window().setSize(dimension);

            squizAction.getPage("gef-components-base", "gef-components-full");
            eyes.checkRegion(FullWidth.drawer);

            eyes.close();
        }

        @Test
        public void whitelabelMobileEduBannerTest() throws Exception {
            SquizActionMethods squizAction = new SquizActionMethods(driver);
            Dimension dimension = new Dimension(375, 650);
            driver.manage().window().setSize(dimension);

            squizAction.getPage("gef-components-base", "gef-components-full");
            eyes.checkRegion(FullWidth.eduBanner);

            eyes.close();
        }

        @Test
        public void whitelabelMobileNoticeRibbonTest() throws Exception {
            SquizActionMethods squizAction = new SquizActionMethods(driver);
            Dimension dimension = new Dimension(375, 650);
            driver.manage().window().setSize(dimension);

            squizAction.getPage("gef-components-base", "gef-components-full");
            eyes.checkRegion(FullWidth.noticeRibbon);

            eyes.close();
        }
}


