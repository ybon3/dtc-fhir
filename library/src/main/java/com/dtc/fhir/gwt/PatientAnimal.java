//
// 此檔案是由 JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 所產生 
// 請參閱 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 一旦重新編譯來源綱要, 對此檔案所做的任何修改都將會遺失. 
// 產生時間: 2016.08.31 於 11:09:06 PM CST 
//


package com.dtc.fhir.gwt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Demographics and other administrative information about an individual or animal receiving care or other health-related services.
 * 
 * <p>Patient.Animal complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="Patient.Animal">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="species" type="{http://hl7.org/fhir}CodeableConcept"/>
 *         &lt;element name="breed" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="genderStatus" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Patient.Animal", propOrder = {
    "species",
    "breed",
    "genderStatus"
})
public class PatientAnimal
    extends BackboneElement
{

    @XmlElement(required = true)
    protected CodeableConcept species;
    protected CodeableConcept breed;
    protected CodeableConcept genderStatus;

    /**
     * 取得 species 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getSpecies() {
        return species;
    }

    /**
     * 設定 species 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setSpecies(CodeableConcept value) {
        this.species = value;
    }

    /**
     * 取得 breed 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getBreed() {
        return breed;
    }

    /**
     * 設定 breed 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setBreed(CodeableConcept value) {
        this.breed = value;
    }

    /**
     * 取得 genderStatus 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getGenderStatus() {
        return genderStatus;
    }

    /**
     * 設定 genderStatus 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setGenderStatus(CodeableConcept value) {
        this.genderStatus = value;
    }

}
