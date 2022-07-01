package cn.hehe.cloud.server.system.properties;

import lombok.Data;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;

/**
 * @author hyp
 * @title: ServerSystemProperties
 * @projectName hyp-cloud
 * @description: 系统服务配置类
 * @date 2022/6/20 15:45
 */
@Data
@SpringBootConfiguration
@PropertySource(value = {"classpath:hyp-server-system.properties"})
@ConfigurationProperties(prefix = "hyp.server.system")
public class ServerSystemProperties {

    private SwaggerProperties swagger = new SwaggerProperties();

    /**
     * 免认证 URI，多个值的话以逗号分隔
     */
    private String anonUrl;
}