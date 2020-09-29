package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDProductQualityAssuranceRetrieveInputModelProductQualityAssuranceOfferedServiceProductQualityAssuranceServiceRecord
 */
public class SDProductQualityAssuranceRetrieveInputModelProductQualityAssuranceOfferedServiceProductQualityAssuranceServiceRecord   {
  private String productQualityAssuranceServiceVersion = null;


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


}

