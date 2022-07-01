package cn.hehe.cloud.common.handler;

import cn.hehe.cloud.common.entity.Response;
import cn.hehe.cloud.common.utils.HypUtil;
import org.springframework.http.MediaType;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author hyp
 * @title: CustomAuthExceptionEntryPoint
 * @projectName hyp-cloud
 * @description: 自定义403异常处理
 * @date 2022/6/17 20:18
 */

public class CustomAuthExceptionEntryPoint implements AuthenticationEntryPoint {

    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response,
                         AuthenticationException authException) throws IOException {
        Response customResponse = new Response();
        HypUtil.makeResponse(
                response, MediaType.APPLICATION_JSON_UTF8_VALUE,
                HttpServletResponse.SC_UNAUTHORIZED, customResponse.message("token无效")
        );
    }

}
