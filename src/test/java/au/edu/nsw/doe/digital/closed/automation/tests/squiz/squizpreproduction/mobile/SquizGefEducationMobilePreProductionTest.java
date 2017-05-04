package au.edu.nsw.doe.digital.closed.automation.tests.squiz.squizpreproduction.mobile;


import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.tests.squiz.SquizActionMethods;
import org.junit.Test;
import org.openqa.selenium.Dimension;

/**
 * Created by christopherpigden on 9/09/2015.
 */
public class SquizGefEducationMobilePreProductionTest extends CapabilitiesBuilder {

    @Test
    public void gefEducationMobilePreProductionEyesTest() throws Exception {

        SquizActionMethods squizAction = new SquizActionMethods(driver);

        Dimension dimension = new Dimension(375, 650);

        driver.manage().window().setSize(dimension);

        squizAction.getPage("gef-education-base", "");
        eyes.checkWindow(System.getenv("EYES-GEF-EDUCATION-HOME"));

        squizAction.getPage("gef-education-base", "gef-education-landing");
        eyes.checkWindow(System.getenv("EYES-GEF-EDUCATION-LANDING"));

        squizAction.getPage("gef-education-base", "gef-education-standard");
        squizAction.showHide();
        eyes.checkWindow(System.getenv("EYES-GEF-EDUCATION-STANDARD"));

        squizAction.getPage("gef-education-base", "gef-education-catalogue");
        eyes.checkWindow(System.getenv("EYES-GEF-EDUCATION-CATALOGUE"));

        squizAction.getPage("gef-education-base", "gef-education-tab");
        eyes.checkWindow(System.getenv("EYES-GEF-EDUCATION-TAB"));

        squizAction.getPage("gef-education-base", "gef-education-news-index");
        eyes.checkWindow(System.getenv("EYES-GEF-FRAMEWORK-NEWS-INDEX"));

        squizAction.getPage("gef-education-base", "gef-education-news-article");
        eyes.checkWindow(System.getenv("EYES-GEF-EDUCATION-NEWS-ARTICLE"));

        squizAction.getPage("gef-education-base-curriculum", "");
        eyes.checkWindow(System.getenv("EYES-GEF-EDUCATION-CURRICULUM"));

        squizAction.getPage("gef-education-base-curriculum", "gef-education-curriculum-landing");
        eyes.checkWindow(System.getenv("EYES-GEF-EDUCATION-CURRICULUM-LANDING"));

        squizAction.getPage("gef-education-base-curriculum", "gef-education-curriculum-standard");
        eyes.checkWindow(System.getenv("EYES-GEF-EDUCATION-CURRICULUM-STANDARD"));

        eyes.close();

    }
}
