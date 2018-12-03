package au.edu.nsw.doe.digital.closed.automation.tests.squiz.InsideTheDept;

import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.setup.LocalSetup;
import au.edu.nsw.doe.digital.closed.automation.tests.squiz.SquizActionMethods;
import org.junit.Test;

public class StaffOnlyTopFiftySearchedKeywordsTest extends CapabilitiesBuilder {
@Test
    public void ElasticPageSearchStaffOnly() throws Exception {

        SquizActionMethods squizAction = new SquizActionMethods(driver);

        String[] TopSearchedKeywords=squizAction.ListfromJenkins(System.getenv("keylist"));
     //use below if you are running in local machine and not from jenkins
     //String[] TopSearchedKeywords= {"Parramatta","child protection","code of conduct","student portal","fitness passport","scout","sentral","mathletics","cool math","games","scootle"};

         squizAction.getPage("gef-education-homepage","");
         squizAction.ssoLoginEntry();
         eyes.setForceFullPageScreenshot(true);

    for (int i=0;i<TopSearchedKeywords.length;i++)
         {
             System.out.println("Keyword is " + TopSearchedKeywords[i] );
             String url="inside-the-department/search?q=";
             System.out.println("URL is " + url );
             squizAction.getPageElasticSearch("gef-education-homepage",url,TopSearchedKeywords[i]);
             eyes.checkWindow(System.getenv(TopSearchedKeywords[i]));
             Thread.sleep(200);
         }

     }

}
