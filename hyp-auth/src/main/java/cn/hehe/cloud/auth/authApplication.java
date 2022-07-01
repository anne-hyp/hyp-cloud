package cn.hehe.cloud.auth;

import cn.hehe.cloud.common.annotation.EnableHypAuthExceptionHandler;
import cn.hehe.cloud.common.annotation.EnableHypLettuceRedis;
import cn.hehe.cloud.common.annotation.EnableHypServerProtect;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author hyp
 * @title: authApplication
 * @projectName hyp-cloud
 * @description: 认证服务器
 * @date 2022/6/17 16:47
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableHypServerProtect
@EnableHypLettuceRedis
@EnableHypAuthExceptionHandler
@MapperScan("cn.hehe.cloud.auth.mapper")
public class authApplication {

    public static void main(String[] args){
        SpringApplication.run(authApplication.class, args);
    }

}
