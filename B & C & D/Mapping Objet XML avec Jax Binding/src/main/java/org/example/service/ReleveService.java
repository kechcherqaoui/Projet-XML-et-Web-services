package org.example.service;

import org.example.model.Releve;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

@WebService
public class ReleveService {

    @WebMethod
    public Releve getReleve() throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Releve.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

        return (Releve) unmarshaller.unmarshal(new File("releve.xml"));
    }
}
