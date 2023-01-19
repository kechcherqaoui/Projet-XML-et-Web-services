package org.example;

import org.example.model.Operation;
import org.example.model.Operations;
import org.example.model.Releve;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;

public class B3_Serialization {
    public static void main(String[] args) throws ParseException, JAXBException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        //List of Operation
        List<Operation> operationList = Arrays.asList(
              new Operation(Operation.Type.CREDIT, dateFormat.parse("2021-01-01"), 9000, "Vers Espèce"),
              new Operation(Operation.Type.DEBIT, dateFormat.parse("2021-01-11"), 3400, "Chèque Guichet"),
              new Operation(Operation.Type.DEBIT, dateFormat.parse("2021-01-15"), 120, "Prélèvement Assurence"),
              new Operation(Operation.Type.CREDIT, dateFormat.parse("2021-01-25"), 70000, "Virement ..")
        );

        //new Operations
        Operations operations = new Operations();
        operations.setDateDebut(dateFormat.parse("2021-01-01"));
        operations.setDateFin(dateFormat.parse("2021-01-30"));
        operations.setOperationList(operationList);

        //New Releve
        Releve releve = new Releve();
        releve.setRIB("011112222333344445555666");
        releve.setDateReleve(dateFormat.parse("2021-11-10"));
        releve.setSolde(14500);
        releve.setOperations(operations);

        //Prepare object for serialization
        JAXBContext jaxbContext = JAXBContext.newInstance(Releve.class);

        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        // Serialize the Releve to XML file
        marshaller.marshal(releve, new File("releve.xml"));
    }
}