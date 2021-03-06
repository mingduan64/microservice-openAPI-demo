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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.BundledProductOfferingPriceRelationship;
import org.openapitools.client.model.ConstraintRef;
import org.openapitools.client.model.Money;
import org.openapitools.client.model.PlaceRef;
import org.openapitools.client.model.PricingLogicAlgorithm;
import org.openapitools.client.model.ProductOfferingPriceRelationship;
import org.openapitools.client.model.ProductOfferingTerm;
import org.openapitools.client.model.ProductSpecificationCharacteristicValueUse;
import org.openapitools.client.model.Quantity;
import org.openapitools.client.model.TaxItem;
import org.openapitools.client.model.TimePeriod;
import org.threeten.bp.OffsetDateTime;

/**
 * Is based on both the basic cost to develop and produce products and the enterprises policy on revenue targets. This price may be further revised through discounting (a Product Offering Price that reflects an alteration). The price, applied for a productOffering may also be influenced by the productOfferingTerm, the customer selected, eg: a productOffering can be offered with multiple terms, like commitment periods for the contract. The price may be influenced by this productOfferingTerm. A productOffering may be cheaper with a 24 month commitment than with a 12 month commitment. Skipped properties: id,href
 */
@ApiModel(description = "Is based on both the basic cost to develop and produce products and the enterprises policy on revenue targets. This price may be further revised through discounting (a Product Offering Price that reflects an alteration). The price, applied for a productOffering may also be influenced by the productOfferingTerm, the customer selected, eg: a productOffering can be offered with multiple terms, like commitment periods for the contract. The price may be influenced by this productOfferingTerm. A productOffering may be cheaper with a 24 month commitment than with a 12 month commitment. Skipped properties: id,href")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-04T02:31:04.425344+07:00[Asia/Ho_Chi_Minh]")
public class ProductOfferingPriceCreate {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_IS_BUNDLE = "isBundle";
  @SerializedName(SERIALIZED_NAME_IS_BUNDLE)
  private Boolean isBundle;

  public static final String SERIALIZED_NAME_LAST_UPDATE = "lastUpdate";
  @SerializedName(SERIALIZED_NAME_LAST_UPDATE)
  private OffsetDateTime lastUpdate;

  public static final String SERIALIZED_NAME_LIFECYCLE_STATUS = "lifecycleStatus";
  @SerializedName(SERIALIZED_NAME_LIFECYCLE_STATUS)
  private String lifecycleStatus;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PERCENTAGE = "percentage";
  @SerializedName(SERIALIZED_NAME_PERCENTAGE)
  private Float percentage;

  public static final String SERIALIZED_NAME_PRICE_TYPE = "priceType";
  @SerializedName(SERIALIZED_NAME_PRICE_TYPE)
  private String priceType;

  public static final String SERIALIZED_NAME_RECURRING_CHARGE_PERIOD_LENGTH = "recurringChargePeriodLength";
  @SerializedName(SERIALIZED_NAME_RECURRING_CHARGE_PERIOD_LENGTH)
  private Integer recurringChargePeriodLength;

  public static final String SERIALIZED_NAME_RECURRING_CHARGE_PERIOD_TYPE = "recurringChargePeriodType";
  @SerializedName(SERIALIZED_NAME_RECURRING_CHARGE_PERIOD_TYPE)
  private String recurringChargePeriodType;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_BUNDLED_POP_RELATIONSHIP = "bundledPopRelationship";
  @SerializedName(SERIALIZED_NAME_BUNDLED_POP_RELATIONSHIP)
  private List<BundledProductOfferingPriceRelationship> bundledPopRelationship = null;

  public static final String SERIALIZED_NAME_CONSTRAINT = "constraint";
  @SerializedName(SERIALIZED_NAME_CONSTRAINT)
  private List<ConstraintRef> constraint = null;

  public static final String SERIALIZED_NAME_PLACE = "place";
  @SerializedName(SERIALIZED_NAME_PLACE)
  private List<PlaceRef> place = null;

  public static final String SERIALIZED_NAME_POP_RELATIONSHIP = "popRelationship";
  @SerializedName(SERIALIZED_NAME_POP_RELATIONSHIP)
  private List<ProductOfferingPriceRelationship> popRelationship = null;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private Money price;

  public static final String SERIALIZED_NAME_PRICING_LOGIC_ALGORITHM = "pricingLogicAlgorithm";
  @SerializedName(SERIALIZED_NAME_PRICING_LOGIC_ALGORITHM)
  private List<PricingLogicAlgorithm> pricingLogicAlgorithm = null;

  public static final String SERIALIZED_NAME_PROD_SPEC_CHAR_VALUE_USE = "prodSpecCharValueUse";
  @SerializedName(SERIALIZED_NAME_PROD_SPEC_CHAR_VALUE_USE)
  private List<ProductSpecificationCharacteristicValueUse> prodSpecCharValueUse = null;

  public static final String SERIALIZED_NAME_PRODUCT_OFFERING_TERM = "productOfferingTerm";
  @SerializedName(SERIALIZED_NAME_PRODUCT_OFFERING_TERM)
  private List<ProductOfferingTerm> productOfferingTerm = null;

  public static final String SERIALIZED_NAME_TAX = "tax";
  @SerializedName(SERIALIZED_NAME_TAX)
  private List<TaxItem> tax = null;

  public static final String SERIALIZED_NAME_UNIT_OF_MEASURE = "unitOfMeasure";
  @SerializedName(SERIALIZED_NAME_UNIT_OF_MEASURE)
  private Quantity unitOfMeasure;

  public static final String SERIALIZED_NAME_VALID_FOR = "validFor";
  @SerializedName(SERIALIZED_NAME_VALID_FOR)
  private TimePeriod validFor;

  public static final String SERIALIZED_NAME_AT_BASE_TYPE = "@baseType";
  @SerializedName(SERIALIZED_NAME_AT_BASE_TYPE)
  private String atBaseType;

  public static final String SERIALIZED_NAME_AT_SCHEMA_LOCATION = "@schemaLocation";
  @SerializedName(SERIALIZED_NAME_AT_SCHEMA_LOCATION)
  private String atSchemaLocation;

  public static final String SERIALIZED_NAME_AT_TYPE = "@type";
  @SerializedName(SERIALIZED_NAME_AT_TYPE)
  private String atType;


  public ProductOfferingPriceCreate description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Description of the productOfferingPrice
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Description of the productOfferingPrice")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public ProductOfferingPriceCreate isBundle(Boolean isBundle) {
    
    this.isBundle = isBundle;
    return this;
  }

   /**
   * A flag indicating if this ProductOfferingPrice is composite (bundle) or not
   * @return isBundle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A flag indicating if this ProductOfferingPrice is composite (bundle) or not")

  public Boolean getIsBundle() {
    return isBundle;
  }


  public void setIsBundle(Boolean isBundle) {
    this.isBundle = isBundle;
  }


  public ProductOfferingPriceCreate lastUpdate(OffsetDateTime lastUpdate) {
    
    this.lastUpdate = lastUpdate;
    return this;
  }

   /**
   * the last update time of this ProductOfferingPrice
   * @return lastUpdate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the last update time of this ProductOfferingPrice")

  public OffsetDateTime getLastUpdate() {
    return lastUpdate;
  }


  public void setLastUpdate(OffsetDateTime lastUpdate) {
    this.lastUpdate = lastUpdate;
  }


  public ProductOfferingPriceCreate lifecycleStatus(String lifecycleStatus) {
    
    this.lifecycleStatus = lifecycleStatus;
    return this;
  }

   /**
   * the lifecycle status of this ProductOfferingPrice
   * @return lifecycleStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the lifecycle status of this ProductOfferingPrice")

  public String getLifecycleStatus() {
    return lifecycleStatus;
  }


  public void setLifecycleStatus(String lifecycleStatus) {
    this.lifecycleStatus = lifecycleStatus;
  }


  public ProductOfferingPriceCreate name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the productOfferingPrice
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the productOfferingPrice")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ProductOfferingPriceCreate percentage(Float percentage) {
    
    this.percentage = percentage;
    return this;
  }

   /**
   * Percentage to apply if this Product Offering Price is an Alteration (such as a Discount)
   * @return percentage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Percentage to apply if this Product Offering Price is an Alteration (such as a Discount)")

  public Float getPercentage() {
    return percentage;
  }


  public void setPercentage(Float percentage) {
    this.percentage = percentage;
  }


  public ProductOfferingPriceCreate priceType(String priceType) {
    
    this.priceType = priceType;
    return this;
  }

   /**
   * A category that describes the price, such as recurring, discount, allowance, penalty, and so forth.
   * @return priceType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A category that describes the price, such as recurring, discount, allowance, penalty, and so forth.")

  public String getPriceType() {
    return priceType;
  }


  public void setPriceType(String priceType) {
    this.priceType = priceType;
  }


  public ProductOfferingPriceCreate recurringChargePeriodLength(Integer recurringChargePeriodLength) {
    
    this.recurringChargePeriodLength = recurringChargePeriodLength;
    return this;
  }

   /**
   * the period of the recurring charge:  1, 2, ... .It sets to zero if it is not applicable
   * @return recurringChargePeriodLength
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the period of the recurring charge:  1, 2, ... .It sets to zero if it is not applicable")

  public Integer getRecurringChargePeriodLength() {
    return recurringChargePeriodLength;
  }


  public void setRecurringChargePeriodLength(Integer recurringChargePeriodLength) {
    this.recurringChargePeriodLength = recurringChargePeriodLength;
  }


  public ProductOfferingPriceCreate recurringChargePeriodType(String recurringChargePeriodType) {
    
    this.recurringChargePeriodType = recurringChargePeriodType;
    return this;
  }

   /**
   * The period to repeat the application of the price Could be month, week...
   * @return recurringChargePeriodType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The period to repeat the application of the price Could be month, week...")

  public String getRecurringChargePeriodType() {
    return recurringChargePeriodType;
  }


  public void setRecurringChargePeriodType(String recurringChargePeriodType) {
    this.recurringChargePeriodType = recurringChargePeriodType;
  }


  public ProductOfferingPriceCreate version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * ProductOfferingPrice version
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ProductOfferingPrice version")

  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    this.version = version;
  }


  public ProductOfferingPriceCreate bundledPopRelationship(List<BundledProductOfferingPriceRelationship> bundledPopRelationship) {
    
    this.bundledPopRelationship = bundledPopRelationship;
    return this;
  }

  public ProductOfferingPriceCreate addBundledPopRelationshipItem(BundledProductOfferingPriceRelationship bundledPopRelationshipItem) {
    if (this.bundledPopRelationship == null) {
      this.bundledPopRelationship = new ArrayList<BundledProductOfferingPriceRelationship>();
    }
    this.bundledPopRelationship.add(bundledPopRelationshipItem);
    return this;
  }

   /**
   * this object represents a bundle relationship from a bundle product offering price (parent) to a simple product offering price (child). A simple product offering price may participate in more than one bundle relationship.
   * @return bundledPopRelationship
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "this object represents a bundle relationship from a bundle product offering price (parent) to a simple product offering price (child). A simple product offering price may participate in more than one bundle relationship.")

  public List<BundledProductOfferingPriceRelationship> getBundledPopRelationship() {
    return bundledPopRelationship;
  }


  public void setBundledPopRelationship(List<BundledProductOfferingPriceRelationship> bundledPopRelationship) {
    this.bundledPopRelationship = bundledPopRelationship;
  }


  public ProductOfferingPriceCreate constraint(List<ConstraintRef> constraint) {
    
    this.constraint = constraint;
    return this;
  }

  public ProductOfferingPriceCreate addConstraintItem(ConstraintRef constraintItem) {
    if (this.constraint == null) {
      this.constraint = new ArrayList<ConstraintRef>();
    }
    this.constraint.add(constraintItem);
    return this;
  }

   /**
   * The Constraint resource represents a policy/rule applied to ProductOfferingPrice.
   * @return constraint
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Constraint resource represents a policy/rule applied to ProductOfferingPrice.")

  public List<ConstraintRef> getConstraint() {
    return constraint;
  }


  public void setConstraint(List<ConstraintRef> constraint) {
    this.constraint = constraint;
  }


  public ProductOfferingPriceCreate place(List<PlaceRef> place) {
    
    this.place = place;
    return this;
  }

  public ProductOfferingPriceCreate addPlaceItem(PlaceRef placeItem) {
    if (this.place == null) {
      this.place = new ArrayList<PlaceRef>();
    }
    this.place.add(placeItem);
    return this;
  }

   /**
   * Place defines the places where the products are sold or delivered.
   * @return place
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Place defines the places where the products are sold or delivered.")

  public List<PlaceRef> getPlace() {
    return place;
  }


  public void setPlace(List<PlaceRef> place) {
    this.place = place;
  }


  public ProductOfferingPriceCreate popRelationship(List<ProductOfferingPriceRelationship> popRelationship) {
    
    this.popRelationship = popRelationship;
    return this;
  }

  public ProductOfferingPriceCreate addPopRelationshipItem(ProductOfferingPriceRelationship popRelationshipItem) {
    if (this.popRelationship == null) {
      this.popRelationship = new ArrayList<ProductOfferingPriceRelationship>();
    }
    this.popRelationship.add(popRelationshipItem);
    return this;
  }

   /**
   * Product Offering Prices related to this Product Offering Price, for example a price alteration such as allowance or discount
   * @return popRelationship
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Product Offering Prices related to this Product Offering Price, for example a price alteration such as allowance or discount")

  public List<ProductOfferingPriceRelationship> getPopRelationship() {
    return popRelationship;
  }


  public void setPopRelationship(List<ProductOfferingPriceRelationship> popRelationship) {
    this.popRelationship = popRelationship;
  }


  public ProductOfferingPriceCreate price(Money price) {
    
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Money getPrice() {
    return price;
  }


  public void setPrice(Money price) {
    this.price = price;
  }


  public ProductOfferingPriceCreate pricingLogicAlgorithm(List<PricingLogicAlgorithm> pricingLogicAlgorithm) {
    
    this.pricingLogicAlgorithm = pricingLogicAlgorithm;
    return this;
  }

  public ProductOfferingPriceCreate addPricingLogicAlgorithmItem(PricingLogicAlgorithm pricingLogicAlgorithmItem) {
    if (this.pricingLogicAlgorithm == null) {
      this.pricingLogicAlgorithm = new ArrayList<PricingLogicAlgorithm>();
    }
    this.pricingLogicAlgorithm.add(pricingLogicAlgorithmItem);
    return this;
  }

   /**
   * The PricingLogicAlgorithm entity represents an instantiation of an interface specification to external rating function (without a modeled behavior in SID). Some of the parameters of the interface definition may be already set (such as price per unit) and some may be gathered during the rating process from the event (such as call duration) or from ProductCharacteristicValues (such as assigned bandwidth).
   * @return pricingLogicAlgorithm
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The PricingLogicAlgorithm entity represents an instantiation of an interface specification to external rating function (without a modeled behavior in SID). Some of the parameters of the interface definition may be already set (such as price per unit) and some may be gathered during the rating process from the event (such as call duration) or from ProductCharacteristicValues (such as assigned bandwidth).")

  public List<PricingLogicAlgorithm> getPricingLogicAlgorithm() {
    return pricingLogicAlgorithm;
  }


  public void setPricingLogicAlgorithm(List<PricingLogicAlgorithm> pricingLogicAlgorithm) {
    this.pricingLogicAlgorithm = pricingLogicAlgorithm;
  }


  public ProductOfferingPriceCreate prodSpecCharValueUse(List<ProductSpecificationCharacteristicValueUse> prodSpecCharValueUse) {
    
    this.prodSpecCharValueUse = prodSpecCharValueUse;
    return this;
  }

  public ProductOfferingPriceCreate addProdSpecCharValueUseItem(ProductSpecificationCharacteristicValueUse prodSpecCharValueUseItem) {
    if (this.prodSpecCharValueUse == null) {
      this.prodSpecCharValueUse = new ArrayList<ProductSpecificationCharacteristicValueUse>();
    }
    this.prodSpecCharValueUse.add(prodSpecCharValueUseItem);
    return this;
  }

   /**
   * A use of the ProductSpecificationCharacteristicValue by a ProductOfferingPrice to which additional properties (attributes) apply or override the properties of similar properties contained in ProductSpecificationCharacteristicValue. It should be noted that characteristics which their value(s) addressed by this object must exist in corresponding product specification. The available characteristic values for a ProductSpecificationCharacteristic in a Product specification can be modified at the ProductOffering and ProcuctOfferingPrice level. The list of values in ProductSpecificationCharacteristicValueUse is a strict subset of the list of values as defined in the corresponding product specification characteristics.
   * @return prodSpecCharValueUse
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A use of the ProductSpecificationCharacteristicValue by a ProductOfferingPrice to which additional properties (attributes) apply or override the properties of similar properties contained in ProductSpecificationCharacteristicValue. It should be noted that characteristics which their value(s) addressed by this object must exist in corresponding product specification. The available characteristic values for a ProductSpecificationCharacteristic in a Product specification can be modified at the ProductOffering and ProcuctOfferingPrice level. The list of values in ProductSpecificationCharacteristicValueUse is a strict subset of the list of values as defined in the corresponding product specification characteristics.")

  public List<ProductSpecificationCharacteristicValueUse> getProdSpecCharValueUse() {
    return prodSpecCharValueUse;
  }


  public void setProdSpecCharValueUse(List<ProductSpecificationCharacteristicValueUse> prodSpecCharValueUse) {
    this.prodSpecCharValueUse = prodSpecCharValueUse;
  }


  public ProductOfferingPriceCreate productOfferingTerm(List<ProductOfferingTerm> productOfferingTerm) {
    
    this.productOfferingTerm = productOfferingTerm;
    return this;
  }

  public ProductOfferingPriceCreate addProductOfferingTermItem(ProductOfferingTerm productOfferingTermItem) {
    if (this.productOfferingTerm == null) {
      this.productOfferingTerm = new ArrayList<ProductOfferingTerm>();
    }
    this.productOfferingTerm.add(productOfferingTermItem);
    return this;
  }

   /**
   * A list of conditions under which a ProductOfferingPrice is made available to Customers. For instance, a Product Offering Price can be offered with multiple commitment periods.
   * @return productOfferingTerm
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of conditions under which a ProductOfferingPrice is made available to Customers. For instance, a Product Offering Price can be offered with multiple commitment periods.")

  public List<ProductOfferingTerm> getProductOfferingTerm() {
    return productOfferingTerm;
  }


  public void setProductOfferingTerm(List<ProductOfferingTerm> productOfferingTerm) {
    this.productOfferingTerm = productOfferingTerm;
  }


  public ProductOfferingPriceCreate tax(List<TaxItem> tax) {
    
    this.tax = tax;
    return this;
  }

  public ProductOfferingPriceCreate addTaxItem(TaxItem taxItem) {
    if (this.tax == null) {
      this.tax = new ArrayList<TaxItem>();
    }
    this.tax.add(taxItem);
    return this;
  }

   /**
   * An amount of money levied on the price of a Product by a legislative body.
   * @return tax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An amount of money levied on the price of a Product by a legislative body.")

  public List<TaxItem> getTax() {
    return tax;
  }


  public void setTax(List<TaxItem> tax) {
    this.tax = tax;
  }


  public ProductOfferingPriceCreate unitOfMeasure(Quantity unitOfMeasure) {
    
    this.unitOfMeasure = unitOfMeasure;
    return this;
  }

   /**
   * Get unitOfMeasure
   * @return unitOfMeasure
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Quantity getUnitOfMeasure() {
    return unitOfMeasure;
  }


  public void setUnitOfMeasure(Quantity unitOfMeasure) {
    this.unitOfMeasure = unitOfMeasure;
  }


  public ProductOfferingPriceCreate validFor(TimePeriod validFor) {
    
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


  public ProductOfferingPriceCreate atBaseType(String atBaseType) {
    
    this.atBaseType = atBaseType;
    return this;
  }

   /**
   * the immediate base class type of this product offering price
   * @return atBaseType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the immediate base class type of this product offering price")

  public String getAtBaseType() {
    return atBaseType;
  }


  public void setAtBaseType(String atBaseType) {
    this.atBaseType = atBaseType;
  }


  public ProductOfferingPriceCreate atSchemaLocation(String atSchemaLocation) {
    
    this.atSchemaLocation = atSchemaLocation;
    return this;
  }

   /**
   * hyperlink reference to the schema describing this resource
   * @return atSchemaLocation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "hyperlink reference to the schema describing this resource")

  public String getAtSchemaLocation() {
    return atSchemaLocation;
  }


  public void setAtSchemaLocation(String atSchemaLocation) {
    this.atSchemaLocation = atSchemaLocation;
  }


  public ProductOfferingPriceCreate atType(String atType) {
    
    this.atType = atType;
    return this;
  }

   /**
   * The class type of this Product offering price
   * @return atType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The class type of this Product offering price")

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
    ProductOfferingPriceCreate productOfferingPriceCreate = (ProductOfferingPriceCreate) o;
    return Objects.equals(this.description, productOfferingPriceCreate.description) &&
        Objects.equals(this.isBundle, productOfferingPriceCreate.isBundle) &&
        Objects.equals(this.lastUpdate, productOfferingPriceCreate.lastUpdate) &&
        Objects.equals(this.lifecycleStatus, productOfferingPriceCreate.lifecycleStatus) &&
        Objects.equals(this.name, productOfferingPriceCreate.name) &&
        Objects.equals(this.percentage, productOfferingPriceCreate.percentage) &&
        Objects.equals(this.priceType, productOfferingPriceCreate.priceType) &&
        Objects.equals(this.recurringChargePeriodLength, productOfferingPriceCreate.recurringChargePeriodLength) &&
        Objects.equals(this.recurringChargePeriodType, productOfferingPriceCreate.recurringChargePeriodType) &&
        Objects.equals(this.version, productOfferingPriceCreate.version) &&
        Objects.equals(this.bundledPopRelationship, productOfferingPriceCreate.bundledPopRelationship) &&
        Objects.equals(this.constraint, productOfferingPriceCreate.constraint) &&
        Objects.equals(this.place, productOfferingPriceCreate.place) &&
        Objects.equals(this.popRelationship, productOfferingPriceCreate.popRelationship) &&
        Objects.equals(this.price, productOfferingPriceCreate.price) &&
        Objects.equals(this.pricingLogicAlgorithm, productOfferingPriceCreate.pricingLogicAlgorithm) &&
        Objects.equals(this.prodSpecCharValueUse, productOfferingPriceCreate.prodSpecCharValueUse) &&
        Objects.equals(this.productOfferingTerm, productOfferingPriceCreate.productOfferingTerm) &&
        Objects.equals(this.tax, productOfferingPriceCreate.tax) &&
        Objects.equals(this.unitOfMeasure, productOfferingPriceCreate.unitOfMeasure) &&
        Objects.equals(this.validFor, productOfferingPriceCreate.validFor) &&
        Objects.equals(this.atBaseType, productOfferingPriceCreate.atBaseType) &&
        Objects.equals(this.atSchemaLocation, productOfferingPriceCreate.atSchemaLocation) &&
        Objects.equals(this.atType, productOfferingPriceCreate.atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, isBundle, lastUpdate, lifecycleStatus, name, percentage, priceType, recurringChargePeriodLength, recurringChargePeriodType, version, bundledPopRelationship, constraint, place, popRelationship, price, pricingLogicAlgorithm, prodSpecCharValueUse, productOfferingTerm, tax, unitOfMeasure, validFor, atBaseType, atSchemaLocation, atType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductOfferingPriceCreate {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isBundle: ").append(toIndentedString(isBundle)).append("\n");
    sb.append("    lastUpdate: ").append(toIndentedString(lastUpdate)).append("\n");
    sb.append("    lifecycleStatus: ").append(toIndentedString(lifecycleStatus)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
    sb.append("    priceType: ").append(toIndentedString(priceType)).append("\n");
    sb.append("    recurringChargePeriodLength: ").append(toIndentedString(recurringChargePeriodLength)).append("\n");
    sb.append("    recurringChargePeriodType: ").append(toIndentedString(recurringChargePeriodType)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    bundledPopRelationship: ").append(toIndentedString(bundledPopRelationship)).append("\n");
    sb.append("    constraint: ").append(toIndentedString(constraint)).append("\n");
    sb.append("    place: ").append(toIndentedString(place)).append("\n");
    sb.append("    popRelationship: ").append(toIndentedString(popRelationship)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    pricingLogicAlgorithm: ").append(toIndentedString(pricingLogicAlgorithm)).append("\n");
    sb.append("    prodSpecCharValueUse: ").append(toIndentedString(prodSpecCharValueUse)).append("\n");
    sb.append("    productOfferingTerm: ").append(toIndentedString(productOfferingTerm)).append("\n");
    sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
    sb.append("    unitOfMeasure: ").append(toIndentedString(unitOfMeasure)).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
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

