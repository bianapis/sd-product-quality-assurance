package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRProductandServiceAssessmentInitiateOutputModel
 */
public class CRProductandServiceAssessmentInitiateOutputModel   {
  private String productandServiceAssessmentInstanceReference = null;

  private String productandServiceAssessmentInitiateActionReference = null;

  private Object productandServiceAssessmentInitiateActionRecord = null;

  private String productandServiceAssessmentInstanceStatus = null;

  private String productandServiceAssessmentParameterType = null;

  private String productandServiceAssessmentSelectedOption = null;

  private String productandServiceAssessmentRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Product and Service Assessment instance 
   * @return productandServiceAssessmentInstanceReference
  **/

  public String getProductandServiceAssessmentInstanceReference() {
    return productandServiceAssessmentInstanceReference;
  }

  public void setProductandServiceAssessmentInstanceReference(String productandServiceAssessmentInstanceReference) {
    this.productandServiceAssessmentInstanceReference = productandServiceAssessmentInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return productandServiceAssessmentInitiateActionReference
  **/

  public String getProductandServiceAssessmentInitiateActionReference() {
    return productandServiceAssessmentInitiateActionReference;
  }

  public void setProductandServiceAssessmentInitiateActionReference(String productandServiceAssessmentInitiateActionReference) {
    this.productandServiceAssessmentInitiateActionReference = productandServiceAssessmentInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return productandServiceAssessmentInitiateActionRecord
  **/

  public Object getProductandServiceAssessmentInitiateActionRecord() {
    return productandServiceAssessmentInitiateActionRecord;
  }

  public void setProductandServiceAssessmentInitiateActionRecord(Object productandServiceAssessmentInitiateActionRecord) {
    this.productandServiceAssessmentInitiateActionRecord = productandServiceAssessmentInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Product and Service Assessment instance (e.g. initialised, pending, active) 
   * @return productandServiceAssessmentInstanceStatus
  **/

  public String getProductandServiceAssessmentInstanceStatus() {
    return productandServiceAssessmentInstanceStatus;
  }

  public void setProductandServiceAssessmentInstanceStatus(String productandServiceAssessmentInstanceStatus) {
    this.productandServiceAssessmentInstanceStatus = productandServiceAssessmentInstanceStatus;
  }


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


}

