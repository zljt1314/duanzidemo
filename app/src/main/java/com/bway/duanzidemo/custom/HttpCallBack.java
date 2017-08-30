package com.bway.duanzidemo.custom;

import java.util.Map;

/**
 * autor: 李金涛.
 * date:2017/8/30
 */


public interface HttpCallBack {

    void get(String url, Map<String,Object> map,MyCallBack callBack);
    void post(String url, Map<String,Object> map,MyCallBack callBack);

}
