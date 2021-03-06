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
 * ConfiguredService
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-06T09:00:50.834+03:00")
public class ConfiguredService {
  @SerializedName("description")
  private String description = null;

  @SerializedName("lmCode")
  private Integer lmCode = null;

  /**
   * Gets or Sets measurementUnit
   */
  @JsonAdapter(MeasurementUnitEnum.Adapter.class)
  public enum MeasurementUnitEnum {
    APERTURE("APERTURE"),
    
    CUT_OFF("CUT_OFF"),
    
    PIECE("PIECE"),
    
    POINT("POINT"),
    
    RUNNING_METER("RUNNING_METER"),
    
    SAW_CUT("SAW_CUT"),
    
    SET("SET"),
    
    SIDE("SIDE"),
    
    SQUARED_METER("SQUARED_METER"),
    
    SUBJECT("SUBJECT"),
    
    EMPTY_DATABASE("EMPTY_DATABASE");

    private String value;

    MeasurementUnitEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MeasurementUnitEnum fromValue(String text) {
      for (MeasurementUnitEnum b : MeasurementUnitEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<MeasurementUnitEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MeasurementUnitEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MeasurementUnitEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return MeasurementUnitEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("measurementUnit")
  private MeasurementUnitEnum measurementUnit = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("price")
  private BigDecimal price = null;

  @SerializedName("quantity")
  private BigDecimal quantity = null;

  @SerializedName("serviceId")
  private Long serviceId = null;

  @SerializedName("totalPrice")
  private BigDecimal totalPrice = null;

  public ConfiguredService description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ConfiguredService lmCode(Integer lmCode) {
    this.lmCode = lmCode;
    return this;
  }

   /**
   * Get lmCode
   * @return lmCode
  **/
  @ApiModelProperty(value = "")
  public Integer getLmCode() {
    return lmCode;
  }

  public void setLmCode(Integer lmCode) {
    this.lmCode = lmCode;
  }

  public ConfiguredService measurementUnit(MeasurementUnitEnum measurementUnit) {
    this.measurementUnit = measurementUnit;
    return this;
  }

   /**
   * Get measurementUnit
   * @return measurementUnit
  **/
  @ApiModelProperty(value = "")
  public MeasurementUnitEnum getMeasurementUnit() {
    return measurementUnit;
  }

  public void setMeasurementUnit(MeasurementUnitEnum measurementUnit) {
    this.measurementUnit = measurementUnit;
  }

  public ConfiguredService name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ConfiguredService price(BigDecimal price) {
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public ConfiguredService quantity(BigDecimal quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Get quantity
   * @return quantity
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getQuantity() {
    return quantity;
  }

  public void setQuantity(BigDecimal quantity) {
    this.quantity = quantity;
  }

  public ConfiguredService serviceId(Long serviceId) {
    this.serviceId = serviceId;
    return this;
  }

   /**
   * Get serviceId
   * @return serviceId
  **/
  @ApiModelProperty(value = "")
  public Long getServiceId() {
    return serviceId;
  }

  public void setServiceId(Long serviceId) {
    this.serviceId = serviceId;
  }

  public ConfiguredService totalPrice(BigDecimal totalPrice) {
    this.totalPrice = totalPrice;
    return this;
  }

   /**
   * Get totalPrice
   * @return totalPrice
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getTotalPrice() {
    return totalPrice;
  }

  public void setTotalPrice(BigDecimal totalPrice) {
    this.totalPrice = totalPrice;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfiguredService configuredService = (ConfiguredService) o;
    return Objects.equals(this.description, configuredService.description) &&
        Objects.equals(this.lmCode, configuredService.lmCode) &&
        Objects.equals(this.measurementUnit, configuredService.measurementUnit) &&
        Objects.equals(this.name, configuredService.name) &&
        Objects.equals(this.price, configuredService.price) &&
        Objects.equals(this.quantity, configuredService.quantity) &&
        Objects.equals(this.serviceId, configuredService.serviceId) &&
        Objects.equals(this.totalPrice, configuredService.totalPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, lmCode, measurementUnit, name, price, quantity, serviceId, totalPrice);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfiguredService {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    lmCode: ").append(toIndentedString(lmCode)).append("\n");
    sb.append("    measurementUnit: ").append(toIndentedString(measurementUnit)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
    sb.append("    totalPrice: ").append(toIndentedString(totalPrice)).append("\n");
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

