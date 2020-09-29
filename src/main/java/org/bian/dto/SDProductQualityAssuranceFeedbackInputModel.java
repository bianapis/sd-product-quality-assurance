package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDProductQualityAssuranceFeedbackInputModelProductQualityAssuranceFeedbackActionRecord;

import javax.validation.Valid;
  
/**
 * SDProductQualityAssuranceFeedbackInputModel
 */
public class SDProductQualityAssuranceFeedbackInputModel   {
  private Object productQualityAssuranceFeedbackActionTaskRecord = null;

  private SDProductQualityAssuranceFeedbackInputModelProductQualityAssuranceFeedbackActionRecord productQualityAssuranceFeedbackActionRecord = null;


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

  public SDProductQualityAssuranceFeedbackInputModelProductQualityAssuranceFeedbackActionRecord getProductQualityAssuranceFeedbackActionRecord() {
    return productQualityAssuranceFeedbackActionRecord;
  }

  public void setProductQualityAssuranceFeedbackActionRecord(SDProductQualityAssuranceFeedbackInputModelProductQualityAssuranceFeedbackActionRecord productQualityAssuranceFeedbackActionRecord) {
    this.productQualityAssuranceFeedbackActionRecord = productQualityAssuranceFeedbackActionRecord;
  }


}

