package cn.hehe.cloud.server.system;

import cn.hehe.cloud.common.annotation.EnableHypServerProtect;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author hyp
 * @title: systemApplication
 * @projectName hyp-cloud
 * @description: 系统服务启动器
 * @date 2022/6/17 18:43
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
@EnableHypServerProtect
@EnableTransactionManagement
@EnableGlobalMethodSecurity(prePostEnabled = true)
@MapperScan("cn.hehe.cloud.server.system.mapper")
public class systemApplication {

    public static void main(String[] args){
        SpringApplication.run(systemApplication.class, args);
    }

}
