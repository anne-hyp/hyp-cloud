package cn.hehe.cloud.common.config;

import cn.hehe.cloud.common.handler.CustomAccessDeniedHandler;
import cn.hehe.cloud.common.handler.CustomAuthExceptionEntryPoint;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;

/**
 * @author hyp
 * @title: AuthExceptionConfigure
 * @projectName hyp-cloud
 * @description: 自定义权限异常处理配置
 * @date 2022/6/17 20:24
 */
public class AuthExceptionConfigure {

    @Bean
    @ConditionalOnMissingBean(name = "accessDeniedHandler")
    public CustomAccessDeniedHandler accessDeniedHandler() {
        return new CustomAccessDeniedHandler();
    }

    @Bean
    @ConditionalOnMissingBean(name = "authenticationEntryPoint")
    public CustomAuthExceptionEntryPoint authenticationEntryPoint() {
        return new CustomAuthExceptionEntryPoint();
    }

}
