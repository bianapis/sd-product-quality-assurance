package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFunctionalConsistencyChecksUpdateOutputModel
 */
public class BQFunctionalConsistencyChecksUpdateOutputModel   {
  private String functionalConsistencyChecksPreconditions = null;

  private String functionalConsistencyChecksAnalysisSchedule = null;

  private String functionalConsistencyChecksVersionNumber = null;

  private String functionalConsistencyChecksServiceType = null;

  private String functionalConsistencyChecksServiceDescription = null;

  private String functionalConsistencyChecksServiceInputsandOuputs = null;

  private String functionalConsistencyChecksServiceWorkProduct = null;

  private String functionalConsistencyChecksServiceName = null;

  private String functionalConsistencyChecksUpdateActionTaskReference = null;

  private Object functionalConsistencyChecksUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return functionalConsistencyChecksUpdateActionTaskReference
  **/

  public String getFunctionalConsistencyChecksUpdateActionTaskReference() {
    return functionalConsistencyChecksUpdateActionTaskReference;
  }

  public void setFunctionalConsistencyChecksUpdateActionTaskReference(String functionalConsistencyChecksUpdateActionTaskReference) {
    this.functionalConsistencyChecksUpdateActionTaskReference = functionalConsistencyChecksUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return functionalConsistencyChecksUpdateActionTaskRecord
  **/

  public Object getFunctionalConsistencyChecksUpdateActionTaskRecord() {
    return functionalConsistencyChecksUpdateActionTaskRecord;
  }

  public void setFunctionalConsistencyChecksUpdateActionTaskRecord(Object functionalConsistencyChecksUpdateActionTaskRecord) {
    this.functionalConsistencyChecksUpdateActionTaskRecord = functionalConsistencyChecksUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

