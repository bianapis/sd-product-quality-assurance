package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProductandServiceAssessmentRetrieveInputModelProductandServiceAssessmentInstanceAnalysis;
import org.bian.dto.CRProductandServiceAssessmentRetrieveInputModelProductandServiceAssessmentInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRProductandServiceAssessmentRetrieveInputModel
 */
public class CRProductandServiceAssessmentRetrieveInputModel   {
  private Object productandServiceAssessmentRetrieveActionTaskRecord = null;

  private String productandServiceAssessmentRetrieveActionRequest = null;

  private CRProductandServiceAssessmentRetrieveInputModelProductandServiceAssessmentInstanceReportRecord productandServiceAssessmentInstanceReportRecord = null;

  private CRProductandServiceAssessmentRetrieveInputModelProductandServiceAssessmentInstanceAnalysis productandServiceAssessmentInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return productandServiceAssessmentRetrieveActionTaskRecord
  **/

  public Object getProductandServiceAssessmentRetrieveActionTaskRecord() {
    return productandServiceAssessmentRetrieveActionTaskRecord;
  }

  public void setProductandServiceAssessmentRetrieveActionTaskRecord(Object productandServiceAssessmentRetrieveActionTaskRecord) {
    this.productandServiceAssessmentRetrieveActionTaskRecord = productandServiceAssessmentRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return productandServiceAssessmentRetrieveActionRequest
  **/

  public String getProductandServiceAssessmentRetrieveActionRequest() {
    return productandServiceAssessmentRetrieveActionRequest;
  }

  public void setProductandServiceAssessmentRetrieveActionRequest(String productandServiceAssessmentRetrieveActionRequest) {
    this.productandServiceAssessmentRetrieveActionRequest = productandServiceAssessmentRetrieveActionRequest;
  }


  /**
   * Get productandServiceAssessmentInstanceReportRecord
   * @return productandServiceAssessmentInstanceReportRecord
  **/

  public CRProductandServiceAssessmentRetrieveInputModelProductandServiceAssessmentInstanceReportRecord getProductandServiceAssessmentInstanceReportRecord() {
    return productandServiceAssessmentInstanceReportRecord;
  }

  public void setProductandServiceAssessmentInstanceReportRecord(CRProductandServiceAssessmentRetrieveInputModelProductandServiceAssessmentInstanceReportRecord productandServiceAssessmentInstanceReportRecord) {
    this.productandServiceAssessmentInstanceReportRecord = productandServiceAssessmentInstanceReportRecord;
  }


  /**
   * Get productandServiceAssessmentInstanceAnalysis
   * @return productandServiceAssessmentInstanceAnalysis
  **/

  public CRProductandServiceAssessmentRetrieveInputModelProductandServiceAssessmentInstanceAnalysis getProductandServiceAssessmentInstanceAnalysis() {
    return productandServiceAssessmentInstanceAnalysis;
  }

  public void setProductandServiceAssessmentInstanceAnalysis(CRProductandServiceAssessmentRetrieveInputModelProductandServiceAssessmentInstanceAnalysis productandServiceAssessmentInstanceAnalysis) {
    this.productandServiceAssessmentInstanceAnalysis = productandServiceAssessmentInstanceAnalysis;
  }


}

