package com.colobu.rest.resteasynetty4;


import org.jboss.resteasy.plugins.server.netty.NettyJaxrsServer;
import org.jboss.resteasy.spi.ResteasyDeployment;

import com.colobu.rest.jaxrs.MyApplication;

public class Main {
    public static void main(String[] args) throws Exception {
        String host = "0.0.0.0";
        int port = 8080;
        if (args.length > 0) {
            host = args[0];
        }
        if (args.length > 1) {
            port = Integer.parseInt(args[1]);
        }


        NettyJaxrsServer netty = new NettyJaxrsServer();
        ResteasyDeployment deployment = new ResteasyDeployment();
        deployment.setApplication(new MyApplication());
        netty.setDeployment(deployment);
        netty.setHostname(host);
        netty.setPort(port);
        netty.setRootResourcePath("/");
        netty.setSecurityDomain(null);
        netty.start();
    }
}
