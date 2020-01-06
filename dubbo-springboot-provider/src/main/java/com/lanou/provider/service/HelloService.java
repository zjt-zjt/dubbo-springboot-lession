package com.lanou.provider.service;


import com.lanou.service.IHelloService;
import org.apache.dubbo.config.annotation.Service;

@Service
public class HelloService implements IHelloService {
    @Override
    public String hello() {
        String msg = "Hello Dubbo";
        System.out.println(msg);
        return msg;
    }

    @Override
    public String hello(String name) {
        String msg = "Hello, " + name;
        System.out.println(msg);
        return msg;
    }
}
