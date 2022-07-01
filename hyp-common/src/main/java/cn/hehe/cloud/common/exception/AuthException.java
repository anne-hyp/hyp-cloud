package cn.hehe.cloud.common.exception;

/**
 * @author hyp
 * @title: AuthException
 * @projectName hyp-cloud
 * @description: 自定义异常
 * @date 2022/6/17 17:15
 */
public class AuthException extends Exception{

    private static final long serialVersionUID = -6916154462432027437L;

    public AuthException(String message){
        super(message);
    }
}
