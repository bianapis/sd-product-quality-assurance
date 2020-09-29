package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQResiliencyandPerformanceChecksRetrieveInputModelResiliencyandPerformanceChecksInstanceReport
 */
public class BQResiliencyandPerformanceChecksRetrieveInputModelResiliencyandPerformanceChecksInstanceReport   {
  private String resiliencyandPerformanceChecksInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return resiliencyandPerformanceChecksInstanceReportReference
  **/

  public String getResiliencyandPerformanceChecksInstanceReportReference() {
    return resiliencyandPerformanceChecksInstanceReportReference;
  }

  public void setResiliencyandPerformanceChecksInstanceReportReference(String resiliencyandPerformanceChecksInstanceReportReference) {
    this.resiliencyandPerformanceChecksInstanceReportReference = resiliencyandPerformanceChecksInstanceReportReference;
  }


}

