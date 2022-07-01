package cn.hehe.cloud.common.entity;

import java.util.HashMap;

/**
 * @author hyp
 * @title: Response
 * @projectName hyp-cloud
 * @description: 公共返回类
 * @date 2022/6/17 17:13
 */
public class Response extends HashMap<String, Object> {

    private static final long serialVersionUID = -8713837118340960775L;

    public Response message(String message) {
        this.put("message", message);
        return this;
    }

    public Response data(Object data) {
        this.put("data", data);
        return this;
    }

    @Override
    public Response put(String key, Object value) {
        super.put(key, value);
        return this;
    }

    public String getMessage() {
        return String.valueOf(get("message"));
    }

    public Object getData() {
        return get("data");
    }
}