package au.edu.nsw.doe.digital.closed.automation.tests.squiz.ElasticSearch;

import au.edu.nsw.doe.digital.closed.automation.pageobjects.squiz.*;
import au.edu.nsw.doe.digital.closed.automation.pageobjects.sso.SsoLogin;
import com.applitools.eyes.Eyes;
import javassist.bytecode.stackmap.BasicBlock;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import au.edu.nsw.doe.digital.closed.automation.setup.CapabilitiesBuilder;
import au.edu.nsw.doe.digital.closed.automation.tests.squiz.SquizActionMethods;
import au.edu.nsw.doe.digital.closed.automation.pageobjects.squiz.*;
import au.edu.nsw.doe.digital.closed.automation.pageobjects.squiz.*;
import au.edu.nsw.doe.digital.closed.automation.pageobjects.sso.SsoLogin;
import com.applitools.eyes.Eyes;
import javassist.bytecode.stackmap.BasicBlock;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.junit.Test;

public class ElasticSeachBaseLineTest extends CapabilitiesBuilder {
@Test
    public void ElasticPageSearch() throws Exception {

        SquizActionMethods squizAction = new SquizActionMethods(driver);

         String[] TopSearchedKeywords=squizAction.ListfromJenkins(System.getenv("keylist"));

         for (int i=0;i<TopSearchedKeywords.length;i++)
         {
             System.out.println("Keyword is " + TopSearchedKeywords[i] );
             String url="/search?site=public_ce_dec_nsw_gov_au&q="+TopSearchedKeywords[i];
             System.out.println("URL is " + url );
             squizAction.getPage("gef-education-homepage",url);
             eyes.checkWindow(System.getenv(TopSearchedKeywords[i]));

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
