
package cn.hehe.cloud.gateway.filter;

import cn.hehe.cloud.common.entity.Response;
import cn.hehe.cloud.common.utils.HypUtil;
import com.netflix.zuul.context.RequestContext;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.cloud.netflix.zuul.filters.post.SendErrorFilter;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.util.ReflectionUtils;

import javax.servlet.http.HttpServletResponse;

/**
 * @author hyp
 * @title: GatewayErrorFilter
 * @projectName hyp-cloud
 * @description: 网关异常过滤器
 * @date 2022/6/17 20:37
 */
@Slf4j
@Component
public class GatewayErrorFilter extends SendErrorFilter {

    @Override
    public Object run() {
        try {
            Response customResponse = new Response();
            RequestContext ctx = RequestContext.getCurrentContext();
            String serviceId = (String) ctx.get(FilterConstants.SERVICE_ID_KEY);

            ExceptionHolder exception = findZuulException(ctx.getThrowable());
            String errorCause = exception.getErrorCause();
            Throwable throwable = exception.getThrowable();
            String message = throwable.getMessage();
            message = StringUtils.isBlank(message) ? errorCause : message;
            customResponse = resolveExceptionMessage(message, serviceId, customResponse);

            HttpServletResponse response = ctx.getResponse();
            HypUtil.makeResponse(
                    response, MediaType.APPLICATION_JSON_UTF8_VALUE,
                    HttpServletResponse.SC_INTERNAL_SERVER_ERROR, customResponse
            );
            log.error("Zull sendError：{}", customResponse.getMessage());
        } catch (Exception ex) {
            log.error("Zuul sendError", ex);
            ReflectionUtils.rethrowRuntimeException(ex);
        }
        return null;
    }

    private Response resolveExceptionMessage(String message, String serviceId, Response customResponse) {
        if (StringUtils.containsIgnoreCase(message, "time out")) {
            return customResponse.message("请求" + serviceId + "服务超时");
        }
        if (StringUtils.containsIgnoreCase(message, "forwarding error")) {
            return customResponse.message(serviceId + "服务不可用");
        }
        return customResponse.message("Zuul请求" + serviceId + "服务异常");
    }
}