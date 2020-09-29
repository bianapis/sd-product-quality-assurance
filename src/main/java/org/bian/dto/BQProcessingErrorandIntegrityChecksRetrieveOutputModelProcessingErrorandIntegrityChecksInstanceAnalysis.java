package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProcessingErrorandIntegrityChecksRetrieveOutputModelProcessingErrorandIntegrityChecksInstanceAnalysis
 */
public class BQProcessingErrorandIntegrityChecksRetrieveOutputModelProcessingErrorandIntegrityChecksInstanceAnalysis   {
  private Object processingErrorandIntegrityChecksInstanceAnalysisRecord = null;

  private String processingErrorandIntegrityChecksInstanceAnalysisReportType = null;

  private String processingErrorandIntegrityChecksInstanceAnalysisParameters = null;

  private Object processingErrorandIntegrityChecksInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return processingErrorandIntegrityChecksInstanceAnalysisRecord
  **/

  public Object getProcessingErrorandIntegrityChecksInstanceAnalysisRecord() {
    return processingErrorandIntegrityChecksInstanceAnalysisRecord;
  }

  public void setProcessingErrorandIntegrityChecksInstanceAnalysisRecord(Object processingErrorandIntegrityChecksInstanceAnalysisRecord) {
    this.processingErrorandIntegrityChecksInstanceAnalysisRecord = processingErrorandIntegrityChecksInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return processingErrorandIntegrityChecksInstanceAnalysisReportType
  **/

  public String getProcessingErrorandIntegrityChecksInstanceAnalysisReportType() {
    return processingErrorandIntegrityChecksInstanceAnalysisReportType;
  }

  public void setProcessingErrorandIntegrityChecksInstanceAnalysisReportType(String processingErrorandIntegrityChecksInstanceAnalysisReportType) {
    this.processingErrorandIntegrityChecksInstanceAnalysisReportType = processingErrorandIntegrityChecksInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return processingErrorandIntegrityChecksInstanceAnalysisParameters
  **/

  public String getProcessingErrorandIntegrityChecksInstanceAnalysisParameters() {
    return processingErrorandIntegrityChecksInstanceAnalysisParameters;
  }

  public void setProcessingErrorandIntegrityChecksInstanceAnalysisParameters(String processingErrorandIntegrityChecksInstanceAnalysisParameters) {
    this.processingErrorandIntegrityChecksInstanceAnalysisParameters = processingErrorandIntegrityChecksInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return processingErrorandIntegrityChecksInstanceAnalysisReport
  **/

  public Object getProcessingErrorandIntegrityChecksInstanceAnalysisReport() {
    return processingErrorandIntegrityChecksInstanceAnalysisReport;
  }

  public void setProcessingErrorandIntegrityChecksInstanceAnalysisReport(Object processingErrorandIntegrityChecksInstanceAnalysisReport) {
    this.processingErrorandIntegrityChecksInstanceAnalysisReport = processingErrorandIntegrityChecksInstanceAnalysisReport;
  }


}

