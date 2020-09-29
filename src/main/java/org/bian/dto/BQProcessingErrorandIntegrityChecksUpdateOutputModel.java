package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProcessingErrorandIntegrityChecksUpdateOutputModel
 */
public class BQProcessingErrorandIntegrityChecksUpdateOutputModel   {
  private String processingErrorandIntegrityChecksPreconditions = null;

  private String processingErrorandIntegrityChecksAnalysisSchedule = null;

  private String processingErrorandIntegrityChecksVersionNumber = null;

  private String processingErrorandIntegrityChecks = null;

  private String processingErrorandIntegrityChecksServiceType = null;

  private String processingErrorandIntegrityChecksServiceDescription = null;

  private String processingErrorandIntegrityChecksServiceInputsandOuputs = null;

  private String processingErrorandIntegrityChecksServiceWorkProduct = null;

  private String processingErrorandIntegrityChecksUpdateActionTaskReference = null;

  private Object processingErrorandIntegrityChecksUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation before the test can be applied 
   * @return processingErrorandIntegrityChecksPreconditions
  **/

  public String getProcessingErrorandIntegrityChecksPreconditions() {
    return processingErrorandIntegrityChecksPreconditions;
  }

  public void setProcessingErrorandIntegrityChecksPreconditions(String processingErrorandIntegrityChecksPreconditions) {
    this.processingErrorandIntegrityChecksPreconditions = processingErrorandIntegrityChecksPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The schedule and timing of the testing performed 
   * @return processingErrorandIntegrityChecksAnalysisSchedule
  **/

  public String getProcessingErrorandIntegrityChecksAnalysisSchedule() {
    return processingErrorandIntegrityChecksAnalysisSchedule;
  }

  public void setProcessingErrorandIntegrityChecksAnalysisSchedule(String processingErrorandIntegrityChecksAnalysisSchedule) {
    this.processingErrorandIntegrityChecksAnalysisSchedule = processingErrorandIntegrityChecksAnalysisSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The test version employed 
   * @return processingErrorandIntegrityChecksVersionNumber
  **/

  public String getProcessingErrorandIntegrityChecksVersionNumber() {
    return processingErrorandIntegrityChecksVersionNumber;
  }

  public void setProcessingErrorandIntegrityChecksVersionNumber(String processingErrorandIntegrityChecksVersionNumber) {
    this.processingErrorandIntegrityChecksVersionNumber = processingErrorandIntegrityChecksVersionNumber;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The Product and Service Assessment specific Business Service 
   * @return processingErrorandIntegrityChecks
  **/

  public String getProcessingErrorandIntegrityChecks() {
    return processingErrorandIntegrityChecks;
  }

  public void setProcessingErrorandIntegrityChecks(String processingErrorandIntegrityChecks) {
    this.processingErrorandIntegrityChecks = processingErrorandIntegrityChecks;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return processingErrorandIntegrityChecksServiceType
  **/

  public String getProcessingErrorandIntegrityChecksServiceType() {
    return processingErrorandIntegrityChecksServiceType;
  }

  public void setProcessingErrorandIntegrityChecksServiceType(String processingErrorandIntegrityChecksServiceType) {
    this.processingErrorandIntegrityChecksServiceType = processingErrorandIntegrityChecksServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return processingErrorandIntegrityChecksServiceDescription
  **/

  public String getProcessingErrorandIntegrityChecksServiceDescription() {
    return processingErrorandIntegrityChecksServiceDescription;
  }

  public void setProcessingErrorandIntegrityChecksServiceDescription(String processingErrorandIntegrityChecksServiceDescription) {
    this.processingErrorandIntegrityChecksServiceDescription = processingErrorandIntegrityChecksServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return processingErrorandIntegrityChecksServiceInputsandOuputs
  **/

  public String getProcessingErrorandIntegrityChecksServiceInputsandOuputs() {
    return processingErrorandIntegrityChecksServiceInputsandOuputs;
  }

  public void setProcessingErrorandIntegrityChecksServiceInputsandOuputs(String processingErrorandIntegrityChecksServiceInputsandOuputs) {
    this.processingErrorandIntegrityChecksServiceInputsandOuputs = processingErrorandIntegrityChecksServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return processingErrorandIntegrityChecksServiceWorkProduct
  **/

  public String getProcessingErrorandIntegrityChecksServiceWorkProduct() {
    return processingErrorandIntegrityChecksServiceWorkProduct;
  }

  public void setProcessingErrorandIntegrityChecksServiceWorkProduct(String processingErrorandIntegrityChecksServiceWorkProduct) {
    this.processingErrorandIntegrityChecksServiceWorkProduct = processingErrorandIntegrityChecksServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return processingErrorandIntegrityChecksUpdateActionTaskReference
  **/

  public String getProcessingErrorandIntegrityChecksUpdateActionTaskReference() {
    return processingErrorandIntegrityChecksUpdateActionTaskReference;
  }

  public void setProcessingErrorandIntegrityChecksUpdateActionTaskReference(String processingErrorandIntegrityChecksUpdateActionTaskReference) {
    this.processingErrorandIntegrityChecksUpdateActionTaskReference = processingErrorandIntegrityChecksUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return processingErrorandIntegrityChecksUpdateActionTaskRecord
  **/

  public Object getProcessingErrorandIntegrityChecksUpdateActionTaskRecord() {
    return processingErrorandIntegrityChecksUpdateActionTaskRecord;
  }

  public void setProcessingErrorandIntegrityChecksUpdateActionTaskRecord(Object processingErrorandIntegrityChecksUpdateActionTaskRecord) {
    this.processingErrorandIntegrityChecksUpdateActionTaskRecord = processingErrorandIntegrityChecksUpdateActionTaskRecord;
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

