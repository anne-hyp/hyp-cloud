package cn.hehe.cloud.common.interceptior;

import cn.hehe.cloud.common.entity.Constant;
import cn.hehe.cloud.common.entity.Response;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.StringUtils;
import org.springframework.http.MediaType;
import org.springframework.util.Base64Utils;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author hyp
 * @title: ServerProtectInterceptor
 * @projectName hyp-cloud
 * @description: 微服务保护拦截器
 * @date 2022/6/18 9:58
 */
public class ServerProtectInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws IOException {
        // 从请求头中获取 Zuul Token
        String token = request.getHeader(Constant.ZUUL_TOKEN_HEADER);
        String zuulToken = new String(Base64Utils.encode(Constant.ZUUL_TOKEN_VALUE.getBytes()));
        // 校验 Zuul Token的正确性
        if (StringUtils.equals(zuulToken, token)) {
            return true;
        } else {
            Response customResponse = new Response();
            response.setContentType(MediaType.APPLICATION_JSON_UTF8_VALUE);
            response.setStatus(HttpServletResponse.SC_FORBIDDEN);
            response.getWriter().write(JSONObject.toJSONString(customResponse.message("请通过网关获取资源")));
            return false;
        }
    }

}
