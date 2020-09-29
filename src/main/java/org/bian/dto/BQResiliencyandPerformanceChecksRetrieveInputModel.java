package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQResiliencyandPerformanceChecksRetrieveInputModelResiliencyandPerformanceChecksInstanceAnalysis;
import org.bian.dto.BQResiliencyandPerformanceChecksRetrieveInputModelResiliencyandPerformanceChecksInstanceReport;

import javax.validation.Valid;
  
/**
 * BQResiliencyandPerformanceChecksRetrieveInputModel
 */
public class BQResiliencyandPerformanceChecksRetrieveInputModel   {
  private Object resiliencyandPerformanceChecksRetrieveActionTaskRecord = null;

  private String resiliencyandPerformanceChecksRetrieveActionRequest = null;

  private BQResiliencyandPerformanceChecksRetrieveInputModelResiliencyandPerformanceChecksInstanceReport resiliencyandPerformanceChecksInstanceReport = null;

  private BQResiliencyandPerformanceChecksRetrieveInputModelResiliencyandPerformanceChecksInstanceAnalysis resiliencyandPerformanceChecksInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return resiliencyandPerformanceChecksRetrieveActionTaskRecord
  **/

  public Object getResiliencyandPerformanceChecksRetrieveActionTaskRecord() {
    return resiliencyandPerformanceChecksRetrieveActionTaskRecord;
  }

  public void setResiliencyandPerformanceChecksRetrieveActionTaskRecord(Object resiliencyandPerformanceChecksRetrieveActionTaskRecord) {
    this.resiliencyandPerformanceChecksRetrieveActionTaskRecord = resiliencyandPerformanceChecksRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return resiliencyandPerformanceChecksRetrieveActionRequest
  **/

  public String getResiliencyandPerformanceChecksRetrieveActionRequest() {
    return resiliencyandPerformanceChecksRetrieveActionRequest;
  }

  public void setResiliencyandPerformanceChecksRetrieveActionRequest(String resiliencyandPerformanceChecksRetrieveActionRequest) {
    this.resiliencyandPerformanceChecksRetrieveActionRequest = resiliencyandPerformanceChecksRetrieveActionRequest;
  }


  /**
   * Get resiliencyandPerformanceChecksInstanceReport
   * @return resiliencyandPerformanceChecksInstanceReport
  **/

  public BQResiliencyandPerformanceChecksRetrieveInputModelResiliencyandPerformanceChecksInstanceReport getResiliencyandPerformanceChecksInstanceReport() {
    return resiliencyandPerformanceChecksInstanceReport;
  }

  public void setResiliencyandPerformanceChecksInstanceReport(BQResiliencyandPerformanceChecksRetrieveInputModelResiliencyandPerformanceChecksInstanceReport resiliencyandPerformanceChecksInstanceReport) {
    this.resiliencyandPerformanceChecksInstanceReport = resiliencyandPerformanceChecksInstanceReport;
  }


  /**
   * Get resiliencyandPerformanceChecksInstanceAnalysis
   * @return resiliencyandPerformanceChecksInstanceAnalysis
  **/

  public BQResiliencyandPerformanceChecksRetrieveInputModelResiliencyandPerformanceChecksInstanceAnalysis getResiliencyandPerformanceChecksInstanceAnalysis() {
    return resiliencyandPerformanceChecksInstanceAnalysis;
  }

  public void setResiliencyandPerformanceChecksInstanceAnalysis(BQResiliencyandPerformanceChecksRetrieveInputModelResiliencyandPerformanceChecksInstanceAnalysis resiliencyandPerformanceChecksInstanceAnalysis) {
    this.resiliencyandPerformanceChecksInstanceAnalysis = resiliencyandPerformanceChecksInstanceAnalysis;
  }


}

