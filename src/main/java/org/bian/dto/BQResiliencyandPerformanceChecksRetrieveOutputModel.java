package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQResiliencyandPerformanceChecksRetrieveOutputModelResiliencyandPerformanceChecksInstanceAnalysis;
import org.bian.dto.BQResiliencyandPerformanceChecksRetrieveOutputModelResiliencyandPerformanceChecksInstanceReport;

import javax.validation.Valid;
  
/**
 * BQResiliencyandPerformanceChecksRetrieveOutputModel
 */
public class BQResiliencyandPerformanceChecksRetrieveOutputModel   {
  private String resiliencyandPerformanceChecksPreconditions = null;

  private String resiliencyandPerformanceChecksAnalysisSchedule = null;

  private String resiliencyandPerformanceChecksVersionNumber = null;

  private String resiliencyandPerformanceChecks = null;

  private String resiliencyandPerformanceChecksServiceType = null;

  private String resiliencyandPerformanceChecksServiceDescription = null;

  private String resiliencyandPerformanceChecksServiceInputsandOuputs = null;

  private String resiliencyandPerformanceChecksServiceWorkProduct = null;

  private String resiliencyandPerformanceChecksServiceName = null;

  private String resiliencyandPerformanceChecksRetrieveActionTaskReference = null;

  private Object resiliencyandPerformanceChecksRetrieveActionTaskRecord = null;

  private String resiliencyandPerformanceChecksRetrieveActionResponse = null;

  private BQResiliencyandPerformanceChecksRetrieveOutputModelResiliencyandPerformanceChecksInstanceReport resiliencyandPerformanceChecksInstanceReport = null;

  private BQResiliencyandPerformanceChecksRetrieveOutputModelResiliencyandPerformanceChecksInstanceAnalysis resiliencyandPerformanceChecksInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Resiliency and Performance Checks instance retrieve service call 
   * @return resiliencyandPerformanceChecksRetrieveActionTaskReference
  **/

  public String getResiliencyandPerformanceChecksRetrieveActionTaskReference() {
    return resiliencyandPerformanceChecksRetrieveActionTaskReference;
  }

  public void setResiliencyandPerformanceChecksRetrieveActionTaskReference(String resiliencyandPerformanceChecksRetrieveActionTaskReference) {
    this.resiliencyandPerformanceChecksRetrieveActionTaskReference = resiliencyandPerformanceChecksRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return resiliencyandPerformanceChecksRetrieveActionTaskRecord
  **/

  public Object getResiliencyandPerformanceChecksRetrieveActionTaskRecord() {
    return resiliencyandPerformanceChecksRetrieveActionTaskRecord;
  }

  public void setResiliencyandPerformanceChecksRetrieveActionTaskRecord(Object resiliencyandPerformanceChecksRetrieveActionTaskRecord) {
    this.resiliencyandPerformanceChecksRetrieveActionTaskRecord = resiliencyandPerformanceChecksRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return resiliencyandPerformanceChecksRetrieveActionResponse
  **/

  public String getResiliencyandPerformanceChecksRetrieveActionResponse() {
    return resiliencyandPerformanceChecksRetrieveActionResponse;
  }

  public void setResiliencyandPerformanceChecksRetrieveActionResponse(String resiliencyandPerformanceChecksRetrieveActionResponse) {
    this.resiliencyandPerformanceChecksRetrieveActionResponse = resiliencyandPerformanceChecksRetrieveActionResponse;
  }


  /**
   * Get resiliencyandPerformanceChecksInstanceReport
   * @return resiliencyandPerformanceChecksInstanceReport
  **/

  public BQResiliencyandPerformanceChecksRetrieveOutputModelResiliencyandPerformanceChecksInstanceReport getResiliencyandPerformanceChecksInstanceReport() {
    return resiliencyandPerformanceChecksInstanceReport;
  }

  public void setResiliencyandPerformanceChecksInstanceReport(BQResiliencyandPerformanceChecksRetrieveOutputModelResiliencyandPerformanceChecksInstanceReport resiliencyandPerformanceChecksInstanceReport) {
    this.resiliencyandPerformanceChecksInstanceReport = resiliencyandPerformanceChecksInstanceReport;
  }


  /**
   * Get resiliencyandPerformanceChecksInstanceAnalysis
   * @return resiliencyandPerformanceChecksInstanceAnalysis
  **/

  public BQResiliencyandPerformanceChecksRetrieveOutputModelResiliencyandPerformanceChecksInstanceAnalysis getResiliencyandPerformanceChecksInstanceAnalysis() {
    return resiliencyandPerformanceChecksInstanceAnalysis;
  }

  public void setResiliencyandPerformanceChecksInstanceAnalysis(BQResiliencyandPerformanceChecksRetrieveOutputModelResiliencyandPerformanceChecksInstanceAnalysis resiliencyandPerformanceChecksInstanceAnalysis) {
    this.resiliencyandPerformanceChecksInstanceAnalysis = resiliencyandPerformanceChecksInstanceAnalysis;
  }


}

