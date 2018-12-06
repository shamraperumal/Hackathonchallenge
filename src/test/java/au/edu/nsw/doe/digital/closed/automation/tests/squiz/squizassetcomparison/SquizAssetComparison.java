package au.edu.nsw.doe.digital.closed.automation.tests.squiz.squizassetcomparison;

import au.edu.nsw.doe.digital.closed.automation.setup.*;
import au.edu.nsw.doe.digital.closed.automation.tests.squiz.*;
import org.junit.*;

//Added by shamra on 16-11-18
public class SquizAssetComparison  extends CapabilitiesBuilder{

    @Test
    public void assetComparison() throws Exception {

    {

        SquizActionMethods squizAction = new SquizActionMethods(driver);
        squizAction.getPage("squiz-base","");
        squizAction.compareExcel("username","password");
    }
}
}
