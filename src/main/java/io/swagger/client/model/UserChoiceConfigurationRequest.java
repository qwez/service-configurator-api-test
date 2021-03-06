/*
 * Service Configurator API Documentation
 * Documentation generated automatically
 *
 * OpenAPI spec version: 212
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.BasketItem;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * UserChoiceConfigurationRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-06T09:00:50.834+03:00")
public class UserChoiceConfigurationRequest {
  @SerializedName("items")
  private List<BasketItem> items = null;

  @SerializedName("storeCode")
  private Integer storeCode = null;

  public UserChoiceConfigurationRequest items(List<BasketItem> items) {
    this.items = items;
    return this;
  }

  public UserChoiceConfigurationRequest addItemsItem(BasketItem itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<BasketItem>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @ApiModelProperty(value = "")
  public List<BasketItem> getItems() {
    return items;
  }

  public void setItems(List<BasketItem> items) {
    this.items = items;
  }

  public UserChoiceConfigurationRequest storeCode(Integer storeCode) {
    this.storeCode = storeCode;
    return this;
  }

   /**
   * Get storeCode
   * @return storeCode
  **/
  @ApiModelProperty(value = "")
  public Integer getStoreCode() {
    return storeCode;
  }

  public void setStoreCode(Integer storeCode) {
    this.storeCode = storeCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserChoiceConfigurationRequest userChoiceConfigurationRequest = (UserChoiceConfigurationRequest) o;
    return Objects.equals(this.items, userChoiceConfigurationRequest.items) &&
        Objects.equals(this.storeCode, userChoiceConfigurationRequest.storeCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, storeCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserChoiceConfigurationRequest {\n");
    
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    storeCode: ").append(toIndentedString(storeCode)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

