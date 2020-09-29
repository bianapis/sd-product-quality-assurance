/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class ProductQualityAssuranceApiServiceImpl implements ProductQualityAssuranceApiService {

	public SDProductQualityAssuranceActivateOutputModel activate(SDProductQualityAssuranceActivateInputModel request){
		return JsonReader.read("activate-SDProductQualityAssuranceActivateOutputModel.json",new TypeReference<SDProductQualityAssuranceActivateOutputModel>(){});
	}
	
	public SDProductQualityAssuranceConfigureOutputModel configure(String sdReferenceId, SDProductQualityAssuranceConfigureInputModel request){
		return JsonReader.read("configure-SDProductQualityAssuranceConfigureOutputModel.json",new TypeReference<SDProductQualityAssuranceConfigureOutputModel>(){});
	}
	
	public CRProductandServiceAssessmentExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRProductandServiceAssessmentExchangeInputModel request){
		return JsonReader.read("exchange-CRProductandServiceAssessmentExchangeOutputModel.json",new TypeReference<CRProductandServiceAssessmentExchangeOutputModel>(){});
	}
	
	public CRProductandServiceAssessmentExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRProductandServiceAssessmentExecuteInputModel request){
		return JsonReader.read("execute-CRProductandServiceAssessmentExecuteOutputModel.json",new TypeReference<CRProductandServiceAssessmentExecuteOutputModel>(){});
	}
	
	public SDProductQualityAssuranceFeedbackOutputModel feedback(String sdReferenceId, SDProductQualityAssuranceFeedbackInputModel request){
		return JsonReader.read("feedback-SDProductQualityAssuranceFeedbackOutputModel.json",new TypeReference<SDProductQualityAssuranceFeedbackOutputModel>(){});
	}
	
	public CRProductandServiceAssessmentGrantOutputModel grant(String sdReferenceId, String crReferenceId, CRProductandServiceAssessmentGrantInputModel request){
		return JsonReader.read("grant-CRProductandServiceAssessmentGrantOutputModel.json",new TypeReference<CRProductandServiceAssessmentGrantOutputModel>(){});
	}
	
	public CRProductandServiceAssessmentInitiateOutputModel initiate(String sdReferenceId, CRProductandServiceAssessmentInitiateInputModel request){
		return JsonReader.read("initiate-CRProductandServiceAssessmentInitiateOutputModel.json",new TypeReference<CRProductandServiceAssessmentInitiateOutputModel>(){});
	}
	
	public BQFunctionalConsistencyChecksInitiateOutputModel initiateFunctionalconsistencychecks(String sdReferenceId, String crReferenceId, BQFunctionalConsistencyChecksInitiateInputModel request){
		return JsonReader.read("initiate-BQFunctionalConsistencyChecksInitiateOutputModel.json",new TypeReference<BQFunctionalConsistencyChecksInitiateOutputModel>(){});
	}
	
	public BQProcessingErrorandIntegrityChecksInitiateOutputModel initiateProcessingerrorandintegritychecks(String sdReferenceId, String crReferenceId, BQProcessingErrorandIntegrityChecksInitiateInputModel request){
		return JsonReader.read("initiate-BQProcessingErrorandIntegrityChecksInitiateOutputModel.json",new TypeReference<BQProcessingErrorandIntegrityChecksInitiateOutputModel>(){});
	}
	
	public BQResiliencyandPerformanceChecksInitiateOutputModel initiateResiliencyandperformancechecks(String sdReferenceId, String crReferenceId, BQResiliencyandPerformanceChecksInitiateInputModel request){
		return JsonReader.read("initiate-BQResiliencyandPerformanceChecksInitiateOutputModel.json",new TypeReference<BQResiliencyandPerformanceChecksInitiateOutputModel>(){});
	}
	
	public BQUsabilityChecksInitiateOutputModel initiateUsabilitychecks(String sdReferenceId, String crReferenceId, BQUsabilityChecksInitiateInputModel request){
		return JsonReader.read("initiate-BQUsabilityChecksInitiateOutputModel.json",new TypeReference<BQUsabilityChecksInitiateOutputModel>(){});
	}
	
	public CRProductandServiceAssessmentRequestOutputModel request(String sdReferenceId, String crReferenceId, CRProductandServiceAssessmentRequestInputModel request){
		return JsonReader.read("request-CRProductandServiceAssessmentRequestOutputModel.json",new TypeReference<CRProductandServiceAssessmentRequestOutputModel>(){});
	}
	
	public CRProductandServiceAssessmentRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRProductandServiceAssessmentRetrieveOutputModel.json",new TypeReference<CRProductandServiceAssessmentRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public BQFunctionalConsistencyChecksRetrieveOutputModel retrieveFunctionalconsistencychecks(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQFunctionalConsistencyChecksRetrieveOutputModel.json",new TypeReference<BQFunctionalConsistencyChecksRetrieveOutputModel>(){});
	}
	
	public BQProcessingErrorandIntegrityChecksRetrieveOutputModel retrieveProcessingerrorandintegritychecks(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQProcessingErrorandIntegrityChecksRetrieveOutputModel.json",new TypeReference<BQProcessingErrorandIntegrityChecksRetrieveOutputModel>(){});
	}
	
	public BQResiliencyandPerformanceChecksRetrieveOutputModel retrieveResiliencyandperformancechecks(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQResiliencyandPerformanceChecksRetrieveOutputModel.json",new TypeReference<BQResiliencyandPerformanceChecksRetrieveOutputModel>(){});
	}
	
	public BQUsabilityChecksRetrieveOutputModel retrieveUsabilitychecks(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQUsabilityChecksRetrieveOutputModel.json",new TypeReference<BQUsabilityChecksRetrieveOutputModel>(){});
	}
	
	public SDProductQualityAssuranceRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDProductQualityAssuranceRetrieveOutputModel.json",new TypeReference<SDProductQualityAssuranceRetrieveOutputModel>(){});
	}
	
	public CRProductandServiceAssessmentUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRProductandServiceAssessmentUpdateInputModel request){
		return JsonReader.read("update-CRProductandServiceAssessmentUpdateOutputModel.json",new TypeReference<CRProductandServiceAssessmentUpdateOutputModel>(){});
	}
	
	public BQFunctionalConsistencyChecksUpdateOutputModel updateFunctionalconsistencychecks(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFunctionalConsistencyChecksUpdateInputModel request){
		return JsonReader.read("update-BQFunctionalConsistencyChecksUpdateOutputModel.json",new TypeReference<BQFunctionalConsistencyChecksUpdateOutputModel>(){});
	}
	
	public BQProcessingErrorandIntegrityChecksUpdateOutputModel updateProcessingerrorandintegritychecks(String sdReferenceId, String crReferenceId, String bqReferenceId, BQProcessingErrorandIntegrityChecksUpdateInputModel request){
		return JsonReader.read("update-BQProcessingErrorandIntegrityChecksUpdateOutputModel.json",new TypeReference<BQProcessingErrorandIntegrityChecksUpdateOutputModel>(){});
	}
	
	public BQResiliencyandPerformanceChecksUpdateOutputModel updateResiliencyandperformancechecks(String sdReferenceId, String crReferenceId, String bqReferenceId, BQResiliencyandPerformanceChecksUpdateInputModel request){
		return JsonReader.read("update-BQResiliencyandPerformanceChecksUpdateOutputModel.json",new TypeReference<BQResiliencyandPerformanceChecksUpdateOutputModel>(){});
	}
	
	public BQUsabilityChecksUpdateOutputModel updateUsabilitychecks(String sdReferenceId, String crReferenceId, String bqReferenceId, BQUsabilityChecksUpdateInputModel request){
		return JsonReader.read("update-BQUsabilityChecksUpdateOutputModel.json",new TypeReference<BQUsabilityChecksUpdateOutputModel>(){});
	}
	
}
