package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * RetrieveACHFulfillmentReconciliation
 */
public class RetrieveACHFulfillmentReconciliation   {
  private String achAccessServiceSessionReference = null;

  private String achAccessSchedule = null;

  private String achReconciliationTaskReference = null;

  private String achTransactionReconciliationTaskReference = null;

  private String achPaymentTransactionReference = null;

  private String achTransactionBatchReference = null;

  private String correspondentBankReference = null;

  private String mirrorNostroAccountReference = null;

  private String achReconciliationTaskResult = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier       
   * @return achAccessServiceSessionReference
  **/

  public String getAchAccessServiceSessionReference() {
    return achAccessServiceSessionReference;
  }

  public void setAchAccessServiceSessionReference(String achAccessServiceSessionReference) {
    this.achAccessServiceSessionReference = achAccessServiceSessionReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Duration   
   * @return achAccessSchedule
  **/

  public String getAchAccessSchedule() {
    return achAccessSchedule;
  }

  public void setAchAccessSchedule(String achAccessSchedule) {
    this.achAccessSchedule = achAccessSchedule;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier       
   * @return achReconciliationTaskReference
  **/

  public String getAchReconciliationTaskReference() {
    return achReconciliationTaskReference;
  }

  public void setAchReconciliationTaskReference(String achReconciliationTaskReference) {
    this.achReconciliationTaskReference = achReconciliationTaskReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier       
   * @return achTransactionReconciliationTaskReference
  **/

  public String getAchTransactionReconciliationTaskReference() {
    return achTransactionReconciliationTaskReference;
  }

  public void setAchTransactionReconciliationTaskReference(String achTransactionReconciliationTaskReference) {
    this.achTransactionReconciliationTaskReference = achTransactionReconciliationTaskReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier       
   * @return achPaymentTransactionReference
  **/

  public String getAchPaymentTransactionReference() {
    return achPaymentTransactionReference;
  }

  public void setAchPaymentTransactionReference(String achPaymentTransactionReference) {
    this.achPaymentTransactionReference = achPaymentTransactionReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier       
   * @return achTransactionBatchReference
  **/

  public String getAchTransactionBatchReference() {
    return achTransactionBatchReference;
  }

  public void setAchTransactionBatchReference(String achTransactionBatchReference) {
    this.achTransactionBatchReference = achTransactionBatchReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier       
   * @return correspondentBankReference
  **/

  public String getCorrespondentBankReference() {
    return correspondentBankReference;
  }

  public void setCorrespondentBankReference(String correspondentBankReference) {
    this.correspondentBankReference = correspondentBankReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier       
   * @return mirrorNostroAccountReference
  **/

  public String getMirrorNostroAccountReference() {
    return mirrorNostroAccountReference;
  }

  public void setMirrorNostroAccountReference(String mirrorNostroAccountReference) {
    this.mirrorNostroAccountReference = mirrorNostroAccountReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text     
   * @return achReconciliationTaskResult
  **/

  public String getAchReconciliationTaskResult() {
    return achReconciliationTaskResult;
  }

  public void setAchReconciliationTaskResult(String achReconciliationTaskResult) {
    this.achReconciliationTaskResult = achReconciliationTaskResult;
  }


}

