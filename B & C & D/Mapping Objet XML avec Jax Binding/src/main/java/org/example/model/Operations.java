package org.example.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import java.util.Date;
import java.util.List;
@XmlAccessorType(XmlAccessType.FIELD)
public class Operations {
    @XmlSchemaType(name = "date")
    @XmlAttribute(required = true)
    private Date dateDebut;
    @XmlSchemaType(name = "date")
    @XmlAttribute(required = true)
    private Date dateFin;
    @XmlElement
    private List<Operation> operationList;

    public Operations(Date dateDebut, Date dateFin, List<Operation> operationList) {
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.operationList = operationList;
    }

    public Operations() {
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public List<Operation> getOperationList() {
        return operationList;
    }

    public void setOperationList(List<Operation> operationList) {
        this.operationList = operationList;
    }

    @Override
    public String toString() {
        return "Operations { " +
              "\n \t \t dateDebut=" + dateDebut + ","+
              "\n \t \t dateFin=" + dateFin +
              "\n \t \t operationList = " + operationList +
              "\n \t }";
    }
}
