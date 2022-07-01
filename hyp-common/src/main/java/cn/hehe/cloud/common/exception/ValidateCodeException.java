package cn.hehe.cloud.common.exception;

/**
 * @author hyp
 * @title: ValidateCodeException
 * @projectName hyp-cloud
 * @description: 验证码异常
 * @date 2022/6/18 15:22
 */
public class ValidateCodeException extends Exception{

    private static final long serialVersionUID = 7514854456967620043L;

    public ValidateCodeException(String message){
        super(message);
    }
}
