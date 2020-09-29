package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFunctionalConsistencyChecksInitiateInputModel
 */
public class BQFunctionalConsistencyChecksInitiateInputModel   {
  private String productandServiceAssessmentInstanceReference = null;

  private Object functionalConsistencyChecksInitiateActionRecord = null;

  private String functionalConsistencyChecksPreconditions = null;

  private String functionalConsistencyChecksAnalysisSchedule = null;

  private String functionalConsistencyChecksVersionNumber = null;

  private String functionalConsistencyChecksServiceType = null;

  private String functionalConsistencyChecksServiceDescription = null;

  private String functionalConsistencyChecksServiceInputsandOuputs = null;

  private String functionalConsistencyChecksServiceWorkProduct = null;

  private String functionalConsistencyChecksServiceName = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Product and Service Assessment instance 
   * @return productandServiceAssessmentInstanceReference
  **/

  public String getProductandServiceAssessmentInstanceReference() {
    return productandServiceAssessmentInstanceReference;
  }

  public void setProductandServiceAssessmentInstanceReference(String productandServiceAssessmentInstanceReference) {
    this.productandServiceAssessmentInstanceReference = productandServiceAssessmentInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return functionalConsistencyChecksInitiateActionRecord
  **/

  public Object getFunctionalConsistencyChecksInitiateActionRecord() {
    return functionalConsistencyChecksInitiateActionRecord;
  }

  public void setFunctionalConsistencyChecksInitiateActionRecord(Object functionalConsistencyChecksInitiateActionRecord) {
    this.functionalConsistencyChecksInitiateActionRecord = functionalConsistencyChecksInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation before the test can be applied 
   * @return functionalConsistencyChecksPreconditions
  **/

  public String getFunctionalConsistencyChecksPreconditions() {
    return functionalConsistencyChecksPreconditions;
  }

  public void setFunctionalConsistencyChecksPreconditions(String functionalConsistencyChecksPreconditions) {
    this.functionalConsistencyChecksPreconditions = functionalConsistencyChecksPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The schedule and timing of the testing performed 
   * @return functionalConsistencyChecksAnalysisSchedule
  **/

  public String getFunctionalConsistencyChecksAnalysisSchedule() {
    return functionalConsistencyChecksAnalysisSchedule;
  }

  public void setFunctionalConsistencyChecksAnalysisSchedule(String functionalConsistencyChecksAnalysisSchedule) {
    this.functionalConsistencyChecksAnalysisSchedule = functionalConsistencyChecksAnalysisSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The test version employed 
   * @return functionalConsistencyChecksVersionNumber
  **/

  public String getFunctionalConsistencyChecksVersionNumber() {
    return functionalConsistencyChecksVersionNumber;
  }

  public void setFunctionalConsistencyChecksVersionNumber(String functionalConsistencyChecksVersionNumber) {
    this.functionalConsistencyChecksVersionNumber = functionalConsistencyChecksVersionNumber;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return functionalConsistencyChecksServiceType
  **/

  public String getFunctionalConsistencyChecksServiceType() {
    return functionalConsistencyChecksServiceType;
  }

  public void setFunctionalConsistencyChecksServiceType(String functionalConsistencyChecksServiceType) {
    this.functionalConsistencyChecksServiceType = functionalConsistencyChecksServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return functionalConsistencyChecksServiceDescription
  **/

  public String getFunctionalConsistencyChecksServiceDescription() {
    return functionalConsistencyChecksServiceDescription;
  }

  public void setFunctionalConsistencyChecksServiceDescription(String functionalConsistencyChecksServiceDescription) {
    this.functionalConsistencyChecksServiceDescription = functionalConsistencyChecksServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return functionalConsistencyChecksServiceInputsandOuputs
  **/

  public String getFunctionalConsistencyChecksServiceInputsandOuputs() {
    return functionalConsistencyChecksServiceInputsandOuputs;
  }

  public void setFunctionalConsistencyChecksServiceInputsandOuputs(String functionalConsistencyChecksServiceInputsandOuputs) {
    this.functionalConsistencyChecksServiceInputsandOuputs = functionalConsistencyChecksServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return functionalConsistencyChecksServiceWorkProduct
  **/

  public String getFunctionalConsistencyChecksServiceWorkProduct() {
    return functionalConsistencyChecksServiceWorkProduct;
  }

  public void setFunctionalConsistencyChecksServiceWorkProduct(String functionalConsistencyChecksServiceWorkProduct) {
    this.functionalConsistencyChecksServiceWorkProduct = functionalConsistencyChecksServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  
   * @return functionalConsistencyChecksServiceName
  **/

  public String getFunctionalConsistencyChecksServiceName() {
    return functionalConsistencyChecksServiceName;
  }

  public void setFunctionalConsistencyChecksServiceName(String functionalConsistencyChecksServiceName) {
    this.functionalConsistencyChecksServiceName = functionalConsistencyChecksServiceName;
  }


}

