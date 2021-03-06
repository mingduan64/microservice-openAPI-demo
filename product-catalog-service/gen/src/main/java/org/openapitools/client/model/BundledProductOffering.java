/*
 * Product Catalog Management
 * ## TMF API Reference: TMF620 - Product Catalog Management  ### Release : 20.5 - March 2021  Product Catalog API is one of Catalog Management API Family. Product Catalog API goal is to provide a catalog of products.   ### Operations Product Catalog API performs the following operations on the resources : - Retrieve an entity or a collection of entities depending on filter criteria - Partial update of an entity (including updating rules) - Create an entity (including default values and creation rules) - Delete an entity - Manage notification of events
 *
 * The version of the OpenAPI document: 4.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.net.URI;
import org.openapitools.client.model.BundledProductOfferingOption;

/**
 * A type of ProductOffering that belongs to a grouping of ProductOfferings made available to the market. It inherits of all attributes of ProductOffering.
 */
@ApiModel(description = "A type of ProductOffering that belongs to a grouping of ProductOfferings made available to the market. It inherits of all attributes of ProductOffering.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-04T02:31:04.425344+07:00[Asia/Ho_Chi_Minh]")
public class BundledProductOffering {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  private String href;

  public static final String SERIALIZED_NAME_LIFECYCLE_STATUS = "lifecycleStatus";
  @SerializedName(SERIALIZED_NAME_LIFECYCLE_STATUS)
  private String lifecycleStatus;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_BUNDLED_PRODUCT_OFFERING_OPTION = "bundledProductOfferingOption";
  @SerializedName(SERIALIZED_NAME_BUNDLED_PRODUCT_OFFERING_OPTION)
  private BundledProductOfferingOption bundledProductOfferingOption;

  public static final String SERIALIZED_NAME_AT_BASE_TYPE = "@baseType";
  @SerializedName(SERIALIZED_NAME_AT_BASE_TYPE)
  private String atBaseType;

  public static final String SERIALIZED_NAME_AT_SCHEMA_LOCATION = "@schemaLocation";
  @SerializedName(SERIALIZED_NAME_AT_SCHEMA_LOCATION)
  private URI atSchemaLocation;

  public static final String SERIALIZED_NAME_AT_TYPE = "@type";
  @SerializedName(SERIALIZED_NAME_AT_TYPE)
  private String atType;


  public BundledProductOffering id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique identifier of the BundledProductOffering
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique identifier of the BundledProductOffering")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public BundledProductOffering href(String href) {
    
    this.href = href;
    return this;
  }

   /**
   * Unique reference of the BundledProductOffering
   * @return href
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique reference of the BundledProductOffering")

  public String getHref() {
    return href;
  }


  public void setHref(String href) {
    this.href = href;
  }


  public BundledProductOffering lifecycleStatus(String lifecycleStatus) {
    
    this.lifecycleStatus = lifecycleStatus;
    return this;
  }

   /**
   * Used to indicate the current lifecycle status
   * @return lifecycleStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Used to indicate the current lifecycle status")

  public String getLifecycleStatus() {
    return lifecycleStatus;
  }


  public void setLifecycleStatus(String lifecycleStatus) {
    this.lifecycleStatus = lifecycleStatus;
  }


  public BundledProductOffering name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the BundledProductOffering
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the BundledProductOffering")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public BundledProductOffering bundledProductOfferingOption(BundledProductOfferingOption bundledProductOfferingOption) {
    
    this.bundledProductOfferingOption = bundledProductOfferingOption;
    return this;
  }

   /**
   * Get bundledProductOfferingOption
   * @return bundledProductOfferingOption
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BundledProductOfferingOption getBundledProductOfferingOption() {
    return bundledProductOfferingOption;
  }


  public void setBundledProductOfferingOption(BundledProductOfferingOption bundledProductOfferingOption) {
    this.bundledProductOfferingOption = bundledProductOfferingOption;
  }


  public BundledProductOffering atBaseType(String atBaseType) {
    
    this.atBaseType = atBaseType;
    return this;
  }

   /**
   * When sub-classing, this defines the super-class
   * @return atBaseType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When sub-classing, this defines the super-class")

  public String getAtBaseType() {
    return atBaseType;
  }


  public void setAtBaseType(String atBaseType) {
    this.atBaseType = atBaseType;
  }


  public BundledProductOffering atSchemaLocation(URI atSchemaLocation) {
    
    this.atSchemaLocation = atSchemaLocation;
    return this;
  }

   /**
   * A URI to a JSON-Schema file that defines additional attributes and relationships
   * @return atSchemaLocation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A URI to a JSON-Schema file that defines additional attributes and relationships")

  public URI getAtSchemaLocation() {
    return atSchemaLocation;
  }


  public void setAtSchemaLocation(URI atSchemaLocation) {
    this.atSchemaLocation = atSchemaLocation;
  }


  public BundledProductOffering atType(String atType) {
    
    this.atType = atType;
    return this;
  }

   /**
   * When sub-classing, this defines the sub-class Extensible name
   * @return atType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When sub-classing, this defines the sub-class Extensible name")

  public String getAtType() {
    return atType;
  }


  public void setAtType(String atType) {
    this.atType = atType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BundledProductOffering bundledProductOffering = (BundledProductOffering) o;
    return Objects.equals(this.id, bundledProductOffering.id) &&
        Objects.equals(this.href, bundledProductOffering.href) &&
        Objects.equals(this.lifecycleStatus, bundledProductOffering.lifecycleStatus) &&
        Objects.equals(this.name, bundledProductOffering.name) &&
        Objects.equals(this.bundledProductOfferingOption, bundledProductOffering.bundledProductOfferingOption) &&
        Objects.equals(this.atBaseType, bundledProductOffering.atBaseType) &&
        Objects.equals(this.atSchemaLocation, bundledProductOffering.atSchemaLocation) &&
        Objects.equals(this.atType, bundledProductOffering.atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, lifecycleStatus, name, bundledProductOfferingOption, atBaseType, atSchemaLocation, atType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BundledProductOffering {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    lifecycleStatus: ").append(toIndentedString(lifecycleStatus)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    bundledProductOfferingOption: ").append(toIndentedString(bundledProductOfferingOption)).append("\n");
    sb.append("    atBaseType: ").append(toIndentedString(atBaseType)).append("\n");
    sb.append("    atSchemaLocation: ").append(toIndentedString(atSchemaLocation)).append("\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

