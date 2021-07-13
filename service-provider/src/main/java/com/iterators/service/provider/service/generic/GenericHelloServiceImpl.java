package com.iterators.service.provider.service.generic;

import api.generic.IHelloService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * 泛化调用实现
 *
 * @author iterators
 * @date 2021/7/13 下午4:10
 */
@DubboService(
    interfaceClass = IHelloService.class
)
public class GenericHelloServiceImpl implements IHelloService {

    @Override
    public String sayHelloGeneric(String name, String message) {
        return String.format("[Generic] %s: %s", name, message);
    }
}
