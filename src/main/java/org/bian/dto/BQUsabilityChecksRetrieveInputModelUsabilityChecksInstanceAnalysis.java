package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQUsabilityChecksRetrieveInputModelUsabilityChecksInstanceAnalysis
 */
public class BQUsabilityChecksRetrieveInputModelUsabilityChecksInstanceAnalysis   {
  private String usabilityChecksInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return usabilityChecksInstanceAnalysisReference
  **/

  public String getUsabilityChecksInstanceAnalysisReference() {
    return usabilityChecksInstanceAnalysisReference;
  }

  public void setUsabilityChecksInstanceAnalysisReference(String usabilityChecksInstanceAnalysisReference) {
    this.usabilityChecksInstanceAnalysisReference = usabilityChecksInstanceAnalysisReference;
  }


}

