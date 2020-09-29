package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQResiliencyandPerformanceChecksRetrieveInputModelResiliencyandPerformanceChecksInstanceAnalysis
 */
public class BQResiliencyandPerformanceChecksRetrieveInputModelResiliencyandPerformanceChecksInstanceAnalysis   {
  private String resiliencyandPerformanceChecksInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return resiliencyandPerformanceChecksInstanceAnalysisReference
  **/

  public String getResiliencyandPerformanceChecksInstanceAnalysisReference() {
    return resiliencyandPerformanceChecksInstanceAnalysisReference;
  }

  public void setResiliencyandPerformanceChecksInstanceAnalysisReference(String resiliencyandPerformanceChecksInstanceAnalysisReference) {
    this.resiliencyandPerformanceChecksInstanceAnalysisReference = resiliencyandPerformanceChecksInstanceAnalysisReference;
  }


}

