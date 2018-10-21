package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * ReconciliationBaseWithId
 */
public class ReconciliationBaseWithId   {
  private String achAccessServiceSessionReference = null;

  private String achTransactionBatchReference = null;

  private String achPaymentTransactionReference = null;

  private String correspondentBankReference = null;

  private String achTransactionReconciliationTaskReference = null;

  private String mirrorNostroAccountReference = null;


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
   * @return mirrorNostroAccountReference
  **/

  public String getMirrorNostroAccountReference() {
    return mirrorNostroAccountReference;
  }

  public void setMirrorNostroAccountReference(String mirrorNostroAccountReference) {
    this.mirrorNostroAccountReference = mirrorNostroAccountReference;
  }


}

