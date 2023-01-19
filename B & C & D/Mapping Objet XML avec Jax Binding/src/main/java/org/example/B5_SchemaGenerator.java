package org.example;

import org.example.model.Releve;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.SchemaOutputResolver;
import javax.xml.transform.Result;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;

public class B5_SchemaGenerator {
    public static void main(String[] args) throws JAXBException, IOException {
        JAXBContext jaxbContext= JAXBContext.newInstance(Releve.class);
        jaxbContext.generateSchema(new SchemaOutputResolver() {
            @Override
            public Result createOutput(String s, String s1){
                File file = new File("releve.xsd");
                StreamResult result = new StreamResult(file);
                result.setSystemId(file.getName());
                return result;
            }
        });
    }
}