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
     //String[] TopSearchedKeywords= {"Parramatta"};

         for (int i=0;i<TopSearchedKeywords.length;i++)
         {
             System.out.println("Keyword is " + TopSearchedKeywords[i] );
             String url="inside-the-department/search?q=";
             System.out.println("URL is " + url );
             squizAction.getPage("gef-education-homepage","");
             squizAction.ssoLoginEntry();
             squizAction.getPageElasticSearch("gef-education-homepage",url,TopSearchedKeywords[i]);
             eyes.checkWindow(System.getenv(TopSearchedKeywords[i]));
             Thread.sleep(6000);
         }

     /*
     squizAction.ssoLoginEntry();

         for (int i=0;i<TopSearchedKeywords.length;i++)
           {
            System.out.println("Keyword is" + TopSearchedKeywords[i] );
            String url="search?site=public_ce_dec_nsw_gov_au&q="+TopSearchedKeywords[i];
            squizAction.getPage("gef-education-homepage",url);
        //   eyes.checkWindow(System.getenv(TopSearchedKeywords[i]));

           }
           */


}

}
