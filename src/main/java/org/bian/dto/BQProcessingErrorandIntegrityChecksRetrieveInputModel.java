package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQProcessingErrorandIntegrityChecksRetrieveInputModelProcessingErrorandIntegrityChecksInstanceAnalysis;
import org.bian.dto.BQProcessingErrorandIntegrityChecksRetrieveInputModelProcessingErrorandIntegrityChecksInstanceReport;

import javax.validation.Valid;
  
/**
 * BQProcessingErrorandIntegrityChecksRetrieveInputModel
 */
public class BQProcessingErrorandIntegrityChecksRetrieveInputModel   {
  private Object processingErrorandIntegrityChecksRetrieveActionTaskRecord = null;

  private String processingErrorandIntegrityChecksRetrieveActionRequest = null;

  private BQProcessingErrorandIntegrityChecksRetrieveInputModelProcessingErrorandIntegrityChecksInstanceReport processingErrorandIntegrityChecksInstanceReport = null;

  private BQProcessingErrorandIntegrityChecksRetrieveInputModelProcessingErrorandIntegrityChecksInstanceAnalysis processingErrorandIntegrityChecksInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return processingErrorandIntegrityChecksRetrieveActionTaskRecord
  **/

  public Object getProcessingErrorandIntegrityChecksRetrieveActionTaskRecord() {
    return processingErrorandIntegrityChecksRetrieveActionTaskRecord;
  }

  public void setProcessingErrorandIntegrityChecksRetrieveActionTaskRecord(Object processingErrorandIntegrityChecksRetrieveActionTaskRecord) {
    this.processingErrorandIntegrityChecksRetrieveActionTaskRecord = processingErrorandIntegrityChecksRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return processingErrorandIntegrityChecksRetrieveActionRequest
  **/

  public String getProcessingErrorandIntegrityChecksRetrieveActionRequest() {
    return processingErrorandIntegrityChecksRetrieveActionRequest;
  }

  public void setProcessingErrorandIntegrityChecksRetrieveActionRequest(String processingErrorandIntegrityChecksRetrieveActionRequest) {
    this.processingErrorandIntegrityChecksRetrieveActionRequest = processingErrorandIntegrityChecksRetrieveActionRequest;
  }


  /**
   * Get processingErrorandIntegrityChecksInstanceReport
   * @return processingErrorandIntegrityChecksInstanceReport
  **/

  public BQProcessingErrorandIntegrityChecksRetrieveInputModelProcessingErrorandIntegrityChecksInstanceReport getProcessingErrorandIntegrityChecksInstanceReport() {
    return processingErrorandIntegrityChecksInstanceReport;
  }

  public void setProcessingErrorandIntegrityChecksInstanceReport(BQProcessingErrorandIntegrityChecksRetrieveInputModelProcessingErrorandIntegrityChecksInstanceReport processingErrorandIntegrityChecksInstanceReport) {
    this.processingErrorandIntegrityChecksInstanceReport = processingErrorandIntegrityChecksInstanceReport;
  }


  /**
   * Get processingErrorandIntegrityChecksInstanceAnalysis
   * @return processingErrorandIntegrityChecksInstanceAnalysis
  **/

  public BQProcessingErrorandIntegrityChecksRetrieveInputModelProcessingErrorandIntegrityChecksInstanceAnalysis getProcessingErrorandIntegrityChecksInstanceAnalysis() {
    return processingErrorandIntegrityChecksInstanceAnalysis;
  }

  public void setProcessingErrorandIntegrityChecksInstanceAnalysis(BQProcessingErrorandIntegrityChecksRetrieveInputModelProcessingErrorandIntegrityChecksInstanceAnalysis processingErrorandIntegrityChecksInstanceAnalysis) {
    this.processingErrorandIntegrityChecksInstanceAnalysis = processingErrorandIntegrityChecksInstanceAnalysis;
  }


}

