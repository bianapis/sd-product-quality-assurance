package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDProductQualityAssuranceRetrieveInputModelProductQualityAssuranceOfferedServiceProductQualityAssuranceServiceRecord;

import javax.validation.Valid;
  
/**
 * SDProductQualityAssuranceRetrieveInputModelProductQualityAssuranceOfferedService
 */
public class SDProductQualityAssuranceRetrieveInputModelProductQualityAssuranceOfferedService   {
  private String productQualityAssuranceServiceReference = null;

  private SDProductQualityAssuranceRetrieveInputModelProductQualityAssuranceOfferedServiceProductQualityAssuranceServiceRecord productQualityAssuranceServiceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service offered by the service center 
   * @return productQualityAssuranceServiceReference
  **/

  public String getProductQualityAssuranceServiceReference() {
    return productQualityAssuranceServiceReference;
  }

  public void setProductQualityAssuranceServiceReference(String productQualityAssuranceServiceReference) {
    this.productQualityAssuranceServiceReference = productQualityAssuranceServiceReference;
  }


  /**
   * Get productQualityAssuranceServiceRecord
   * @return productQualityAssuranceServiceRecord
  **/

  public SDProductQualityAssuranceRetrieveInputModelProductQualityAssuranceOfferedServiceProductQualityAssuranceServiceRecord getProductQualityAssuranceServiceRecord() {
    return productQualityAssuranceServiceRecord;
  }

  public void setProductQualityAssuranceServiceRecord(SDProductQualityAssuranceRetrieveInputModelProductQualityAssuranceOfferedServiceProductQualityAssuranceServiceRecord productQualityAssuranceServiceRecord) {
    this.productQualityAssuranceServiceRecord = productQualityAssuranceServiceRecord;
  }


}

