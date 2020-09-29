package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRProductandServiceAssessmentExchangeOutputModel
 */
public class CRProductandServiceAssessmentExchangeOutputModel   {
  private String productandServiceAssessmentParameterType = null;

  private String productandServiceAssessmentSelectedOption = null;

  private String productandServiceAssessmentRequest = null;

  private String productandServiceAssessmentExchangeActionTaskReference = null;

  private Object productandServiceAssessmentExchangeActionTaskRecord = null;

  private String productandServiceAssessmentExchangeActionResponse = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Product and Service Assessment instance exchange service call 
   * @return productandServiceAssessmentExchangeActionTaskReference
  **/

  public String getProductandServiceAssessmentExchangeActionTaskReference() {
    return productandServiceAssessmentExchangeActionTaskReference;
  }

  public void setProductandServiceAssessmentExchangeActionTaskReference(String productandServiceAssessmentExchangeActionTaskReference) {
    this.productandServiceAssessmentExchangeActionTaskReference = productandServiceAssessmentExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return productandServiceAssessmentExchangeActionTaskRecord
  **/

  public Object getProductandServiceAssessmentExchangeActionTaskRecord() {
    return productandServiceAssessmentExchangeActionTaskRecord;
  }

  public void setProductandServiceAssessmentExchangeActionTaskRecord(Object productandServiceAssessmentExchangeActionTaskRecord) {
    this.productandServiceAssessmentExchangeActionTaskRecord = productandServiceAssessmentExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return productandServiceAssessmentExchangeActionResponse
  **/

  public String getProductandServiceAssessmentExchangeActionResponse() {
    return productandServiceAssessmentExchangeActionResponse;
  }

  public void setProductandServiceAssessmentExchangeActionResponse(String productandServiceAssessmentExchangeActionResponse) {
    this.productandServiceAssessmentExchangeActionResponse = productandServiceAssessmentExchangeActionResponse;
  }


}

