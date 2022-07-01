package cn.hehe.cloud.auth.properties;

import lombok.Data;



/**
 * @author hyp
 * @title: ClientsProperties
 * @projectName hyp-cloud
 * @description: 认证服务器客户端实体类
 * @date 2022/6/17 19:44
 */
@Data
public class ClientsProperties {

    private String client;
    private String secret;
    private String grantType = "password,authorization_code,refresh_token";
    private String scope = "all";

}
