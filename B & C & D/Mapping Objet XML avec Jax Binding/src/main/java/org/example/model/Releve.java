package org.example.model;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import java.util.Date;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Releve {
    @XmlAttribute(name = "RIB", required = true)
    private String RIB;
    @XmlSchemaType(name = "date")
    @XmlElement(required = true)
    private Date dateReleve;
    @XmlElement(required = true)
    private int solde;
    @XmlElement(required = true)
    private Operations operations;

    public Releve (String RIB, Date dateReleve, int solde, Operations operations) {
        this.RIB = RIB;
        this.dateReleve = dateReleve;
        this.solde = solde;
        this.operations = operations;
    }

    public Releve() {
    }

    public String getRIB() {
        return RIB;
    }

    public void setRIB(String RIB) {
        this.RIB = RIB;
    }

    public Date getDateReleve() {
        return dateReleve;
    }

    public void setDateReleve(Date dateReleve) {
        this.dateReleve = dateReleve;
    }

    public int getSolde() {
        return solde;
    }

    public void setSolde(int solde) {
        this.solde = solde;
    }

    public Operations getOperations() {
        return operations;
    }

    public void setOperations(Operations operations) {
        this.operations = operations;
    }

    @Override
    public String toString() {
        return "Releve {" +
              "\n \t RIB = '" + RIB + "\'," +
              "\n \t dateReleve = " + dateReleve  + "," +
              "\n \t solde = " + solde + "," +
              "\n \t operations = " + operations +
              "\n }";
    }
}
