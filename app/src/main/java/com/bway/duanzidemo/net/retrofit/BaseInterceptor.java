package com.bway.duanzidemo.net.retrofit;

import java.io.IOException;
import java.util.Map;
import java.util.Set;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;


/**
 * @类用途:
 * @author: likaihu
 * @date: 2017/8/30  9:23
 */
public class BaseInterceptor implements Interceptor {

    private Map<String, String> mHeaders;

    public BaseInterceptor(Map<String, String> mHeaders) {
        this.mHeaders = mHeaders;
    }


    /**
     * 重写拦截器的方法追加请求头
     */
    @Override
    public Response intercept(Chain chain) throws IOException {


        Request.Builder builder = chain.request().newBuilder();


        if (mHeaders != null && mHeaders.size() > 0) {

            Set<String> key = mHeaders.keySet();
            for (String headerKeys : key) {

                builder.addHeader(headerKeys, mHeaders.get(headerKeys)).build();
            }
        }

        return chain.proceed(builder.build());
    }
}
