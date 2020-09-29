package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQFunctionalConsistencyChecksRetrieveInputModelFunctionalConsistencyChecksInstanceAnalysis;
import org.bian.dto.BQFunctionalConsistencyChecksRetrieveInputModelFunctionalConsistencyChecksInstanceReport;

import javax.validation.Valid;
  
/**
 * BQFunctionalConsistencyChecksRetrieveInputModel
 */
public class BQFunctionalConsistencyChecksRetrieveInputModel   {
  private Object functionalConsistencyChecksRetrieveActionTaskRecord = null;

  private String functionalConsistencyChecksRetrieveActionRequest = null;

  private BQFunctionalConsistencyChecksRetrieveInputModelFunctionalConsistencyChecksInstanceReport functionalConsistencyChecksInstanceReport = null;

  private BQFunctionalConsistencyChecksRetrieveInputModelFunctionalConsistencyChecksInstanceAnalysis functionalConsistencyChecksInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return functionalConsistencyChecksRetrieveActionTaskRecord
  **/

  public Object getFunctionalConsistencyChecksRetrieveActionTaskRecord() {
    return functionalConsistencyChecksRetrieveActionTaskRecord;
  }

  public void setFunctionalConsistencyChecksRetrieveActionTaskRecord(Object functionalConsistencyChecksRetrieveActionTaskRecord) {
    this.functionalConsistencyChecksRetrieveActionTaskRecord = functionalConsistencyChecksRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return functionalConsistencyChecksRetrieveActionRequest
  **/

  public String getFunctionalConsistencyChecksRetrieveActionRequest() {
    return functionalConsistencyChecksRetrieveActionRequest;
  }

  public void setFunctionalConsistencyChecksRetrieveActionRequest(String functionalConsistencyChecksRetrieveActionRequest) {
    this.functionalConsistencyChecksRetrieveActionRequest = functionalConsistencyChecksRetrieveActionRequest;
  }


  /**
   * Get functionalConsistencyChecksInstanceReport
   * @return functionalConsistencyChecksInstanceReport
  **/

  public BQFunctionalConsistencyChecksRetrieveInputModelFunctionalConsistencyChecksInstanceReport getFunctionalConsistencyChecksInstanceReport() {
    return functionalConsistencyChecksInstanceReport;
  }

  public void setFunctionalConsistencyChecksInstanceReport(BQFunctionalConsistencyChecksRetrieveInputModelFunctionalConsistencyChecksInstanceReport functionalConsistencyChecksInstanceReport) {
    this.functionalConsistencyChecksInstanceReport = functionalConsistencyChecksInstanceReport;
  }


  /**
   * Get functionalConsistencyChecksInstanceAnalysis
   * @return functionalConsistencyChecksInstanceAnalysis
  **/

  public BQFunctionalConsistencyChecksRetrieveInputModelFunctionalConsistencyChecksInstanceAnalysis getFunctionalConsistencyChecksInstanceAnalysis() {
    return functionalConsistencyChecksInstanceAnalysis;
  }

  public void setFunctionalConsistencyChecksInstanceAnalysis(BQFunctionalConsistencyChecksRetrieveInputModelFunctionalConsistencyChecksInstanceAnalysis functionalConsistencyChecksInstanceAnalysis) {
    this.functionalConsistencyChecksInstanceAnalysis = functionalConsistencyChecksInstanceAnalysis;
  }


}

