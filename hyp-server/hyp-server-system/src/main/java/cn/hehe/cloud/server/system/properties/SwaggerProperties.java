package cn.hehe.cloud.server.system.properties;

import lombok.Data;

/**
 * @author hyp
 * @title: SwaggerProperties
 * @projectName hyp-cloud
 * @description: Swagger属性文件
 * @date 2022/6/20 15:44
 */
@Data
public class SwaggerProperties {

    private String basePackage;
    private String title;
    private String description;
    private String version;
    private String author;
    private String url;
    private String email;
    private String license;
    private String licenseUrl;

    private String grantUrl;
    private String name;
    private String scope;

}
