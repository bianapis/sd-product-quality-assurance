package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDProductQualityAssuranceRetrieveOutputModelProductQualityAssuranceOfferedServiceProductQualityAssuranceServiceRecordProductQualityAssuranceServicePoliciesandGuidelines;

import javax.validation.Valid;
  
/**
 * SDProductQualityAssuranceRetrieveOutputModelProductQualityAssuranceOfferedServiceProductQualityAssuranceServiceRecord
 */
public class SDProductQualityAssuranceRetrieveOutputModelProductQualityAssuranceOfferedServiceProductQualityAssuranceServiceRecord   {
  private String productQualityAssuranceServiceType = null;

  private String productQualityAssuranceServiceVersion = null;

  private String productQualityAssuranceServiceDescription = null;

  private SDProductQualityAssuranceRetrieveOutputModelProductQualityAssuranceOfferedServiceProductQualityAssuranceServiceRecordProductQualityAssuranceServicePoliciesandGuidelines productQualityAssuranceServicePoliciesandGuidelines = null;

  private String productQualityAssuranceServiceSchedule = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Refers to the different types of services offered 
   * @return productQualityAssuranceServiceType
  **/

  public String getProductQualityAssuranceServiceType() {
    return productQualityAssuranceServiceType;
  }

  public void setProductQualityAssuranceServiceType(String productQualityAssuranceServiceType) {
    this.productQualityAssuranceServiceType = productQualityAssuranceServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The version details of the service when appropriate 
   * @return productQualityAssuranceServiceVersion
  **/

  public String getProductQualityAssuranceServiceVersion() {
    return productQualityAssuranceServiceVersion;
  }

  public void setProductQualityAssuranceServiceVersion(String productQualityAssuranceServiceVersion) {
    this.productQualityAssuranceServiceVersion = productQualityAssuranceServiceVersion;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the offered service  
   * @return productQualityAssuranceServiceDescription
  **/

  public String getProductQualityAssuranceServiceDescription() {
    return productQualityAssuranceServiceDescription;
  }

  public void setProductQualityAssuranceServiceDescription(String productQualityAssuranceServiceDescription) {
    this.productQualityAssuranceServiceDescription = productQualityAssuranceServiceDescription;
  }


  /**
   * Get productQualityAssuranceServicePoliciesandGuidelines
   * @return productQualityAssuranceServicePoliciesandGuidelines
  **/

  public SDProductQualityAssuranceRetrieveOutputModelProductQualityAssuranceOfferedServiceProductQualityAssuranceServiceRecordProductQualityAssuranceServicePoliciesandGuidelines getProductQualityAssuranceServicePoliciesandGuidelines() {
    return productQualityAssuranceServicePoliciesandGuidelines;
  }

  public void setProductQualityAssuranceServicePoliciesandGuidelines(SDProductQualityAssuranceRetrieveOutputModelProductQualityAssuranceOfferedServiceProductQualityAssuranceServiceRecordProductQualityAssuranceServicePoliciesandGuidelines productQualityAssuranceServicePoliciesandGuidelines) {
    this.productQualityAssuranceServicePoliciesandGuidelines = productQualityAssuranceServicePoliciesandGuidelines;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Schedule defining when the accessed service is available 
   * @return productQualityAssuranceServiceSchedule
  **/

  public String getProductQualityAssuranceServiceSchedule() {
    return productQualityAssuranceServiceSchedule;
  }

  public void setProductQualityAssuranceServiceSchedule(String productQualityAssuranceServiceSchedule) {
    this.productQualityAssuranceServiceSchedule = productQualityAssuranceServiceSchedule;
  }


}

