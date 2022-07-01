package cn.hehe.cloud.common.annotation;

import cn.hehe.cloud.common.config.ServerProtectConfigure;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author hyp
 * @title: EnableHypServerProtect
 * @projectName hyp-cloud
 * @description: 微服务保护注解
 * @date 2022/6/18 10:03
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(ServerProtectConfigure.class)
public @interface EnableHypServerProtect {
}
