package com.lanou;


import com.lanou.service.IHelloService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class ConsumerApplication {


    @Reference
    private IHelloService helloService;

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }

    @PostConstruct
    public void invokeService() {
        String result = helloService.hello();
        System.out.println("远程服务hello()调用结果: " + result);

        result = helloService.hello("John");
        System.out.println("远程服务hello(name)调用结果: " + result);
    }

}
