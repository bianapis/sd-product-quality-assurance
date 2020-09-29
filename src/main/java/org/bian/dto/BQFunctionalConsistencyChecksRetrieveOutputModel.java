package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQFunctionalConsistencyChecksRetrieveOutputModelFunctionalConsistencyChecksInstanceAnalysis;
import org.bian.dto.BQFunctionalConsistencyChecksRetrieveOutputModelFunctionalConsistencyChecksInstanceReport;

import javax.validation.Valid;
  
/**
 * BQFunctionalConsistencyChecksRetrieveOutputModel
 */
public class BQFunctionalConsistencyChecksRetrieveOutputModel   {
  private String functionalConsistencyChecksPreconditions = null;

  private String functionalConsistencyChecksAnalysisSchedule = null;

  private String functionalConsistencyChecksVersionNumber = null;

  private String functionalConsistencyChecksServiceType = null;

  private String functionalConsistencyChecksServiceDescription = null;

  private String functionalConsistencyChecksServiceInputsandOuputs = null;

  private String functionalConsistencyChecksServiceWorkProduct = null;

  private String functionalConsistencyChecksServiceName = null;

  private String functionalConsistencyChecksRetrieveActionTaskReference = null;

  private Object functionalConsistencyChecksRetrieveActionTaskRecord = null;

  private String functionalConsistencyChecksRetrieveActionResponse = null;

  private BQFunctionalConsistencyChecksRetrieveOutputModelFunctionalConsistencyChecksInstanceReport functionalConsistencyChecksInstanceReport = null;

  private BQFunctionalConsistencyChecksRetrieveOutputModelFunctionalConsistencyChecksInstanceAnalysis functionalConsistencyChecksInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Functional Consistency Checks instance retrieve service call 
   * @return functionalConsistencyChecksRetrieveActionTaskReference
  **/

  public String getFunctionalConsistencyChecksRetrieveActionTaskReference() {
    return functionalConsistencyChecksRetrieveActionTaskReference;
  }

  public void setFunctionalConsistencyChecksRetrieveActionTaskReference(String functionalConsistencyChecksRetrieveActionTaskReference) {
    this.functionalConsistencyChecksRetrieveActionTaskReference = functionalConsistencyChecksRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return functionalConsistencyChecksRetrieveActionTaskRecord
  **/

  public Object getFunctionalConsistencyChecksRetrieveActionTaskRecord() {
    return functionalConsistencyChecksRetrieveActionTaskRecord;
  }

  public void setFunctionalConsistencyChecksRetrieveActionTaskRecord(Object functionalConsistencyChecksRetrieveActionTaskRecord) {
    this.functionalConsistencyChecksRetrieveActionTaskRecord = functionalConsistencyChecksRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return functionalConsistencyChecksRetrieveActionResponse
  **/

  public String getFunctionalConsistencyChecksRetrieveActionResponse() {
    return functionalConsistencyChecksRetrieveActionResponse;
  }

  public void setFunctionalConsistencyChecksRetrieveActionResponse(String functionalConsistencyChecksRetrieveActionResponse) {
    this.functionalConsistencyChecksRetrieveActionResponse = functionalConsistencyChecksRetrieveActionResponse;
  }


  /**
   * Get functionalConsistencyChecksInstanceReport
   * @return functionalConsistencyChecksInstanceReport
  **/

  public BQFunctionalConsistencyChecksRetrieveOutputModelFunctionalConsistencyChecksInstanceReport getFunctionalConsistencyChecksInstanceReport() {
    return functionalConsistencyChecksInstanceReport;
  }

  public void setFunctionalConsistencyChecksInstanceReport(BQFunctionalConsistencyChecksRetrieveOutputModelFunctionalConsistencyChecksInstanceReport functionalConsistencyChecksInstanceReport) {
    this.functionalConsistencyChecksInstanceReport = functionalConsistencyChecksInstanceReport;
  }


  /**
   * Get functionalConsistencyChecksInstanceAnalysis
   * @return functionalConsistencyChecksInstanceAnalysis
  **/

  public BQFunctionalConsistencyChecksRetrieveOutputModelFunctionalConsistencyChecksInstanceAnalysis getFunctionalConsistencyChecksInstanceAnalysis() {
    return functionalConsistencyChecksInstanceAnalysis;
  }

  public void setFunctionalConsistencyChecksInstanceAnalysis(BQFunctionalConsistencyChecksRetrieveOutputModelFunctionalConsistencyChecksInstanceAnalysis functionalConsistencyChecksInstanceAnalysis) {
    this.functionalConsistencyChecksInstanceAnalysis = functionalConsistencyChecksInstanceAnalysis;
  }


}

