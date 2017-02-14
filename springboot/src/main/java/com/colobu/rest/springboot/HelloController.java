package com.colobu.rest.springboot;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class HelloController {

    @RequestMapping("/rest/hello")
    @ResponseBody
    String hello() {
        return "Hello World";
    }

    @RequestMapping("/rest/helloAsync")
    @ResponseBody
    @Async
    String helloAsync() {
        return "Hello World";
    }
}
