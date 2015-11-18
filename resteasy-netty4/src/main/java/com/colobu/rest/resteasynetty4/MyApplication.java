package com.colobu.rest.resteasynetty4;


import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

public class MyApplication extends Application {
    @Override
    public Set<Class<?>> getClasses() {
        HashSet<Class<?>> classes = new HashSet<Class<?>>();
        classes.add(HelloResource.class);
        return classes;
    }
}
