package au.edu.nsw.doe.digital.closed.automation.tests.squiz.ElasticSearchPreprod;

import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.tests.squiz.SquizActionMethods;
import org.junit.Test;

public class PreprodTopFiftySearchedKeywordsTest extends CapabilitiesBuilder {
@Test
    public void ElasticPageSearch() throws Exception {

        SquizActionMethods squizAction = new SquizActionMethods(driver);

         String[] TopSearchedKeywords=squizAction.ListfromJenkins(System.getenv("keylist"));

         for (int i=0;i<TopSearchedKeywords.length;i++)
         {
             System.out.println("Keyword is " + TopSearchedKeywords[i] );
             String url="/search?site=public_pre_education_nsw_gov_au&q=";
             System.out.println("URL is " + url );
             squizAction.getPageElasticSearch("gef-education-homepage",url,TopSearchedKeywords[i]);
             Thread.sleep(6000);
            eyes.checkWindow(System.getenv(TopSearchedKeywords[i]));
         }

     


}

}
