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
import org.openapitools.client.model.JobStateType;
import org.threeten.bp.OffsetDateTime;

/**
 * Represents a task used to export resources to a file Skipped properties: id,href
 */
@ApiModel(description = "Represents a task used to export resources to a file Skipped properties: id,href")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-04T02:31:04.425344+07:00[Asia/Ho_Chi_Minh]")
public class ExportJobCreate {
  public static final String SERIALIZED_NAME_COMPLETION_DATE = "completionDate";
  @SerializedName(SERIALIZED_NAME_COMPLETION_DATE)
  private OffsetDateTime completionDate;

  public static final String SERIALIZED_NAME_CONTENT_TYPE = "contentType";
  @SerializedName(SERIALIZED_NAME_CONTENT_TYPE)
  private String contentType;

  public static final String SERIALIZED_NAME_CREATION_DATE = "creationDate";
  @SerializedName(SERIALIZED_NAME_CREATION_DATE)
  private OffsetDateTime creationDate;

  public static final String SERIALIZED_NAME_ERROR_LOG = "errorLog";
  @SerializedName(SERIALIZED_NAME_ERROR_LOG)
  private String errorLog;

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public static final String SERIALIZED_NAME_QUERY = "query";
  @SerializedName(SERIALIZED_NAME_QUERY)
  private String query;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private URI url;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private JobStateType status;

  public static final String SERIALIZED_NAME_AT_BASE_TYPE = "@baseType";
  @SerializedName(SERIALIZED_NAME_AT_BASE_TYPE)
  private String atBaseType;

  public static final String SERIALIZED_NAME_AT_SCHEMA_LOCATION = "@schemaLocation";
  @SerializedName(SERIALIZED_NAME_AT_SCHEMA_LOCATION)
  private URI atSchemaLocation;

  public static final String SERIALIZED_NAME_AT_TYPE = "@type";
  @SerializedName(SERIALIZED_NAME_AT_TYPE)
  private String atType;


  public ExportJobCreate completionDate(OffsetDateTime completionDate) {
    
    this.completionDate = completionDate;
    return this;
  }

   /**
   * Data at which the job was completed
   * @return completionDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Data at which the job was completed")

  public OffsetDateTime getCompletionDate() {
    return completionDate;
  }


  public void setCompletionDate(OffsetDateTime completionDate) {
    this.completionDate = completionDate;
  }


  public ExportJobCreate contentType(String contentType) {
    
    this.contentType = contentType;
    return this;
  }

   /**
   * The format of the exported data
   * @return contentType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The format of the exported data")

  public String getContentType() {
    return contentType;
  }


  public void setContentType(String contentType) {
    this.contentType = contentType;
  }


  public ExportJobCreate creationDate(OffsetDateTime creationDate) {
    
    this.creationDate = creationDate;
    return this;
  }

   /**
   * Date at which the job was created
   * @return creationDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date at which the job was created")

  public OffsetDateTime getCreationDate() {
    return creationDate;
  }


  public void setCreationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
  }


  public ExportJobCreate errorLog(String errorLog) {
    
    this.errorLog = errorLog;
    return this;
  }

   /**
   * Reason for failure
   * @return errorLog
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Reason for failure")

  public String getErrorLog() {
    return errorLog;
  }


  public void setErrorLog(String errorLog) {
    this.errorLog = errorLog;
  }


  public ExportJobCreate path(String path) {
    
    this.path = path;
    return this;
  }

   /**
   * URL of the root resource acting as the source for streaming content to the file specified by the export job
   * @return path
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "URL of the root resource acting as the source for streaming content to the file specified by the export job")

  public String getPath() {
    return path;
  }


  public void setPath(String path) {
    this.path = path;
  }


  public ExportJobCreate query(String query) {
    
    this.query = query;
    return this;
  }

   /**
   * Used to scope the exported data
   * @return query
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Used to scope the exported data")

  public String getQuery() {
    return query;
  }


  public void setQuery(String query) {
    this.query = query;
  }


  public ExportJobCreate url(URI url) {
    
    this.url = url;
    return this;
  }

   /**
   * URL of the file containing the data to be exported
   * @return url
  **/
  @ApiModelProperty(required = true, value = "URL of the file containing the data to be exported")

  public URI getUrl() {
    return url;
  }


  public void setUrl(URI url) {
    this.url = url;
  }


  public ExportJobCreate status(JobStateType status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public JobStateType getStatus() {
    return status;
  }


  public void setStatus(JobStateType status) {
    this.status = status;
  }


  public ExportJobCreate atBaseType(String atBaseType) {
    
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


  public ExportJobCreate atSchemaLocation(URI atSchemaLocation) {
    
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


  public ExportJobCreate atType(String atType) {
    
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
    ExportJobCreate exportJobCreate = (ExportJobCreate) o;
    return Objects.equals(this.completionDate, exportJobCreate.completionDate) &&
        Objects.equals(this.contentType, exportJobCreate.contentType) &&
        Objects.equals(this.creationDate, exportJobCreate.creationDate) &&
        Objects.equals(this.errorLog, exportJobCreate.errorLog) &&
        Objects.equals(this.path, exportJobCreate.path) &&
        Objects.equals(this.query, exportJobCreate.query) &&
        Objects.equals(this.url, exportJobCreate.url) &&
        Objects.equals(this.status, exportJobCreate.status) &&
        Objects.equals(this.atBaseType, exportJobCreate.atBaseType) &&
        Objects.equals(this.atSchemaLocation, exportJobCreate.atSchemaLocation) &&
        Objects.equals(this.atType, exportJobCreate.atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(completionDate, contentType, creationDate, errorLog, path, query, url, status, atBaseType, atSchemaLocation, atType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExportJobCreate {\n");
    sb.append("    completionDate: ").append(toIndentedString(completionDate)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    errorLog: ").append(toIndentedString(errorLog)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

