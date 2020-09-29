package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDProductQualityAssuranceRetrieveInputModelProductQualityAssuranceOfferedService;
import org.bian.dto.SDProductQualityAssuranceRetrieveInputModelProductQualityAssuranceRetrieveActionRecord;

import javax.validation.Valid;
  
/**
 * SDProductQualityAssuranceRetrieveInputModel
 */
public class SDProductQualityAssuranceRetrieveInputModel   {
  private Object productQualityAssuranceRetrieveActionTaskRecord = null;

  private String productQualityAssuranceRetrieveActionRequest = null;

  private SDProductQualityAssuranceRetrieveInputModelProductQualityAssuranceRetrieveActionRecord productQualityAssuranceRetrieveActionRecord = null;

  private SDProductQualityAssuranceRetrieveInputModelProductQualityAssuranceOfferedService productQualityAssuranceOfferedService = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return productQualityAssuranceRetrieveActionTaskRecord
  **/

  public Object getProductQualityAssuranceRetrieveActionTaskRecord() {
    return productQualityAssuranceRetrieveActionTaskRecord;
  }

  public void setProductQualityAssuranceRetrieveActionTaskRecord(Object productQualityAssuranceRetrieveActionTaskRecord) {
    this.productQualityAssuranceRetrieveActionTaskRecord = productQualityAssuranceRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return productQualityAssuranceRetrieveActionRequest
  **/

  public String getProductQualityAssuranceRetrieveActionRequest() {
    return productQualityAssuranceRetrieveActionRequest;
  }

  public void setProductQualityAssuranceRetrieveActionRequest(String productQualityAssuranceRetrieveActionRequest) {
    this.productQualityAssuranceRetrieveActionRequest = productQualityAssuranceRetrieveActionRequest;
  }


  /**
   * Get productQualityAssuranceRetrieveActionRecord
   * @return productQualityAssuranceRetrieveActionRecord
  **/

  public SDProductQualityAssuranceRetrieveInputModelProductQualityAssuranceRetrieveActionRecord getProductQualityAssuranceRetrieveActionRecord() {
    return productQualityAssuranceRetrieveActionRecord;
  }

  public void setProductQualityAssuranceRetrieveActionRecord(SDProductQualityAssuranceRetrieveInputModelProductQualityAssuranceRetrieveActionRecord productQualityAssuranceRetrieveActionRecord) {
    this.productQualityAssuranceRetrieveActionRecord = productQualityAssuranceRetrieveActionRecord;
  }


  /**
   * Get productQualityAssuranceOfferedService
   * @return productQualityAssuranceOfferedService
  **/

  public SDProductQualityAssuranceRetrieveInputModelProductQualityAssuranceOfferedService getProductQualityAssuranceOfferedService() {
    return productQualityAssuranceOfferedService;
  }

  public void setProductQualityAssuranceOfferedService(SDProductQualityAssuranceRetrieveInputModelProductQualityAssuranceOfferedService productQualityAssuranceOfferedService) {
    this.productQualityAssuranceOfferedService = productQualityAssuranceOfferedService;
  }


}

