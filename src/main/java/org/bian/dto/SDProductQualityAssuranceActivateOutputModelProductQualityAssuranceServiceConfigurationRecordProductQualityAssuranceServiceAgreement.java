package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDProductQualityAssuranceActivateOutputModelProductQualityAssuranceServiceConfigurationRecordProductQualityAssuranceServiceAgreement
 */
public class SDProductQualityAssuranceActivateOutputModelProductQualityAssuranceServiceConfigurationRecordProductQualityAssuranceServiceAgreement   {
  private String productQualityAssuranceServiceAgreementReference = null;

  private String productQualityAssuranceServiceUserReference = null;

  private String productQualityAssuranceServiceAgreementTermsandConditions = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the offered service agreement 
   * @return productQualityAssuranceServiceAgreementReference
  **/

  public String getProductQualityAssuranceServiceAgreementReference() {
    return productQualityAssuranceServiceAgreementReference;
  }

  public void setProductQualityAssuranceServiceAgreementReference(String productQualityAssuranceServiceAgreementReference) {
    this.productQualityAssuranceServiceAgreementReference = productQualityAssuranceServiceAgreementReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the user covered by the contract 
   * @return productQualityAssuranceServiceUserReference
  **/

  public String getProductQualityAssuranceServiceUserReference() {
    return productQualityAssuranceServiceUserReference;
  }

  public void setProductQualityAssuranceServiceUserReference(String productQualityAssuranceServiceUserReference) {
    this.productQualityAssuranceServiceUserReference = productQualityAssuranceServiceUserReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Terms and conditions covering the service agreement 
   * @return productQualityAssuranceServiceAgreementTermsandConditions
  **/

  public String getProductQualityAssuranceServiceAgreementTermsandConditions() {
    return productQualityAssuranceServiceAgreementTermsandConditions;
  }

  public void setProductQualityAssuranceServiceAgreementTermsandConditions(String productQualityAssuranceServiceAgreementTermsandConditions) {
    this.productQualityAssuranceServiceAgreementTermsandConditions = productQualityAssuranceServiceAgreementTermsandConditions;
  }


}

