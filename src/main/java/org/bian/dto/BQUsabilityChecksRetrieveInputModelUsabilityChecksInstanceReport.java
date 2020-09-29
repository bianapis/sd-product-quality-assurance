package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQUsabilityChecksRetrieveInputModelUsabilityChecksInstanceReport
 */
public class BQUsabilityChecksRetrieveInputModelUsabilityChecksInstanceReport   {
  private String usabilityChecksInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return usabilityChecksInstanceReportReference
  **/

  public String getUsabilityChecksInstanceReportReference() {
    return usabilityChecksInstanceReportReference;
  }

  public void setUsabilityChecksInstanceReportReference(String usabilityChecksInstanceReportReference) {
    this.usabilityChecksInstanceReportReference = usabilityChecksInstanceReportReference;
  }


}

