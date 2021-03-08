package com.iterators.service.provider.service.v2;

import api.hello.IHelloService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * helloService Impl
 *
 * @author zhanghui
 * @date 2021/3/6 下午3:07
 */
@DubboService(
    interfaceClass = IHelloService.class,
    version = "2.0.0"
)
public class HelloService implements IHelloService {
    @Override
    public String sayHello(String name) {
        return String.format("Hello, %s", name);
    }
}
