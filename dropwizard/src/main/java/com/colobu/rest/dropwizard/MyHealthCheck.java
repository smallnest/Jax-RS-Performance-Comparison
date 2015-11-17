package com.colobu.rest.dropwizard;

import com.codahale.metrics.health.HealthCheck;

public class MyHealthCheck extends HealthCheck {
    @Override
    protected Result check() throws Exception {
        //Result.unhealthy
        return Result.healthy();
    }
}