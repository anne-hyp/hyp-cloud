package cn.hehe.cloud.monitor.admin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author hyp
 * @title: monitorAdminApplication
 * @projectName hyp-cloud
 * @description: admin监控服务启动类
 * @date 2022/6/21 15:34
 */
@EnableAdminServer
@SpringBootApplication
public class monitorAdminApplication {

    public static void main(String[] args){
        SpringApplication.run(monitorAdminApplication.class, args);
    }

}
