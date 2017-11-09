package au.edu.nsw.doe.digital.closed.automation.tests.squiz.squizwhitelabelcomponents.desktop;

import au.edu.nsw.doe.digital.closed.automation.pageobjects.whitelabel.FullWidth;
import au.edu.nsw.doe.digital.closed.automation.pageobjects.whitelabel.WidthContained;
import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.tests.squiz.SquizActionMethods;
import org.junit.Test;

/**
 * Created by christopherpigden on 10/3/17.
 */
public class SquizGefComponentsWidthContainedTest extends CapabilitiesBuilder{

    @Override
    public boolean getForceFullPageScreenshot() {
        return false;
    }

    @Test
    public void whitelabelAnchorBoxTest() throws Exception {
        SquizActionMethods squizAction = new SquizActionMethods(driver);

        squizAction.getPage("gef-components-base", "gef-components-width-contained");
        eyes.checkRegion(WidthContained.anchorBox);

        eyes.close();
    }

    @Test
    public void whitelabelBreadcrumbsTest() throws Exception {
        SquizActionMethods squizAction = new SquizActionMethods(driver);

        squizAction.getPage("gef-components-base", "gef-components-width-contained");
        eyes.checkRegion(WidthContained.breadcrumbs);

        eyes.close();
    }

    @Test
    public void whitelabelCallOutBoxTest() throws Exception {
        SquizActionMethods squizAction = new SquizActionMethods(driver);

        squizAction.getPage("gef-components-base", "gef-components-width-contained");
        eyes.checkRegion(WidthContained.callOutBox);

        eyes.close();
    }

    @Test
    public void whitelabelCategoryTest() throws Exception {
        SquizActionMethods squizAction = new SquizActionMethods(driver);

        squizAction.getPage("gef-components-base", "gef-components-width-contained");
        eyes.checkRegion(WidthContained.category);

        eyes.close();
    }

    @Test
    public void whitelabelCategoryListTest() throws Exception {
        SquizActionMethods squizAction = new SquizActionMethods(driver);

        squizAction.getPage("gef-components-base", "gef-components-width-contained");
        eyes.checkRegion(WidthContained.categoryList);

        eyes.close();
    }

    @Test
    public void whitelabelCategorySelectTest() throws Exception {
        SquizActionMethods squizAction = new SquizActionMethods(driver);

        squizAction.getPage("gef-components-base", "gef-components-width-contained");
        eyes.checkRegion(WidthContained.categorySelect);

        eyes.close();
    }

    @Test
    public void whitelabelContentPanelTest() throws Exception {
        SquizActionMethods squizAction = new SquizActionMethods(driver);

        squizAction.getPage("gef-components-base", "gef-components-width-contained");
        eyes.checkRegion(WidthContained.contentPanel);

        eyes.close();
    }

    @Test
    public void whitelabelDatePickerTest() throws Exception {
        SquizActionMethods squizAction = new SquizActionMethods(driver);

        squizAction.getPage("gef-components-base", "gef-components-width-contained");
        eyes.checkRegion(WidthContained.datePicker);

        eyes.close();
    }

    @Test
    public void whitelabelDownloadTest() throws Exception {
        SquizActionMethods squizAction = new SquizActionMethods(driver);

        squizAction.getPage("gef-components-base", "gef-components-width-contained");
        eyes.checkRegion(WidthContained.downLoad);

        eyes.close();
    }

    @Test
    public void whitelabelFeaturedTeaserTest() throws Exception {
        SquizActionMethods squizAction = new SquizActionMethods(driver);

        squizAction.getPage("gef-components-base", "gef-components-width-contained");
        eyes.checkRegion(WidthContained.featuredTeaser);

        eyes.close();
    }

    @Test
    public void whitelabelLeadParagraphTest() throws Exception {
        SquizActionMethods squizAction = new SquizActionMethods(driver);

        squizAction.getPage("gef-components-base", "gef-components-width-contained");
        eyes.checkRegion(WidthContained.leadParagraph);

        eyes.close();
    }

    @Test
    public void whitelabeMetaDataTest() throws Exception {
        SquizActionMethods squizAction = new SquizActionMethods(driver);

        squizAction.getPage("gef-components-base", "gef-components-width-contained");
        eyes.checkRegion(WidthContained.metaData);

        eyes.close();
    }

    @Test
    public void whitelabeNewsTeasersTest() throws Exception {
        SquizActionMethods squizAction = new SquizActionMethods(driver);

        squizAction.getPage("gef-components-base", "gef-components-width-contained");
        eyes.checkRegion(WidthContained.newsTeasers);

        eyes.close();
    }

    @Test
    public void whitelabePaginationTest() throws Exception {
        SquizActionMethods squizAction = new SquizActionMethods(driver);

        squizAction.getPage("gef-components-base", "gef-components-width-contained");
        eyes.checkRegion(WidthContained.pagination);

        eyes.close();
    }

    @Test
    public void whitelabeSearchBoxTest() throws Exception {
        SquizActionMethods squizAction = new SquizActionMethods(driver);

        squizAction.getPage("gef-components-base", "gef-components-width-contained");
        eyes.checkRegion(WidthContained.searchBox);

        eyes.close();
    }

    @Test
    public void whitelabeSearchResultsTest() throws Exception {
        SquizActionMethods squizAction = new SquizActionMethods(driver);

        squizAction.getPage("gef-components-base", "gef-components-width-contained");
        eyes.checkRegion(WidthContained.searchResults);

        eyes.close();
    }

    @Test
    public void whitelabeSearchIndicatorTest() throws Exception {
        SquizActionMethods squizAction = new SquizActionMethods(driver);

        squizAction.getPage("gef-components-base", "gef-components-width-contained");
        eyes.checkRegion(WidthContained.secureIndicator);

        eyes.close();
    }

    @Test
    public void whitelabeShareThisTest() throws Exception {
        SquizActionMethods squizAction = new SquizActionMethods(driver);

        squizAction.getPage("gef-components-base", "gef-components-width-contained");
        eyes.checkRegion(WidthContained.shareThis);

        eyes.close();
    }

    @Test
    public void whitelabeShowHideTest() throws Exception {
        SquizActionMethods squizAction = new SquizActionMethods(driver);

        squizAction.getPage("gef-components-base", "gef-components-width-contained");
        eyes.checkRegion(WidthContained.showHide);

        eyes.close();
    }

    @Test
    public void whitelabeSideNavigationTest() throws Exception {
        SquizActionMethods squizAction = new SquizActionMethods(driver);

        squizAction.getPage("gef-components-base", "gef-components-width-contained");
        eyes.checkRegion(WidthContained.sideNavigation);

        eyes.close();
    }

    @Test
    public void whitelabeTabsTest() throws Exception {
        SquizActionMethods squizAction = new SquizActionMethods(driver);

        squizAction.getPage("gef-components-base", "gef-components-width-contained");
        eyes.checkRegion(WidthContained.tabs);

        eyes.close();
    }

    @Test
    public void whitelabeTagsTest() throws Exception {
        SquizActionMethods squizAction = new SquizActionMethods(driver);

        squizAction.getPage("gef-components-base", "gef-components-width-contained");
        eyes.checkRegion(WidthContained.tags);

        eyes.close();
    }

    @Test
    public void whitelabelFeaturedTeaserVariantTest() throws Exception {
        SquizActionMethods squizAction = new SquizActionMethods(driver);

        squizAction.getPage("gef-components-base", "gef-components-width-contained");
        eyes.checkRegion(WidthContained.featuredTeaserVariant);

        eyes.close();
    }}