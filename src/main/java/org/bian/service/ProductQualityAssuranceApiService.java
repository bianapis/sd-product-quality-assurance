/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface ProductQualityAssuranceApiService {

	SDProductQualityAssuranceActivateOutputModel activate(SDProductQualityAssuranceActivateInputModel request);
	
	SDProductQualityAssuranceConfigureOutputModel configure(String sdReferenceId, SDProductQualityAssuranceConfigureInputModel request);
	
	CRProductandServiceAssessmentExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRProductandServiceAssessmentExchangeInputModel request);
	
	CRProductandServiceAssessmentExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRProductandServiceAssessmentExecuteInputModel request);
	
	SDProductQualityAssuranceFeedbackOutputModel feedback(String sdReferenceId, SDProductQualityAssuranceFeedbackInputModel request);
	
	CRProductandServiceAssessmentGrantOutputModel grant(String sdReferenceId, String crReferenceId, CRProductandServiceAssessmentGrantInputModel request);
	
	CRProductandServiceAssessmentInitiateOutputModel initiate(String sdReferenceId, CRProductandServiceAssessmentInitiateInputModel request);
	
	BQFunctionalConsistencyChecksInitiateOutputModel initiateFunctionalconsistencychecks(String sdReferenceId, String crReferenceId, BQFunctionalConsistencyChecksInitiateInputModel request);
	
	BQProcessingErrorandIntegrityChecksInitiateOutputModel initiateProcessingerrorandintegritychecks(String sdReferenceId, String crReferenceId, BQProcessingErrorandIntegrityChecksInitiateInputModel request);
	
	BQResiliencyandPerformanceChecksInitiateOutputModel initiateResiliencyandperformancechecks(String sdReferenceId, String crReferenceId, BQResiliencyandPerformanceChecksInitiateInputModel request);
	
	BQUsabilityChecksInitiateOutputModel initiateUsabilitychecks(String sdReferenceId, String crReferenceId, BQUsabilityChecksInitiateInputModel request);
	
	CRProductandServiceAssessmentRequestOutputModel request(String sdReferenceId, String crReferenceId, CRProductandServiceAssessmentRequestInputModel request);
	
	CRProductandServiceAssessmentRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	BQFunctionalConsistencyChecksRetrieveOutputModel retrieveFunctionalconsistencychecks(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQProcessingErrorandIntegrityChecksRetrieveOutputModel retrieveProcessingerrorandintegritychecks(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQResiliencyandPerformanceChecksRetrieveOutputModel retrieveResiliencyandperformancechecks(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQUsabilityChecksRetrieveOutputModel retrieveUsabilitychecks(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	SDProductQualityAssuranceRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRProductandServiceAssessmentUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRProductandServiceAssessmentUpdateInputModel request);
	
	BQFunctionalConsistencyChecksUpdateOutputModel updateFunctionalconsistencychecks(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFunctionalConsistencyChecksUpdateInputModel request);
	
	BQProcessingErrorandIntegrityChecksUpdateOutputModel updateProcessingerrorandintegritychecks(String sdReferenceId, String crReferenceId, String bqReferenceId, BQProcessingErrorandIntegrityChecksUpdateInputModel request);
	
	BQResiliencyandPerformanceChecksUpdateOutputModel updateResiliencyandperformancechecks(String sdReferenceId, String crReferenceId, String bqReferenceId, BQResiliencyandPerformanceChecksUpdateInputModel request);
	
	BQUsabilityChecksUpdateOutputModel updateUsabilitychecks(String sdReferenceId, String crReferenceId, String bqReferenceId, BQUsabilityChecksUpdateInputModel request);
	
}
