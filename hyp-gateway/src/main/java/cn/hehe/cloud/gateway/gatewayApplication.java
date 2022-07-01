package cn.hehe.cloud.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author hyp
 * @title: gatewayApplication
 * @projectName hyp-cloud
 * @description: 网关启动类
 * @date 2022/6/17 17:46
 */
@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
public class gatewayApplication {

    public static void main(String[] args){
        SpringApplication.run(gatewayApplication.class, args);
    }

}
