package cn.hehe.cloud.server.test.service.fallback;

import cn.hehe.cloud.server.test.service.ISystemService;
import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author hyp
 * @title: SystemServiceFallback
 * @projectName hyp-cloud
 * @description: system服务回调
 * @date 2022/6/18 9:39
 */
@Slf4j
@Component
public class SystemServiceFallback implements FallbackFactory<ISystemService> {

    @Override
    public ISystemService create(Throwable throwable) {
        return new ISystemService() {
            @Override
            public String hello(String name) {
                log.error("调用hyp-server-system服务出错", throwable);
                return "调用出错";
            }
        };
    }

}
