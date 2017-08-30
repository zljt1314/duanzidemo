package com.bway.duanzidemo.net.retrofit;


/**
 * @类用途:
 * @author: likaihu
 * @date: 2017/8/30  9:23
 */
public interface BaseSuccess<T> {


    void Sueccess(T t);
    void Error(String str);
}
