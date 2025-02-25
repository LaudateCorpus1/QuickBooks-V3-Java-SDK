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
 * Related UOM
 * 
 * <p>Java class for UOMConvUnit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UOMConvUnit"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Abbrv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ConvRatio" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UOMConvUnit", propOrder = {
    "name",
    "abbrv",
    "convRatio"
})
public class UOMConvUnit implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Abbrv")
    protected String abbrv;
    @XmlElement(name = "ConvRatio")
    protected BigDecimal convRatio;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the abbrv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbbrv() {
        return abbrv;
    }

    /**
     * Sets the value of the abbrv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbbrv(String value) {
        this.abbrv = value;
    }

    /**
     * Gets the value of the convRatio property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getConvRatio() {
        return convRatio;
    }

    /**
     * Sets the value of the convRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setConvRatio(BigDecimal value) {
        this.convRatio = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final UOMConvUnit that = ((UOMConvUnit) object);
        {
            String lhsName;
            lhsName = this.getName();
            String rhsName;
            rhsName = that.getName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName, (this.name!= null), (that.name!= null))) {
                return false;
            }
        }
        {
            String lhsAbbrv;
            lhsAbbrv = this.getAbbrv();
            String rhsAbbrv;
            rhsAbbrv = that.getAbbrv();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "abbrv", lhsAbbrv), LocatorUtils.property(thatLocator, "abbrv", rhsAbbrv), lhsAbbrv, rhsAbbrv, (this.abbrv!= null), (that.abbrv!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsConvRatio;
            lhsConvRatio = this.getConvRatio();
            BigDecimal rhsConvRatio;
            rhsConvRatio = that.getConvRatio();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "convRatio", lhsConvRatio), LocatorUtils.property(thatLocator, "convRatio", rhsConvRatio), lhsConvRatio, rhsConvRatio, (this.convRatio!= null), (that.convRatio!= null))) {
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
        int currentHashCode = 1;
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName, (this.name!= null));
        }
        {
            String theAbbrv;
            theAbbrv = this.getAbbrv();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "abbrv", theAbbrv), currentHashCode, theAbbrv, (this.abbrv!= null));
        }
        {
            BigDecimal theConvRatio;
            theConvRatio = this.getConvRatio();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "convRatio", theConvRatio), currentHashCode, theConvRatio, (this.convRatio!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
