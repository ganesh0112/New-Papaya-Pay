#@MasterDetail
#Feature:MasterDetail Feature
#
#  #C154940
#  @MasterDetail @WithoutChildList
#  Scenario: Verify the MD configuration for a list adding details into mandatory fields without child list(Master View, Details View-Actions, Details View- Details&Tabs)
#    Given create a new Custom List
#    Given Add Master Detail on Home Page
#    Then configure added Master Detail
#      | AutomationCustomButtonWithMD | MasterDetail | This is Custom List | All Items |
#    Then click on the Master View and select the fields
#    Then add a new Button in Master View
#    Then Add Buttons in Detail view-Actions
#    Then click on the Detail view and select the fields
#    Then add new Tab in Detail View
#    Then save the MD page
#    Then publish the page
#    Then remove the newly created Custom List
#
#
#  @MasterDetail @MasterDetailCustomButton
#  Scenario: Create custom button & check on MD
#    Given create a new Custom List
#    Given Navigate to custom button through BPA Settings
#    When Click on New Button and fill mandatory custom button fields
#      | AutoCustomButton | AutoCustomButtonTitle | https://bpasolutionssa1400.sharepoint.com/sites/spfx-release-swqa/2022-07-11-AUTO | This button created for Automation Test | Same window |
#    Given create a new Custom List
#    Given Add Master Detail on Home Page
#    Then configure added Master Detail
#      | AutomationCustomButtonWithMD | MasterDetail | This is Custom List | All Items |
#    Then click on the Master View and select the fields
#    Then add a Custom Button in Master View
#    Then Add Buttons in Detail view-Actions
#    Then click on the Detail view and select the fields
#    Then add new Tab in Detail View
#    Then click on Child List in Detail View
#    Then configure added dataviewer for Compliance Documents in Child List
#      | AutomationCustomButtonWithDV | MD-ChildList | Compliance Documents | All Documents |
#    Then click on display options
#    Then save the MD page
#    Then publish the page
#    Then verify the added Custom Button on MD Page
#    Then remove the newly created Custom List
#
#  #C154942
#  @MasterDetailOneButton
#  Scenario: Verify saving MD config keeping atleast one button in Details View -Action tab
#    Given create a new Custom List
#    Given Add Master Detail on Home Page
#    Then publish the page
#    Then edit the added MD page
#    Then configure added Master Detail
#      | AutomationCustomButtonWithMD | MasterDetail | This is Custom List | All Items |
#    Then click on the Master View and select the fields
#    Then add a new Button in Master View
#    Then Add Buttons in Detail view-Actions
#    Then click on the Detail view and select the fields
#    Then add new Tab in Detail View
#    Then click on Child List in Detail View
#    Then configure added Custom List for Master Detail in Child List
#      | AutomationCustomListChildList | CustomList | This is Custom List | All Items |
#    Then add new Buttons in the First Child List
#    Then click on display options by selecting Filter field
#    And select the look in the filter field
#    Then configure Compliance Documents for Master Detail in Child List
#      | AutomationCustomListChildList | CustomList | Compliance Documents | All Documents |
#    Then save the MD page
#    Then republish the page
#    Then remove the newly created Custom List
#
#
#
#    #C155029
#     @CustomButtonFunctionality
#    Scenario Outline: Verify the functionality of custom button
#     Given create a new Custom List
#      Given Navigate to custom button through BPA Settings
#      When Click on New Button and fill mandatory custom button fields as "<buttonID>", "<buttonTitle>", "<buttonURL>", "<buttonDescription>", "<window>"
#      Given create a new Custom List
#      Given Add Master Detail on Home Page
#      Then configure added Master Detail
#        | AutomationCustomButtonWithMD | MasterDetail | This is Custom List | All Items |
#      Then click on the Master View and select the fields
#      Then add a Custom Button in Master View
#      Then Add Buttons in Detail view-Actions
#      Then click on the Detail view and select the fields
#      Then add new Tab in Detail View
#      Then click on Child List in Detail View
#      Then configure added dataviewer for Compliance Documents in Child List
#        | AutomationCustomButtonWithDV | MD-ChildList | Compliance Documents | All Documents |
#      Then click on display options
#      Then save the MD page
#      Then publish the page
#      Then verify the added Custom Button on MD Page
#       Given Navigate to custom button through BPA Settings
#       And Click on Delete Icon to delete the addded custom button
#       Then remove the newly created Custom List
#      Examples:
#        | buttonID         | buttonTitle           | buttonURL                                                                                                            | buttonDescription                       | window      |
#        | AutoCustomButton | AutoCustomButtonTitle | https://bpasolutionssa1400.sharepoint.com/sites/spfx-dev-swqa/2022-10-03-AUTO/Shared%20Documents/Forms/AllItems.aspx | This button created for Automation Test | Same window |
#        | AutoCustomButton | AutoCustomButtonTitle | https://bpasolutionssa1400.sharepoint.com/sites/spfx-dev-swqa/2022-10-03-AUTO/Shared%20Documents/Forms/AllItems.aspx | This button created for Automation Test | New window  |
#
#       #C154941
#       #Covered in above scenario
#   Scenario: Verify the MD config adding mandatory fields into with child list(Master View, Details View-Actions, Details View- Details&Tabs, detail view- Child lists)
#
#   #C154944
#  @OneActionButtonDetailView
#  Scenario: Verify saving MD config keeping atleast one Action button from Details View -Child List
#    Given create a new Custom List
#    And Add Columns in the Custom List
#    And Add Data in the Custom List
#    Given Add Master Detail on Home Page
#    Then publish the page
#    Then edit the added MD page
#    Then configure added Master Detail
#      | AutomationCustomButtonWithMD | MasterDetail | This is Custom List | All Items |
#    Then click on the Master View and select the fields
#    Then add a new Button in Master View
#    Then Add Buttons in Detail view-Actions
#    Then click on the Detail view and select the fields
#    Then add new Tab in Detail View
#    Then click on Child List in Detail View
#    Then configure added Custom List for Master Detail in Child List
#      | AutomationCustomListChildList | CustomList | This is Custom List | All Items |
#    Then add new Buttons in the First Child List
#    Then click on display options by selecting Filter field
#    And select the look in the filter field
#    Then configure Compliance Documents for Master Detail in Child List
#      | AutomationCustomListChildList | CustomList | Compliance Documents | All Documents |
#    Then save the MD page
#    Then republish the page
#    Then remove the newly created Custom List
#
#    #C154946
#    @ReOrderButtonMasterDetail
#    Scenario: Verify adding MD config reordering the Actions buttons
#      Given create a new Custom List
#      And Add Columns in the Custom List
#      And Add Data in the Custom List
#      Given Add Master Detail on Home Page
#      Then publish the page
#      Then edit the added MD page
#      Then configure added Master Detail
#        | AutomationCustomButtonWithMD | MasterDetail | This is Custom List | All Items |
#      Then click on the Master View and select the fields
#      Then add a new Button in Master View
#      Then Add Buttons in Detail view-Actions
#      Then click on the Detail view and select the fields
#      Then add new Tab in Detail View
#      Then click on Child List in Detail View
#      Then configure added Custom List for Master Detail in Child List
#        | AutomationCustomListChildList | CustomList | This is Custom List | All Items |
#      Then add new Buttons in the First Child List
#      Then click on display options by selecting Filter field
#      And select the look in the filter field
#      Then configure Compliance Documents for Master Detail in Child List
#        | AutomationCustomListChildList | CustomList | Compliance Documents | All Documents |
#      Then save the MD page
#      Then republish the page
#      Then check the order of the Action buttons
#      And check the order of the Action buttons after reordering
#      Then remove the newly created Custom List
#
#      #C154948
#  @CustomActionButton
#  Scenario: Verify adding Custom Action buttons from MD config, observe if buttons are displayed on MD webpage - DetailView-Action Section
#        Given create a new Custom List
#        Given Navigate to custom button through BPA Settings
#        When Click on New Button and fill mandatory custom button fields
#          | AutoCustomButton | AutoCustomButtonTitle | https://bpasolutionssa1400.sharepoint.com/sites/spfx-dev-swqa/2022-07-25-QUA/Shared%20Documents/Forms/AllItems.aspx | This button created for Automation Test | Same window |
#        Given Add Master Detail on Home Page
#        Then configure added Master Detail
#          | AutomationCustomButtonWithMD | MasterDetail | This is Custom List | All Items |
#        Then click on the Master View and select the fields
#        Then add a Custom Button in Master View
#        Then add a Custom Button in DetailView Action Section
#        Then click on the Detail view and select the fields
#        Then save the MD page
#        Then publish the page
#        Then verify the added Custom Action button in the MD config
#        Then remove the newly created Custom List
#
#  #C154971
#  # Covered in above scenarios
# Scenario : Verify the functionality of Save button
#
#  #C154972
#  # Covered in above scenarios
#  Scenario: Verify functionality of Save and close button
#
#  #C163509
#  # Covered in DataViewer Component
#  Scenario: Verify the AutoBind functionality







