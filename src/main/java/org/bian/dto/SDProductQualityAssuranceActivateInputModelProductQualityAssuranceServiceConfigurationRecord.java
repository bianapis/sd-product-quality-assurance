package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDProductQualityAssuranceActivateInputModelProductQualityAssuranceServiceConfigurationRecordProductQualityAssuranceServiceConfigurationSetup;

import javax.validation.Valid;
  
/**
 * SDProductQualityAssuranceActivateInputModelProductQualityAssuranceServiceConfigurationRecord
 */
public class SDProductQualityAssuranceActivateInputModelProductQualityAssuranceServiceConfigurationRecord   {
  private String productQualityAssuranceServiceConfigurationSettingReference = null;

  private String productQualityAssuranceServiceConfigurationSettingType = null;

  private SDProductQualityAssuranceActivateInputModelProductQualityAssuranceServiceConfigurationRecordProductQualityAssuranceServiceConfigurationSetup productQualityAssuranceServiceConfigurationSetup = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Refers to the service configuration parameter for the service 
   * @return productQualityAssuranceServiceConfigurationSettingReference
  **/

  public String getProductQualityAssuranceServiceConfigurationSettingReference() {
    return productQualityAssuranceServiceConfigurationSettingReference;
  }

  public void setProductQualityAssuranceServiceConfigurationSettingReference(String productQualityAssuranceServiceConfigurationSettingReference) {
    this.productQualityAssuranceServiceConfigurationSettingReference = productQualityAssuranceServiceConfigurationSettingReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of service configuration parameter 
   * @return productQualityAssuranceServiceConfigurationSettingType
  **/

  public String getProductQualityAssuranceServiceConfigurationSettingType() {
    return productQualityAssuranceServiceConfigurationSettingType;
  }

  public void setProductQualityAssuranceServiceConfigurationSettingType(String productQualityAssuranceServiceConfigurationSettingType) {
    this.productQualityAssuranceServiceConfigurationSettingType = productQualityAssuranceServiceConfigurationSettingType;
  }


  /**
   * Get productQualityAssuranceServiceConfigurationSetup
   * @return productQualityAssuranceServiceConfigurationSetup
  **/

  public SDProductQualityAssuranceActivateInputModelProductQualityAssuranceServiceConfigurationRecordProductQualityAssuranceServiceConfigurationSetup getProductQualityAssuranceServiceConfigurationSetup() {
    return productQualityAssuranceServiceConfigurationSetup;
  }

  public void setProductQualityAssuranceServiceConfigurationSetup(SDProductQualityAssuranceActivateInputModelProductQualityAssuranceServiceConfigurationRecordProductQualityAssuranceServiceConfigurationSetup productQualityAssuranceServiceConfigurationSetup) {
    this.productQualityAssuranceServiceConfigurationSetup = productQualityAssuranceServiceConfigurationSetup;
  }


}

