package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRProductandServiceAssessmentRetrieveInputModelProductandServiceAssessmentInstanceAnalysis
 */
public class CRProductandServiceAssessmentRetrieveInputModelProductandServiceAssessmentInstanceAnalysis   {
  private String productandServiceAssessmentInstanceAnalysisReference = null;

  private String productandServiceAssessmentInstanceAnalysisReportType = null;

  private String productandServiceAssessmentInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return productandServiceAssessmentInstanceAnalysisReference
  **/

  public String getProductandServiceAssessmentInstanceAnalysisReference() {
    return productandServiceAssessmentInstanceAnalysisReference;
  }

  public void setProductandServiceAssessmentInstanceAnalysisReference(String productandServiceAssessmentInstanceAnalysisReference) {
    this.productandServiceAssessmentInstanceAnalysisReference = productandServiceAssessmentInstanceAnalysisReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return productandServiceAssessmentInstanceAnalysisReportType
  **/

  public String getProductandServiceAssessmentInstanceAnalysisReportType() {
    return productandServiceAssessmentInstanceAnalysisReportType;
  }

  public void setProductandServiceAssessmentInstanceAnalysisReportType(String productandServiceAssessmentInstanceAnalysisReportType) {
    this.productandServiceAssessmentInstanceAnalysisReportType = productandServiceAssessmentInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return productandServiceAssessmentInstanceAnalysisParameters
  **/

  public String getProductandServiceAssessmentInstanceAnalysisParameters() {
    return productandServiceAssessmentInstanceAnalysisParameters;
  }

  public void setProductandServiceAssessmentInstanceAnalysisParameters(String productandServiceAssessmentInstanceAnalysisParameters) {
    this.productandServiceAssessmentInstanceAnalysisParameters = productandServiceAssessmentInstanceAnalysisParameters;
  }


}

