package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQProcessingErrorandIntegrityChecksRetrieveOutputModelProcessingErrorandIntegrityChecksInstanceAnalysis;
import org.bian.dto.BQProcessingErrorandIntegrityChecksRetrieveOutputModelProcessingErrorandIntegrityChecksInstanceReport;

import javax.validation.Valid;
  
/**
 * BQProcessingErrorandIntegrityChecksRetrieveOutputModel
 */
public class BQProcessingErrorandIntegrityChecksRetrieveOutputModel   {
  private String processingErrorandIntegrityChecksPreconditions = null;

  private String processingErrorandIntegrityChecksAnalysisSchedule = null;

  private String processingErrorandIntegrityChecksVersionNumber = null;

  private String processingErrorandIntegrityChecks = null;

  private String processingErrorandIntegrityChecksServiceType = null;

  private String processingErrorandIntegrityChecksServiceDescription = null;

  private String processingErrorandIntegrityChecksServiceInputsandOuputs = null;

  private String processingErrorandIntegrityChecksServiceWorkProduct = null;

  private String processingErrorandIntegrityChecksRetrieveActionTaskReference = null;

  private Object processingErrorandIntegrityChecksRetrieveActionTaskRecord = null;

  private String processingErrorandIntegrityChecksRetrieveActionResponse = null;

  private BQProcessingErrorandIntegrityChecksRetrieveOutputModelProcessingErrorandIntegrityChecksInstanceReport processingErrorandIntegrityChecksInstanceReport = null;

  private BQProcessingErrorandIntegrityChecksRetrieveOutputModelProcessingErrorandIntegrityChecksInstanceAnalysis processingErrorandIntegrityChecksInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Processing Error and Integrity Checks instance retrieve service call 
   * @return processingErrorandIntegrityChecksRetrieveActionTaskReference
  **/

  public String getProcessingErrorandIntegrityChecksRetrieveActionTaskReference() {
    return processingErrorandIntegrityChecksRetrieveActionTaskReference;
  }

  public void setProcessingErrorandIntegrityChecksRetrieveActionTaskReference(String processingErrorandIntegrityChecksRetrieveActionTaskReference) {
    this.processingErrorandIntegrityChecksRetrieveActionTaskReference = processingErrorandIntegrityChecksRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return processingErrorandIntegrityChecksRetrieveActionTaskRecord
  **/

  public Object getProcessingErrorandIntegrityChecksRetrieveActionTaskRecord() {
    return processingErrorandIntegrityChecksRetrieveActionTaskRecord;
  }

  public void setProcessingErrorandIntegrityChecksRetrieveActionTaskRecord(Object processingErrorandIntegrityChecksRetrieveActionTaskRecord) {
    this.processingErrorandIntegrityChecksRetrieveActionTaskRecord = processingErrorandIntegrityChecksRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return processingErrorandIntegrityChecksRetrieveActionResponse
  **/

  public String getProcessingErrorandIntegrityChecksRetrieveActionResponse() {
    return processingErrorandIntegrityChecksRetrieveActionResponse;
  }

  public void setProcessingErrorandIntegrityChecksRetrieveActionResponse(String processingErrorandIntegrityChecksRetrieveActionResponse) {
    this.processingErrorandIntegrityChecksRetrieveActionResponse = processingErrorandIntegrityChecksRetrieveActionResponse;
  }


  /**
   * Get processingErrorandIntegrityChecksInstanceReport
   * @return processingErrorandIntegrityChecksInstanceReport
  **/

  public BQProcessingErrorandIntegrityChecksRetrieveOutputModelProcessingErrorandIntegrityChecksInstanceReport getProcessingErrorandIntegrityChecksInstanceReport() {
    return processingErrorandIntegrityChecksInstanceReport;
  }

  public void setProcessingErrorandIntegrityChecksInstanceReport(BQProcessingErrorandIntegrityChecksRetrieveOutputModelProcessingErrorandIntegrityChecksInstanceReport processingErrorandIntegrityChecksInstanceReport) {
    this.processingErrorandIntegrityChecksInstanceReport = processingErrorandIntegrityChecksInstanceReport;
  }


  /**
   * Get processingErrorandIntegrityChecksInstanceAnalysis
   * @return processingErrorandIntegrityChecksInstanceAnalysis
  **/

  public BQProcessingErrorandIntegrityChecksRetrieveOutputModelProcessingErrorandIntegrityChecksInstanceAnalysis getProcessingErrorandIntegrityChecksInstanceAnalysis() {
    return processingErrorandIntegrityChecksInstanceAnalysis;
  }

  public void setProcessingErrorandIntegrityChecksInstanceAnalysis(BQProcessingErrorandIntegrityChecksRetrieveOutputModelProcessingErrorandIntegrityChecksInstanceAnalysis processingErrorandIntegrityChecksInstanceAnalysis) {
    this.processingErrorandIntegrityChecksInstanceAnalysis = processingErrorandIntegrityChecksInstanceAnalysis;
  }


}

