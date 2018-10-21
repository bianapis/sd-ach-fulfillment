package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * RetrieveACHFulfillmentOperatingSession
 */
public class RetrieveACHFulfillmentOperatingSession   {
  private String achReference = null;

  private String achAccessServiceSessionReference = null;

  private String achAccessSchedule = null;


  /**
   * Get achReference
   * @return achReference
  **/

  public String getAchReference() {
    return achReference;
  }

  public void setAchReference(String achReference) {
    this.achReference = achReference;
  }


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


}

