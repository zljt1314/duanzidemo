package com.bway.duanzidemo.custom;

/**
 * autor: 李金涛.
 * date:2017/8/30
 */


public interface MyCallBack<T> {

    void onSuccess(T t);
    void onErr(String err);
}
