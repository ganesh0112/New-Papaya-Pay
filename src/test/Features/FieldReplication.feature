@FieldReplication
Feature: Field Replication Scenario
   # TODO:C202,C203,C204,C181,C179

  # Test covered C202
  @FieldReplicationSameValue @regression
  Scenario: Same Value Field Replication
    Given create parent list and child list
    Then Add New Field Replication
     | Same value | ParentList | PText | ChildList | CText | ParentLookup |
    Then add Data into ParentList
    Then Verify Same Value Field Replication

    # Test covered C185
  @FieldReplicationSumFieldNumber @regression
  Scenario: Sum Field Replication for Number Field
    Given edit the existing field replication for operation Sum and Number Field
    Then add data into childList for non calculated field
      | CNumber |
    Then verify Sum operation for numeric Fields

     # Test covered C186
  @FieldReplicationSumFieldCurrency @regression
  Scenario: Sum Field Replication for Currency Field
    Given edit the existing field replication for operation Sum and Currency Field
    Then add data into childList for non calculated field
      | CCurrency |
    Then verify Sum operation for currency Fields

    # Test covered C410
  @FieldReplicationSumFieldNumberCalculatedField @regression
  Scenario: Sum Field Replication for Calculated Number Field
    Given Add extra number columns in child list
    Then edit the existing field replication for operation Sum and Number calculated Field
    Then add data into childList for calculated field
      | CNo1 | CNo2 | Sum | 2 |
    Then Verify Sum Operation for Calculated Number Field

    # Test covered C411
  @FieldReplicationSumFieldCurrencyCalculatedField @regression
  Scenario: Sum Field Replication for Calculated Currency Field
    Given Add extra currency columns in child list
    Then edit the existing field replication for operation Sum and currency calculated Field
    Then add data into childList for calculated field
      | CCur1 | CCur2 | Sum | 2 |
    Then Verify Sum Operation for Calculated Number Field

    # Test covered C187
  @FieldReplicationMinFieldNumber @regression
  Scenario: Min Field Replication for Number Field
    Given edit the existing field replication for operation Min and Number Field
    Then add data into childList for non calculated field
      | CNumber | " " | Min | 3 |
    Then verify Minimum operation for Number Field

     # Test covered C188
  @FieldReplicationMinFieldCurrency @regression
  Scenario: Min Field Replication for Currency Field
    Given edit the existing field replication for operation Min and Currency Field
    Then add data into childList for non calculated field
      | CCurrency | " " | Min | 3 |
    Then verify Minimum operation for Currency Field

    # Test covered C412
  @FieldReplicationMinFieldNumberCalculatedField @regression
  Scenario: Min Field Replication for Calculated Number Field
    Given edit the existing field replication for operation Min and calculated Number Field
    Then add data into childList for calculated field
      | CNo1 | CNo2 | Min | 3 |
    Then Verify Minimum Operation for Calculated Number Field

    # Test covered C414
  @FieldReplicationMinFieldCurrencyCalculatedField @regression
  Scenario: Min Field Replication for Calculated Currency Field
    Given edit the existing field replication for operation Min and calculated Currency Field
    #TODO: while saving configuration, error is "Child field and Parent field types not compatible for this operation Child:Calculated 10 Parent:Currency"
    # If Above error resolved this scenario will work or pass.
    Then add data into childList for calculated field
      | CCur1 | CCur2 | Min | 3 |
    Then Verify Minimum Operation for Calculated Currency Field

    # Test covered C183
  @FieldReplicationAvgFieldNumber @regression
  Scenario: Avg Field Replication for Number Field
    Given edit the existing field replication for operation Avg and Number Field
    Then add data into childList for non calculated field
      | CNo1 | " " | Avg | 5 |
    Then verify Average operation for Number Field

     # Test covered C184
  @FieldReplicationAvgFieldCurrency @regression
  Scenario: Avg Field Replication for Currency Field
    Given edit the existing field replication for operation Avg and Currency Field
    Then add data into childList for non calculated field
      | CCur1 | " " | Avg | 5 |
    Then verify Average operation for Currency Field

     # Test covered C408
  @FieldReplicationAvgFieldNumberCalculatedField @regression
  Scenario: Avg Field Replication for Calculated Number Field
    Given edit the existing field replication for operation Avg and calculated Number Field
    Then add data into childList for calculated field
      | CNo1 | CNo2 | Avg | 3 |
    Then Verify Avg Operation for Calculated Number Field

    # Test covered C409
  @FieldReplicationAvgFieldCurrencyCalculatedField @regression
  Scenario: Avg Field Replication for Calculated Currency Field
    Given edit the existing field replication for operation Avg and calculated Currency Field
    Then add data into childList for calculated field
      | CCur1 | CCur2 | Avg | 3 |
    Then Verify Avg Operation for Calculated Currency Field

    # Test covered C189
  @FieldReplicationMaxFieldNumber @regression
  Scenario: Max Field Replication for Number Field
    Given edit the existing field replication for operation Max and Number Field
    Then add data into childList for non calculated field
      | CNumber | " " | Max | 3 |
    Then verify Maximum operation for Number Field

    # Test covered C190
  @FieldReplicationMaxFieldCurrency @regression
  Scenario: Max Field Replication for Currency Field
    Given edit the existing field replication for operation Max and Currency Field
    Then add data into childList for non calculated field
      | CCurrency | " " | Max | 3 |
    Then verify Maximum operation for Currency Field

    # Test covered C413
  @FieldReplicationMaxFieldNumberCalculatedField @regression
  Scenario: Max Field Replication for Calculated Number Field
    Given edit the existing field replication for operation Max and calculated Number Field
    Then add data into childList for calculated field
      | CNo1 | CNo2 | Max | 3 |
    Then Verify Max Operation for Calculated Number Field

     # Test covered C415
  @FieldReplicationMaxFieldCurrencyCalculatedField @regression
  Scenario: Max Field Replication for Calculated Currency Field
    Given edit the existing field replication for operation Max and calculated Currency Field
    #TODO: while saving configuration, error is "Child field and Parent field types not compatible for this operation Child:Calculated 10 Parent:Currency"
    # If Above error resolved this scenario will work or pass.
    Then add data into childList for calculated field
      | CCur1 | CCur2 | Max | 3 |
    Then Verify Max Operation for Calculated Currency Field

     # Test covered C193
  @FieldReplicationCount @regression
  Scenario: Count operation with multiple child items
    Given edit the existing field replication for operation count
    Then select lookup fields in Child List
    Then verify count operation with multiple child Items

     # Test covered C196
     #earliest Date=Last date
  @FieldReplicationLastOperation @regression
  Scenario: Last operation with multiple child items
    Given edit the existing field replication for operation Last
    Then add dates into child List
      | 09/01/2018 | 02/03/2016 | 02/03/2018 | 07/05/2000 | 06/08/2019 | Last |
    Then Verify Last operation with multiple Child Items

    # Test covered C200
    # past Date=First date
  @FieldReplicationFirstOperation @regression
  Scenario: First operation with multiple child items
    Given edit the existing field replication for operation First
    Then add dates into child List
      | 09/01/2007 | 02/03/2013 | 02/03/2020 | 07/05/2000 | 06/08/2016 | First |
    Then Verify First operation with multiple Child Items