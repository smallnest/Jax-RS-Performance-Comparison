package com.colobu.rest.vertx;


import io.vertx.core.AbstractVerticle;
import io.vertx.core.DeploymentOptions;
import io.vertx.core.Vertx;
import io.vertx.core.http.HttpServerResponse;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.RoutingContext;
import io.vertx.ext.web.handler.BodyHandler;

public class Main  extends AbstractVerticle {
    public static void main(String[] args) {
        Vertx vertx = Vertx.vertx();
        vertx.deployVerticle(Main.class.getName(),new DeploymentOptions().setInstances(20), e -> {
            System.out.println(e.succeeded());
            System.out.println(e.failed());
            System.out.println(e.cause());
            System.out.println(e.result());
        });
        //vertx.deployVerticle(Main.class.getName(),new DeploymentOptions().setInstances(2 * Runtime.getRuntime().availableProcessors()));

    }
    @Override
    public void start() {
        Router router = Router.router(vertx);

        router.route().handler(BodyHandler.create());
        router.get("/rest/hello").handler(Main::handleHello);
        vertx.createHttpServer().requestHandler(router::accept).listen(8080);
    }
    private static void handleHello(RoutingContext routingContext) {
        HttpServerResponse response = routingContext.response();
        response.putHeader("content-type", "application/json").end("Hello world");
    }
}
