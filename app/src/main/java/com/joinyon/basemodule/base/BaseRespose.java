package com.joinyon.basemodule.base;

import java.io.Serializable;

/**
 * 网络响应的基类
 * <p>
 * 需要根据具体的后台返回信息定制
 *
 * @param <T>
 */
public class BaseRespose<T> implements Serializable {
    public String code;
    public String message;

    public T data;

    public boolean success() {
        return "200".equals(code);
    }

    @Override
    public String toString() {
        return "BaseRespose{" +
                "code='" + code + '\'' +
                ", msg='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
