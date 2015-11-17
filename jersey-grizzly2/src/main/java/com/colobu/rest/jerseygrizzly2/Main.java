package com.colobu.rest.jerseygrizzly2;

import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.core.UriBuilder;
import java.io.IOException;
import java.net.URI;


public class Main {
    public static final String BASE_URI = "http://localhost:8080/rest/";

    public static HttpServer startServer(String host, int port) {
        final ResourceConfig rc = new ResourceConfig().packages("com.colobu.rest.jerseygrizzly2");
        URI baseUri = UriBuilder.fromUri(BASE_URI).host(host).port(port).build();
        return GrizzlyHttpServerFactory.createHttpServer(baseUri, rc);
    }

    public static void main(String[] args) throws IOException {
        String host = "0.0.0.0";
        int port = 8080;
        if (args.length > 0) {
            host = args[0];
        }
        if (args.length > 1) {
            port = Integer.parseInt(args[1]);
        }

        final HttpServer server = startServer(host,port);
        System.in.read();
        server.stop();
    }
}

