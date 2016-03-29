package com.colobu.rest.vertx;


import io.vertx.core.Vertx;
import io.vertx.core.VertxOptions;
import io.vertx.core.http.HttpServerResponse;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.RoutingContext;
import io.vertx.ext.web.handler.BodyHandler;

public class Main {
    public static void main(String[] args) {
        VertxOptions options = new VertxOptions();
        Vertx vertx = Vertx.vertx(options);
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
