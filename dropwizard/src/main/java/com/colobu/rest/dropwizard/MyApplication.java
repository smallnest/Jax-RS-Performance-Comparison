package com.colobu.rest.dropwizard;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class MyApplication extends Application<MyConfiguration> {

    @Override
    public String getName() {
        return "rest";
    }

    @Override
    public void initialize(Bootstrap<MyConfiguration> bootstrap) {
        // nothing to do yet
    }

    @Override
    public void run(MyConfiguration myConfiguration, Environment environment) throws Exception {
        environment.healthChecks().register("healthcheck", new MyHealthCheck());
        environment.jersey().packages("com.colobu.rest.dropwizard");
    }
}
