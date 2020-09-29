package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQResiliencyandPerformanceChecksUpdateOutputModel
 */
public class BQResiliencyandPerformanceChecksUpdateOutputModel   {
  private String resiliencyandPerformanceChecksPreconditions = null;

  private String resiliencyandPerformanceChecksAnalysisSchedule = null;

  private String resiliencyandPerformanceChecksVersionNumber = null;

  private String resiliencyandPerformanceChecks = null;

  private String resiliencyandPerformanceChecksServiceType = null;

  private String resiliencyandPerformanceChecksServiceDescription = null;

  private String resiliencyandPerformanceChecksServiceInputsandOuputs = null;

  private String resiliencyandPerformanceChecksServiceWorkProduct = null;

  private String resiliencyandPerformanceChecksServiceName = null;

  private String resiliencyandPerformanceChecksUpdateActionTaskReference = null;

  private Object resiliencyandPerformanceChecksUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation before the test can be applied 
   * @return resiliencyandPerformanceChecksPreconditions
  **/

  public String getResiliencyandPerformanceChecksPreconditions() {
    return resiliencyandPerformanceChecksPreconditions;
  }

  public void setResiliencyandPerformanceChecksPreconditions(String resiliencyandPerformanceChecksPreconditions) {
    this.resiliencyandPerformanceChecksPreconditions = resiliencyandPerformanceChecksPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The schedule and timing of the testing performed 
   * @return resiliencyandPerformanceChecksAnalysisSchedule
  **/

  public String getResiliencyandPerformanceChecksAnalysisSchedule() {
    return resiliencyandPerformanceChecksAnalysisSchedule;
  }

  public void setResiliencyandPerformanceChecksAnalysisSchedule(String resiliencyandPerformanceChecksAnalysisSchedule) {
    this.resiliencyandPerformanceChecksAnalysisSchedule = resiliencyandPerformanceChecksAnalysisSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The test version employed 
   * @return resiliencyandPerformanceChecksVersionNumber
  **/

  public String getResiliencyandPerformanceChecksVersionNumber() {
    return resiliencyandPerformanceChecksVersionNumber;
  }

  public void setResiliencyandPerformanceChecksVersionNumber(String resiliencyandPerformanceChecksVersionNumber) {
    this.resiliencyandPerformanceChecksVersionNumber = resiliencyandPerformanceChecksVersionNumber;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The Product and Service Assessment specific Business Service 
   * @return resiliencyandPerformanceChecks
  **/

  public String getResiliencyandPerformanceChecks() {
    return resiliencyandPerformanceChecks;
  }

  public void setResiliencyandPerformanceChecks(String resiliencyandPerformanceChecks) {
    this.resiliencyandPerformanceChecks = resiliencyandPerformanceChecks;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return resiliencyandPerformanceChecksServiceType
  **/

  public String getResiliencyandPerformanceChecksServiceType() {
    return resiliencyandPerformanceChecksServiceType;
  }

  public void setResiliencyandPerformanceChecksServiceType(String resiliencyandPerformanceChecksServiceType) {
    this.resiliencyandPerformanceChecksServiceType = resiliencyandPerformanceChecksServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return resiliencyandPerformanceChecksServiceDescription
  **/

  public String getResiliencyandPerformanceChecksServiceDescription() {
    return resiliencyandPerformanceChecksServiceDescription;
  }

  public void setResiliencyandPerformanceChecksServiceDescription(String resiliencyandPerformanceChecksServiceDescription) {
    this.resiliencyandPerformanceChecksServiceDescription = resiliencyandPerformanceChecksServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return resiliencyandPerformanceChecksServiceInputsandOuputs
  **/

  public String getResiliencyandPerformanceChecksServiceInputsandOuputs() {
    return resiliencyandPerformanceChecksServiceInputsandOuputs;
  }

  public void setResiliencyandPerformanceChecksServiceInputsandOuputs(String resiliencyandPerformanceChecksServiceInputsandOuputs) {
    this.resiliencyandPerformanceChecksServiceInputsandOuputs = resiliencyandPerformanceChecksServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return resiliencyandPerformanceChecksServiceWorkProduct
  **/

  public String getResiliencyandPerformanceChecksServiceWorkProduct() {
    return resiliencyandPerformanceChecksServiceWorkProduct;
  }

  public void setResiliencyandPerformanceChecksServiceWorkProduct(String resiliencyandPerformanceChecksServiceWorkProduct) {
    this.resiliencyandPerformanceChecksServiceWorkProduct = resiliencyandPerformanceChecksServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  
   * @return resiliencyandPerformanceChecksServiceName
  **/

  public String getResiliencyandPerformanceChecksServiceName() {
    return resiliencyandPerformanceChecksServiceName;
  }

  public void setResiliencyandPerformanceChecksServiceName(String resiliencyandPerformanceChecksServiceName) {
    this.resiliencyandPerformanceChecksServiceName = resiliencyandPerformanceChecksServiceName;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return resiliencyandPerformanceChecksUpdateActionTaskReference
  **/

  public String getResiliencyandPerformanceChecksUpdateActionTaskReference() {
    return resiliencyandPerformanceChecksUpdateActionTaskReference;
  }

  public void setResiliencyandPerformanceChecksUpdateActionTaskReference(String resiliencyandPerformanceChecksUpdateActionTaskReference) {
    this.resiliencyandPerformanceChecksUpdateActionTaskReference = resiliencyandPerformanceChecksUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return resiliencyandPerformanceChecksUpdateActionTaskRecord
  **/

  public Object getResiliencyandPerformanceChecksUpdateActionTaskRecord() {
    return resiliencyandPerformanceChecksUpdateActionTaskRecord;
  }

  public void setResiliencyandPerformanceChecksUpdateActionTaskRecord(Object resiliencyandPerformanceChecksUpdateActionTaskRecord) {
    this.resiliencyandPerformanceChecksUpdateActionTaskRecord = resiliencyandPerformanceChecksUpdateActionTaskRecord;
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

