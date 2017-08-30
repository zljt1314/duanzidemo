package com.bway.duanzidemo.net.retrofit;

import android.content.Context;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;


/**
 * @类用途:
 * @author: likaihu
 * @date: 2017/8/30  9:23
 */
public class RetrofitClientUtils {

    private static final int DEFAULT_TIMEOUT = 5;
    private BaseApiService apiService;
    private Retrofit mRetrofit;
    private static Context mContext;
    private OkHttpClient okHttpClient;
    private static RetrofitClientUtils sNewInstance;

    /**
     * 创建单利模式
     * 有请求头回调的方法
     */
    public static RetrofitClientUtils getInstance(Context context, String url, Map<String, String> headers) {
        if (context != null) {
            mContext = context;
        }
        return new RetrofitClientUtils(context,url,headers);
    }
    /**
     * 创建单利模式
     * 没有添加请求头回调的方法
     */

    public static RetrofitClientUtils getInstance(Context context, String url) {

        if (context != null) {
            mContext = context;
        }
        return new RetrofitClientUtils(context, url);
    }


    public static RetrofitClientUtils getInstance(Context context) {

        if (context != null) {
            mContext = context;
        }
        return new RetrofitClientUtils(context);
    }


    private RetrofitClientUtils(Context context, String url) {
        this(context, url, null);
    }

    private RetrofitClientUtils(Context context) {
        this(context, null, null);
    }


    /**
     * create BaseApi  defalte ApiManager
     *
     * @return ApiManager
     */
    public RetrofitClientUtils createBaseApi() {
        apiService = create(BaseApiService.class);
        return this;
    }

    public <T> T create(final Class<T> service) {
        if (service == null) {
            throw new RuntimeException("Api service is null!");
        }
        return mRetrofit.create(service);
    }

    /**
     * 创建构造器添加拦截器
     *
     * @param context
     * @param uri
     * @param headers
     */
    private RetrofitClientUtils(Context context, String uri, Map<String, String> headers) {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor()
                .setLevel(HttpLoggingInterceptor.Level.HEADERS);
        okHttpClient = new OkHttpClient.Builder()

                .addNetworkInterceptor(interceptor).addInterceptor(new BaseInterceptor(headers))
                .connectTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS)
                .writeTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS).build();

        /**
         * Retrofit添加OKHTTP
         * 支持解析对象
         * 支持RXJAVA
         */
        mRetrofit = new Retrofit.Builder()
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .baseUrl(uri)
                .build();
    }


    /**
     * Get请求
     *
     * @param uri
     * @param map
     * @param o
     */
    public void get(String uri, Map<String, String> map, Observer o) {
        apiService.executeGet(uri, map)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(o);
    }

    public void get(String uri, Observer o) {
        apiService.getdata(uri)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(o);

    }

    public void post(String uri, Observer o) {
        apiService.postdata(uri)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(o);

    }


    /**
     * Post请
     *
     * @param uri
     * @param map
     * @param o
     */
    public void post(String uri, Map<String, String> map, Observer o) {
        apiService.executePost(uri, map)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(o);
    }

    /**
     * 返回ResponseBody
     *
     * @param uri
     * @param map
     * @param o
     */
    public void post2(String uri, Map<String, String> map, Observer o) {
        apiService.executePost2(uri, map)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(o);
    }

    /**
     * @param observable
     * @param o
     * @param <T>
     * @return
     */
    public static <T> T execute(Observable<T> observable, Observer o) {
        observable.subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(o);

        return null;
    }

}
