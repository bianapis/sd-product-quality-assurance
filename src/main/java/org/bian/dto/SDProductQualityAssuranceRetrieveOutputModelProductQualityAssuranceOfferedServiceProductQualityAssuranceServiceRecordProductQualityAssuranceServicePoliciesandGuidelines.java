package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDProductQualityAssuranceRetrieveOutputModelProductQualityAssuranceOfferedServiceProductQualityAssuranceServiceRecordProductQualityAssuranceServicePoliciesandGuidelines
 */
public class SDProductQualityAssuranceRetrieveOutputModelProductQualityAssuranceOfferedServiceProductQualityAssuranceServiceRecordProductQualityAssuranceServicePoliciesandGuidelines   {
  private String productQualityAssuranceServiceEligibility = null;

  private String productQualityAssuranceServiceIntendedUses = null;

  private String productQualityAssuranceServicePricingandTerms = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Policies and rules governing access to the offered service, includes eligibility and qualifications 
   * @return productQualityAssuranceServiceEligibility
  **/

  public String getProductQualityAssuranceServiceEligibility() {
    return productQualityAssuranceServiceEligibility;
  }

  public void setProductQualityAssuranceServiceEligibility(String productQualityAssuranceServiceEligibility) {
    this.productQualityAssuranceServiceEligibility = productQualityAssuranceServiceEligibility;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Guidelines covering allowed, intended use of the service 
   * @return productQualityAssuranceServiceIntendedUses
  **/

  public String getProductQualityAssuranceServiceIntendedUses() {
    return productQualityAssuranceServiceIntendedUses;
  }

  public void setProductQualityAssuranceServiceIntendedUses(String productQualityAssuranceServiceIntendedUses) {
    this.productQualityAssuranceServiceIntendedUses = productQualityAssuranceServiceIntendedUses;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Terms, prices, penalties associated with use of the service 
   * @return productQualityAssuranceServicePricingandTerms
  **/

  public String getProductQualityAssuranceServicePricingandTerms() {
    return productQualityAssuranceServicePricingandTerms;
  }

  public void setProductQualityAssuranceServicePricingandTerms(String productQualityAssuranceServicePricingandTerms) {
    this.productQualityAssuranceServicePricingandTerms = productQualityAssuranceServicePricingandTerms;
  }


}

