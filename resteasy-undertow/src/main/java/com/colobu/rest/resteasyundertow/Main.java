package com.colobu.rest.resteasyundertow;


import io.undertow.Undertow;
import org.jboss.resteasy.plugins.server.undertow.UndertowJaxrsServer;

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

        Undertow.Builder builder = Undertow.builder().addListener(port, host);
        server = new UndertowJaxrsServer().start(builder);
        server.deploy(MyApplication.class, "/rest");

//        DeploymentInfo di = server.undertowDeployment(MyApplication.class);
//        di.setContextPath("/rest");
//        di.setDeploymentName("rest");
//        server.deploy(di);

    }
}
