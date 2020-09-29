package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQUsabilityChecksRetrieveOutputModelUsabilityChecksInstanceAnalysis
 */
public class BQUsabilityChecksRetrieveOutputModelUsabilityChecksInstanceAnalysis   {
  private Object usabilityChecksInstanceAnalysisRecord = null;

  private String usabilityChecksInstanceAnalysisReportType = null;

  private String usabilityChecksInstanceAnalysisParameters = null;

  private Object usabilityChecksInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return usabilityChecksInstanceAnalysisRecord
  **/

  public Object getUsabilityChecksInstanceAnalysisRecord() {
    return usabilityChecksInstanceAnalysisRecord;
  }

  public void setUsabilityChecksInstanceAnalysisRecord(Object usabilityChecksInstanceAnalysisRecord) {
    this.usabilityChecksInstanceAnalysisRecord = usabilityChecksInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return usabilityChecksInstanceAnalysisReportType
  **/

  public String getUsabilityChecksInstanceAnalysisReportType() {
    return usabilityChecksInstanceAnalysisReportType;
  }

  public void setUsabilityChecksInstanceAnalysisReportType(String usabilityChecksInstanceAnalysisReportType) {
    this.usabilityChecksInstanceAnalysisReportType = usabilityChecksInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return usabilityChecksInstanceAnalysisParameters
  **/

  public String getUsabilityChecksInstanceAnalysisParameters() {
    return usabilityChecksInstanceAnalysisParameters;
  }

  public void setUsabilityChecksInstanceAnalysisParameters(String usabilityChecksInstanceAnalysisParameters) {
    this.usabilityChecksInstanceAnalysisParameters = usabilityChecksInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return usabilityChecksInstanceAnalysisReport
  **/

  public Object getUsabilityChecksInstanceAnalysisReport() {
    return usabilityChecksInstanceAnalysisReport;
  }

  public void setUsabilityChecksInstanceAnalysisReport(Object usabilityChecksInstanceAnalysisReport) {
    this.usabilityChecksInstanceAnalysisReport = usabilityChecksInstanceAnalysisReport;
  }


}

