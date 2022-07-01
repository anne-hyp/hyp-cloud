package cn.hehe.cloud.auth.handler;

import cn.hehe.cloud.common.handler.BaseExceptionHandler;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author hyp
 * @title: GlobalExceptionHandler
 * @projectName hyp-cloud
 * @description: 全局异常处理
 * @date 2022/6/17 20:46
 */
@RestControllerAdvice
@Order(value = Ordered.HIGHEST_PRECEDENCE)
public class GlobalExceptionHandler extends BaseExceptionHandler {
}
