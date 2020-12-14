package au.edu.nsw.doe.digital.closed.automation.pageobjects.Applifashion;

import org.openqa.selenium.*;

public class GlobalElements {


    public static By megaMenu = By.xpath("//div[@class='sws-mega-menu uk-visible-large']");
    public static By megaMobileMenu = By.xpath("//nav[@class='uk-width-1-1 uk-container uk-container-center uk-flex uk-flex-center uk-flex-space-between']");
    public static By globalLogo = By.xpath("//img[@class='gef-corporate-logo__image']");

    //Clickable web elements
    public static By loginButton = By.id("logindropdownbtn");
    public static By subMenuLink1 = By.cssSelector(".uk-parent:nth-child(4) .sws-meganav-megalinks");
    public static By subMenu = By.cssSelector(".uk-dropdown-bottom");
    public static By mobileMegaMenu = By.xpath("//button[@class='uk-navbar-toggle sws-local-mobile-nav__icon--nav']");
    public static By mobileNavExpanded = By.id("mobile-nav-container");
    public static By searchField=By.cssSelector("#sws-search-textfield");
    public static By search=By.id("search");
    public static By searchSubmitButton=By.cssSelector("#search-textfield__submit");
    public static By pagination=By.id("pagination");

    //Added by shamra for functional tests

    //AEM login
    public static By  username =By.id("idToken1");
    public static By password =By.id("idToken2");
    public static By login=By.id("loginButton_0");

    //Sites page
    public static By AEM = By.id("#globalNavHeader");
    public static By sites = By.cssSelector(".coral3-Icon--pages+ .globalnav-homecard-title");
    public static By assets = By.cssSelector(".globalnav-collection-container .globalnav-homecard-chevron+ .globalnav-homecard-title");

    public static By files = By.cssSelector(".coral3-Icon--folder+.globalnav-homecard-title");
    //public static By Assetfoldername=By.cssSelector(".coral3-Card-title");
    public static By Assetfoldername=By.cssSelector(".coral-Table-body .foundation-layout-table-cellwrapper");

    //Create options
    public static By createOptions=By.cssSelector(".foundation-layout-panel-header .foundation-collection-actionbar .granite-pulldown-overlay .coral3-Popover-content .coral3-AnchorList .coral3-BasicList-item-outerContainer .coral3-BasicList-item-content");

    public static By CreateButton = By.cssSelector(".coral3-Button--primary");
    public static By PagePropertiesSaveAndClose = By.id("shell-propertiespage-doneactivator");
    public static By PagePropertiesCancel = By.id("shell-propertiespage-doneactivator");
    public static By CreateAlbum = By.cssSelector(".coral3-Icon--imageAlbum+ .coral3-BasicList-item-outerContainer .coral3-BasicList-item-content");
    public static By createEvent=By.cssSelector(".coral3-Icon--calendar+ .coral3-BasicList-item-outerContainer .coral3-BasicList-item-content");
    public static By createNewsLetter=By.cssSelector(".coral3-Icon--feed+ .coral3-BasicList-item-outerContainer .coral3-BasicList-item-content");
    public static By createPage=By.cssSelector(".coral3-Icon--experience+ .coral3-BasicList-item-outerContainer .coral3-BasicList-item-content");
    public static By createNews=By.cssSelector(".coral3-Icon--news+ .coral3-BasicList-item-outerContainer .coral3-BasicList-item-content");

    public static By confirmDialogBoxbuttonOpen=By.cssSelector(".coral3-Dialog-footer .coral3-Button--secondary+ .coral3-Button--primary");
    public static By configureComponent=By.cssSelector("#EditableToolbar .coral3-Button");
    public static By selectEditabaleToolBar=By.cssSelector(".cq-Overlay--component");
    public static By RTE=By.cssSelector(".coral-RichText-editable");
    public static By albumAddButton=By.cssSelector("#custom-multifiled-class .coral3-Button--secondary");
    public static By selectImage=By.cssSelector("#custom-multifiled-class .coral-InputGroup .coral-InputGroup-button .coral3-Button--secondary");

    public static By pickerDialogSubmitButton=By.cssSelector(".granite-pickerdialog-submit");
    public static By pickerDialogIframeSubmitButton=By.cssSelector(".asset-picker-done");
    public static By selectpath=By.cssSelector(".foundation-layout-panel-bodywrapper .coral3-ColumnView-column .coral3-ColumnView-item--drilldown .foundation-collection-item-title");

    public static By selectImageThumbnail=By.tagName("img");
    public static By imageCaption=By.id("Attachment Label");
    public static By dialogStatusDone=By.cssSelector(".cq-dialog-submit");
    public static By dialogStatusCancel=By.cssSelector(".cq-dialog-cancel");
    public static By searchContentLocator=By.cssSelector(".coral3-Icon--search");
    public static By sitessearchinputfeild=By.cssSelector(".granite-omnisearch-typeahead-input");
    public static By searchInputfeild=By.cssSelector(".coral3-Textfield");
    public static By listdropdown=By.cssSelector("#granite-collection-switcher-toggle");
    public static By listview=By.cssSelector("#granite-collection-switcher-toggle .coral3-Icon--viewList");

  public static By searchcontentresult=By.cssSelector(".granite-omnisearch-content .granite-omnisearch-result .foundation-collection-navigator");


    public static By dialogBoxConfirmDeleteAssets=By.cssSelector("#deleteAssetDialog .coral3-Button--warning");
    public static By dialogBoxConfirmDelete=By.cssSelector(".coral3-Button--warning");

    public static By searchimage=By.cssSelector(".coral-TabPanel-content .coral-TabPanel-pane .coral-FixedColumn-column .coral-Form-fieldwrapper .js-browse-activator");
    public static By iframeElement=By.cssSelector(".doe-AssetPicker-iframe");

    public static By componentInputFields=By.cssSelector(".coral-TabPanel-content .coral-TabPanel-pane .coral-FixedColumn-column .coral-Form-fieldwrapper .coral-Textfield");
    public static By componentInputFieldsvariation2=By.cssSelector(".coral-TabPanel-content .coral-TabPanel-pane .coral-FixedColumn-column .coral-Form-fieldwrapper .coral3-Textfield");
    public static By componentCheckfeild=By.cssSelector(".coral3-Checkbox-input");

    public static By componentCheckfeildname=By.cssSelector(".coral-TabPanel-content .coral-TabPanel-pane .coral-FixedColumn-column .cq-dialog-checkbox-showhide");
    public static By pagePropertiesLabelFeild=By.cssSelector(".cq-siteadmin-admin-properties-tabs .coral-Form-fieldwrapper");
    public static By pagePropertiesInputField=By.cssSelector(".coral3-Textfield");
    public static By componentDateFormFields=By.cssSelector(".coral-TabPanel-content .coral-TabPanel-pane .coral-FixedColumn-column .coral-Form-fieldwrapper .coral-Form-field");
    public static By componentDateInputFields=By.cssSelector(".coral3-Textfield");
    public static By selectall=By.cssSelector("#granite-omnisearch-result-actionbar .coral-Button--graniteActionBar .coral3-Icon--selectAll");
    public static By sleectPageInformation=By.cssSelector("#pageinfo-trigger .coral3-Icon--properties");
    public static By pageInfoData=By.cssSelector(".header-main .coral3-ActionBar-primary .coral3-ActionBar-item #pageinfo-popover .js-editor-PageInfo-closePopover");
    public static By workflowDialog=By.cssSelector(".js-cq-WorkflowStart .coral3-Dialog-header");
    public static By workflowDropdownButton=By.cssSelector(".coral3-Dialog-content .js-cq-WorkflowStart-select .coral3-Select-button");
    public static By workflowModelOptions=By.cssSelector(".js-cq-WorkflowStart-select .coral3-SelectList .coral3-SelectList-item");
    public static By workflowTextFeild=By.cssSelector(".coral3-Dialog-content .js-cq-WorkflowStart-title");
    public static By startWorkFlowButton=By.cssSelector(".coral3-Dialog-footer .js-cq-WorkflowStart-submit");
    public static By permissionAndCopyrightDilaog=By.cssSelector(".coral3-Dialog .coral3-Dialog-wrapper .coral3-Dialog-header");
    public static By permissionCheckBoxNameImageNo=By.cssSelector("input[value='children-name-image-no']");
    public static By permissionCheckBoxNameImageYes=By.cssSelector("input[value='children-name-image-yes']");
    public static By permissionCheckBoxNameImagePermissionNo=By.cssSelector("input[value='children-name-image-no']");
    public static By permissionCheckBoxNameImagePermissionYes=By.cssSelector("input[value='children-name-image-yes']");
    public static By permissionCheckBoxCopyRightYes=By.cssSelector("input[value='copyright-yes']");
    public static By permissioneaCheckBoxCopyRightNo=By.cssSelector("input[value='copyright-no']");
    public static By permissionOkButton=By.cssSelector(".coral3-Dialog-footer #ok-modal");
    public static By uploadFromYourComputer=By.cssSelector(".cq-FileUpload-browse");
    public static By uploadFromYourComputerOnsummary=By.cssSelector(".coral3-Textfield--multiline+ .coral-Form-fieldwrapper .cq-FileUpload-browse");
    public static By doesearchassetfeild=By.cssSelector(".doe-SearchAssetField");

    //Screenshots
    public static By component=By.cssSelector(".cq-dialog-content");
    public static By componentpage=By.cssSelector(".coral--light");

    //hackathon
    public static By productGrid=By.cssSelector("#product_grid");
    public static By filterType=By.cssSelector("#sidebar_filters .filter_type a");
    public static By filtervalue=By.cssSelector("#sidebar_filters .collapse label");
    public static By filterbutton=By.cssSelector("#filterBtn");
    public static By selectproduct=By.cssSelector(".grid_item h3");

}