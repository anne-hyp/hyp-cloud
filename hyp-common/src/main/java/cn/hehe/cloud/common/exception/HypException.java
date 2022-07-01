package cn.hehe.cloud.common.exception;

/**
 * @author hyp
 * @title: HypException
 * @projectName hyp-cloud
 * @description: 通用业务异常
 * @date 2022/6/18 17:47
 */
public class HypException extends Exception{

    private static final long serialVersionUID = -6916154462432027437L;

    public HypException(String message){
        super(message);
    }
}
