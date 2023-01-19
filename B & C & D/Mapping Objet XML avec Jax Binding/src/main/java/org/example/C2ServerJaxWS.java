package org.example;

import org.example.service.ReleveService;

import javax.xml.ws.Endpoint;

public class C2ServerJaxWS {
    public static void main(String[] args) {
        String address = "http://0.0.0.0:8080/";
        Endpoint.publish(address, new ReleveService());
        System.out.println("running on port: 8080");
    }
}
