package au.edu.nsw.doe.digital.closed.automation.tests.squiz.squizproduction.mobile;


import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.tests.squiz.SquizActionMethods;
import org.junit.Test;
import org.openqa.selenium.Dimension;

/**
 * Created by christopherpigden on 9/09/2015.
 */
public class SquizGefFrameworkMobileProductionTest extends CapabilitiesBuilder {

    @Test
    public void gefFrameworkMobileProductionEyesTest() throws Exception {

        SquizActionMethods squizAction = new SquizActionMethods(driver);

        Dimension dimension = new Dimension(375, 650);

        driver.manage().window().setSize(dimension);

        squizAction.getPage("gef-framework-base", "", "", "");
        eyes.checkWindow("Gef Framework Mobile Production Home Page");

        squizAction.mobileSearch(System.getenv("SEARCH-INPUT"));
        eyes.checkWindow("Gef Framework Mobile Search Results Page");

        squizAction.getPage("gef-framework-base", "gef-framework-landing", "", "");
        eyes.checkWindow("Gef Framework Mobile Production Landing Page");

        squizAction.getPage("gef-framework-base", "gef-framework-standard", "", "");
        squizAction.showHide();
        eyes.checkWindow("Gef Framework Mobile Production Standard Page");

        squizAction.getPage("gef-framework-base", "gef-framework-catalogue", "", "");
        eyes.checkWindow("Gef Framework Mobile Production Catalogue Page");

        squizAction.getPage("gef-framework-base", "gef-framework-tab", "", "");
        eyes.checkWindow("Gef Framework Mobile Production Tab Page");

        squizAction.getPage("gef-framework-base", "gef-framework-news-index", "", "");
        eyes.checkWindow(System.getenv("EYES-GEF-FRAMEWORK-NEWS-INDEX"));

        squizAction.getPage("gef-framework-base", "gef-framework-news-article", "", "");
        eyes.checkWindow(System.getenv("EYES-GEF-FRAMEWORK-NEWS-ARTICLE"));

        eyes.close();

    }
}

