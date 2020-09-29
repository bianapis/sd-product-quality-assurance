package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRProductandServiceAssessmentRetrieveOutputModelProductandServiceAssessmentInstanceAnalysis
 */
public class CRProductandServiceAssessmentRetrieveOutputModelProductandServiceAssessmentInstanceAnalysis   {
  private String productandServiceAssessmentInstanceAnalysisData = null;

  private String productandServiceAssessmentInstanceAnalysisReportType = null;

  private Object productandServiceAssessmentInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return productandServiceAssessmentInstanceAnalysisData
  **/

  public String getProductandServiceAssessmentInstanceAnalysisData() {
    return productandServiceAssessmentInstanceAnalysisData;
  }

  public void setProductandServiceAssessmentInstanceAnalysisData(String productandServiceAssessmentInstanceAnalysisData) {
    this.productandServiceAssessmentInstanceAnalysisData = productandServiceAssessmentInstanceAnalysisData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return productandServiceAssessmentInstanceAnalysisReport
  **/

  public Object getProductandServiceAssessmentInstanceAnalysisReport() {
    return productandServiceAssessmentInstanceAnalysisReport;
  }

  public void setProductandServiceAssessmentInstanceAnalysisReport(Object productandServiceAssessmentInstanceAnalysisReport) {
    this.productandServiceAssessmentInstanceAnalysisReport = productandServiceAssessmentInstanceAnalysisReport;
  }


}

