package cn.hehe.cloud.common.annotation;

import cn.hehe.cloud.common.config.LettuceRedisConfigure;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author hyp
 * @title: EnableHypLettuceRedis
 * @projectName hyp-cloud
 * @description: Redis配置启动注解
 * @date 2022/6/18 11:28
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(LettuceRedisConfigure.class)
public @interface EnableHypLettuceRedis {
}
