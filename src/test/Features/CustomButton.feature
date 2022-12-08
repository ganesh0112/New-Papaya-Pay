@CustomButtonFeatures
Feature: Custom Button Component

  # Tests covered  C673,C685,C698,C721, C155155
  @AddCustomButton @regression
  Scenario Outline: Create custom Button and validate opens in Same Window
    Given Navigate to custom button through BPA Settings
    When Click on New Button and fill mandatory custom button fields
      | AutoCustomButton | AutoCustomButtonTitle | https://bpasolutionssa1400.sharepoint.com/sites/spfx-dev-swqa/2022-07-25-QUA/Shared%20Documents/Forms/AllItems.aspx | This button created for Automation Test | Same window |
    Given Create web part page to test Custom Button
    Then  data Viewer Configuration for Custom Button
      | CustomButtonWithDV | Dataviewer1 | Contacts | All Contacts |
    Then add a new Custom button
    Then save the DV page
    Then publish the page
    Then Verify Custom Button created successfully.
    Then verify clicking on custom button URL opens in same window
    Then verify configured "<URL>" with custom button
    Examples:
      | URL |
      | https://bpasolutionssa1400.sharepoint.com/sites/spfx-dev-swqa/2022-07-25-QUA/Shared%20Documents/Forms/AllItems.aspx    |

  # Tests covered  C674,C723,C675
  @EditCustomButton @regression
  Scenario: Edit Created custom Button and validate opens in New Window
    Given Click on Edit Icon present in BPASettings Page
    When buttonId field is removed and click Save
    Then Error message should display as The option Button ID is required
    When buttonTitle field is removed and click Save
    Then Error message should display as The option Button Title is required
    When buttonURL field is removed and click Save
    Then Error message should display as The option Button URL is required


#  check this Scenario with manual team
  @EditCustomButtonIcon
  Scenario: Edit the CB icon and check the same on DV/MD
    Given Click on Edit Icon present in BPASettings Page
    When check the Button Icon and change it
    Then check on DV whether it has been edited

    #C155157
  @DeleteCustomButton @regression
  Scenario: Delete custom button
    Given Navigate to custom button through BPA Settings
    And Click on Delete Icon to delete the addded custom button


    @CustomButtonMD @regression
    Scenario: Create custom button & check on MD
      Given create a new Custom List
      Given Navigate to custom button through BPA Settings
      When Click on New Button and fill mandatory custom button fields
        | AutoCustomButton | AutoCustomButtonTitle | https://bpasolutionssa1400.sharepoint.com/sites/spfx-dev-swqa/2022-07-25-QUA/Shared%20Documents/Forms/AllItems.aspx | This button created for Automation Test | Same window |
      Given Add Master Detail on Home Page
      Then configure added Master Detail
        | AutomationCustomButtonWithMD | MasterDetail | This is Custom List | All Items |
      Then click on the Master View and select the fields
      Then add a new Custom Button in Master View
      Then click on the Detail view and select the fields
      Then click on Child List in Detail View
      Then configure added dataviewer for Compliance Documents in Child List
        | AutomationCustomButtonWithDV | MD-ChildList | Compliance Documents | All Documents |
       Then click on display options
       Then save the MD page
       Then publish the page
       Then check Custom Button on MD page



