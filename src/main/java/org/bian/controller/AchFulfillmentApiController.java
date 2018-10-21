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
import org.bian.annotation.functionalpattern.Operate;

@BianRestController
public class AchFulfillmentApiController {

	@Autowired
	AchFulfillmentApiService service;
	
	@BQ("inbound-achs")
	@Operate.ExecutePost
	public BianResponse<RetrieveACHFulfillmentInboundACH> executePostInboundAchs(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<InboundACHBase> bianRequest) {
		return BianResponse.forSuccess(service.executePostInboundAchs(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("inbound-achs")
	@Operate.ExecutePut
	public BianResponse<RetrieveACHFulfillmentInboundACH> executePutInboundAchs(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<InboundACHBase> bianRequest) {
		return BianResponse.forSuccess(service.executePutInboundAchs(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("outbound-achs")
	@Operate.ExecutePost
	public BianResponse<RetrieveACHFulfillmentOutboundACH> executePostOutboundAchs(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<OutboundACHBase> bianRequest) {
		return BianResponse.forSuccess(service.executePostOutboundAchs(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("outbound-achs")
	@Operate.ExecutePut
	public BianResponse<RetrieveACHFulfillmentOutboundACH> executePutOutboundAchs(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<OutboundACHBase> bianRequest) {
		return BianResponse.forSuccess(service.executePutOutboundAchs(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Operate.Record
	public BianResponse<ACHFulfillmentRecordResponse> record(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<ACHFulfillmentRecordRequest> bianRequest) {
		return BianResponse.forSuccess(service.record(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("reconciliations")
	@Operate.RequestPost
	public BianResponse<RetrieveACHFulfillmentReconciliation> requestPostReconciliations(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<ReconciliationBaseWithId> bianRequest) {
		return BianResponse.forSuccess(service.requestPostReconciliations(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("reconciliations")
	@Operate.RequestPut
	public BianResponse<RetrieveACHFulfillmentReconciliation> requestPutReconciliations(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<ReconciliationBaseWithId> bianRequest) {
		return BianResponse.forSuccess(service.requestPutReconciliations(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("warehousings")
	@Operate.RequestPost
	public BianResponse<RetrieveACHFulfillmentWarehousing> requestPostWarehousings(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<ACHWarehousing> bianRequest) {
		return BianResponse.forSuccess(service.requestPostWarehousings(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("warehousings")
	@Operate.RequestPut
	public BianResponse<RetrieveACHFulfillmentWarehousing> requestPutWarehousings(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<ACHWarehousing> bianRequest) {
		return BianResponse.forSuccess(service.requestPutWarehousings(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Operate.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Operate.Retrieve
	public BianResponse<RetrieveACHFulfillmentOperatingSession> retrieve(@PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(crReferenceId));
	}
	
	@BQ("clearingandsettlements")
	@Operate.Retrieve
	public BianResponse<RetrieveACHFulfillmentClearingAndSettlement> retrieveClearingandsettlements(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveClearingandsettlements(crReferenceId, bqReferenceId));
	}
	
	@BQ("inbound-achs")
	@Operate.Retrieve
	public BianResponse<RetrieveACHFulfillmentInboundACH> retrieveInboundAchs(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveInboundAchs(crReferenceId, bqReferenceId));
	}
	
	@BQ("outbound-achs")
	@Operate.Retrieve
	public BianResponse<RetrieveACHFulfillmentOutboundACH> retrieveOutboundAchs(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveOutboundAchs(crReferenceId, bqReferenceId));
	}
	
	@BQ("reconciliations")
	@Operate.Retrieve
	public BianResponse<RetrieveACHFulfillmentReconciliation> retrieveReconciliations(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveReconciliations(crReferenceId, bqReferenceId));
	}
	
	@BQ("reportings")
	@Operate.Retrieve
	public BianResponse<ACHFulfillmentReportingResponse> retrieveReportings(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveReportings(crReferenceId, bqReferenceId));
	}
	
	@BQ("updaterepairs")
	@Operate.Retrieve
	public BianResponse<RetrieveACHFulfillmentUpdateRepair> retrieveUpdaterepairs(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveUpdaterepairs(crReferenceId, bqReferenceId));
	}
	
	@BQ("warehousings")
	@Operate.Retrieve
	public BianResponse<RetrieveACHFulfillmentWarehousing> retrieveWarehousings(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveWarehousings(crReferenceId, bqReferenceId));
	}
	
	@Operate.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds() {
		return BianResponse.forSuccess(service.retrieveRefIds());
	}
	
	@Operate.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(crReferenceId, behaviorQualifier));
	}
	
}
