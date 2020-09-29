package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFunctionalConsistencyChecksRetrieveOutputModelFunctionalConsistencyChecksInstanceReport
 */
public class BQFunctionalConsistencyChecksRetrieveOutputModelFunctionalConsistencyChecksInstanceReport   {
  private Object functionalConsistencyChecksInstanceReportRecord = null;

  private String functionalConsistencyChecksInstanceReportType = null;

  private String functionalConsistencyChecksInstanceReportParameters = null;

  private Object functionalConsistencyChecksInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return functionalConsistencyChecksInstanceReportRecord
  **/

  public Object getFunctionalConsistencyChecksInstanceReportRecord() {
    return functionalConsistencyChecksInstanceReportRecord;
  }

  public void setFunctionalConsistencyChecksInstanceReportRecord(Object functionalConsistencyChecksInstanceReportRecord) {
    this.functionalConsistencyChecksInstanceReportRecord = functionalConsistencyChecksInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return functionalConsistencyChecksInstanceReportType
  **/

  public String getFunctionalConsistencyChecksInstanceReportType() {
    return functionalConsistencyChecksInstanceReportType;
  }

  public void setFunctionalConsistencyChecksInstanceReportType(String functionalConsistencyChecksInstanceReportType) {
    this.functionalConsistencyChecksInstanceReportType = functionalConsistencyChecksInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return functionalConsistencyChecksInstanceReportParameters
  **/

  public String getFunctionalConsistencyChecksInstanceReportParameters() {
    return functionalConsistencyChecksInstanceReportParameters;
  }

  public void setFunctionalConsistencyChecksInstanceReportParameters(String functionalConsistencyChecksInstanceReportParameters) {
    this.functionalConsistencyChecksInstanceReportParameters = functionalConsistencyChecksInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return functionalConsistencyChecksInstanceReport
  **/

  public Object getFunctionalConsistencyChecksInstanceReport() {
    return functionalConsistencyChecksInstanceReport;
  }

  public void setFunctionalConsistencyChecksInstanceReport(Object functionalConsistencyChecksInstanceReport) {
    this.functionalConsistencyChecksInstanceReport = functionalConsistencyChecksInstanceReport;
  }


}

