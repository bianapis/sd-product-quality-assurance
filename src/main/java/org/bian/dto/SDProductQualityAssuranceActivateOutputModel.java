package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDProductQualityAssuranceActivateOutputModelProductQualityAssuranceServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDProductQualityAssuranceActivateOutputModel
 */
public class SDProductQualityAssuranceActivateOutputModel   {
  private String productQualityAssuranceActivationActionTaskReference = null;

  private Object productQualityAssuranceActivationActionTaskRecord = null;

  private String productQualityAssuranceServicingSessionReference = null;

  private Object productQualityAssuranceServicingSessionRecord = null;

  private SDProductQualityAssuranceActivateOutputModelProductQualityAssuranceServiceConfigurationRecord productQualityAssuranceServiceConfigurationRecord = null;

  private String productQualityAssuranceServicingSessionStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service activation service call 
   * @return productQualityAssuranceActivationActionTaskReference
  **/

  public String getProductQualityAssuranceActivationActionTaskReference() {
    return productQualityAssuranceActivationActionTaskReference;
  }

  public void setProductQualityAssuranceActivationActionTaskReference(String productQualityAssuranceActivationActionTaskReference) {
    this.productQualityAssuranceActivationActionTaskReference = productQualityAssuranceActivationActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Consolidated information record for the servicing session 
   * @return productQualityAssuranceServicingSessionRecord
  **/

  public Object getProductQualityAssuranceServicingSessionRecord() {
    return productQualityAssuranceServicingSessionRecord;
  }

  public void setProductQualityAssuranceServicingSessionRecord(Object productQualityAssuranceServicingSessionRecord) {
    this.productQualityAssuranceServicingSessionRecord = productQualityAssuranceServicingSessionRecord;
  }


  /**
   * Get productQualityAssuranceServiceConfigurationRecord
   * @return productQualityAssuranceServiceConfigurationRecord
  **/

  public SDProductQualityAssuranceActivateOutputModelProductQualityAssuranceServiceConfigurationRecord getProductQualityAssuranceServiceConfigurationRecord() {
    return productQualityAssuranceServiceConfigurationRecord;
  }

  public void setProductQualityAssuranceServiceConfigurationRecord(SDProductQualityAssuranceActivateOutputModelProductQualityAssuranceServiceConfigurationRecord productQualityAssuranceServiceConfigurationRecord) {
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

