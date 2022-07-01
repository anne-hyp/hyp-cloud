package cn.hehe.cloud.register;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author hyp
 * @title: registerApplication
 * @projectName hyp-cloud
 * @description: 注册中心启动类
 * @date 2022/6/16 11:26
 */
@EnableEurekaServer
@SpringBootApplication
public class registerApplication {

    public static void main(String[] args){
        SpringApplication.run(registerApplication.class, args);
    }

}
