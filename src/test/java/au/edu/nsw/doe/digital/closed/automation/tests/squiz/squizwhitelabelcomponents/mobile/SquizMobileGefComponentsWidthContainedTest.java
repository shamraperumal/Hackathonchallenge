package au.edu.nsw.doe.digital.closed.automation.tests.squiz.squizwhitelabelcomponents.mobile;

import au.edu.nsw.doe.digital.closed.automation.pageobjects.whitelabel.WidthContained;
import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.tests.squiz.SquizActionMethods;
import org.junit.Test;
import org.openqa.selenium.Dimension;

/**
 * Created by cpigden on 14/03/2016.
 */
public class SquizMobileGefComponentsWidthContainedTest extends CapabilitiesBuilder {

    @Test
    public void whitelabelMobileAnchorBoxTest() throws Exception {
        SquizActionMethods squizAction = new SquizActionMethods(driver);
        Dimension dimension = new Dimension(375, 650);
        driver.manage().window().setSize(dimension);

        squizAction.getPage("gef-components-base", "gef-components-width-contained");
        eyes.checkRegion(WidthContained.anchorBox);

        eyes.close();
    }

    @Test
    public void whitelabelMobileBreadcrumbsTest() throws Exception {
        SquizActionMethods squizAction = new SquizActionMethods(driver);
        Dimension dimension = new Dimension(375, 650);
        driver.manage().window().setSize(dimension);

        squizAction.getPage("gef-components-base", "gef-components-width-contained");
        eyes.checkRegion(WidthContained.breadcrumbs);

        eyes.close();
    }

    @Test
    public void whitelabelMobileCallOutBoxTest() throws Exception {
        SquizActionMethods squizAction = new SquizActionMethods(driver);
        Dimension dimension = new Dimension(375, 650);
        driver.manage().window().setSize(dimension);

        squizAction.getPage("gef-components-base", "gef-components-width-contained");
        eyes.checkRegion(WidthContained.callOutBox);

        eyes.close();
    }

    @Test
    public void whitelabelMobileCategoryTest() throws Exception {
        SquizActionMethods squizAction = new SquizActionMethods(driver);
        Dimension dimension = new Dimension(375, 650);
        driver.manage().window().setSize(dimension);

        squizAction.getPage("gef-components-base", "gef-components-width-contained");
        eyes.checkRegion(WidthContained.category);

        eyes.close();
    }

    @Test
    public void whitelabelMobileCategoryListTest() throws Exception {
        SquizActionMethods squizAction = new SquizActionMethods(driver);
        Dimension dimension = new Dimension(375, 650);
        driver.manage().window().setSize(dimension);

        squizAction.getPage("gef-components-base", "gef-components-width-contained");
        eyes.checkRegion(WidthContained.categoryList);

        eyes.close();
    }

    @Test
    public void whitelabelMobileCategorySelectTest() throws Exception {
        SquizActionMethods squizAction = new SquizActionMethods(driver);
        Dimension dimension = new Dimension(375, 650);
        driver.manage().window().setSize(dimension);

        squizAction.getPage("gef-components-base", "gef-components-width-contained");
        eyes.checkRegion(WidthContained.categorySelect);

        eyes.close();
    }

    @Test
    public void whitelabelMobileContentPanelTest() throws Exception {
        SquizActionMethods squizAction = new SquizActionMethods(driver);
        Dimension dimension = new Dimension(375, 650);
        driver.manage().window().setSize(dimension);

        squizAction.getPage("gef-components-base", "gef-components-width-contained");
        eyes.checkRegion(WidthContained.contentPanel);

        eyes.close();
    }

    @Test
    public void whitelabelMobileDatePickerTest() throws Exception {
        SquizActionMethods squizAction = new SquizActionMethods(driver);
        Dimension dimension = new Dimension(375, 650);
        driver.manage().window().setSize(dimension);

        squizAction.getPage("gef-components-base", "gef-components-width-contained");
        eyes.checkRegion(WidthContained.datePicker);

        eyes.close();
    }

    @Test
    public void whitelabelMobileDownloadTest() throws Exception {
        SquizActionMethods squizAction = new SquizActionMethods(driver);
        Dimension dimension = new Dimension(375, 650);
        driver.manage().window().setSize(dimension);

        squizAction.getPage("gef-components-base", "gef-components-width-contained");
        eyes.checkRegion(WidthContained.downLoad);

        eyes.close();
    }

    @Test
    public void whitelabelMobileFeaturedTeaserTest() throws Exception {
        SquizActionMethods squizAction = new SquizActionMethods(driver);
        Dimension dimension = new Dimension(375, 650);
        driver.manage().window().setSize(dimension);

        squizAction.getPage("gef-components-base", "gef-components-width-contained");
        eyes.checkRegion(WidthContained.featuredTeaser);

        eyes.close();
    }

    @Test
    public void whitelabelMobileLeadParagraphTest() throws Exception {
        SquizActionMethods squizAction = new SquizActionMethods(driver);
        Dimension dimension = new Dimension(375, 650);
        driver.manage().window().setSize(dimension);

        squizAction.getPage("gef-components-base", "gef-components-width-contained");
        eyes.checkRegion(WidthContained.leadParagraph);

        eyes.close();
    }

    @Test
    public void whitelabelMobileMetaDataTest() throws Exception {
        SquizActionMethods squizAction = new SquizActionMethods(driver);
        Dimension dimension = new Dimension(375, 650);
        driver.manage().window().setSize(dimension);

        squizAction.getPage("gef-components-base", "gef-components-width-contained");
        eyes.checkRegion(WidthContained.metaData);

        eyes.close();
    }

    @Test
    public void whitelabelMobileNewsTeasersTest() throws Exception {
        SquizActionMethods squizAction = new SquizActionMethods(driver);
        Dimension dimension = new Dimension(375, 650);
        driver.manage().window().setSize(dimension);

        squizAction.getPage("gef-components-base", "gef-components-width-contained");
        eyes.checkRegion(WidthContained.newsTeasers);

        eyes.close();
    }

    @Test
    public void whitelabelMobilePaginationTest() throws Exception {
        SquizActionMethods squizAction = new SquizActionMethods(driver);
        Dimension dimension = new Dimension(375, 650);
        driver.manage().window().setSize(dimension);

        squizAction.getPage("gef-components-base", "gef-components-width-contained");
        eyes.checkRegion(WidthContained.pagination);

        eyes.close();
    }

    @Test
    public void whitelabelMobileSearchBoxTest() throws Exception {
        SquizActionMethods squizAction = new SquizActionMethods(driver);
        Dimension dimension = new Dimension(375, 650);
        driver.manage().window().setSize(dimension);

        squizAction.getPage("gef-components-base", "gef-components-width-contained");
        eyes.checkRegion(WidthContained.searchBox);

        eyes.close();
    }

    @Test
    public void whitelabelMobileSearchResultsTest() throws Exception {
        SquizActionMethods squizAction = new SquizActionMethods(driver);
        Dimension dimension = new Dimension(375, 650);
        driver.manage().window().setSize(dimension);

        squizAction.getPage("gef-components-base", "gef-components-width-contained");
        eyes.checkRegion(WidthContained.searchResults);

        eyes.close();
    }

    @Test
    public void whitelabelMobileSearchIndicatorTest() throws Exception {
        SquizActionMethods squizAction = new SquizActionMethods(driver);
        Dimension dimension = new Dimension(375, 650);
        driver.manage().window().setSize(dimension);

        squizAction.getPage("gef-components-base", "gef-components-width-contained");
        eyes.checkRegion(WidthContained.secureIndicator);

        eyes.close();
    }

    @Test
    public void whitelabelMobileShareThisTest() throws Exception {
        SquizActionMethods squizAction = new SquizActionMethods(driver);
        Dimension dimension = new Dimension(375, 650);
        driver.manage().window().setSize(dimension);

        squizAction.getPage("gef-components-base", "gef-components-width-contained");
        eyes.checkRegion(WidthContained.shareThis);

        eyes.close();
    }

    @Test
    public void whitelabelMobileShowHideTest() throws Exception {
        SquizActionMethods squizAction = new SquizActionMethods(driver);
        Dimension dimension = new Dimension(375, 650);
        driver.manage().window().setSize(dimension);

        squizAction.getPage("gef-components-base", "gef-components-width-contained");
        eyes.checkRegion(WidthContained.showHide);

        eyes.close();
    }

    @Test
    public void whitelabelMobileSideNavigationTest() throws Exception {
        SquizActionMethods squizAction = new SquizActionMethods(driver);
        Dimension dimension = new Dimension(375, 650);
        driver.manage().window().setSize(dimension);

        squizAction.getPage("gef-components-base", "gef-components-width-contained");
        eyes.checkRegion(WidthContained.sideNavigation);

        eyes.close();
    }

    @Test
    public void whitelabelMobileTabsTest() throws Exception {
        SquizActionMethods squizAction = new SquizActionMethods(driver);
        Dimension dimension = new Dimension(375, 650);
        driver.manage().window().setSize(dimension);

        squizAction.getPage("gef-components-base", "gef-components-width-contained");
        eyes.checkRegion(WidthContained.tabs);

        eyes.close();
    }

    @Test
    public void whitelabelMobileTagsTest() throws Exception {
        SquizActionMethods squizAction = new SquizActionMethods(driver);
        Dimension dimension = new Dimension(375, 650);
        driver.manage().window().setSize(dimension);

        squizAction.getPage("gef-components-base", "gef-components-width-contained");
        eyes.checkRegion(WidthContained.tags);

        eyes.close();
    }
}

