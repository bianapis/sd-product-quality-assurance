/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Assess;

@BianRestController
public class ProductQualityAssuranceApiController {

	@Autowired
	ProductQualityAssuranceApiService service;
	
	@Assess.Activate
	public BianResponse<SDProductQualityAssuranceActivateOutputModel> activate(@RequestBody BianRequest<SDProductQualityAssuranceActivateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.activate(bianRequest.getData()));
	}
	
	@Assess.Configure
	public BianResponse<SDProductQualityAssuranceConfigureOutputModel> configure(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDProductQualityAssuranceConfigureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.configure(sdReferenceId, bianRequest.getData()));
	}
	
	@Assess.Exchange
	public BianResponse<CRProductandServiceAssessmentExchangeOutputModel> exchange(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRProductandServiceAssessmentExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchange(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Assess.Execute
	public BianResponse<CRProductandServiceAssessmentExecuteOutputModel> execute(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRProductandServiceAssessmentExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.execute(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Assess.Feedback
	public BianResponse<SDProductQualityAssuranceFeedbackOutputModel> feedback(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDProductQualityAssuranceFeedbackInputModel> bianRequest) {
		return BianResponse.forSuccess(service.feedback(sdReferenceId, bianRequest.getData()));
	}
	
	@Assess.Grant
	public BianResponse<CRProductandServiceAssessmentGrantOutputModel> grant(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRProductandServiceAssessmentGrantInputModel> bianRequest) {
		return BianResponse.forSuccess(service.grant(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Assess.Initiate
	public BianResponse<CRProductandServiceAssessmentInitiateOutputModel> initiate(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<CRProductandServiceAssessmentInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiate(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("functionalconsistencychecks")
	@Assess.Initiate
	public BianResponse<BQFunctionalConsistencyChecksInitiateOutputModel> initiateFunctionalconsistencychecks(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQFunctionalConsistencyChecksInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateFunctionalconsistencychecks(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("processingerrorandintegritychecks")
	@Assess.Initiate
	public BianResponse<BQProcessingErrorandIntegrityChecksInitiateOutputModel> initiateProcessingerrorandintegritychecks(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQProcessingErrorandIntegrityChecksInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateProcessingerrorandintegritychecks(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("resiliencyandperformancechecks")
	@Assess.Initiate
	public BianResponse<BQResiliencyandPerformanceChecksInitiateOutputModel> initiateResiliencyandperformancechecks(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQResiliencyandPerformanceChecksInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateResiliencyandperformancechecks(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("usabilitychecks")
	@Assess.Initiate
	public BianResponse<BQUsabilityChecksInitiateOutputModel> initiateUsabilitychecks(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQUsabilityChecksInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateUsabilitychecks(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Assess.Request
	public BianResponse<CRProductandServiceAssessmentRequestOutputModel> request(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRProductandServiceAssessmentRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.request(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Assess.Retrieve
	public BianResponse<CRProductandServiceAssessmentRetrieveOutputModel> retrieve(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(sdReferenceId, crReferenceId));
	}
	
	@Assess.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(sdReferenceId, crReferenceId, behaviorQualifier));
	}
	
	@Assess.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Assess.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveRefIds(sdReferenceId));
	}
	
	@BQ("functionalconsistencychecks")
	@Assess.Retrieve
	public BianResponse<BQFunctionalConsistencyChecksRetrieveOutputModel> retrieveFunctionalconsistencychecks(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveFunctionalconsistencychecks(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("processingerrorandintegritychecks")
	@Assess.Retrieve
	public BianResponse<BQProcessingErrorandIntegrityChecksRetrieveOutputModel> retrieveProcessingerrorandintegritychecks(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveProcessingerrorandintegritychecks(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("resiliencyandperformancechecks")
	@Assess.Retrieve
	public BianResponse<BQResiliencyandPerformanceChecksRetrieveOutputModel> retrieveResiliencyandperformancechecks(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveResiliencyandperformancechecks(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("usabilitychecks")
	@Assess.Retrieve
	public BianResponse<BQUsabilityChecksRetrieveOutputModel> retrieveUsabilitychecks(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveUsabilitychecks(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@Assess.RetrieveSD
	public BianResponse<SDProductQualityAssuranceRetrieveOutputModel> retrieveSD(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveSD(sdReferenceId));
	}
	
	@Assess.Update
	public BianResponse<CRProductandServiceAssessmentUpdateOutputModel> update(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRProductandServiceAssessmentUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.update(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("functionalconsistencychecks")
	@Assess.Update
	public BianResponse<BQFunctionalConsistencyChecksUpdateOutputModel> updateFunctionalconsistencychecks(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQFunctionalConsistencyChecksUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateFunctionalconsistencychecks(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("processingerrorandintegritychecks")
	@Assess.Update
	public BianResponse<BQProcessingErrorandIntegrityChecksUpdateOutputModel> updateProcessingerrorandintegritychecks(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQProcessingErrorandIntegrityChecksUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateProcessingerrorandintegritychecks(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("resiliencyandperformancechecks")
	@Assess.Update
	public BianResponse<BQResiliencyandPerformanceChecksUpdateOutputModel> updateResiliencyandperformancechecks(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQResiliencyandPerformanceChecksUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateResiliencyandperformancechecks(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("usabilitychecks")
	@Assess.Update
	public BianResponse<BQUsabilityChecksUpdateOutputModel> updateUsabilitychecks(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQUsabilityChecksUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateUsabilitychecks(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
}
