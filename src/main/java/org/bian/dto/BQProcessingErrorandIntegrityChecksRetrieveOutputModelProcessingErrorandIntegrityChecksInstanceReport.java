package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProcessingErrorandIntegrityChecksRetrieveOutputModelProcessingErrorandIntegrityChecksInstanceReport
 */
public class BQProcessingErrorandIntegrityChecksRetrieveOutputModelProcessingErrorandIntegrityChecksInstanceReport   {
  private Object processingErrorandIntegrityChecksInstanceReportRecord = null;

  private String processingErrorandIntegrityChecksInstanceReportType = null;

  private String processingErrorandIntegrityChecksInstanceReportParameters = null;

  private Object processingErrorandIntegrityChecksInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return processingErrorandIntegrityChecksInstanceReportRecord
  **/

  public Object getProcessingErrorandIntegrityChecksInstanceReportRecord() {
    return processingErrorandIntegrityChecksInstanceReportRecord;
  }

  public void setProcessingErrorandIntegrityChecksInstanceReportRecord(Object processingErrorandIntegrityChecksInstanceReportRecord) {
    this.processingErrorandIntegrityChecksInstanceReportRecord = processingErrorandIntegrityChecksInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return processingErrorandIntegrityChecksInstanceReportType
  **/

  public String getProcessingErrorandIntegrityChecksInstanceReportType() {
    return processingErrorandIntegrityChecksInstanceReportType;
  }

  public void setProcessingErrorandIntegrityChecksInstanceReportType(String processingErrorandIntegrityChecksInstanceReportType) {
    this.processingErrorandIntegrityChecksInstanceReportType = processingErrorandIntegrityChecksInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return processingErrorandIntegrityChecksInstanceReportParameters
  **/

  public String getProcessingErrorandIntegrityChecksInstanceReportParameters() {
    return processingErrorandIntegrityChecksInstanceReportParameters;
  }

  public void setProcessingErrorandIntegrityChecksInstanceReportParameters(String processingErrorandIntegrityChecksInstanceReportParameters) {
    this.processingErrorandIntegrityChecksInstanceReportParameters = processingErrorandIntegrityChecksInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return processingErrorandIntegrityChecksInstanceReport
  **/

  public Object getProcessingErrorandIntegrityChecksInstanceReport() {
    return processingErrorandIntegrityChecksInstanceReport;
  }

  public void setProcessingErrorandIntegrityChecksInstanceReport(Object processingErrorandIntegrityChecksInstanceReport) {
    this.processingErrorandIntegrityChecksInstanceReport = processingErrorandIntegrityChecksInstanceReport;
  }


}

