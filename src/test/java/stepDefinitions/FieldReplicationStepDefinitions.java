package stepDefinitions;

import common.BasePage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import page_objects.components.FieldReplication;
import page_objects.pages.Home;
import page_objects.pages.Settings;
import page_objects.pages.SiteContents;

import java.awt.*;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FieldReplicationStepDefinitions extends BasePage {
    private Map<String, Integer> childListData;
    private Map<String,String> expectedResult;
    private final Map<String, String> columnDetails = new LinkedHashMap<>();

    @Given("^create parent list and child list$")
    public void createParentListAndChildList() {
        getInstance(Home.class).goToSiteContents();
        getInstance(SiteContents.class).createParentList("ParentList", false, "");
        getInstance(Home.class).goToSiteContents();
        getInstance(SiteContents.class).createChildList("ChildList", true, "ParentList");
    }


    @Then("^Add New Field Replication$")
    public void addNewFieldReplication(DataTable frDetails) {
        getInstance(Home.class).goToBPASettings();
        getInstance(Settings.class).clickOnFieldReplication();
        getInstance(Settings.class).clickOnNewFieldReplication();
        List<List<String>> data = frDetails.asLists(String.class);
        getInstance(FieldReplication.class).addFieldReplication(data.get(0).get(0), data.get(0).get(1), data.get(0).get(2), data.get(0).get(3), data.get(0).get(4), data.get(0).get(5));
    }

    @Then("^add Data into ParentList$")
    public void addDataIntoParentList() throws AWTException {
        getInstance(FieldReplication.class).addDataIntoParentList();
    }

    @Then("^Verify Same Value Field Replication$")
    public void verifySameValueFieldReplication() {
        getInstance(FieldReplication.class).verifySameValueFieldReplication();
    }

    @Given("^edit the existing field replication for operation Sum and Number Field$")
    public void editTheExistingFieldReplicationForOperationSumAndNumberField() {
        getInstance(FieldReplication.class).editFieldReplication("Sum", "PNumber", "CNumber");
    }


    @Then("^add data into childList for calculated field$")
    public void addDataIntoChildList(DataTable columnName) {
        List<List<String>> data = columnName.asLists();
        if (data.get(0).size() > 1) {
            childListData = getInstance(FieldReplication.class).addDataIntoChildList(data.get(0).get(0), data.get(0).get(1), data.get(0).get(2), Integer.parseInt(data.get(0).get(3)));
            if (data.get(0).get(0).equals("CNo1")) {
                childListData = getInstance(FieldReplication.class).getCalculatedFieldsActualData("CAddition", data.get(0).get(2));
            }
            if (data.get(0).get(0).equals("CCur1")) {
                childListData = getInstance(FieldReplication.class).getCalculatedFieldsActualData("CCurAddition", data.get(0).get(2));
            }
        }


    }

    @Then("^add data into childList for non calculated field$")
    public void addDataIntoChildListForNonCalculatedField(DataTable columnName) {
        List<List<String>> data = columnName.asLists();
        if (data.get(0).size() > 1) {
            childListData = getInstance(FieldReplication.class).addDataIntoChildList(data.get(0).get(0), data.get(0).get(1), data.get(0).get(2), Integer.parseInt(data.get(0).get(3)));
        } else {
            childListData = getInstance(FieldReplication.class).addDataInChildList(data.get(0).get(0));
        }
    }

    @Then("^verify Sum operation for numeric Fields$")
    public void verifySumOperationForNumericFields() {
        try {
            getInstance(FieldReplication.class).verifyNumericField(childListData);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            getInstance(FieldReplication.class).deleteExistingChildData();
        }
    }

    @Given("^edit the existing field replication for operation Sum and Currency Field$")
    public void editTheExistingFieldReplicationForOperationSumAndCurrencyField() {
        getInstance(FieldReplication.class).editFieldReplication("", "PCurrency", "CCurrency");
    }

    @Then("^verify Sum operation for currency Fields$")
    public void verifySumOperationForCurrencyFields() {
        try {
            getInstance(FieldReplication.class).verifyCurrencyField(childListData);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            getInstance(FieldReplication.class).deleteExistingChildData();
        }
    }

    @Given("^Add extra number columns in child list$")
    public void addExtraNumberColumnsInChildList() {
        columnDetails.put("CNo1", "Number");
        columnDetails.put("CNo2", "Number");
        columnDetails.put("CAddition", "Calculated");
        getInstance(SiteContents.class).addExtraColumnsInList("ChildList", columnDetails);
    }

    @Then("^edit the existing field replication for operation Sum and Number calculated Field$")
    public void editTheExistingFieldReplicationForOperationSumAndNumberCalculatedField() {
        getInstance(FieldReplication.class).editFieldReplication(" ", "PNumber", "CAddition");
    }

    @Then("^Verify Sum Operation for Calculated Number Field$")
    public void verifySumOperationForCalculatedNumberField() {
        try {
            getInstance(FieldReplication.class).verifyNumericField(childListData);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            getInstance(FieldReplication.class).deleteExistingChildData();
        }
    }

    @Given("^Add extra currency columns in child list$")
    public void addExtraCurrencyColumnsInChildList() {
        columnDetails.clear();
        columnDetails.put("CCur1", "Currency");
        columnDetails.put("CCur2", "Currency");
        columnDetails.put("CCurAddition", "Calculated");
        getInstance(SiteContents.class).addExtraColumnsInList("ChildList", columnDetails);
    }

    @Then("^edit the existing field replication for operation Sum and currency calculated Field$")
    public void editTheExistingFieldReplicationForOperationSumAndCurrencyCalculatedField() {
        getInstance(FieldReplication.class).editFieldReplication("", "PCurrency", "CCurAddition");
    }

    @Then("^Verify Sum Operation for Calculated Currency Field$")
    public void verifySumOperationForCalculatedCurrencyField() {
        try {
            getInstance(FieldReplication.class).verifyCurrencyField(childListData);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            getInstance(FieldReplication.class).deleteExistingChildData();
        }
    }

    @Given("^edit the existing field replication for operation Min and Number Field$")
    public void editTheExistingFieldReplicationForOperationMinAndNumberField() {
        getInstance(FieldReplication.class).editFieldReplication("Minimum", "PNumber", "CNumber");
    }

    @Then("^verify Minimum operation for Number Field$")
    public void verifyMinimumOperationForNumberField() {
        try {
            getInstance(FieldReplication.class).verifyNumericField(childListData);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            getInstance(FieldReplication.class).deleteExistingChildData();
        }
    }

    @Given("^edit the existing field replication for operation Min and Currency Field$")
    public void editTheExistingFieldReplicationForOperationMinAndCurrencyField() {
        getInstance(FieldReplication.class).editFieldReplication("", "PCurrency", "CCurrency");
    }

    @Then("^verify Minimum operation for Currency Field$")
    public void verifyMinimumOperationForCurrencyField() {
        try {
            getInstance(FieldReplication.class).verifyCurrencyField(childListData);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            getInstance(FieldReplication.class).deleteExistingChildData();
        }
    }

    @Given("^edit the existing field replication for operation Min and calculated Number Field$")
    public void editTheExistingFieldReplicationForOperationMinAndCalculatedNumberField() {
        getInstance(FieldReplication.class).editFieldReplication("", "PNumber", "CAddition");
    }

    @Then("^Verify Minimum Operation for Calculated Number Field$")
    public void verifyMinimumOperationForCalculatedNumberField() {
        try {
            getInstance(FieldReplication.class).verifyNumericField(childListData);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            getInstance(FieldReplication.class).deleteExistingChildData();
        }
    }

    @Given("^edit the existing field replication for operation Min and calculated Currency Field$")
    public void editTheExistingFieldReplicationForOperationMinAndCalculatedCurrencyField() {
        getInstance(FieldReplication.class).editFieldReplication("", "PCurrency", "CCurAddition");
    }

    @Then("^Verify Minimum Operation for Calculated Currency Field$")
    public void verifyMinimumOperationForCalculatedCurrencyField() {
        try {
            getInstance(FieldReplication.class).verifyCurrencyField(childListData);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            getInstance(FieldReplication.class).deleteExistingChildData();
        }
    }

    @Given("^edit the existing field replication for operation Avg and Number Field$")
    public void editTheExistingFieldReplicationForOperationAvgAndNumberField() {
        getInstance(FieldReplication.class).editFieldReplication("Average", "PNumber", "CNo1");
    }

    @Then("^verify Average operation for Number Field$")
    public void verifyAverageOperationForNumberField() {
        try {
            getInstance(FieldReplication.class).verifyNumericField(childListData);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            getInstance(FieldReplication.class).deleteExistingChildData();
        }
    }

    @Given("^edit the existing field replication for operation Avg and Currency Field$")
    public void editTheExistingFieldReplicationForOperationAvgAndCurrencyField() {
        getInstance(FieldReplication.class).editFieldReplication("Average", "PCurrency", "CCur1");
    }

    @Then("^verify Average operation for Currency Field$")
    public void verifyAverageOperationForCurrencyField() {
        try {
            getInstance(FieldReplication.class).verifyCurrencyField(childListData);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            getInstance(FieldReplication.class).deleteExistingChildData();
        }
    }

    @Given("^edit the existing field replication for operation Avg and calculated Number Field$")
    public void editTheExistingFieldReplicationForOperationAvgAndCalculatedNumberField() {
        getInstance(FieldReplication.class).editFieldReplication("Average", "PNumber", "CAddition");
    }

    @Then("^Verify Avg Operation for Calculated Number Field$")
    public void verifyAvgOperationForCalculatedNumberField() {
        try {
            getInstance(FieldReplication.class).verifyNumericField(childListData);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            getInstance(FieldReplication.class).deleteExistingChildData();
        }
    }

    @Given("^edit the existing field replication for operation Avg and calculated Currency Field$")
    public void editTheExistingFieldReplicationForOperationAvgAndCalculatedCurrencyField() {
        getInstance(FieldReplication.class).editFieldReplication("Average", "PCurrency", "CCurAddition");
    }

    @Then("^Verify Avg Operation for Calculated Currency Field$")
    public void verifyAvgOperationForCalculatedCurrencyField() {
        try {
            getInstance(FieldReplication.class).verifyCurrencyField(childListData);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            getInstance(FieldReplication.class).deleteExistingChildData();
        }
    }

    @Given("^edit the existing field replication for operation Max and Number Field$")
    public void editTheExistingFieldReplicationForOperationMaxAndNumberField() {
        getInstance(FieldReplication.class).editFieldReplication("Maximum", "PNumber", "CNumber");
    }

    @Then("^verify Maximum operation for Number Field$")
    public void verifyMaximumOperationForNumberField() {
        try {
            getInstance(FieldReplication.class).verifyNumericField(childListData);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            getInstance(FieldReplication.class).deleteExistingChildData();
        }
    }

    @Given("^edit the existing field replication for operation Max and Currency Field$")
    public void editTheExistingFieldReplicationForOperationMaxAndCurrencyField() {
        getInstance(FieldReplication.class).editFieldReplication("Maximum", "PCurrency", "CCurrency");
    }

    @Then("^verify Maximum operation for Currency Field$")
    public void verifyMaximumOperationForCurrencyField() {
        try {
            getInstance(FieldReplication.class).verifyCurrencyField(childListData);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            getInstance(FieldReplication.class).deleteExistingChildData();
        }
    }

    @Given("^edit the existing field replication for operation Max and calculated Number Field$")
    public void editTheExistingFieldReplicationForOperationMaxAndCalculatedNumberField() {
        getInstance(FieldReplication.class).editFieldReplication("Maximum", "PNumber", "CAddition");
    }

    @Then("^Verify Max Operation for Calculated Number Field$")
    public void verifyMaxOperationForCalculatedNumberField() {
        try {
            getInstance(FieldReplication.class).verifyNumericField(childListData);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            getInstance(FieldReplication.class).deleteExistingChildData();
        }
    }

    @Given("^edit the existing field replication for operation Max and calculated Currency Field$")
    public void editTheExistingFieldReplicationForOperationMaxAndCalculatedCurrencyField() {
        getInstance(FieldReplication.class).editFieldReplication("Maximum", "PCurrency", "CCurAddition");
    }

    @Then("^Verify Max Operation for Calculated Currency Field$")
    public void verifyMaxOperationForCalculatedCurrencyField() {
        try {
            getInstance(FieldReplication.class).verifyCurrencyField(childListData);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            getInstance(FieldReplication.class).deleteExistingChildData();
        }
    }

    @Given("^edit the existing field replication for operation count$")
    public void editTheExistingFieldReplicationForOperationCount() {
        getInstance(FieldReplication.class).editFieldReplication("Count", "PNumber", "CNumber");
    }

    @Then("^select lookup fields in Child List$")
    public void selectLookupFieldsInChildList() {
        childListData = getInstance(FieldReplication.class).selectLookupFieldsInChildList();
    }

    @Then("^verify count operation with multiple child Items$")
    public void verifyCountOperationWithMultipleChildItems() {
        try {
            getInstance(FieldReplication.class).verifyCountOperationWithMultipleChildItems(childListData);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            getInstance(FieldReplication.class).deleteExistingChildData();
        }
    }

    @Given("^edit the existing field replication for operation Last$")
    public void editTheExistingFieldReplicationForOperationLast() {
        getInstance(FieldReplication.class).editFieldReplication("Last", "PDateTime", "CDateTime");
    }

    @Then("^add dates into child List$")
    public void addDatesIntoChildList(DataTable dates) {
        List<List<String>> data = dates.asLists();
        expectedResult = getInstance(FieldReplication.class).addDatesIntoChildList(data,data.get(0).get(5));
    }

    @Then("^Verify Last operation with multiple Child Items$")
    public void verifyLastOperationWithMultipleChildItems() {
        try {
            getInstance(FieldReplication.class).verifyLastFirstOperationWithMultipleChildItems(expectedResult);
        }catch (Exception e) {
            e.printStackTrace();
        } finally {
            getInstance(FieldReplication.class).deleteExistingChildData();
        }
    }

    @Given("^edit the existing field replication for operation First$")
    public void editTheExistingFieldReplicationForOperationFirst() {
        getInstance(FieldReplication.class).editFieldReplication("First", "PDateTime", "CDateTime");
    }

    @Then("^Verify First operation with multiple Child Items$")
    public void verifyFirstOperationWithMultipleChildItems() {
        try {
            getInstance(FieldReplication.class).verifyLastFirstOperationWithMultipleChildItems(expectedResult);
        }catch (Exception e) {
            e.printStackTrace();
        } finally {
            getInstance(FieldReplication.class).deleteExistingChildData();
        }
    }
}

