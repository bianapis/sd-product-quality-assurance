package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProcessingErrorandIntegrityChecksRetrieveInputModelProcessingErrorandIntegrityChecksInstanceAnalysis
 */
public class BQProcessingErrorandIntegrityChecksRetrieveInputModelProcessingErrorandIntegrityChecksInstanceAnalysis   {
  private String processingErrorandIntegrityChecksInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return processingErrorandIntegrityChecksInstanceAnalysisReference
  **/

  public String getProcessingErrorandIntegrityChecksInstanceAnalysisReference() {
    return processingErrorandIntegrityChecksInstanceAnalysisReference;
  }

  public void setProcessingErrorandIntegrityChecksInstanceAnalysisReference(String processingErrorandIntegrityChecksInstanceAnalysisReference) {
    this.processingErrorandIntegrityChecksInstanceAnalysisReference = processingErrorandIntegrityChecksInstanceAnalysisReference;
  }


}

