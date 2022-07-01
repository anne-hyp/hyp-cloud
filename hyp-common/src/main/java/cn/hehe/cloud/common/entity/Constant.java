package cn.hehe.cloud.common.entity;

/**
 * @author hyp
 * @title: Constant
 * @projectName hyp-cloud
 * @description: 常量配置
 * @date 2022/6/18 9:54
 */
public class Constant {

    /**
     * Zuul请求头TOKEN名称（不要有空格）
     */
    public static final String ZUUL_TOKEN_HEADER = "ZuulToken";
    /**
     * Zuul请求头TOKEN值
     */
    public static final String ZUUL_TOKEN_VALUE = "hyp:zuul:123456";

    /**
     * gif类型
     */
    public static final String GIF = "gif";
    /**
     * png类型
     */
    public static final String PNG = "png";

    /**
     * 验证码 key前缀
     */
    public static final String CODE_PREFIX = "hyp.captcha.";

}
