package au.edu.nsw.doe.digital.closed.automation.tests.applifashion;

import au.edu.nsw.doe.digital.closed.automation.pageobjects.Applifashion.*;

import au.edu.nsw.doe.digital.closed.automation.setup.*;
import au.edu.nsw.doe.digital.closed.automation.tests.functions.*;
import com.applitools.eyes.selenium.fluent.*;
import org.junit.*;

public class Test1 extends Setup {
    private ApplifashionActions action;




  @Test
    public void Test1() throws Exception {
        {
            action = new ApplifashionActionMethods(driver);

            action.getPage("AppliFashion", " ");
            action.wait(GlobalElements.filterType);
            eyes.checkWindow("main page");
            eyes.close();
        }
    }

    @Test
    public void Test2() throws Exception {
        {
            action = new ApplifashionActionMethods(driver);

            action.getPage("AppliFashion", " ");
            action.wait(GlobalElements.filterType);
            action.selectfiltertypeandvalue("colors", "Black");
            action.wait(GlobalElements.productGrid);

            eyes.check("filter by color", Target.region(GlobalElements.productGrid));
            eyes.close();

        }
    }

    @Test
    public void Test3() throws Exception {
        {
            action = new ApplifashionActionMethods(driver);

            action.getPage("AppliFashion", " ");
            action.wait(GlobalElements.filterType);
            action.selectproduct("Appli Air x Night");

            eyes.checkWindow("product details");
            eyes.close();

        }
    }
}