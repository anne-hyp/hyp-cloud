package cn.hehe.cloud.gateway.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author hyp
 * @title: GatewaySecurityConfigure
 * @projectName hyp-cloud
 * @description: 网关安全配置
 * @date 2022/6/17 17:52
 */
@EnableWebSecurity
public class GatewaySecurityConfigure extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //关闭csrf功能
        http.csrf().disable();
    }
}
