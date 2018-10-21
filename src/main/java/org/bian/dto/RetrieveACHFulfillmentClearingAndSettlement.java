package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * RetrieveACHFulfillmentClearingAndSettlement
 */
public class RetrieveACHFulfillmentClearingAndSettlement   {
  private String achAccessServiceSessionReference = null;

  private String achClearingAndSettlementTaskReference = null;

  private String correspondentBankReference = null;

  private String correspondentBankClearingAgreementClearingInstructions = null;

  private String correspondentBankClearingAgreementSettlementInstructions = null;

  private String correspondentBankClearingAgreementReference = null;

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
   * @return achClearingAndSettlementTaskReference
  **/

  public String getAchClearingAndSettlementTaskReference() {
    return achClearingAndSettlementTaskReference;
  }

  public void setAchClearingAndSettlementTaskReference(String achClearingAndSettlementTaskReference) {
    this.achClearingAndSettlementTaskReference = achClearingAndSettlementTaskReference;
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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text     
   * @return correspondentBankClearingAgreementClearingInstructions
  **/

  public String getCorrespondentBankClearingAgreementClearingInstructions() {
    return correspondentBankClearingAgreementClearingInstructions;
  }

  public void setCorrespondentBankClearingAgreementClearingInstructions(String correspondentBankClearingAgreementClearingInstructions) {
    this.correspondentBankClearingAgreementClearingInstructions = correspondentBankClearingAgreementClearingInstructions;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text     
   * @return correspondentBankClearingAgreementSettlementInstructions
  **/

  public String getCorrespondentBankClearingAgreementSettlementInstructions() {
    return correspondentBankClearingAgreementSettlementInstructions;
  }

  public void setCorrespondentBankClearingAgreementSettlementInstructions(String correspondentBankClearingAgreementSettlementInstructions) {
    this.correspondentBankClearingAgreementSettlementInstructions = correspondentBankClearingAgreementSettlementInstructions;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier       
   * @return correspondentBankClearingAgreementReference
  **/

  public String getCorrespondentBankClearingAgreementReference() {
    return correspondentBankClearingAgreementReference;
  }

  public void setCorrespondentBankClearingAgreementReference(String correspondentBankClearingAgreementReference) {
    this.correspondentBankClearingAgreementReference = correspondentBankClearingAgreementReference;
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

