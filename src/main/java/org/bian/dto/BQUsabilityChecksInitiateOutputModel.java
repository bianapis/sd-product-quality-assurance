package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQUsabilityChecksInitiateOutputModel
 */
public class BQUsabilityChecksInitiateOutputModel   {
  private String usabilityChecksInstanceReference = null;

  private String usabilityChecksInitiateActionReference = null;

  private Object usabilityChecksInitiateActionRecord = null;

  private String usabilityChecksInstanceStatus = null;

  private String usabilityChecksPreconditions = null;

  private String usabilityChecksAnalysisSchedule = null;

  private String usabilityChecksVersionNumber = null;

  private String usabilityChecksServiceType = null;

  private String usabilityChecksServiceDescription = null;

  private String usabilityChecksServiceInputsandOuputs = null;

  private String usabilityChecksServiceWorkProduct = null;

  private String usabilityChecksServiceName = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Usability Checks instance 
   * @return usabilityChecksInstanceReference
  **/

  public String getUsabilityChecksInstanceReference() {
    return usabilityChecksInstanceReference;
  }

  public void setUsabilityChecksInstanceReference(String usabilityChecksInstanceReference) {
    this.usabilityChecksInstanceReference = usabilityChecksInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return usabilityChecksInitiateActionReference
  **/

  public String getUsabilityChecksInitiateActionReference() {
    return usabilityChecksInitiateActionReference;
  }

  public void setUsabilityChecksInitiateActionReference(String usabilityChecksInitiateActionReference) {
    this.usabilityChecksInitiateActionReference = usabilityChecksInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return usabilityChecksInitiateActionRecord
  **/

  public Object getUsabilityChecksInitiateActionRecord() {
    return usabilityChecksInitiateActionRecord;
  }

  public void setUsabilityChecksInitiateActionRecord(Object usabilityChecksInitiateActionRecord) {
    this.usabilityChecksInitiateActionRecord = usabilityChecksInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Usability Checks instance (e.g. initialised, pending, active) 
   * @return usabilityChecksInstanceStatus
  **/

  public String getUsabilityChecksInstanceStatus() {
    return usabilityChecksInstanceStatus;
  }

  public void setUsabilityChecksInstanceStatus(String usabilityChecksInstanceStatus) {
    this.usabilityChecksInstanceStatus = usabilityChecksInstanceStatus;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation before the test can be applied 
   * @return usabilityChecksPreconditions
  **/

  public String getUsabilityChecksPreconditions() {
    return usabilityChecksPreconditions;
  }

  public void setUsabilityChecksPreconditions(String usabilityChecksPreconditions) {
    this.usabilityChecksPreconditions = usabilityChecksPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The schedule and timing of the testing performed 
   * @return usabilityChecksAnalysisSchedule
  **/

  public String getUsabilityChecksAnalysisSchedule() {
    return usabilityChecksAnalysisSchedule;
  }

  public void setUsabilityChecksAnalysisSchedule(String usabilityChecksAnalysisSchedule) {
    this.usabilityChecksAnalysisSchedule = usabilityChecksAnalysisSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The test version employed 
   * @return usabilityChecksVersionNumber
  **/

  public String getUsabilityChecksVersionNumber() {
    return usabilityChecksVersionNumber;
  }

  public void setUsabilityChecksVersionNumber(String usabilityChecksVersionNumber) {
    this.usabilityChecksVersionNumber = usabilityChecksVersionNumber;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return usabilityChecksServiceType
  **/

  public String getUsabilityChecksServiceType() {
    return usabilityChecksServiceType;
  }

  public void setUsabilityChecksServiceType(String usabilityChecksServiceType) {
    this.usabilityChecksServiceType = usabilityChecksServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return usabilityChecksServiceDescription
  **/

  public String getUsabilityChecksServiceDescription() {
    return usabilityChecksServiceDescription;
  }

  public void setUsabilityChecksServiceDescription(String usabilityChecksServiceDescription) {
    this.usabilityChecksServiceDescription = usabilityChecksServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return usabilityChecksServiceInputsandOuputs
  **/

  public String getUsabilityChecksServiceInputsandOuputs() {
    return usabilityChecksServiceInputsandOuputs;
  }

  public void setUsabilityChecksServiceInputsandOuputs(String usabilityChecksServiceInputsandOuputs) {
    this.usabilityChecksServiceInputsandOuputs = usabilityChecksServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return usabilityChecksServiceWorkProduct
  **/

  public String getUsabilityChecksServiceWorkProduct() {
    return usabilityChecksServiceWorkProduct;
  }

  public void setUsabilityChecksServiceWorkProduct(String usabilityChecksServiceWorkProduct) {
    this.usabilityChecksServiceWorkProduct = usabilityChecksServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  
   * @return usabilityChecksServiceName
  **/

  public String getUsabilityChecksServiceName() {
    return usabilityChecksServiceName;
  }

  public void setUsabilityChecksServiceName(String usabilityChecksServiceName) {
    this.usabilityChecksServiceName = usabilityChecksServiceName;
  }


}

