package cn.hehe.cloud.server.test.service;

import cn.hehe.cloud.common.entity.ServerConstant;
import cn.hehe.cloud.server.test.service.fallback.SystemServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author hyp
 * @title: ISystemService
 * @projectName hyp-cloud
 * @description: system服务远程调用接口
 * @date 2022/6/18 9:37
 */
@FeignClient(value = ServerConstant.HYP_SERVER_SYSTEM, contextId = "systemServiceClient", fallbackFactory = SystemServiceFallback.class)
public interface ISystemService {

    @GetMapping("hello")
    String hello(@RequestParam String name);

}
