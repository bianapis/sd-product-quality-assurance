package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQResiliencyandPerformanceChecksRetrieveOutputModelResiliencyandPerformanceChecksInstanceAnalysis
 */
public class BQResiliencyandPerformanceChecksRetrieveOutputModelResiliencyandPerformanceChecksInstanceAnalysis   {
  private Object resiliencyandPerformanceChecksInstanceAnalysisRecord = null;

  private String resiliencyandPerformanceChecksInstanceAnalysisReportType = null;

  private String resiliencyandPerformanceChecksInstanceAnalysisParameters = null;

  private Object resiliencyandPerformanceChecksInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return resiliencyandPerformanceChecksInstanceAnalysisRecord
  **/

  public Object getResiliencyandPerformanceChecksInstanceAnalysisRecord() {
    return resiliencyandPerformanceChecksInstanceAnalysisRecord;
  }

  public void setResiliencyandPerformanceChecksInstanceAnalysisRecord(Object resiliencyandPerformanceChecksInstanceAnalysisRecord) {
    this.resiliencyandPerformanceChecksInstanceAnalysisRecord = resiliencyandPerformanceChecksInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return resiliencyandPerformanceChecksInstanceAnalysisReportType
  **/

  public String getResiliencyandPerformanceChecksInstanceAnalysisReportType() {
    return resiliencyandPerformanceChecksInstanceAnalysisReportType;
  }

  public void setResiliencyandPerformanceChecksInstanceAnalysisReportType(String resiliencyandPerformanceChecksInstanceAnalysisReportType) {
    this.resiliencyandPerformanceChecksInstanceAnalysisReportType = resiliencyandPerformanceChecksInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return resiliencyandPerformanceChecksInstanceAnalysisParameters
  **/

  public String getResiliencyandPerformanceChecksInstanceAnalysisParameters() {
    return resiliencyandPerformanceChecksInstanceAnalysisParameters;
  }

  public void setResiliencyandPerformanceChecksInstanceAnalysisParameters(String resiliencyandPerformanceChecksInstanceAnalysisParameters) {
    this.resiliencyandPerformanceChecksInstanceAnalysisParameters = resiliencyandPerformanceChecksInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return resiliencyandPerformanceChecksInstanceAnalysisReport
  **/

  public Object getResiliencyandPerformanceChecksInstanceAnalysisReport() {
    return resiliencyandPerformanceChecksInstanceAnalysisReport;
  }

  public void setResiliencyandPerformanceChecksInstanceAnalysisReport(Object resiliencyandPerformanceChecksInstanceAnalysisReport) {
    this.resiliencyandPerformanceChecksInstanceAnalysisReport = resiliencyandPerformanceChecksInstanceAnalysisReport;
  }


}

