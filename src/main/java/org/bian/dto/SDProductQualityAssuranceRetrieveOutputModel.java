package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDProductQualityAssuranceRetrieveOutputModelProductQualityAssuranceOfferedService;
import org.bian.dto.SDProductQualityAssuranceRetrieveOutputModelProductQualityAssuranceRetrieveActionRecord;

import javax.validation.Valid;
  
/**
 * SDProductQualityAssuranceRetrieveOutputModel
 */
public class SDProductQualityAssuranceRetrieveOutputModel   {
  private String productQualityAssuranceRetrieveActionTaskReference = null;

  private Object productQualityAssuranceRetrieveActionTaskRecord = null;

  private String productQualityAssuranceRetrieveActionResponse = null;

  private SDProductQualityAssuranceRetrieveOutputModelProductQualityAssuranceRetrieveActionRecord productQualityAssuranceRetrieveActionRecord = null;

  private SDProductQualityAssuranceRetrieveOutputModelProductQualityAssuranceOfferedService productQualityAssuranceOfferedService = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a retrieve service call 
   * @return productQualityAssuranceRetrieveActionTaskReference
  **/

  public String getProductQualityAssuranceRetrieveActionTaskReference() {
    return productQualityAssuranceRetrieveActionTaskReference;
  }

  public void setProductQualityAssuranceRetrieveActionTaskReference(String productQualityAssuranceRetrieveActionTaskReference) {
    this.productQualityAssuranceRetrieveActionTaskReference = productQualityAssuranceRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return productQualityAssuranceRetrieveActionResponse
  **/

  public String getProductQualityAssuranceRetrieveActionResponse() {
    return productQualityAssuranceRetrieveActionResponse;
  }

  public void setProductQualityAssuranceRetrieveActionResponse(String productQualityAssuranceRetrieveActionResponse) {
    this.productQualityAssuranceRetrieveActionResponse = productQualityAssuranceRetrieveActionResponse;
  }


  /**
   * Get productQualityAssuranceRetrieveActionRecord
   * @return productQualityAssuranceRetrieveActionRecord
  **/

  public SDProductQualityAssuranceRetrieveOutputModelProductQualityAssuranceRetrieveActionRecord getProductQualityAssuranceRetrieveActionRecord() {
    return productQualityAssuranceRetrieveActionRecord;
  }

  public void setProductQualityAssuranceRetrieveActionRecord(SDProductQualityAssuranceRetrieveOutputModelProductQualityAssuranceRetrieveActionRecord productQualityAssuranceRetrieveActionRecord) {
    this.productQualityAssuranceRetrieveActionRecord = productQualityAssuranceRetrieveActionRecord;
  }


  /**
   * Get productQualityAssuranceOfferedService
   * @return productQualityAssuranceOfferedService
  **/

  public SDProductQualityAssuranceRetrieveOutputModelProductQualityAssuranceOfferedService getProductQualityAssuranceOfferedService() {
    return productQualityAssuranceOfferedService;
  }

  public void setProductQualityAssuranceOfferedService(SDProductQualityAssuranceRetrieveOutputModelProductQualityAssuranceOfferedService productQualityAssuranceOfferedService) {
    this.productQualityAssuranceOfferedService = productQualityAssuranceOfferedService;
  }


}

