package com.iterators.service.consumer.controller;

import api.hello.IHelloService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello
 *
 * @author zhanghui
 * @date 2021/3/6 下午10:44
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @DubboReference(interfaceClass = IHelloService.class, version = "1.0.0")
    private IHelloService helloService;

    @GetMapping(value = "/{name}")
    public String hello(@PathVariable String name) {
        return helloService.sayHello(name);
    }
}
