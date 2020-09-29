package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQResiliencyandPerformanceChecksRetrieveOutputModelResiliencyandPerformanceChecksInstanceReport
 */
public class BQResiliencyandPerformanceChecksRetrieveOutputModelResiliencyandPerformanceChecksInstanceReport   {
  private Object resiliencyandPerformanceChecksInstanceReportRecord = null;

  private String resiliencyandPerformanceChecksInstanceReportType = null;

  private String resiliencyandPerformanceChecksInstanceReportParameters = null;

  private Object resiliencyandPerformanceChecksInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return resiliencyandPerformanceChecksInstanceReportRecord
  **/

  public Object getResiliencyandPerformanceChecksInstanceReportRecord() {
    return resiliencyandPerformanceChecksInstanceReportRecord;
  }

  public void setResiliencyandPerformanceChecksInstanceReportRecord(Object resiliencyandPerformanceChecksInstanceReportRecord) {
    this.resiliencyandPerformanceChecksInstanceReportRecord = resiliencyandPerformanceChecksInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return resiliencyandPerformanceChecksInstanceReportType
  **/

  public String getResiliencyandPerformanceChecksInstanceReportType() {
    return resiliencyandPerformanceChecksInstanceReportType;
  }

  public void setResiliencyandPerformanceChecksInstanceReportType(String resiliencyandPerformanceChecksInstanceReportType) {
    this.resiliencyandPerformanceChecksInstanceReportType = resiliencyandPerformanceChecksInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return resiliencyandPerformanceChecksInstanceReportParameters
  **/

  public String getResiliencyandPerformanceChecksInstanceReportParameters() {
    return resiliencyandPerformanceChecksInstanceReportParameters;
  }

  public void setResiliencyandPerformanceChecksInstanceReportParameters(String resiliencyandPerformanceChecksInstanceReportParameters) {
    this.resiliencyandPerformanceChecksInstanceReportParameters = resiliencyandPerformanceChecksInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return resiliencyandPerformanceChecksInstanceReport
  **/

  public Object getResiliencyandPerformanceChecksInstanceReport() {
    return resiliencyandPerformanceChecksInstanceReport;
  }

  public void setResiliencyandPerformanceChecksInstanceReport(Object resiliencyandPerformanceChecksInstanceReport) {
    this.resiliencyandPerformanceChecksInstanceReport = resiliencyandPerformanceChecksInstanceReport;
  }


}

