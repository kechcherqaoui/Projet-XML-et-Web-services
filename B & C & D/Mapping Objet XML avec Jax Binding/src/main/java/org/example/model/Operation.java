package org.example.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import java.util.Date;

@XmlAccessorType(XmlAccessType.FIELD)
public class Operation {
    public enum Type {CREDIT, DEBIT};
    @XmlAttribute(required = true)
    private Type type;
    @XmlSchemaType(name = "date")
    @XmlAttribute(required = true)
    private Date date;
    @XmlAttribute
    private double montant;
    @XmlAttribute(required = true)
    private String description;

    public Operation(Type type, Date date, double montant, String description) {
        this.type = type;
        this.date = date;
        this.montant = montant;
        this.description = description;
    }

    public Operation() {
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "\n \t \t \t Operation { " +
              "type = " + type +
              ", date = " + date +
              ", montant = " + montant +
              ", description = '" + description + '\'' +
              '}';
    }
}