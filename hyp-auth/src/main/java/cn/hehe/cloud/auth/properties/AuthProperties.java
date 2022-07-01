package cn.hehe.cloud.auth.properties;

import lombok.Data;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;

/**
 * @author hyp
 * @title: AuthProperties
 * @projectName hyp-cloud
 * @description: 认证服务器配置实体类
 * @date 2022/6/17 19:45
 */
@Data
@SpringBootConfiguration
@PropertySource(value = {"classpath:auth.properties"})
@ConfigurationProperties(prefix = "hyp.auth")
public class AuthProperties {

    private ClientsProperties[] clients = {};
    private int accessTokenValiditySeconds = 60 * 60 * 24;
    private int refreshTokenValiditySeconds = 60 * 60 * 24 * 7;
    // 免认证路径
    private String anonUrl;

    //验证码配置类
    private ValidateCodeProperties code = new ValidateCodeProperties();

}
