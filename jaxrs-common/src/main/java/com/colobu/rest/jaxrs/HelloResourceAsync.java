package com.colobu.rest.jaxrs;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.container.AsyncResponse;
import javax.ws.rs.container.Suspended;
import javax.ws.rs.core.MediaType;

@Path("/rest/helloAsync")
public class HelloResourceAsync {
    private ExecutorService executor = Executors
            .newFixedThreadPool(Integer.getInteger("com.colobu.rest.jaxrs.concurrency", 16));

    public HelloResourceAsync() {
        System.out.println("HelloResourceAsync()");
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public void helloAsync(@Suspended final AsyncResponse response) {
        executor.execute(() -> {
            response.resume("Hello world");
        });
    }

}
