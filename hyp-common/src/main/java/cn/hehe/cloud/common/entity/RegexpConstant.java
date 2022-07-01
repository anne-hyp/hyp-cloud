package cn.hehe.cloud.common.entity;

/**
 * @author hyp
 * @title: RegexpConstant
 * @projectName hyp-cloud
 * @description: 正则表达式常量
 * @date 2022/6/20 11:44
 */
public class RegexpConstant {

    // 简单手机号正则（这里只是简单校验是否为 11位，实际规则更复杂）
    public static final String MOBILE_REG = "[1]\\d{10}";
}
