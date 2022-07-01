package cn.hehe.cloud.common.annotation;

import cn.hehe.cloud.common.config.OAuth2FeignConfigure;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author hyp
 * @title: EnableHypOauth2FeignClient
 * @projectName hyp-cloud
 * @description: Feign自动化配置
 * @date 2022/6/18 9:48
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(OAuth2FeignConfigure.class)
public @interface EnableHypOauth2FeignClient {
}
