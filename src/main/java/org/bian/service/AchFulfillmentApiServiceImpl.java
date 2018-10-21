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
public class AchFulfillmentApiServiceImpl implements AchFulfillmentApiService {

	public RetrieveACHFulfillmentInboundACH executePostInboundAchs(String crReferenceId, InboundACHBase request){
		return JsonReader.read("executePost-RetrieveACHFulfillmentInboundACH.json",new TypeReference<RetrieveACHFulfillmentInboundACH>(){});
	}
	
	public RetrieveACHFulfillmentInboundACH executePutInboundAchs(String crReferenceId, String bqReferenceId, InboundACHBase request){
		return JsonReader.read("executePut-RetrieveACHFulfillmentInboundACH.json",new TypeReference<RetrieveACHFulfillmentInboundACH>(){});
	}
	
	public RetrieveACHFulfillmentOutboundACH executePostOutboundAchs(String crReferenceId, OutboundACHBase request){
		return JsonReader.read("executePost-RetrieveACHFulfillmentOutboundACH.json",new TypeReference<RetrieveACHFulfillmentOutboundACH>(){});
	}
	
	public RetrieveACHFulfillmentOutboundACH executePutOutboundAchs(String crReferenceId, String bqReferenceId, OutboundACHBase request){
		return JsonReader.read("executePut-RetrieveACHFulfillmentOutboundACH.json",new TypeReference<RetrieveACHFulfillmentOutboundACH>(){});
	}
	
	public ACHFulfillmentRecordResponse record(String crReferenceId, ACHFulfillmentRecordRequest request){
		return JsonReader.read("record-ACHFulfillmentRecordResponse.json",new TypeReference<ACHFulfillmentRecordResponse>(){});
	}
	
	public RetrieveACHFulfillmentReconciliation requestPostReconciliations(String crReferenceId, ReconciliationBaseWithId request){
		return JsonReader.read("requestPost-RetrieveACHFulfillmentReconciliation.json",new TypeReference<RetrieveACHFulfillmentReconciliation>(){});
	}
	
	public RetrieveACHFulfillmentReconciliation requestPutReconciliations(String crReferenceId, String bqReferenceId, ReconciliationBaseWithId request){
		return JsonReader.read("requestPut-RetrieveACHFulfillmentReconciliation.json",new TypeReference<RetrieveACHFulfillmentReconciliation>(){});
	}
	
	public RetrieveACHFulfillmentWarehousing requestPostWarehousings(String crReferenceId, ACHWarehousing request){
		return JsonReader.read("requestPost-RetrieveACHFulfillmentWarehousing.json",new TypeReference<RetrieveACHFulfillmentWarehousing>(){});
	}
	
	public RetrieveACHFulfillmentWarehousing requestPutWarehousings(String crReferenceId, String bqReferenceId, ACHWarehousing request){
		return JsonReader.read("requestPut-RetrieveACHFulfillmentWarehousing.json",new TypeReference<RetrieveACHFulfillmentWarehousing>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public RetrieveACHFulfillmentOperatingSession retrieve(String crReferenceId){
		return JsonReader.read("retrieve-RetrieveACHFulfillmentOperatingSession.json",new TypeReference<RetrieveACHFulfillmentOperatingSession>(){});
	}
	
	public RetrieveACHFulfillmentClearingAndSettlement retrieveClearingandsettlements(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-RetrieveACHFulfillmentClearingAndSettlement.json",new TypeReference<RetrieveACHFulfillmentClearingAndSettlement>(){});
	}
	
	public RetrieveACHFulfillmentInboundACH retrieveInboundAchs(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-RetrieveACHFulfillmentInboundACH.json",new TypeReference<RetrieveACHFulfillmentInboundACH>(){});
	}
	
	public RetrieveACHFulfillmentOutboundACH retrieveOutboundAchs(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-RetrieveACHFulfillmentOutboundACH.json",new TypeReference<RetrieveACHFulfillmentOutboundACH>(){});
	}
	
	public RetrieveACHFulfillmentReconciliation retrieveReconciliations(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-RetrieveACHFulfillmentReconciliation.json",new TypeReference<RetrieveACHFulfillmentReconciliation>(){});
	}
	
	public ACHFulfillmentReportingResponse retrieveReportings(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-ACHFulfillmentReportingResponse.json",new TypeReference<ACHFulfillmentReportingResponse>(){});
	}
	
	public RetrieveACHFulfillmentUpdateRepair retrieveUpdaterepairs(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-RetrieveACHFulfillmentUpdateRepair.json",new TypeReference<RetrieveACHFulfillmentUpdateRepair>(){});
	}
	
	public RetrieveACHFulfillmentWarehousing retrieveWarehousings(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-RetrieveACHFulfillmentWarehousing.json",new TypeReference<RetrieveACHFulfillmentWarehousing>(){});
	}
	
	public List<String> retrieveRefIds(){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
}
