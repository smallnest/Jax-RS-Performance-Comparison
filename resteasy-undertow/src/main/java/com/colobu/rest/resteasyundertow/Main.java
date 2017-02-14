package com.colobu.rest.resteasyundertow;


import org.jboss.resteasy.plugins.server.undertow.UndertowJaxrsServer;

import com.colobu.rest.jaxrs.MyApplication;

import io.undertow.Undertow;

public class Main {
    private static UndertowJaxrsServer server;

    public static void main(String[] args) throws Exception {
        String host = "0.0.0.0";
        int port = 8080;
        if (args.length > 0) {
            host = args[0];
        }
        if (args.length > 1) {
            port = Integer.parseInt(args[1]);
        }

        Undertow.Builder builder = Undertow.builder().addHttpListener(port, host);
        server = new UndertowJaxrsServer().start(builder);
        server.deploy(MyApplication.class, "/");

//        DeploymentInfo di = server.undertowDeployment(MyApplication.class);
//        di.setContextPath("/rest");
//        di.setDeploymentName("rest");
//        server.deploy(di);

    }
}
