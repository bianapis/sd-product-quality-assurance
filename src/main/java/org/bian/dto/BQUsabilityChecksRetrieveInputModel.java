package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQUsabilityChecksRetrieveInputModelUsabilityChecksInstanceAnalysis;
import org.bian.dto.BQUsabilityChecksRetrieveInputModelUsabilityChecksInstanceReport;

import javax.validation.Valid;
  
/**
 * BQUsabilityChecksRetrieveInputModel
 */
public class BQUsabilityChecksRetrieveInputModel   {
  private Object usabilityChecksRetrieveActionTaskRecord = null;

  private String usabilityChecksRetrieveActionRequest = null;

  private BQUsabilityChecksRetrieveInputModelUsabilityChecksInstanceReport usabilityChecksInstanceReport = null;

  private BQUsabilityChecksRetrieveInputModelUsabilityChecksInstanceAnalysis usabilityChecksInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return usabilityChecksRetrieveActionTaskRecord
  **/

  public Object getUsabilityChecksRetrieveActionTaskRecord() {
    return usabilityChecksRetrieveActionTaskRecord;
  }

  public void setUsabilityChecksRetrieveActionTaskRecord(Object usabilityChecksRetrieveActionTaskRecord) {
    this.usabilityChecksRetrieveActionTaskRecord = usabilityChecksRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return usabilityChecksRetrieveActionRequest
  **/

  public String getUsabilityChecksRetrieveActionRequest() {
    return usabilityChecksRetrieveActionRequest;
  }

  public void setUsabilityChecksRetrieveActionRequest(String usabilityChecksRetrieveActionRequest) {
    this.usabilityChecksRetrieveActionRequest = usabilityChecksRetrieveActionRequest;
  }


  /**
   * Get usabilityChecksInstanceReport
   * @return usabilityChecksInstanceReport
  **/

  public BQUsabilityChecksRetrieveInputModelUsabilityChecksInstanceReport getUsabilityChecksInstanceReport() {
    return usabilityChecksInstanceReport;
  }

  public void setUsabilityChecksInstanceReport(BQUsabilityChecksRetrieveInputModelUsabilityChecksInstanceReport usabilityChecksInstanceReport) {
    this.usabilityChecksInstanceReport = usabilityChecksInstanceReport;
  }


  /**
   * Get usabilityChecksInstanceAnalysis
   * @return usabilityChecksInstanceAnalysis
  **/

  public BQUsabilityChecksRetrieveInputModelUsabilityChecksInstanceAnalysis getUsabilityChecksInstanceAnalysis() {
    return usabilityChecksInstanceAnalysis;
  }

  public void setUsabilityChecksInstanceAnalysis(BQUsabilityChecksRetrieveInputModelUsabilityChecksInstanceAnalysis usabilityChecksInstanceAnalysis) {
    this.usabilityChecksInstanceAnalysis = usabilityChecksInstanceAnalysis;
  }


}

