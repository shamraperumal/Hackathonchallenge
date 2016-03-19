package au.edu.nsw.doe.digital.closed.automation.pageobjects.pws;

import au.edu.nsw.doe.digital.automation.setup.CapabilitiesBuilder;
import org.openqa.selenium.By;


public class DecInternationalSearch extends CapabilitiesBuilder {

    public static By schoolSearchtextField = By.id("_eppinternationalschoolsearchportlet_WAR_eppinternationaldefaultportlet_name");
    public static By schoolSuitableForDropDown = By.id("_eppinternationalschoolsearchportlet_WAR_eppinternationaldefaultportlet_suitablefor");
    public static By schoolSearchSubmitButton = By.id("_eppinternationalschoolsearchportlet_WAR_eppinternationaldefaultportlet_searchsubmit");
    public static By gsaSearchTextField = By.id("searchBox");
    public static By gsaSearchSubmitButton = By.id("searchSubmit");

}
