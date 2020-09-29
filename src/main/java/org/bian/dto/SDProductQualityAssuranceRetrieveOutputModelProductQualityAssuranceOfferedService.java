package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDProductQualityAssuranceRetrieveOutputModelProductQualityAssuranceOfferedServiceProductQualityAssuranceServiceRecord;

import javax.validation.Valid;
  
/**
 * SDProductQualityAssuranceRetrieveOutputModelProductQualityAssuranceOfferedService
 */
public class SDProductQualityAssuranceRetrieveOutputModelProductQualityAssuranceOfferedService   {
  private String productQualityAssuranceServiceReference = null;

  private SDProductQualityAssuranceRetrieveOutputModelProductQualityAssuranceOfferedServiceProductQualityAssuranceServiceRecord productQualityAssuranceServiceRecord = null;


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

  public SDProductQualityAssuranceRetrieveOutputModelProductQualityAssuranceOfferedServiceProductQualityAssuranceServiceRecord getProductQualityAssuranceServiceRecord() {
    return productQualityAssuranceServiceRecord;
  }

  public void setProductQualityAssuranceServiceRecord(SDProductQualityAssuranceRetrieveOutputModelProductQualityAssuranceOfferedServiceProductQualityAssuranceServiceRecord productQualityAssuranceServiceRecord) {
    this.productQualityAssuranceServiceRecord = productQualityAssuranceServiceRecord;
  }


}

