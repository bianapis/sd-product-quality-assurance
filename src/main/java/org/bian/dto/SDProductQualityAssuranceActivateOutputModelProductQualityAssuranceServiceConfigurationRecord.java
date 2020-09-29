package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDProductQualityAssuranceActivateInputModelProductQualityAssuranceServiceConfigurationRecordProductQualityAssuranceServiceConfigurationSetup;
import org.bian.dto.SDProductQualityAssuranceActivateOutputModelProductQualityAssuranceServiceConfigurationRecordProductQualityAssuranceServiceAgreement;
import org.bian.dto.SDProductQualityAssuranceActivateOutputModelProductQualityAssuranceServiceConfigurationRecordProductQualityAssuranceServiceSubscription;

import javax.validation.Valid;
  
/**
 * SDProductQualityAssuranceActivateOutputModelProductQualityAssuranceServiceConfigurationRecord
 */
public class SDProductQualityAssuranceActivateOutputModelProductQualityAssuranceServiceConfigurationRecord   {
  private String productQualityAssuranceServiceConfigurationSettingReference = null;

  private String productQualityAssuranceServiceConfigurationSettingDescription = null;

  private SDProductQualityAssuranceActivateInputModelProductQualityAssuranceServiceConfigurationRecordProductQualityAssuranceServiceConfigurationSetup productQualityAssuranceServiceConfigurationSetup = null;

  private SDProductQualityAssuranceActivateOutputModelProductQualityAssuranceServiceConfigurationRecordProductQualityAssuranceServiceSubscription productQualityAssuranceServiceSubscription = null;

  private SDProductQualityAssuranceActivateOutputModelProductQualityAssuranceServiceConfigurationRecordProductQualityAssuranceServiceAgreement productQualityAssuranceServiceAgreement = null;

  private String productQualityAssuranceServiceStatus = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the configuration parameter, allowed values and processing impact 
   * @return productQualityAssuranceServiceConfigurationSettingDescription
  **/

  public String getProductQualityAssuranceServiceConfigurationSettingDescription() {
    return productQualityAssuranceServiceConfigurationSettingDescription;
  }

  public void setProductQualityAssuranceServiceConfigurationSettingDescription(String productQualityAssuranceServiceConfigurationSettingDescription) {
    this.productQualityAssuranceServiceConfigurationSettingDescription = productQualityAssuranceServiceConfigurationSettingDescription;
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


  /**
   * Get productQualityAssuranceServiceSubscription
   * @return productQualityAssuranceServiceSubscription
  **/

  public SDProductQualityAssuranceActivateOutputModelProductQualityAssuranceServiceConfigurationRecordProductQualityAssuranceServiceSubscription getProductQualityAssuranceServiceSubscription() {
    return productQualityAssuranceServiceSubscription;
  }

  public void setProductQualityAssuranceServiceSubscription(SDProductQualityAssuranceActivateOutputModelProductQualityAssuranceServiceConfigurationRecordProductQualityAssuranceServiceSubscription productQualityAssuranceServiceSubscription) {
    this.productQualityAssuranceServiceSubscription = productQualityAssuranceServiceSubscription;
  }


  /**
   * Get productQualityAssuranceServiceAgreement
   * @return productQualityAssuranceServiceAgreement
  **/

  public SDProductQualityAssuranceActivateOutputModelProductQualityAssuranceServiceConfigurationRecordProductQualityAssuranceServiceAgreement getProductQualityAssuranceServiceAgreement() {
    return productQualityAssuranceServiceAgreement;
  }

  public void setProductQualityAssuranceServiceAgreement(SDProductQualityAssuranceActivateOutputModelProductQualityAssuranceServiceConfigurationRecordProductQualityAssuranceServiceAgreement productQualityAssuranceServiceAgreement) {
    this.productQualityAssuranceServiceAgreement = productQualityAssuranceServiceAgreement;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the offered service (e.g. active, suspended, idle) 
   * @return productQualityAssuranceServiceStatus
  **/

  public String getProductQualityAssuranceServiceStatus() {
    return productQualityAssuranceServiceStatus;
  }

  public void setProductQualityAssuranceServiceStatus(String productQualityAssuranceServiceStatus) {
    this.productQualityAssuranceServiceStatus = productQualityAssuranceServiceStatus;
  }


}

