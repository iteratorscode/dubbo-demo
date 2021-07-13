package com.iterators.service.consumer.runner;

import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.ReferenceConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.rpc.service.GenericService;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * 客户端泛化调用接口
 *
 * @author zhanghui
 * @date 2021/7/13 4:14 下午
 */
@Component
@Slf4j
public class InvokeGenericServiceRunner implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        ReferenceConfig<GenericService> genericServiceReferenceConfig = new ReferenceConfig<>();
        genericServiceReferenceConfig.setGeneric(Boolean.TRUE);
        genericServiceReferenceConfig.setRegistry(new RegistryConfig("nacos://127.0.0.1:8848"));
        genericServiceReferenceConfig.setInterface("api.generic.IHelloService");

        GenericService genericService = genericServiceReferenceConfig.get();
        String name = "ietartors";
        String message = "你好";
        Object result = genericService.$invoke("sayHelloGeneric", new String[] { "java.lang.String", "java.lang.String" }, new Object[] { name, message });
        log.info("{}",result);
    }
}
