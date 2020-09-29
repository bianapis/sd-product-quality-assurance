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
 * SDProductQualityAssuranceConfigureOutputModelProductQualityAssuranceServiceConfigurationRecord
 */
public class SDProductQualityAssuranceConfigureOutputModelProductQualityAssuranceServiceConfigurationRecord   {
  private String productQualityAssuranceServiceConfigurationSettingDescription = null;

  private SDProductQualityAssuranceConfigureInputModelProductQualityAssuranceServiceConfigurationRecordProductQualityAssuranceServiceConfigurationSetup productQualityAssuranceServiceConfigurationSetup = null;

  private SDProductQualityAssuranceConfigureInputModelProductQualityAssuranceServiceConfigurationRecordProductQualityAssuranceServiceSubscription productQualityAssuranceServiceSubscription = null;

  private SDProductQualityAssuranceConfigureInputModelProductQualityAssuranceServiceConfigurationRecordProductQualityAssuranceServiceAgreement productQualityAssuranceServiceAgreement = null;

  private String productQualityAssuranceServiceStatus = null;


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

