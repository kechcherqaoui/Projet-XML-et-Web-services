package org.example;

import org.example.model.Releve;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class B4_Deserialization {
    public static void main(String[] args) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Releve.class);

        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

        // Deserialize the XML file
        Releve releve = (Releve) unmarshaller.unmarshal(new File("releve.xml"));

        System.out.println(releve);
    }
}
