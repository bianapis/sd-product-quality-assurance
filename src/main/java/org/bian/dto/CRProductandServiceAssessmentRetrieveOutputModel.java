package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProductandServiceAssessmentRetrieveOutputModelProductandServiceAssessmentInstanceAnalysis;
import org.bian.dto.CRProductandServiceAssessmentRetrieveOutputModelProductandServiceAssessmentInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRProductandServiceAssessmentRetrieveOutputModel
 */
public class CRProductandServiceAssessmentRetrieveOutputModel   {
  private String productandServiceAssessmentParameterType = null;

  private String productandServiceAssessmentSelectedOption = null;

  private String productandServiceAssessmentType = null;

  private String productandServiceAssessmentReference = null;

  private String productandServiceAssessmentRequest = null;

  private String productandServiceAssessmentSchedule = null;

  private String productandServiceAssessmentStatus = null;

  private String productandServiceAssessmentUsageLog = null;

  private String productandServiceAssessmentServiceProviderReference = null;

  private String productandServiceAssessmentRequesterReference = null;

  private String productandServiceAssessmentRetrieveActionTaskReference = null;

  private Object productandServiceAssessmentRetrieveActionTaskRecord = null;

  private String productandServiceAssessmentRetrieveActionResponse = null;

  private CRProductandServiceAssessmentRetrieveOutputModelProductandServiceAssessmentInstanceReportRecord productandServiceAssessmentInstanceReportRecord = null;

  private CRProductandServiceAssessmentRetrieveOutputModelProductandServiceAssessmentInstanceAnalysis productandServiceAssessmentInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of Product and Service Assessment 
   * @return productandServiceAssessmentType
  **/

  public String getProductandServiceAssessmentType() {
    return productandServiceAssessmentType;
  }

  public void setProductandServiceAssessmentType(String productandServiceAssessmentType) {
    this.productandServiceAssessmentType = productandServiceAssessmentType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to Product and Service Assessment 
   * @return productandServiceAssessmentReference
  **/

  public String getProductandServiceAssessmentReference() {
    return productandServiceAssessmentReference;
  }

  public void setProductandServiceAssessmentReference(String productandServiceAssessmentReference) {
    this.productandServiceAssessmentReference = productandServiceAssessmentReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Timetable to assess ProductandService 
   * @return productandServiceAssessmentSchedule
  **/

  public String getProductandServiceAssessmentSchedule() {
    return productandServiceAssessmentSchedule;
  }

  public void setProductandServiceAssessmentSchedule(String productandServiceAssessmentSchedule) {
    this.productandServiceAssessmentSchedule = productandServiceAssessmentSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of Product and Service Assessment 
   * @return productandServiceAssessmentStatus
  **/

  public String getProductandServiceAssessmentStatus() {
    return productandServiceAssessmentStatus;
  }

  public void setProductandServiceAssessmentStatus(String productandServiceAssessmentStatus) {
    this.productandServiceAssessmentStatus = productandServiceAssessmentStatus;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the log of (usage) ativities/events of Product and Service Assessment 
   * @return productandServiceAssessmentUsageLog
  **/

  public String getProductandServiceAssessmentUsageLog() {
    return productandServiceAssessmentUsageLog;
  }

  public void setProductandServiceAssessmentUsageLog(String productandServiceAssessmentUsageLog) {
    this.productandServiceAssessmentUsageLog = productandServiceAssessmentUsageLog;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the party who has provided Product and Service Assessment 
   * @return productandServiceAssessmentServiceProviderReference
  **/

  public String getProductandServiceAssessmentServiceProviderReference() {
    return productandServiceAssessmentServiceProviderReference;
  }

  public void setProductandServiceAssessmentServiceProviderReference(String productandServiceAssessmentServiceProviderReference) {
    this.productandServiceAssessmentServiceProviderReference = productandServiceAssessmentServiceProviderReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the party who has requested Product and Service Assessment 
   * @return productandServiceAssessmentRequesterReference
  **/

  public String getProductandServiceAssessmentRequesterReference() {
    return productandServiceAssessmentRequesterReference;
  }

  public void setProductandServiceAssessmentRequesterReference(String productandServiceAssessmentRequesterReference) {
    this.productandServiceAssessmentRequesterReference = productandServiceAssessmentRequesterReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Product and Service Assessment instance retrieve service call 
   * @return productandServiceAssessmentRetrieveActionTaskReference
  **/

  public String getProductandServiceAssessmentRetrieveActionTaskReference() {
    return productandServiceAssessmentRetrieveActionTaskReference;
  }

  public void setProductandServiceAssessmentRetrieveActionTaskReference(String productandServiceAssessmentRetrieveActionTaskReference) {
    this.productandServiceAssessmentRetrieveActionTaskReference = productandServiceAssessmentRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return productandServiceAssessmentRetrieveActionTaskRecord
  **/

  public Object getProductandServiceAssessmentRetrieveActionTaskRecord() {
    return productandServiceAssessmentRetrieveActionTaskRecord;
  }

  public void setProductandServiceAssessmentRetrieveActionTaskRecord(Object productandServiceAssessmentRetrieveActionTaskRecord) {
    this.productandServiceAssessmentRetrieveActionTaskRecord = productandServiceAssessmentRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return productandServiceAssessmentRetrieveActionResponse
  **/

  public String getProductandServiceAssessmentRetrieveActionResponse() {
    return productandServiceAssessmentRetrieveActionResponse;
  }

  public void setProductandServiceAssessmentRetrieveActionResponse(String productandServiceAssessmentRetrieveActionResponse) {
    this.productandServiceAssessmentRetrieveActionResponse = productandServiceAssessmentRetrieveActionResponse;
  }


  /**
   * Get productandServiceAssessmentInstanceReportRecord
   * @return productandServiceAssessmentInstanceReportRecord
  **/

  public CRProductandServiceAssessmentRetrieveOutputModelProductandServiceAssessmentInstanceReportRecord getProductandServiceAssessmentInstanceReportRecord() {
    return productandServiceAssessmentInstanceReportRecord;
  }

  public void setProductandServiceAssessmentInstanceReportRecord(CRProductandServiceAssessmentRetrieveOutputModelProductandServiceAssessmentInstanceReportRecord productandServiceAssessmentInstanceReportRecord) {
    this.productandServiceAssessmentInstanceReportRecord = productandServiceAssessmentInstanceReportRecord;
  }


  /**
   * Get productandServiceAssessmentInstanceAnalysis
   * @return productandServiceAssessmentInstanceAnalysis
  **/

  public CRProductandServiceAssessmentRetrieveOutputModelProductandServiceAssessmentInstanceAnalysis getProductandServiceAssessmentInstanceAnalysis() {
    return productandServiceAssessmentInstanceAnalysis;
  }

  public void setProductandServiceAssessmentInstanceAnalysis(CRProductandServiceAssessmentRetrieveOutputModelProductandServiceAssessmentInstanceAnalysis productandServiceAssessmentInstanceAnalysis) {
    this.productandServiceAssessmentInstanceAnalysis = productandServiceAssessmentInstanceAnalysis;
  }


}

