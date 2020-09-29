package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRProductandServiceAssessmentRetrieveInputModelProductandServiceAssessmentInstanceReportRecord
 */
public class CRProductandServiceAssessmentRetrieveInputModelProductandServiceAssessmentInstanceReportRecord   {
  private String productandServiceAssessmentInstanceReportReference = null;

  private String productandServiceAssessmentInstanceReportType = null;

  private String productandServiceAssessmentInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return productandServiceAssessmentInstanceReportReference
  **/

  public String getProductandServiceAssessmentInstanceReportReference() {
    return productandServiceAssessmentInstanceReportReference;
  }

  public void setProductandServiceAssessmentInstanceReportReference(String productandServiceAssessmentInstanceReportReference) {
    this.productandServiceAssessmentInstanceReportReference = productandServiceAssessmentInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return productandServiceAssessmentInstanceReportType
  **/

  public String getProductandServiceAssessmentInstanceReportType() {
    return productandServiceAssessmentInstanceReportType;
  }

  public void setProductandServiceAssessmentInstanceReportType(String productandServiceAssessmentInstanceReportType) {
    this.productandServiceAssessmentInstanceReportType = productandServiceAssessmentInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return productandServiceAssessmentInstanceReportParameters
  **/

  public String getProductandServiceAssessmentInstanceReportParameters() {
    return productandServiceAssessmentInstanceReportParameters;
  }

  public void setProductandServiceAssessmentInstanceReportParameters(String productandServiceAssessmentInstanceReportParameters) {
    this.productandServiceAssessmentInstanceReportParameters = productandServiceAssessmentInstanceReportParameters;
  }


}

