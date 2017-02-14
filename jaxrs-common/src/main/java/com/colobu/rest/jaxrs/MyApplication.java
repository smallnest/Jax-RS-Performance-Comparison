package com.colobu.rest.jaxrs;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("")
public class MyApplication extends Application {
    @Override
    public Set<Class<?>> getClasses() {
        return Collections.emptySet();
    }

    @Override
    public Set<Object> getSingletons() {
        HashSet<Object> classes = new HashSet<>();
        classes.add(new HelloResource());
        classes.add(new HelloResourceAsync());
        return classes;
    }

}
