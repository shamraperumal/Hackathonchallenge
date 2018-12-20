package au.edu.nsw.doe.digital.closed.automation.tests.squiz.ElasticSearchPreprod;

import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.setup.LocalSetup;
import au.edu.nsw.doe.digital.closed.automation.tests.squiz.SquizActionMethods;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;

public class PreprodTopFiftySearchedKeywordsTest extends CapabilitiesBuilder {
@Test
    public void ElasticPageSearchPreprod() throws Exception {

        SquizActionMethods squizAction = new SquizActionMethods(driver);

      String[] TopSearchedKeywords=squizAction.ListfromJenkins(System.getenv("keylist"));

    //use below if you are running in local machine and not from jenkins
  //
  //  String[] TopSearchedKeywords= {"Parramatta","child protection"};

    // Need login function for pre-prod squiz
        squizAction.SquizAdminloginfunction();
       // driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");

  //  ((JavascriptExecutor)driver).executeScript("window.open()");
    //ArrayList<String> tabs = new  ArrayList<String>(driver.getWindowHandles());

     //  driver.switchTo().window(tabs.get(1));


    for (int i=0;i<TopSearchedKeywords.length;i++)
         {
             System.out.println("Keyword is " + TopSearchedKeywords[i] );
             String url="search?site=public_ce_dec_nsw_gov_au&q=";
             //https://pre.education.nsw.gov.au/search?site=public_pre_education_nsw_gov_au&q=pdp
             System.out.println("Search URL to be appended" + url );
             squizAction.getPageElasticSearch("gef-education-homepage",url,TopSearchedKeywords[i]);
             Thread.sleep(200);
            eyes.checkWindow(System.getenv(TopSearchedKeywords[i]));
         }

    // eyes.close();
}

}
