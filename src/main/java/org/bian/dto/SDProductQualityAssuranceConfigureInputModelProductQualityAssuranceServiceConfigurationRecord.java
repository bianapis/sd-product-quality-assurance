package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDProductQualityAssuranceConfigureInputModelProductQualityAssuranceServiceConfigurationRecordProductQualityAssuranceServiceAgreement;
import org.bian.dto.SDProductQualityAssuranceConfigureInputModelProductQualityAssuranceServiceConfigurationRecordProductQualityAssuranceServiceConfigurationSetup;
import org.bian.dto.SDProductQualityAssuranceConfigureInputModelProductQualityAssuranceServiceConfigurationRecordProductQualityAssuranceServiceSubscription;

import javax.validation.Valid;
  
/**
 * SDProductQualityAssuranceConfigureInputModelProductQualityAssuranceServiceConfigurationRecord
 */
public class SDProductQualityAssuranceConfigureInputModelProductQualityAssuranceServiceConfigurationRecord   {
  private String productQualityAssuranceServiceConfigurationSettingReference = null;

  private String productQualityAssuranceServiceConfigurationSettingType = null;

  private SDProductQualityAssuranceConfigureInputModelProductQualityAssuranceServiceConfigurationRecordProductQualityAssuranceServiceConfigurationSetup productQualityAssuranceServiceConfigurationSetup = null;

  private SDProductQualityAssuranceConfigureInputModelProductQualityAssuranceServiceConfigurationRecordProductQualityAssuranceServiceSubscription productQualityAssuranceServiceSubscription = null;

  private SDProductQualityAssuranceConfigureInputModelProductQualityAssuranceServiceConfigurationRecordProductQualityAssuranceServiceAgreement productQualityAssuranceServiceAgreement = null;


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

  public SDProductQualityAssuranceConfigureInputModelProductQualityAssuranceServiceConfigurationRecordProductQualityAssuranceServiceConfigurationSetup getProductQualityAssuranceServiceConfigurationSetup() {
    return productQualityAssuranceServiceConfigurationSetup;
  }

  public void setProductQualityAssuranceServiceConfigurationSetup(SDProductQualityAssuranceConfigureInputModelProductQualityAssuranceServiceConfigurationRecordProductQualityAssuranceServiceConfigurationSetup productQualityAssuranceServiceConfigurationSetup) {
    this.productQualityAssuranceServiceConfigurationSetup = productQualityAssuranceServiceConfigurationSetup;
  }


  /**
   * Get productQualityAssuranceServiceSubscription
   * @return productQualityAssuranceServiceSubscription
  **/

  public SDProductQualityAssuranceConfigureInputModelProductQualityAssuranceServiceConfigurationRecordProductQualityAssuranceServiceSubscription getProductQualityAssuranceServiceSubscription() {
    return productQualityAssuranceServiceSubscription;
  }

  public void setProductQualityAssuranceServiceSubscription(SDProductQualityAssuranceConfigureInputModelProductQualityAssuranceServiceConfigurationRecordProductQualityAssuranceServiceSubscription productQualityAssuranceServiceSubscription) {
    this.productQualityAssuranceServiceSubscription = productQualityAssuranceServiceSubscription;
  }


  /**
   * Get productQualityAssuranceServiceAgreement
   * @return productQualityAssuranceServiceAgreement
  **/

  public SDProductQualityAssuranceConfigureInputModelProductQualityAssuranceServiceConfigurationRecordProductQualityAssuranceServiceAgreement getProductQualityAssuranceServiceAgreement() {
    return productQualityAssuranceServiceAgreement;
  }

  public void setProductQualityAssuranceServiceAgreement(SDProductQualityAssuranceConfigureInputModelProductQualityAssuranceServiceConfigurationRecordProductQualityAssuranceServiceAgreement productQualityAssuranceServiceAgreement) {
    this.productQualityAssuranceServiceAgreement = productQualityAssuranceServiceAgreement;
  }


}

