package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQUsabilityChecksRetrieveOutputModelUsabilityChecksInstanceReport
 */
public class BQUsabilityChecksRetrieveOutputModelUsabilityChecksInstanceReport   {
  private Object usabilityChecksInstanceReportRecord = null;

  private String usabilityChecksInstanceReportType = null;

  private String usabilityChecksInstanceReportParameters = null;

  private Object usabilityChecksInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return usabilityChecksInstanceReportRecord
  **/

  public Object getUsabilityChecksInstanceReportRecord() {
    return usabilityChecksInstanceReportRecord;
  }

  public void setUsabilityChecksInstanceReportRecord(Object usabilityChecksInstanceReportRecord) {
    this.usabilityChecksInstanceReportRecord = usabilityChecksInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return usabilityChecksInstanceReportType
  **/

  public String getUsabilityChecksInstanceReportType() {
    return usabilityChecksInstanceReportType;
  }

  public void setUsabilityChecksInstanceReportType(String usabilityChecksInstanceReportType) {
    this.usabilityChecksInstanceReportType = usabilityChecksInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return usabilityChecksInstanceReportParameters
  **/

  public String getUsabilityChecksInstanceReportParameters() {
    return usabilityChecksInstanceReportParameters;
  }

  public void setUsabilityChecksInstanceReportParameters(String usabilityChecksInstanceReportParameters) {
    this.usabilityChecksInstanceReportParameters = usabilityChecksInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return usabilityChecksInstanceReport
  **/

  public Object getUsabilityChecksInstanceReport() {
    return usabilityChecksInstanceReport;
  }

  public void setUsabilityChecksInstanceReport(Object usabilityChecksInstanceReport) {
    this.usabilityChecksInstanceReport = usabilityChecksInstanceReport;
  }


}

