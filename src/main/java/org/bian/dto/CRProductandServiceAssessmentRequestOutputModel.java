package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRProductandServiceAssessmentRequestOutputModel
 */
public class CRProductandServiceAssessmentRequestOutputModel   {
  private String productandServiceAssessmentParameterType = null;

  private String productandServiceAssessmentSelectedOption = null;

  private String productandServiceAssessmentRequest = null;

  private String productandServiceAssessmentRequestActionTaskReference = null;

  private Object productandServiceAssessmentRequestActionTaskRecord = null;

  private String requestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A Classification value that distinguishes between Assessments according to type of concern defined within Product and Service Assessment . Eg Market Analysis, Risk Analysis, Perfomance Analysis, etc. 
   * @return productandServiceAssessmentParameterType
  **/

  public String getProductandServiceAssessmentParameterType() {
    return productandServiceAssessmentParameterType;
  }

  public void setProductandServiceAssessmentParameterType(String productandServiceAssessmentParameterType) {
    this.productandServiceAssessmentParameterType = productandServiceAssessmentParameterType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A selected optional business service as subject matter of assessment 
   * @return productandServiceAssessmentSelectedOption
  **/

  public String getProductandServiceAssessmentSelectedOption() {
    return productandServiceAssessmentSelectedOption;
  }

  public void setProductandServiceAssessmentSelectedOption(String productandServiceAssessmentSelectedOption) {
    this.productandServiceAssessmentSelectedOption = productandServiceAssessmentSelectedOption;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Request to assess ProductandService 
   * @return productandServiceAssessmentRequest
  **/

  public String getProductandServiceAssessmentRequest() {
    return productandServiceAssessmentRequest;
  }

  public void setProductandServiceAssessmentRequest(String productandServiceAssessmentRequest) {
    this.productandServiceAssessmentRequest = productandServiceAssessmentRequest;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Product and Service Assessment instance request service call 
   * @return productandServiceAssessmentRequestActionTaskReference
  **/

  public String getProductandServiceAssessmentRequestActionTaskReference() {
    return productandServiceAssessmentRequestActionTaskReference;
  }

  public void setProductandServiceAssessmentRequestActionTaskReference(String productandServiceAssessmentRequestActionTaskReference) {
    this.productandServiceAssessmentRequestActionTaskReference = productandServiceAssessmentRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return productandServiceAssessmentRequestActionTaskRecord
  **/

  public Object getProductandServiceAssessmentRequestActionTaskRecord() {
    return productandServiceAssessmentRequestActionTaskRecord;
  }

  public void setProductandServiceAssessmentRequestActionTaskRecord(Object productandServiceAssessmentRequestActionTaskRecord) {
    this.productandServiceAssessmentRequestActionTaskRecord = productandServiceAssessmentRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service request record 
   * @return requestRecordReference
  **/

  public String getRequestRecordReference() {
    return requestRecordReference;
  }

  public void setRequestRecordReference(String requestRecordReference) {
    this.requestRecordReference = requestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

