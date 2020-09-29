package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProductandServiceAssessmentGrantOutputModelGrantRequestResponseRecord;

import javax.validation.Valid;
  
/**
 * CRProductandServiceAssessmentGrantOutputModel
 */
public class CRProductandServiceAssessmentGrantOutputModel   {
  private String productandServiceAssessmentParameterType = null;

  private String productandServiceAssessmentSelectedOption = null;

  private String productandServiceAssessmentRequest = null;

  private String productandServiceAssessmentGrantActionTaskReference = null;

  private Object productandServiceAssessmentGrantActionTaskRecord = null;

  private String grantRequestRecordReference = null;

  private CRProductandServiceAssessmentGrantOutputModelGrantRequestResponseRecord grantRequestResponseRecord = null;


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


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Product and Service Assessment instance grant service call 
   * @return productandServiceAssessmentGrantActionTaskReference
  **/

  public String getProductandServiceAssessmentGrantActionTaskReference() {
    return productandServiceAssessmentGrantActionTaskReference;
  }

  public void setProductandServiceAssessmentGrantActionTaskReference(String productandServiceAssessmentGrantActionTaskReference) {
    this.productandServiceAssessmentGrantActionTaskReference = productandServiceAssessmentGrantActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The grant service call consolidated processing record 
   * @return productandServiceAssessmentGrantActionTaskRecord
  **/

  public Object getProductandServiceAssessmentGrantActionTaskRecord() {
    return productandServiceAssessmentGrantActionTaskRecord;
  }

  public void setProductandServiceAssessmentGrantActionTaskRecord(Object productandServiceAssessmentGrantActionTaskRecord) {
    this.productandServiceAssessmentGrantActionTaskRecord = productandServiceAssessmentGrantActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the grant request record 
   * @return grantRequestRecordReference
  **/

  public String getGrantRequestRecordReference() {
    return grantRequestRecordReference;
  }

  public void setGrantRequestRecordReference(String grantRequestRecordReference) {
    this.grantRequestRecordReference = grantRequestRecordReference;
  }


  /**
   * Get grantRequestResponseRecord
   * @return grantRequestResponseRecord
  **/

  public CRProductandServiceAssessmentGrantOutputModelGrantRequestResponseRecord getGrantRequestResponseRecord() {
    return grantRequestResponseRecord;
  }

  public void setGrantRequestResponseRecord(CRProductandServiceAssessmentGrantOutputModelGrantRequestResponseRecord grantRequestResponseRecord) {
    this.grantRequestResponseRecord = grantRequestResponseRecord;
  }


}

