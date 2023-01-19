package org.example;

import org.example.proxy.JAXBException_Exception;
import org.example.proxy.ReleveService;
import org.example.proxy.ReleveServiceService;

public class Main {
    public static void main(String[] args) throws JAXBException_Exception {
        ReleveService stub = new ReleveServiceService().getReleveServicePort();
        System.out.println(stub.getReleve());
    }
}