package com.Srvnn.RandomQuotesGenerator.service;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class CallAPIUsingJava {

    public static void main(String[] args) throws Exception {

        String url = "https://jsonplaceholder.typicode.com/posts/1/comments";

        HttpRequest getRequest = HttpRequest.newBuilder()
                .uri(new URI(url))
                .build();

        HttpClient httpClient = HttpClient.newHttpClient();

        HttpResponse<String> getResponse = httpClient.send(getRequest, HttpResponse.BodyHandlers.ofString());

        System.out.println(getResponse.body());
    }
}
