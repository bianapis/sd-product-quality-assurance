package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDProductQualityAssuranceActivateInputModelProductQualityAssuranceServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDProductQualityAssuranceActivateInputModel
 */
public class SDProductQualityAssuranceActivateInputModel   {
  private Object productQualityAssuranceActivationActionTaskRecord = null;

  private String productQualityAssuranceCenterReference = null;

  private String productQualityAssuranceServiceReference = null;

  private SDProductQualityAssuranceActivateInputModelProductQualityAssuranceServiceConfigurationRecord productQualityAssuranceServiceConfigurationRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The activation service call consolidated processing record 
   * @return productQualityAssuranceActivationActionTaskRecord
  **/

  public Object getProductQualityAssuranceActivationActionTaskRecord() {
    return productQualityAssuranceActivationActionTaskRecord;
  }

  public void setProductQualityAssuranceActivationActionTaskRecord(Object productQualityAssuranceActivationActionTaskRecord) {
    this.productQualityAssuranceActivationActionTaskRecord = productQualityAssuranceActivationActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service center/operational unit 
   * @return productQualityAssuranceCenterReference
  **/

  public String getProductQualityAssuranceCenterReference() {
    return productQualityAssuranceCenterReference;
  }

  public void setProductQualityAssuranceCenterReference(String productQualityAssuranceCenterReference) {
    this.productQualityAssuranceCenterReference = productQualityAssuranceCenterReference;
  }


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
   * Get productQualityAssuranceServiceConfigurationRecord
   * @return productQualityAssuranceServiceConfigurationRecord
  **/

  public SDProductQualityAssuranceActivateInputModelProductQualityAssuranceServiceConfigurationRecord getProductQualityAssuranceServiceConfigurationRecord() {
    return productQualityAssuranceServiceConfigurationRecord;
  }

  public void setProductQualityAssuranceServiceConfigurationRecord(SDProductQualityAssuranceActivateInputModelProductQualityAssuranceServiceConfigurationRecord productQualityAssuranceServiceConfigurationRecord) {
    this.productQualityAssuranceServiceConfigurationRecord = productQualityAssuranceServiceConfigurationRecord;
  }


}

