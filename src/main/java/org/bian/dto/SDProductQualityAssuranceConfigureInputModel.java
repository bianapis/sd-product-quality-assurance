package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDProductQualityAssuranceConfigureInputModelProductQualityAssuranceServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDProductQualityAssuranceConfigureInputModel
 */
public class SDProductQualityAssuranceConfigureInputModel   {
  private Object productQualityAssuranceConfigurationActionTaskRecord = null;

  private String productQualityAssuranceServicingSessionReference = null;

  private String productQualityAssuranceServiceReference = null;

  private SDProductQualityAssuranceConfigureInputModelProductQualityAssuranceServiceConfigurationRecord productQualityAssuranceServiceConfigurationRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The configuration service call consolidated processing record 
   * @return productQualityAssuranceConfigurationActionTaskRecord
  **/

  public Object getProductQualityAssuranceConfigurationActionTaskRecord() {
    return productQualityAssuranceConfigurationActionTaskRecord;
  }

  public void setProductQualityAssuranceConfigurationActionTaskRecord(Object productQualityAssuranceConfigurationActionTaskRecord) {
    this.productQualityAssuranceConfigurationActionTaskRecord = productQualityAssuranceConfigurationActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return productQualityAssuranceServicingSessionReference
  **/

  public String getProductQualityAssuranceServicingSessionReference() {
    return productQualityAssuranceServicingSessionReference;
  }

  public void setProductQualityAssuranceServicingSessionReference(String productQualityAssuranceServicingSessionReference) {
    this.productQualityAssuranceServicingSessionReference = productQualityAssuranceServicingSessionReference;
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

  public SDProductQualityAssuranceConfigureInputModelProductQualityAssuranceServiceConfigurationRecord getProductQualityAssuranceServiceConfigurationRecord() {
    return productQualityAssuranceServiceConfigurationRecord;
  }

  public void setProductQualityAssuranceServiceConfigurationRecord(SDProductQualityAssuranceConfigureInputModelProductQualityAssuranceServiceConfigurationRecord productQualityAssuranceServiceConfigurationRecord) {
    this.productQualityAssuranceServiceConfigurationRecord = productQualityAssuranceServiceConfigurationRecord;
  }


}

