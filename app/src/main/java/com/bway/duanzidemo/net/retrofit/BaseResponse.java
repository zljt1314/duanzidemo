package com.bway.duanzidemo.net.retrofit;


/**
 * @类用途:
 * @author: likaihu
 * @date: 2017/8/30  9:23
 */
public class BaseResponse<T> {


    private int code;
    private String msg;
    private int total;
    private String token;
    private T data;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
