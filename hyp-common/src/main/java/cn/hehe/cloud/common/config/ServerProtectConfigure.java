package cn.hehe.cloud.common.config;

import cn.hehe.cloud.common.interceptior.ServerProtectInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author hyp
 * @title: ServerProtectConfigure
 * @projectName hyp-cloud
 * @description: 微服务保护配置
 * @date 2022/6/18 10:01
 */
public class ServerProtectConfigure implements WebMvcConfigurer {

    @Bean
    public HandlerInterceptor ServerProtectInterceptor() {
        return new ServerProtectInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(ServerProtectInterceptor());
    }

}
