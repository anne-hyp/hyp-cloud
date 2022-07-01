package cn.hehe.cloud.server.test;

import cn.hehe.cloud.common.annotation.EnableHypAuthExceptionHandler;
import cn.hehe.cloud.common.annotation.EnableHypOauth2FeignClient;
import cn.hehe.cloud.common.annotation.EnableHypServerProtect;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

/**
 * @author hyp
 * @title: testApplication
 * @projectName hyp-cloud
 * @description: 测试项目启动器
 * @date 2022/6/18 9:20
 */
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
@EnableHypServerProtect
@EnableHypOauth2FeignClient
@EnableHypAuthExceptionHandler
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class testApplication {

    public static void main(String[] args){
        SpringApplication.run(testApplication.class, args);
    }

}
