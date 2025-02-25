//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.02.02 at 10:13:31 AM PST 
//


package com.intuit.ipp.data;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxReturnStatusEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TaxReturnStatusEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FILED"/&gt;
 *     &lt;enumeration value="FILING_FAILED"/&gt;
 *     &lt;enumeration value="FILING_FAILED_WRONG_AGENCY_CREDENTIALS"/&gt;
 *     &lt;enumeration value="AGENCY_PAYMENT_INITIATED"/&gt;
 *     &lt;enumeration value="AGENCY_PAYMENT_COMPLETED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TaxReturnStatusEnum")
@XmlEnum
public enum TaxReturnStatusEnum {

    FILED,
    FILING_FAILED,
    FILING_FAILED_WRONG_AGENCY_CREDENTIALS,
    AGENCY_PAYMENT_INITIATED,
    AGENCY_PAYMENT_COMPLETED;

    public String value() {
        return name();
    }

    public static TaxReturnStatusEnum fromValue(String v) {
        return valueOf(v);
    }

}
