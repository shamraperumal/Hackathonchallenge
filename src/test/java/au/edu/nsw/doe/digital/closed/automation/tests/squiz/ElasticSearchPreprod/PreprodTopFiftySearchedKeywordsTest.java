package au.edu.nsw.doe.digital.closed.automation.tests.squiz.ElasticSearchPreprod;

import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.setup.LocalSetup;
import au.edu.nsw.doe.digital.closed.automation.tests.squiz.SquizActionMethods;
import org.junit.Test;

public class PreprodTopFiftySearchedKeywordsTest extends CapabilitiesBuilder {
@Test
    public void ElasticPageSearch() throws Exception {

        SquizActionMethods squizAction = new SquizActionMethods(driver);

        String[] TopSearchedKeywords=squizAction.ListfromJenkins(System.getenv("keylist"));

    //use below if you are running in local machine and not from jenkins
//    String[] TopSearchedKeywords= {"Parramatta","child protection"};


    for (int i=0;i<TopSearchedKeywords.length;i++)
         {
             System.out.println("Keyword is " + TopSearchedKeywords[i] );
             String url="/search?site=public_pre_education_nsw_gov_au&q=";
             //https://pre.education.nsw.gov.au/search?site=public_pre_education_nsw_gov_au&q=pdp
             System.out.println("URL is " + url );
             squizAction.getPageElasticSearch("gef-education-homepage",url,TopSearchedKeywords[i]);
             Thread.sleep(6000);
           // eyes.checkWindow(System.getenv(TopSearchedKeywords[i]));
         }


}

}
