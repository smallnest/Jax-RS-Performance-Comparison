package com.colobu.rest.jerseyjetty;

import org.eclipse.jetty.server.Server;
import org.glassfish.jersey.jetty.JettyHttpContainerFactory;
import org.glassfish.jersey.server.ResourceConfig;

import com.colobu.rest.jaxrs.MyApplication;

import javax.ws.rs.core.UriBuilder;
import java.net.URI;


public class Main {
    public static final String BASE_URI = "http://localhost:8080";

    public static Server startServer(String host, int port) {
        final ResourceConfig rc = ResourceConfig.forApplicationClass(MyApplication.class);
        URI baseUri = UriBuilder.fromUri(BASE_URI).host(host).port(port).build();
        return JettyHttpContainerFactory.createServer(baseUri, rc);
    }

    public static void main(String[] args) throws Exception {
        String host = "0.0.0.0";
        int port = 8080;
        if (args.length > 0) {
            host = args[0];
        }
        if (args.length > 1) {
            port = Integer.parseInt(args[1]);
        }

        final Server server = startServer(host, port);
        System.in.read();
        server.stop();
    }
}

