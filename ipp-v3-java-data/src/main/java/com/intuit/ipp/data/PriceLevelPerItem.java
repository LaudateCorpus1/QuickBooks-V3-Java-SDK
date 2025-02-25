//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.02.02 at 10:13:31 AM PST 
//


package com.intuit.ipp.data;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.Equals2;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy2;
import org.jvnet.jaxb2_commons.lang.HashCode2;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy2;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * 
 * 				Product: QBW
 * 				Description: A custom price or
 * 				percentage change from the item's base price for a specific price
 * 				level
 * 			
 * 
 * <p>Java class for PriceLevelPerItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriceLevelPerItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.intuit.com/finance/v3}IntuitEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ItemRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="CustomPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *           &lt;element name="CustomPricePercent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="PriceLevelPerItemEx" type="{http://schema.intuit.com/finance/v3}IntuitAnyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceLevelPerItem", propOrder = {
    "itemRef",
    "customPrice",
    "customPricePercent",
    "priceLevelPerItemEx"
})
public class PriceLevelPerItem
    extends IntuitEntity
    implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ItemRef")
    protected ReferenceType itemRef;
    @XmlElement(name = "CustomPrice")
    protected BigDecimal customPrice;
    @XmlElement(name = "CustomPricePercent")
    protected BigDecimal customPricePercent;
    @XmlElement(name = "PriceLevelPerItemEx")
    protected IntuitAnyType priceLevelPerItemEx;

    /**
     * Gets the value of the itemRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getItemRef() {
        return itemRef;
    }

    /**
     * Sets the value of the itemRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setItemRef(ReferenceType value) {
        this.itemRef = value;
    }

    /**
     * Gets the value of the customPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCustomPrice() {
        return customPrice;
    }

    /**
     * Sets the value of the customPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCustomPrice(BigDecimal value) {
        this.customPrice = value;
    }

    /**
     * Gets the value of the customPricePercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCustomPricePercent() {
        return customPricePercent;
    }

    /**
     * Sets the value of the customPricePercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCustomPricePercent(BigDecimal value) {
        this.customPricePercent = value;
    }

    /**
     * Gets the value of the priceLevelPerItemEx property.
     * 
     * @return
     *     possible object is
     *     {@link IntuitAnyType }
     *     
     */
    public IntuitAnyType getPriceLevelPerItemEx() {
        return priceLevelPerItemEx;
    }

    /**
     * Sets the value of the priceLevelPerItemEx property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntuitAnyType }
     *     
     */
    public void setPriceLevelPerItemEx(IntuitAnyType value) {
        this.priceLevelPerItemEx = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final PriceLevelPerItem that = ((PriceLevelPerItem) object);
        {
            ReferenceType lhsItemRef;
            lhsItemRef = this.getItemRef();
            ReferenceType rhsItemRef;
            rhsItemRef = that.getItemRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "itemRef", lhsItemRef), LocatorUtils.property(thatLocator, "itemRef", rhsItemRef), lhsItemRef, rhsItemRef, (this.itemRef!= null), (that.itemRef!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsCustomPrice;
            lhsCustomPrice = this.getCustomPrice();
            BigDecimal rhsCustomPrice;
            rhsCustomPrice = that.getCustomPrice();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "customPrice", lhsCustomPrice), LocatorUtils.property(thatLocator, "customPrice", rhsCustomPrice), lhsCustomPrice, rhsCustomPrice, (this.customPrice!= null), (that.customPrice!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsCustomPricePercent;
            lhsCustomPricePercent = this.getCustomPricePercent();
            BigDecimal rhsCustomPricePercent;
            rhsCustomPricePercent = that.getCustomPricePercent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "customPricePercent", lhsCustomPricePercent), LocatorUtils.property(thatLocator, "customPricePercent", rhsCustomPricePercent), lhsCustomPricePercent, rhsCustomPricePercent, (this.customPricePercent!= null), (that.customPricePercent!= null))) {
                return false;
            }
        }
        {
            IntuitAnyType lhsPriceLevelPerItemEx;
            lhsPriceLevelPerItemEx = this.getPriceLevelPerItemEx();
            IntuitAnyType rhsPriceLevelPerItemEx;
            rhsPriceLevelPerItemEx = that.getPriceLevelPerItemEx();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "priceLevelPerItemEx", lhsPriceLevelPerItemEx), LocatorUtils.property(thatLocator, "priceLevelPerItemEx", rhsPriceLevelPerItemEx), lhsPriceLevelPerItemEx, rhsPriceLevelPerItemEx, (this.priceLevelPerItemEx!= null), (that.priceLevelPerItemEx!= null))) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy2 strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            ReferenceType theItemRef;
            theItemRef = this.getItemRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "itemRef", theItemRef), currentHashCode, theItemRef, (this.itemRef!= null));
        }
        {
            BigDecimal theCustomPrice;
            theCustomPrice = this.getCustomPrice();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "customPrice", theCustomPrice), currentHashCode, theCustomPrice, (this.customPrice!= null));
        }
        {
            BigDecimal theCustomPricePercent;
            theCustomPricePercent = this.getCustomPricePercent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "customPricePercent", theCustomPricePercent), currentHashCode, theCustomPricePercent, (this.customPricePercent!= null));
        }
        {
            IntuitAnyType thePriceLevelPerItemEx;
            thePriceLevelPerItemEx = this.getPriceLevelPerItemEx();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "priceLevelPerItemEx", thePriceLevelPerItemEx), currentHashCode, thePriceLevelPerItemEx, (this.priceLevelPerItemEx!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
