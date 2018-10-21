/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface AchFulfillmentApiService {

	RetrieveACHFulfillmentInboundACH executePostInboundAchs(String crReferenceId, InboundACHBase request);
	
	RetrieveACHFulfillmentInboundACH executePutInboundAchs(String crReferenceId, String bqReferenceId, InboundACHBase request);
	
	RetrieveACHFulfillmentOutboundACH executePostOutboundAchs(String crReferenceId, OutboundACHBase request);
	
	RetrieveACHFulfillmentOutboundACH executePutOutboundAchs(String crReferenceId, String bqReferenceId, OutboundACHBase request);
	
	ACHFulfillmentRecordResponse record(String crReferenceId, ACHFulfillmentRecordRequest request);
	
	RetrieveACHFulfillmentReconciliation requestPostReconciliations(String crReferenceId, ReconciliationBaseWithId request);
	
	RetrieveACHFulfillmentReconciliation requestPutReconciliations(String crReferenceId, String bqReferenceId, ReconciliationBaseWithId request);
	
	RetrieveACHFulfillmentWarehousing requestPostWarehousings(String crReferenceId, ACHWarehousing request);
	
	RetrieveACHFulfillmentWarehousing requestPutWarehousings(String crReferenceId, String bqReferenceId, ACHWarehousing request);
	
	List<String> retrieveBQs();
	
	RetrieveACHFulfillmentOperatingSession retrieve(String crReferenceId);
	
	RetrieveACHFulfillmentClearingAndSettlement retrieveClearingandsettlements(String crReferenceId, String bqReferenceId);
	
	RetrieveACHFulfillmentInboundACH retrieveInboundAchs(String crReferenceId, String bqReferenceId);
	
	RetrieveACHFulfillmentOutboundACH retrieveOutboundAchs(String crReferenceId, String bqReferenceId);
	
	RetrieveACHFulfillmentReconciliation retrieveReconciliations(String crReferenceId, String bqReferenceId);
	
	ACHFulfillmentReportingResponse retrieveReportings(String crReferenceId, String bqReferenceId);
	
	RetrieveACHFulfillmentUpdateRepair retrieveUpdaterepairs(String crReferenceId, String bqReferenceId);
	
	RetrieveACHFulfillmentWarehousing retrieveWarehousings(String crReferenceId, String bqReferenceId);
	
	List<String> retrieveRefIds();
	
	List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier);
	
}
