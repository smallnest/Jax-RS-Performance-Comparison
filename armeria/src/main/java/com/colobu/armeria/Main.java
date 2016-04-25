package com.colobu.armeria;

import com.colobu.armeria.service.thrift.v1.HelloService;
import com.linecorp.armeria.common.SerializationFormat;
import com.linecorp.armeria.common.SessionProtocol;
import com.linecorp.armeria.server.Server;
import com.linecorp.armeria.server.ServerBuilder;
import com.linecorp.armeria.server.docs.DocService;
import com.linecorp.armeria.server.thrift.ThriftService;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;

public class Main {
    public static void main(String[] args) {
        HelloService.AsyncIface helloHandler = new HelloService.AsyncIface(){
            @Override
            public void hello(AsyncMethodCallback resultHandler) throws TException {
                resultHandler.onComplete("Hello world");
            }
        };

        ServerBuilder sb = new ServerBuilder();
        sb.port(8080, SessionProtocol.HTTP);
        sb.serviceAt("/hello", ThriftService.of(helloHandler, SerializationFormat.THRIFT_BINARY))
                .serviceUnder("/docs/", new DocService());

        Server server= sb.build();
        server.start();
    }
}
