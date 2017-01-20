package au.edu.nsw.doe.digital.closed.automation.tests.squiz.squizuat.desktop.interactions;

import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.tests.squiz.SquizActionMethods;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by christopherpigden on 21/1/17.
 */
public class GefCatalogueSortAzTest extends CapabilitiesBuilder {

    @Test
    public void gefEducationDesktopCatalogueSortAZTest() throws Exception {

        SquizActionMethods squizAction = new SquizActionMethods(driver);

        squizAction.getPage("gef-education-base", "gef-education-catalogue");

        squizAction.catalogueSort("AZ");

        Thread.sleep(3000);


        try {
            ArrayList<String> obtainedList = new ArrayList<>();
            List<WebElement> elementList = driver.findElements(By.xpath("//ul[@class='gef-flex-grid gef-flex-grid--columns uk-margin-bottom']"));
            for (WebElement we : elementList) {
                obtainedList.add(we.getText());
                String actual = we.getText();
                String expected = "A\n" +
                        "A\n" +
                        "$10.0 (exc. GST)\n" +
                        "Lowest\n" +
                        "Cheap\n" +
                        "$0.01 (exc. GST)\n" +
                        "Highest\n" +
                        "Expensive\n" +
                        "$1000000 (exc. GST)\n" +
                        "Z\n" +
                        "Z\n" +
                        "$10.00 (exc. GST)";
                Assert.assertEquals(expected,actual);
                System.out.println("The order when set from a - z is\n" + actual);
            }

        } catch(Exception e){
            System.out.println("List is not as expected");
            throw e;
        }
    }
}

