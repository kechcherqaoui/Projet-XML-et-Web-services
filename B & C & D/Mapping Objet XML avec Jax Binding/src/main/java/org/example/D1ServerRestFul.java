package org.example;

import com.google.gson.Gson;
import org.example.model.Releve;
import spark.Spark;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class D1ServerRestFul {
    public static void main(String[] args) throws JAXBException {
        int port = 8080;

        JAXBContext jaxbContext = JAXBContext.newInstance(Releve.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

        Releve releve = (Releve) unmarshaller.unmarshal(new File("releve.xml"));
        Spark.port(port);
        Spark.defaultResponseTransformer(new Gson()::toJson);


        Spark.get("/releve", (req, res) -> {
            res.type("application/json");
            return releve;
        });

        System.out.println("RestFul server running on port " + port);
    }
}
