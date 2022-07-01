package cn.hehe.cloud.common.annotation;

import cn.hehe.cloud.common.config.AuthExceptionConfigure;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author hyp
 * @title: EnableHypAuthExceptionHandler
 * @projectName hyp-cloud
 * @description: 开启自定义权限异常处理注解
 * @date 2022/6/17 20:27
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(AuthExceptionConfigure.class)
public @interface EnableHypAuthExceptionHandler {
}
