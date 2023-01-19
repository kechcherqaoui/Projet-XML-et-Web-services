
package org.example.proxy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for releve complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="releve"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dateReleve" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="solde" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="operations" type="{http://service.example.org/}operations"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="RIB" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "releve", propOrder = {
    "dateReleve",
    "solde",
    "operations"
})
public class Releve {

    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateReleve;
    protected int solde;
    @XmlElement(required = true)
    protected Operations operations;
    @XmlAttribute(name = "RIB", required = true)
    protected String rib;

    /**
     * Gets the value of the dateReleve property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateReleve() {
        return dateReleve;
    }

    /**
     * Sets the value of the dateReleve property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateReleve(XMLGregorianCalendar value) {
        this.dateReleve = value;
    }

    /**
     * Gets the value of the solde property.
     * 
     */
    public int getSolde() {
        return solde;
    }

    /**
     * Sets the value of the solde property.
     * 
     */
    public void setSolde(int value) {
        this.solde = value;
    }

    /**
     * Gets the value of the operations property.
     * 
     * @return
     *     possible object is
     *     {@link Operations }
     *     
     */
    public Operations getOperations() {
        return operations;
    }

    /**
     * Sets the value of the operations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Operations }
     *     
     */
    public void setOperations(Operations value) {
        this.operations = value;
    }

    /**
     * Gets the value of the rib property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRIB() {
        return rib;
    }

    /**
     * Sets the value of the rib property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRIB(String value) {
        this.rib = value;
    }



    @Override
    public String toString() {
        return "Releve {" +
              "\n \t RIB = '" + rib + "\'," +
              "\n \t dateReleve = " + dateReleve  + "," +
              "\n \t solde = " + solde + "," +
              "\n \t operations = " + operations +
              "\n }";
    }
}
