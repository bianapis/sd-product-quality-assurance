package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFunctionalConsistencyChecksRetrieveOutputModelFunctionalConsistencyChecksInstanceAnalysis
 */
public class BQFunctionalConsistencyChecksRetrieveOutputModelFunctionalConsistencyChecksInstanceAnalysis   {
  private Object functionalConsistencyChecksInstanceAnalysisRecord = null;

  private String functionalConsistencyChecksInstanceAnalysisReportType = null;

  private String functionalConsistencyChecksInstanceAnalysisParameters = null;

  private Object functionalConsistencyChecksInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return functionalConsistencyChecksInstanceAnalysisRecord
  **/

  public Object getFunctionalConsistencyChecksInstanceAnalysisRecord() {
    return functionalConsistencyChecksInstanceAnalysisRecord;
  }

  public void setFunctionalConsistencyChecksInstanceAnalysisRecord(Object functionalConsistencyChecksInstanceAnalysisRecord) {
    this.functionalConsistencyChecksInstanceAnalysisRecord = functionalConsistencyChecksInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return functionalConsistencyChecksInstanceAnalysisReportType
  **/

  public String getFunctionalConsistencyChecksInstanceAnalysisReportType() {
    return functionalConsistencyChecksInstanceAnalysisReportType;
  }

  public void setFunctionalConsistencyChecksInstanceAnalysisReportType(String functionalConsistencyChecksInstanceAnalysisReportType) {
    this.functionalConsistencyChecksInstanceAnalysisReportType = functionalConsistencyChecksInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return functionalConsistencyChecksInstanceAnalysisParameters
  **/

  public String getFunctionalConsistencyChecksInstanceAnalysisParameters() {
    return functionalConsistencyChecksInstanceAnalysisParameters;
  }

  public void setFunctionalConsistencyChecksInstanceAnalysisParameters(String functionalConsistencyChecksInstanceAnalysisParameters) {
    this.functionalConsistencyChecksInstanceAnalysisParameters = functionalConsistencyChecksInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return functionalConsistencyChecksInstanceAnalysisReport
  **/

  public Object getFunctionalConsistencyChecksInstanceAnalysisReport() {
    return functionalConsistencyChecksInstanceAnalysisReport;
  }

  public void setFunctionalConsistencyChecksInstanceAnalysisReport(Object functionalConsistencyChecksInstanceAnalysisReport) {
    this.functionalConsistencyChecksInstanceAnalysisReport = functionalConsistencyChecksInstanceAnalysisReport;
  }


}

