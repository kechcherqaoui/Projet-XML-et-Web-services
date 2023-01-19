package org.example;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet request = new HttpGet("http://localhost:8080/releve");
        request.addHeader("content-type", "application/json");

        CloseableHttpResponse response = httpClient.execute(request);

        System.out.println("Releve " + EntityUtils.toString(response.getEntity()));

        response.close();
        httpClient.close();
    }
}