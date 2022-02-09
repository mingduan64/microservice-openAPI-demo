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
import org.openapitools.client.model.Quantity;
import org.openapitools.client.model.TimePeriod;

/**
 * An attachment by value or by reference. An attachment complements the description of an element, for example through a document, a video, a picture.
 */
@ApiModel(description = "An attachment by value or by reference. An attachment complements the description of an element, for example through a document, a video, a picture.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-04T02:31:04.425344+07:00[Asia/Ho_Chi_Minh]")
public class AttachmentRefOrValue {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  private URI href;

  public static final String SERIALIZED_NAME_ATTACHMENT_TYPE = "attachmentType";
  @SerializedName(SERIALIZED_NAME_ATTACHMENT_TYPE)
  private String attachmentType;

  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private String content;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_MIME_TYPE = "mimeType";
  @SerializedName(SERIALIZED_NAME_MIME_TYPE)
  private String mimeType;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private URI url;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Quantity size;

  public static final String SERIALIZED_NAME_VALID_FOR = "validFor";
  @SerializedName(SERIALIZED_NAME_VALID_FOR)
  private TimePeriod validFor;

  public static final String SERIALIZED_NAME_AT_BASE_TYPE = "@baseType";
  @SerializedName(SERIALIZED_NAME_AT_BASE_TYPE)
  private String atBaseType;

  public static final String SERIALIZED_NAME_AT_SCHEMA_LOCATION = "@schemaLocation";
  @SerializedName(SERIALIZED_NAME_AT_SCHEMA_LOCATION)
  private URI atSchemaLocation;

  public static final String SERIALIZED_NAME_AT_TYPE = "@type";
  @SerializedName(SERIALIZED_NAME_AT_TYPE)
  private String atType;

  public static final String SERIALIZED_NAME_AT_REFERRED_TYPE = "@referredType";
  @SerializedName(SERIALIZED_NAME_AT_REFERRED_TYPE)
  private String atReferredType;


  public AttachmentRefOrValue id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique identifier for this particular attachment
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4aafacbd-11ff-4dc8-b445-305f2215715f", value = "Unique identifier for this particular attachment")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public AttachmentRefOrValue href(URI href) {
    
    this.href = href;
    return this;
  }

   /**
   * URI for this Attachment
   * @return href
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://host/Attachment/4aafacbd-11ff-4dc8-b445-305f2215715f", value = "URI for this Attachment")

  public URI getHref() {
    return href;
  }


  public void setHref(URI href) {
    this.href = href;
  }


  public AttachmentRefOrValue attachmentType(String attachmentType) {
    
    this.attachmentType = attachmentType;
    return this;
  }

   /**
   * Attachment type such as video, picture
   * @return attachmentType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "video", value = "Attachment type such as video, picture")

  public String getAttachmentType() {
    return attachmentType;
  }


  public void setAttachmentType(String attachmentType) {
    this.attachmentType = attachmentType;
  }


  public AttachmentRefOrValue content(String content) {
    
    this.content = content;
    return this;
  }

   /**
   * The actual contents of the attachment object, if embedded, encoded as base64
   * @return content
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The actual contents of the attachment object, if embedded, encoded as base64")

  public String getContent() {
    return content;
  }


  public void setContent(String content) {
    this.content = content;
  }


  public AttachmentRefOrValue description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * A narrative text describing the content of the attachment
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Photograph of the Product", value = "A narrative text describing the content of the attachment")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public AttachmentRefOrValue mimeType(String mimeType) {
    
    this.mimeType = mimeType;
    return this;
  }

   /**
   * Attachment mime type such as extension file for video, picture and document
   * @return mimeType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Attachment mime type such as extension file for video, picture and document")

  public String getMimeType() {
    return mimeType;
  }


  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }


  public AttachmentRefOrValue name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the attachment
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the attachment")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public AttachmentRefOrValue url(URI url) {
    
    this.url = url;
    return this;
  }

   /**
   * Uniform Resource Locator, is a web page address (a subset of URI)
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://host/Content/4aafacbd-11ff-4dc8-b445-305f2215715f", value = "Uniform Resource Locator, is a web page address (a subset of URI)")

  public URI getUrl() {
    return url;
  }


  public void setUrl(URI url) {
    this.url = url;
  }


  public AttachmentRefOrValue size(Quantity size) {
    
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Quantity getSize() {
    return size;
  }


  public void setSize(Quantity size) {
    this.size = size;
  }


  public AttachmentRefOrValue validFor(TimePeriod validFor) {
    
    this.validFor = validFor;
    return this;
  }

   /**
   * Get validFor
   * @return validFor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TimePeriod getValidFor() {
    return validFor;
  }


  public void setValidFor(TimePeriod validFor) {
    this.validFor = validFor;
  }


  public AttachmentRefOrValue atBaseType(String atBaseType) {
    
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


  public AttachmentRefOrValue atSchemaLocation(URI atSchemaLocation) {
    
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


  public AttachmentRefOrValue atType(String atType) {
    
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


  public AttachmentRefOrValue atReferredType(String atReferredType) {
    
    this.atReferredType = atReferredType;
    return this;
  }

   /**
   * The actual type of the target instance when needed for disambiguation.
   * @return atReferredType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The actual type of the target instance when needed for disambiguation.")

  public String getAtReferredType() {
    return atReferredType;
  }


  public void setAtReferredType(String atReferredType) {
    this.atReferredType = atReferredType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttachmentRefOrValue attachmentRefOrValue = (AttachmentRefOrValue) o;
    return Objects.equals(this.id, attachmentRefOrValue.id) &&
        Objects.equals(this.href, attachmentRefOrValue.href) &&
        Objects.equals(this.attachmentType, attachmentRefOrValue.attachmentType) &&
        Objects.equals(this.content, attachmentRefOrValue.content) &&
        Objects.equals(this.description, attachmentRefOrValue.description) &&
        Objects.equals(this.mimeType, attachmentRefOrValue.mimeType) &&
        Objects.equals(this.name, attachmentRefOrValue.name) &&
        Objects.equals(this.url, attachmentRefOrValue.url) &&
        Objects.equals(this.size, attachmentRefOrValue.size) &&
        Objects.equals(this.validFor, attachmentRefOrValue.validFor) &&
        Objects.equals(this.atBaseType, attachmentRefOrValue.atBaseType) &&
        Objects.equals(this.atSchemaLocation, attachmentRefOrValue.atSchemaLocation) &&
        Objects.equals(this.atType, attachmentRefOrValue.atType) &&
        Objects.equals(this.atReferredType, attachmentRefOrValue.atReferredType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, attachmentType, content, description, mimeType, name, url, size, validFor, atBaseType, atSchemaLocation, atType, atReferredType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttachmentRefOrValue {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    attachmentType: ").append(toIndentedString(attachmentType)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
    sb.append("    atBaseType: ").append(toIndentedString(atBaseType)).append("\n");
    sb.append("    atSchemaLocation: ").append(toIndentedString(atSchemaLocation)).append("\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
    sb.append("    atReferredType: ").append(toIndentedString(atReferredType)).append("\n");
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

