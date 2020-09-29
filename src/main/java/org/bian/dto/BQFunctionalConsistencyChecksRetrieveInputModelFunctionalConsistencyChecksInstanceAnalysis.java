package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFunctionalConsistencyChecksRetrieveInputModelFunctionalConsistencyChecksInstanceAnalysis
 */
public class BQFunctionalConsistencyChecksRetrieveInputModelFunctionalConsistencyChecksInstanceAnalysis   {
  private String functionalConsistencyChecksInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return functionalConsistencyChecksInstanceAnalysisReference
  **/

  public String getFunctionalConsistencyChecksInstanceAnalysisReference() {
    return functionalConsistencyChecksInstanceAnalysisReference;
  }

  public void setFunctionalConsistencyChecksInstanceAnalysisReference(String functionalConsistencyChecksInstanceAnalysisReference) {
    this.functionalConsistencyChecksInstanceAnalysisReference = functionalConsistencyChecksInstanceAnalysisReference;
  }


}

