package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFunctionalConsistencyChecksRetrieveInputModelFunctionalConsistencyChecksInstanceReport
 */
public class BQFunctionalConsistencyChecksRetrieveInputModelFunctionalConsistencyChecksInstanceReport   {
  private String functionalConsistencyChecksInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return functionalConsistencyChecksInstanceReportReference
  **/

  public String getFunctionalConsistencyChecksInstanceReportReference() {
    return functionalConsistencyChecksInstanceReportReference;
  }

  public void setFunctionalConsistencyChecksInstanceReportReference(String functionalConsistencyChecksInstanceReportReference) {
    this.functionalConsistencyChecksInstanceReportReference = functionalConsistencyChecksInstanceReportReference;
  }


}

