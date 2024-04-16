package com.bogdan.alura.modelos;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HTTPPeticion {
    HttpClient client;
    HttpRequest request;
    HttpResponse<String> response;

    public HTTPPeticion(String direccion) throws IOException, InterruptedException {
        this.client = HttpClient.newHttpClient();
        this.request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();

         this.response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
    }

    public HttpClient getClient() {
        return client;
    }

    public HttpRequest getRequest() {
        return request;
    }

    public HttpResponse<String> getResponse() {
        return response;
    }
}
