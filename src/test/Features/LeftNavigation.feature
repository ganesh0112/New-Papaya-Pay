@LeftNavigation
Feature:Left Navigation Scenario

  # Test covered C3,C4
  @AddCategory @regression
  Scenario: Add and Edit New category link and verify
    Given add new category
    Then verify Category added
    Then edit category

   # Test covered C6
  @AddQuickLink @regression
  Scenario: Add New quick link and verify
    Given add new quick link Automation Links category
    Then verify quick link added

  # Test covered C7
  @EditQuickLink @regression
  Scenario: Edit quick link and verify
    Given navigate to left navigation through BPA settings
    Then verify quick link Edited
    Then verify quick link edited, reflected in BPA navigation

   # Test covered C8
  @DeleteQuickLink @regression
  Scenario: Delete quick link and verify
    Then delete the quick link
    Then verify quick link deleted
    #TODO: quick link get deleted, but reflected time is lot in BPA navigation so failed.

  # Test covered C5
  @DeleteCategory @regression
  Scenario: Delete category and verify
    Then delete the category Automation Link
    Then verify category automation deleted