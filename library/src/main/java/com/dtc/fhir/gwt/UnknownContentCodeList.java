//
// 此檔案是由 JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 所產生 
// 請參閱 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 一旦重新編譯來源綱要, 對此檔案所做的任何修改都將會遺失. 
// 產生時間: 2016.08.31 於 11:09:06 PM CST 
//


package com.dtc.fhir.gwt;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>UnknownContentCode-list 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * <p>
 * <pre>
 * &lt;simpleType name="UnknownContentCode-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="no"/>
 *     &lt;enumeration value="extensions"/>
 *     &lt;enumeration value="elements"/>
 *     &lt;enumeration value="both"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UnknownContentCode-list")
@XmlEnum
public enum UnknownContentCodeList {


    /**
     * The application does not accept either unknown elements or extensions.
     * 
     */
    @XmlEnumValue("no")
    NO("no"),

    /**
     * The application accepts unknown extensions, but not unknown elements.
     * 
     */
    @XmlEnumValue("extensions")
    EXTENSIONS("extensions"),

    /**
     * The application accepts unknown elements, but not unknown extensions.
     * 
     */
    @XmlEnumValue("elements")
    ELEMENTS("elements"),

    /**
     * The application accepts unknown elements and extensions.
     * 
     */
    @XmlEnumValue("both")
    BOTH("both");
    private final String value;

    UnknownContentCodeList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UnknownContentCodeList fromValue(String v) {
        for (UnknownContentCodeList c: UnknownContentCodeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
