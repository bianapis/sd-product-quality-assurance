package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRProductandServiceAssessmentRetrieveOutputModelProductandServiceAssessmentInstanceReportRecord
 */
public class CRProductandServiceAssessmentRetrieveOutputModelProductandServiceAssessmentInstanceReportRecord   {
  private String productandServiceAssessmentInstanceReportData = null;

  private String productandServiceAssessmentInstanceReportType = null;

  private Object productandServiceAssessmentInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return productandServiceAssessmentInstanceReportData
  **/

  public String getProductandServiceAssessmentInstanceReportData() {
    return productandServiceAssessmentInstanceReportData;
  }

  public void setProductandServiceAssessmentInstanceReportData(String productandServiceAssessmentInstanceReportData) {
    this.productandServiceAssessmentInstanceReportData = productandServiceAssessmentInstanceReportData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return productandServiceAssessmentInstanceReport
  **/

  public Object getProductandServiceAssessmentInstanceReport() {
    return productandServiceAssessmentInstanceReport;
  }

  public void setProductandServiceAssessmentInstanceReport(Object productandServiceAssessmentInstanceReport) {
    this.productandServiceAssessmentInstanceReport = productandServiceAssessmentInstanceReport;
  }


}

