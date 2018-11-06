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
import java.io.IOException;
import java.math.BigDecimal;

/**
 * BasketItem
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-06T09:00:50.834+03:00")
public class BasketItem {
  @SerializedName("quantity")
  private Integer quantity = null;

  @SerializedName("serviceId")
  private Integer serviceId = null;

  public BasketItem quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Get quantity
   * @return quantity
  **/
  @ApiModelProperty(value = "")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public BasketItem serviceId(Integer serviceId) {
    this.serviceId = serviceId;
    return this;
  }

   /**
   * Get serviceId
   * @return serviceId
  **/
  @ApiModelProperty(value = "")
  public Integer getServiceId() {
    return serviceId;
  }

  public void setServiceId(Integer serviceId) {
    this.serviceId = serviceId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BasketItem basketItem = (BasketItem) o;
    return Objects.equals(this.quantity, basketItem.quantity) &&
        Objects.equals(this.serviceId, basketItem.serviceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quantity, serviceId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BasketItem {\n");
    
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
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

