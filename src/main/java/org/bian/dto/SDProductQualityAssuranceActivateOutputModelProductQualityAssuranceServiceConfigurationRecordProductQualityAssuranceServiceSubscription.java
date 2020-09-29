package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDProductQualityAssuranceActivateOutputModelProductQualityAssuranceServiceConfigurationRecordProductQualityAssuranceServiceSubscription
 */
public class SDProductQualityAssuranceActivateOutputModelProductQualityAssuranceServiceConfigurationRecordProductQualityAssuranceServiceSubscription   {
  private String productQualityAssuranceServiceSubscriberReference = null;

  private String productQualityAssuranceServiceSubscriberAccessProfile = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Maintains reference to allowed users or subscribers to the service which can be any known party 
   * @return productQualityAssuranceServiceSubscriberReference
  **/

  public String getProductQualityAssuranceServiceSubscriberReference() {
    return productQualityAssuranceServiceSubscriberReference;
  }

  public void setProductQualityAssuranceServiceSubscriberReference(String productQualityAssuranceServiceSubscriberReference) {
    this.productQualityAssuranceServiceSubscriberReference = productQualityAssuranceServiceSubscriberReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The allowed service access for a user or subscriber to the service which can be any known party 
   * @return productQualityAssuranceServiceSubscriberAccessProfile
  **/

  public String getProductQualityAssuranceServiceSubscriberAccessProfile() {
    return productQualityAssuranceServiceSubscriberAccessProfile;
  }

  public void setProductQualityAssuranceServiceSubscriberAccessProfile(String productQualityAssuranceServiceSubscriberAccessProfile) {
    this.productQualityAssuranceServiceSubscriberAccessProfile = productQualityAssuranceServiceSubscriberAccessProfile;
  }


}

