package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDProductQualityAssuranceConfigureOutputModelProductQualityAssuranceServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDProductQualityAssuranceConfigureOutputModel
 */
public class SDProductQualityAssuranceConfigureOutputModel   {
  private String productQualityAssuranceConfigurationActionTaskReference = null;

  private Object productQualityAssuranceConfigurationActionTaskRecord = null;

  private SDProductQualityAssuranceConfigureOutputModelProductQualityAssuranceServiceConfigurationRecord productQualityAssuranceServiceConfigurationRecord = null;

  private String productQualityAssuranceServicingSessionStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service configuration service call 
   * @return productQualityAssuranceConfigurationActionTaskReference
  **/

  public String getProductQualityAssuranceConfigurationActionTaskReference() {
    return productQualityAssuranceConfigurationActionTaskReference;
  }

  public void setProductQualityAssuranceConfigurationActionTaskReference(String productQualityAssuranceConfigurationActionTaskReference) {
    this.productQualityAssuranceConfigurationActionTaskReference = productQualityAssuranceConfigurationActionTaskReference;
  }


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
   * Get productQualityAssuranceServiceConfigurationRecord
   * @return productQualityAssuranceServiceConfigurationRecord
  **/

  public SDProductQualityAssuranceConfigureOutputModelProductQualityAssuranceServiceConfigurationRecord getProductQualityAssuranceServiceConfigurationRecord() {
    return productQualityAssuranceServiceConfigurationRecord;
  }

  public void setProductQualityAssuranceServiceConfigurationRecord(SDProductQualityAssuranceConfigureOutputModelProductQualityAssuranceServiceConfigurationRecord productQualityAssuranceServiceConfigurationRecord) {
    this.productQualityAssuranceServiceConfigurationRecord = productQualityAssuranceServiceConfigurationRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The current operating status of the overall servicing session 
   * @return productQualityAssuranceServicingSessionStatus
  **/

  public String getProductQualityAssuranceServicingSessionStatus() {
    return productQualityAssuranceServicingSessionStatus;
  }

  public void setProductQualityAssuranceServicingSessionStatus(String productQualityAssuranceServicingSessionStatus) {
    this.productQualityAssuranceServicingSessionStatus = productQualityAssuranceServicingSessionStatus;
  }


}

