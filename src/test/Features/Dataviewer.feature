@Dataviewer
Feature: Dataviewer Features

  @dvConfigurator @regression
  Scenario: Add DataViewer on Home page and Configure dataviewer
    Given create a new Custom List
    Given add dataviewer on Home page
    Then configure added dataviewer
      | AutomationCustomButtonWithDV | Dataviewer01 | This is Custom List | All Items|
    And add a new Button
    And publish the page
    Then delete the added dataviewer
    Then remove the newly created Custom List


#C155077s
  @AddCustomList @regression
  Scenario: Verify adding Data viewer webpart for custom list
    And create a new Custom List
    Given add dataviewer on Home page
    Then configure added dataviewer
      | AutomationCustomButtonWithDV | Dataviewer01 | This is Custom List | All Items |
    And add a new Button
    Then publish the page
    When clicked on Site Contents
    When add the item in the list
    Then remove the newly created Custom List
    Then delete the added dataviewer

    #C155076
  @AddDocumentList @regression
  Scenario: Verify adding Data viewer webpart for librabry list
    When clicked on Site Contents
    When adding the document list
    When adding a folder in the document list
    When adding the document list in DV configurator
    Then configure added dataviewer for Document Library
      | AutomationCustomButtonWithDV | Dataviewer01 | SampleDDocument | All Documents |
    And add a new Button
    Then publish the page
    Then delete the added dataviewer

    #C155082
  @ItemHistoryButton @regression
  Scenario: Verify functionality of Item history button on DataViewer
    Given create a new Custom List
    Given add dataviewer on Home page
    Then configure added dataviewer
      | AutomationCustomButtonWithDV | Dataviewer01 | This is Custom List | All Items|
    Then add an Item History Button
    Then add an new Item Button
    Then save the DV page
    And publish the page
    Then remove the newly created Custom List
    Then delete the added dataviewer


  @OpenDocumentButton @regression
  Scenario: Verify functionality of Open Document button on DataViewer
    Given create a new Custom List
    Given add dataviewer on Home page
    Then configure added dataviewer
      | AutomationCustomButtonWithDV | Dataviewer01 | This is Custom List | All Items|
    Then add an Open document Button
    Then save the DV page
    And publish the page
    Then remove the newly created Custom List
    Then delete the added dataviewer

    #Test with Compliance Document
  @UploadButton @regression
  Scenario: Verify functionality of Upload button on DataViewer
    Given create a new Custom List
    Given add dataviewer on Home page
    Then configure added dataviewer for Compliance Documents
      | AutomationCustomButtonWithDV | Dataviewer01 | Compliance Documents | All Documents |
    Then add an Upload Button
    And publish the page
    Then remove the newly created Custom List
    Then delete the added dataviewer

  @AlertButton @regression
  Scenario:Verify functionality of Alertme button on Data viewer
    Given create a new Custom List
    Given add dataviewer on Home page
    Then configure added dataviewer
      | AutomationCustomButtonWithDV | Dataviewer01 | This is Custom List | All Items|
    Then add an Alertme Button
    Then save the DV page
    And publish the page
    Then remove the newly created Custom List
    Then delete the added dataviewer

    #Need to add Item Button and item then verify permission button
   @PermissionButton @regression
  Scenario:Verify functionality of Permission button on Data viewer
    Given create a new Custom List
    Given add dataviewer on Home page
    Then configure added dataviewer
      | AutomationCustomButtonWithDV | Dataviewer01 | This is Custom List | All Items|
    Then add a Permission Button
    Then add an new Item Button
    Then click on display options
    Then save the DV page
    And publish the page
    Then verify the button on the Site Page
    Then remove the newly created Custom List
    Then delete the added dataviewer

  @ShareTeamButton @regression
  Scenario:Verify functionality of Share to team button on Data viewer
    Given create a new Custom List
    Given add dataviewer on Home page
    Then configure added dataviewer
      | AutomationCustomButtonWithDV | Dataviewer01 | This is Custom List | All Items|
    Then add a Share to Team Button
    Then click on display options
    Then save the DV page
    And publish the page
    Then verify the Share To Team button on the Site Page
    Then remove the newly created Custom List
    Then delete the added dataviewer


  @EditSelectionDelete @regression
  Scenario: Verify selecting quick option edit, selection, delete on Data viewer
    Given create a new Custom List
    Given add dataviewer on Home page
    Then configure added dataviewer
      | AutomationCustomButtonWithDV | Dataviewer01 | This is Custom List | All Items|
    Then select quick option edit selection delete on Data viewer
    And publish the page
    Then remove the newly created Custom List
    Then delete the added dataviewer

  @CustomButtonDV @regression
  Scenario: Verify Adding a custom button on Data viewer
    Given create a new Custom List
    Given Navigate to custom button through BPA Settings
    When Click on New Button and fill mandatory custom button fields
      | AutoCustomButton | AutoCustomButtonTitle | https://bpasolutionssa1400.sharepoint.com/sites/spfx-dev-swqa/2022-07-25-QUA/Shared%20Documents/Forms/AllItems.aspx | This button created for Automation Test | Same window |
    When adding a dataviewer on Home page
    Then configure added dataviewer
      | AutomationCustomButtonWithDV | Dataviewer01 | This is Custom List | All Items|
    Then add a new Custom button
    Then save the DV page
    And publish the page
    Then click on the new Custom Button
    Then remove the newly created Custom List
    Then delete the added dataviewer

  #C155092
  @Delete/RemoveItem @regression
  Scenario: Verify deleting removing an item from Data viewer through quick action delete button
    Given create a new Custom List
    And  add the item in the custom list
    Given add dataviewer on Home page
    Then configure added dataviewer
      | AutomationCustomButtonWithDV | Dataviewer01 | This is Custom List | All Items|
    Then add a Button
    Then select quick delete option on Data viewer
    And publish the page
    Then click on delete custom list item
    Then remove the newly created Custom List
    Then delete the added dataviewer

  @QuickEditItem @regression
  Scenario: Verify selecting an item from Data viewer through quick action select checkbox
    Given create a new Custom List
    And  add the item in the custom list
    Given add dataviewer on Home page
    Then configure added dataviewer
      | AutomationCustomButtonWithDV | Dataviewer01 | This is Custom List | All Items|
    Then add a Button
    Then select quick edit option
    And publish the page
    Then click on quick edit list item
    Then remove the newly created Custom List
    Then delete the added dataviewer

  #C155095
  @ShowDetailPageColumn @regression
  Scenario: Verify adding a field to Show link to detail page on this column on Data viewer from dv configurator
    Given add dataviewer on Home page
    Then configure added dataviewer for Compliance Documents
      | AutomationCustomButtonWithDV | Dataviewer01 | Compliance Documents | All Documents |
    Then select the Display Options on DV Page
    Then select the option in link to detail page
    And publish the page
    Then go To Link Editor via Setting
    Then navigate to the added dataviewer
    Then click on the link to show detail page
    Then delete the added dataviewer

    #C155096
  @OpenDetailPageColumn @regression
  Scenario: Verify adding a value to 'Show link to open document on this column' on data viewer from dv configurator
    Given add dataviewer on Home page
    Then configure added dataviewer for Compliance Documents
      | AutomationCustomButtonWithDV | Dataviewer01 | Compliance Documents | All Documents |
    Then select the Display Options on DV Page
    Then select the option in link to open document column
    Then save the DV page
    And publish the page
    Then click on link to open document on the column
    Then delete the added dataviewer


  #C155097
  @openDocumentlibrarylist @regression
  Scenario: Verify 'Show link to open document on this column option data viewer only available for library list on dv configurator
    And create a new Custom List
    Given add dataviewer on Home page
    Then configure added dataviewer for quick edit item
      | AutomationCustomButtonWithDV | Dataviewer01 | This is Custom List | All Items |
    Then select the Display Options on DV Page
    Then check the show link to open document column
    Then click on the close button
    And publish the page
    Then remove the newly created Custom List
    Then delete the added dataviewer

  @button @regression
  Scenario: adding DataViewer webpart for Library List
    Given add dataviewer button on Home page
    Then enter the button alignment
    And publish the page
    Then delete the added dataviewer

  @cancelConfigurator @regression
  Scenario: Verify discarding changes on configurator clicking on cancel button
    Given create a new Custom List
    Given add dataviewer on Home page
    Then configure added dataviewer
      | AutomationCustomButtonWithDV | Dataviewer01 | This is Custom List | All Items |
    And click on cancel button
    And publish the page
    Then remove the newly created Custom List
    Then delete the added dataviewer

  @MandatoryFields @regression
  Scenario: Try saving DV configurator with all mandatory fields clicking save button & then closing the configurator clicking x button
    Given add dataviewer on Home page
    And configure added dataviewer only mandatory fields
      | Contacts | All Contacts |
    And publish the page
    Then delete the added dataviewer

  @OnlyOneMandatoryField @regression
  Scenario: Adding Only One Mandatory Fields in DV configurator from webpart
    Given add dataviewer on Home page
    And configure added dataviewer only one mandatory fields
      | Contacts |

  @deletedvConfigurator @regression
  Scenario: Delete DV configurator from webpart
    Given add dataviewer on Home page
    Then configure added dataviewer for Compliance Documents
      | AutomationCustomButtonWithDV | Dataviewer01 | Compliance Documents | All Documents |
    Then save the DV page
    Then publish the page
    Given delete dataviewer on Home page
    Then republish the page
    Then delete the added dataviewer

  @duplicatedvConfigurator @regression
  Scenario: Duplicate DV configurator from webpart
    Given add dataviewer on Home page
    Then configure added dataviewer for Compliance Documents
      | AutomationCustomButtonWithDV | Dataviewer01 | Compliance Documents | All Documents |
    Then save the DV page
    Then publish the page
    Given duplicate dataviewer on Home page
    Then republish the page
    Then delete the added dataviewer


    #C155194
   @progressBar @regression
   Scenario: Verify the progress bar in DV config
     #Functionality covered in above scenarios

  @AddDv @dataviewerpublish @regression
  Scenario:Create a DataViewer and publish it
    Given add dataviewer on Home page
    Then configure added dataviewer for Compliance Documents
      | AutomationCustomButtonWithDV | Dataviewer01 | Compliance Documents | All Documents |
    Then add a Button
    Then save the DV page
    And publish the page
    Then delete the added dataviewer

   #C155179
  @LargerView @regression
  Scenario: BPA Data Viewer to Show larger view
    Given add dataviewer on Home page
    Then configure added dataviewer for Compliance Documents
      | AutomationCustomButtonWithDV | Dataviewer01 | Compliance Documents | All Documents |
    Then add a Button
    Then save the DV page
    And publish the page
    Then go to Page Styles link via BPA Settings
    Then navigate to added DV and change the view
    Then check the view
    Then delete the added dataviewer

   #C155098
  @ReorderButton @regression
  Scenario:Verify reordering action buttons from DV configurator
   Given add dataviewer on Home page
    Then configure added dataviewer for Compliance Documents
      | AutomationCustomButtonWithDV | Dataviewer01 | Compliance Documents | All Documents |
    Then add Buttons
    Then click on display options
    Then save the DV page
    Then publish the page
    Then reorder the buttons and check
    Then save the DV page
    Then republish the page
    Then check the orders of the button
    Then delete the added dataviewer

    #C155107
  @AddFolders @regression
  Scenario:Verify adding folders for library list are displayed in DV
    Given navigate to compliance document  via Site Contents
    Given go to Library settings via Setting
    When user visits compliance Document setting
    Given add dataviewer on Home page
    Then configure added dataviewer for Compliance Documents
      | AutomationCustomButtonWithDV | Dataviewer01 | Compliance Documents | All Documents |
    Then add an new Item Button
    Then save the DV page
    Then publish the page
    Then create new folders
    Then delete the added dataviewer
    Then delete the added folder

  #C155108
  @NestedFolder @regression
  Scenario: Verify adding nested folders for library list are displayed in DV
    Given navigate to compliance document  via Site Contents
    Given go to Library settings via Setting
    When user visits compliance Document setting
    Given add dataviewer on Home page
    Then configure added dataviewer for Compliance Documents
      | AutomationCustomButtonWithDV | Dataviewer01 | Compliance Documents | All Documents |
    Then add an new Item Button
    Then click on display options
    Then save the DV page
    Then publish the page
    Then create the nested folders

    #Run the above scenario before running the below scenario for breadcrumbs
    #C155115
    @BreadCrumbs @regression
    Scenario: Verify clicking on breadcrumbs for nested folder through Name (Linked to document with edit menu) or Name (Linked to document)
      Given navigate to the added DV
      Then verify by clicking on the breadcrumbs for nested folder through Name
      Then click on the folders by name to trace it
      Then delete the added folders
      Then delete the added dataviewer

    #C155109
   @FlatView @regression
   Scenario: Verify saving flat view for main list(library) on DV displayed
     Given navigate to compliance document  via Site Contents
     Given create a new Flat View
     Given create a new Folder
     Given a file is uploaded
     Given user tries to edit the view
     Given add dataviewer on Home page
     Then configure added dataviewer for Compliance Documents for FlatView
       | AutomationCustomButtonWithDV | Dataviewer01 | Compliance Documents | All Documents |
     Then add an new Item Button
     Then save the DV page
     Then publish the page
     Then delete the added dataviewer

   #C155184
   @multipleDV @regression
  Scenario: Verify if multiple DV web parts are visible after page style is change from Standard to Full width
     Given create a new Custom List
     Given add dataviewer on Home page
     Then configure added dataviewer
       | AutomationCustomButtonWithDV | Dataviewer01 | This is Custom List | All Items |
#    Then configure added dataviewer for Compliance Documents
#         | AutomationCustomButtonWithDV | Dataviewer01 | Compliance Documents | All Documents |
    Then save the DV page
    Then create multiple DV
    Then publish the page
    Then go to Page Styles link via BPA Settings
    Then navigate to added DV and change the view
    Then check the view of the DVs
    Then republish the page

  #C155189 #Same as above
  @multipleDVFunctionality  @regression
  Scenario: Verify functionality of DV in Full width


  #C155190
  @FullWidth @regression
  Scenario: Verify functionality of DV from Full width to Standard width
    Given user clicks on Page Styles link via BPA Settings
    When user navigates to the added DV and changes view to Standard
    Then check the view of the DVs
    Then republish the page

 # C155081
  @MMButtonFunctionality @regression
 Scenario: Verify functionality of MM button button on Data viewer
   Given add dataviewer on Home page
   Then configure added dataviewer for Audits
     | AutomationCustomButtonWithDV | Dataviewer01 | Audits | All Audits |
   Then add a MM button
   Then do the MM button setting
   Then add an new Item Button for MM functionality
   Then click on display options
   Then save the DV page
   Then publish the page
   Then add new Items for MM button
   Then check whether MM document is created
   Then delete the added dataviewer


  @MMButtonRunAutomatically @regression
  Scenario: Verify functionality of MM button button on Data viewer by selecting Run Automatically Option
    Given add dataviewer on Home page
    Then configure added dataviewer for Audits
      | AutomationCustomButtonWithDV | Dataviewer01 | Audits | All Audits |
    Then add a MM button
    Then do the MM button setting by selecting run automatically option
    Then add an new Item Button for MM functionality
    Then click on display options
    Then save the DV page
    Then publish the page
    Then add new Items for MM button for automatic option
    Then check whether MM document is created
    Then delete the added dataviewer

  #C155183
  @MMButtonWithoutDV @regression
  Scenario: Verify the behavior of MM button after selecting Merge can be run from DV without to select any item will merge all items from views checkbox from the button config
   Given add dataviewer on Home page
   Then configure added dataviewer for Audits
     | AutomationCustomButtonWithDV | Dataviewer01 | Audits | All Audits |
   Then add a MM button
   Then do the MM button setting by merging without any item selection
    Then add an new Item Button for MM functionality
   Then click on display options
   Then save the DV page
   Then publish the page
   Then add new Items for MM button
   Then check whether MM document is created in Documents
    Then delete the added dataviewer

 #C155195  #Same as above scenario
  @MMButton @regression
  Scenario: Verify the option Merge can be run from DV without to select any items in MM button wizard


  @PermissionButtonFunctionality @regression
 Scenario: Verify functionality of Permission button on Data viewer page
    Given create a new Custom List
    Given add dataviewer on Home page
    Then configure added dataviewer
      | AutomationCustomButtonWithDV | Dataviewer01 | This is Custom List | All Items |   |
    Then add a Permission Button
    Then click on display options
    Then save the DV page
    And publish the page
    Then check the permission button functionality

    #C155110
  @SpecificPermission-ReadOnly @regression
  Scenario: Verify folders to set specific permissions for specific entities in group organizations
    Given create a new Custom List
    And adds content for the custom List
    And change the site permissions
    Given user logs in to the website with new credentials
    When user navigates to the custom list
    Then check if user can change the permission
#    Then remove the newly created Custom List

  @SpecificPermission-EditPermission @regression
  Scenario: Verify folders to set specific permissions for specific entities in group organizations Edit Permissions
    Given navigate to the custom list
    And change the edit permissions for an item in the custom listPresent
    Given user logs in to the website with new credentials
    When user navigates to the custom list
    Then check if user can change the permission for the edited item

  #C155112
  @Permission-Views @regression
  Scenario: Permissions need to be tested in flat views, apply correctly
    Given navigate to the custom list
    And create a new view for the custom list
    And change the site permissions
    Given user logs in to the website with new credentials
    When user navigates to the custom list
    Then check the permission for the items in the given view

  @Permission-DataViewer_ReadOnyPermission @regression
  Scenario: Verify folders to set specific permissions for specific entities in group organizations for DataViewer
    Given add dataviewer on Home page
    Then configure added dataviewer
      | AutomationCustomButtonWithDV | Dataviewer01 | This is Custom List | All Items |
    Then add Buttons
    Then click on display options
    Then save the DV page
    Then publish the page
    Given user logs in to the website with new credentials
    When user navigates to DV sample
    Then check the permission of the DV Sample

  @Permission-DataViewer_EditPermission @regression
  Scenario: Verify folders to set specific permissions for specific entities in group organizations for Editing DataViewer Permissions
    Given navigate to the added DV
    Given check if user can change permission to edit
    Given user logs in to the website with new credentials
    When user navigates to DV sample
    Then check the edit permission of the DV Sample

  #C155111
 @PermissionFolders @regression
 Scenario: Verify Permissions tested in folders views
   Given user creates a document library
   And user uploads the document
   And change the site permissions
   Given user logs in to the website with new credentials
   Then navigate to the document library
   And check the permission of the document library

  #C155191
  @Non-License @regression
   Scenario: Verify the functionality of DV for a non-licensed user
    Given the user logs in to the website
    When user clicks on the DV sample

  #C155193
  @Expired-License @regression
  Scenario: Verify the functionality of DV for user with expired license
    Given the user logs in to the website with expired license
    When user clicks on the DV sample to check the expired license

  #C155192
  @Max-User @regression
  Scenario: Verify the functionality of DV with max users limit reached
    Given the user logs in to the website for max users limit
    When user clicks on the DV sample to check the max users limit reached

  #C163499
  @Chat-bot @regression
   Scenario: Verify adding 'AI Chat Bot' action button
    Given add dataviewer on Home page
    Then configure added dataviewer for Compliance Documents
      | AutomationCustomButtonWithDV | Dataviewer01 | Compliance Documents | All Documents |
    Then add a AI Chat Bot button
    Then click on display options
    Then save the DV page
    Then publish the page
    Then verify the added AI Chat bot button

  @groupByView @regression
  Scenario: Verify the Group by View (for 30+ items)
   Given create a new Custom List
    And add new columns in the list
    When user creates new items
    When user creates a new View
    Given add dataviewer on Home page
    Then configure added dataviewer
      | CustomButtonWithDV | Dataviewer01 | This is Custom List | All Items |
    Then add an new Item Button
    Then click on display options
    Then add the view by clickinig on View Options
    Then save the DV page
    Then publish the page
    Then click on Switch View and confirm
    Then delete the added dataviewer
    Then remove the newly created Custom List

  #C155242
  @Autobind @regression
  Scenario: Verify the autobind functionality
    Given create a new Custom List
    And Add Columns in the Custom List
    And Add Data in the Custom List
    Given Add Master Detail on Home Page
    Then publish the page
    Then edit the added MD page
    Then configure added Master Detail
      | AutomationCustomButtonWithMD | MasterDetail | This is Custom List | All Items |
    Then click on the Master View and select the fields
    Then add a new Button in Master View
    Then Add Buttons in Detail view-Actions
    Then click on the Detail view and select the fields
    Then add new Tab in Detail View
    Then click on Child List in Detail View
    Then configure added Custom List for Master Detail in Child List
      | AutomationCustomListChildList | CustomList | This is Custom List | All Items |
    Then add new Buttons in the First Child List
    Then click on display options by selecting Filter field
    And select the look in the filter field
    Then configure Compliance Documents for Master Detail in Child List
      | AutomationCustomListChildList | CustomList | Compliance Documents | All Documents |
    Then save the MD page
    Then republish the page



  #C155245
  @multipleCT @regression
  Scenario: Verify with multiple CTs

