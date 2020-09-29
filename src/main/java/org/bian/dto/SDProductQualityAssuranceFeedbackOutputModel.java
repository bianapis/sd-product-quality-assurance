package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDProductQualityAssuranceFeedbackOutputModelProductQualityAssuranceFeedbackActionRecord;

import javax.validation.Valid;
  
/**
 * SDProductQualityAssuranceFeedbackOutputModel
 */
public class SDProductQualityAssuranceFeedbackOutputModel   {
  private String productQualityAssuranceFeedbackActionTaskReference = null;

  private Object productQualityAssuranceFeedbackActionTaskRecord = null;

  private SDProductQualityAssuranceFeedbackOutputModelProductQualityAssuranceFeedbackActionRecord productQualityAssuranceFeedbackActionRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a feedback service call 
   * @return productQualityAssuranceFeedbackActionTaskReference
  **/

  public String getProductQualityAssuranceFeedbackActionTaskReference() {
    return productQualityAssuranceFeedbackActionTaskReference;
  }

  public void setProductQualityAssuranceFeedbackActionTaskReference(String productQualityAssuranceFeedbackActionTaskReference) {
    this.productQualityAssuranceFeedbackActionTaskReference = productQualityAssuranceFeedbackActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The feedback service call consolidated processing record 
   * @return productQualityAssuranceFeedbackActionTaskRecord
  **/

  public Object getProductQualityAssuranceFeedbackActionTaskRecord() {
    return productQualityAssuranceFeedbackActionTaskRecord;
  }

  public void setProductQualityAssuranceFeedbackActionTaskRecord(Object productQualityAssuranceFeedbackActionTaskRecord) {
    this.productQualityAssuranceFeedbackActionTaskRecord = productQualityAssuranceFeedbackActionTaskRecord;
  }


  /**
   * Get productQualityAssuranceFeedbackActionRecord
   * @return productQualityAssuranceFeedbackActionRecord
  **/

  public SDProductQualityAssuranceFeedbackOutputModelProductQualityAssuranceFeedbackActionRecord getProductQualityAssuranceFeedbackActionRecord() {
    return productQualityAssuranceFeedbackActionRecord;
  }

  public void setProductQualityAssuranceFeedbackActionRecord(SDProductQualityAssuranceFeedbackOutputModelProductQualityAssuranceFeedbackActionRecord productQualityAssuranceFeedbackActionRecord) {
    this.productQualityAssuranceFeedbackActionRecord = productQualityAssuranceFeedbackActionRecord;
  }


}

