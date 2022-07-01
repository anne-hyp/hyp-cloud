package cn.hehe.cloud.common.handler;

import cn.hehe.cloud.common.entity.Response;
import cn.hehe.cloud.common.utils.HypUtil;
import org.springframework.http.MediaType;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author hyp
 * @title: CustomAccessDeniedHandler
 * @projectName hyp-cloud
 * @description: 自定义403异常处理
 * @date 2022/6/17 20:25
 */
public class CustomAccessDeniedHandler  implements AccessDeniedHandler {

    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response, AccessDeniedException accessDeniedException) throws IOException {
        Response customResponse = new Response();
        HypUtil.makeResponse(
                response, MediaType.APPLICATION_JSON_UTF8_VALUE,
                HttpServletResponse.SC_FORBIDDEN, customResponse.message("没有权限访问该资源"));
    }
}