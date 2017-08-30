package com.bway.duanzidemo.net.retrofit;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.google.gson.Gson;

import java.io.IOException;

import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import okhttp3.ResponseBody;

/**
 * @类用途:
 * @author: likaihu
 * @date: 2017/8/30  9:23
 */

public abstract class BaseObserBean2<T> implements Observer<ResponseBody> {

    public BaseObserBean2(Context context, Class t) {
        this.context = context;
        this.mTClass = t;
    }

    public BaseObserBean2(Context context) {
        this.context = context;
    }

    private Class mTClass;
    private Context context;

    @Override
    public void onComplete() {

    }

    @Override
    public void onError(Throwable e) {
        Log.d("这老小子onError死出来了：", e.toString());
         Toast.makeText(context, "网络异常", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onSubscribe(@NonNull Disposable d) {

    }

    @Override
    public void onNext(@NonNull ResponseBody body) {
        try {
            String string = body.string();
            if (mTClass == null) {
                Next((T) string);
            } else {
                T data = (T) new Gson().fromJson(string, mTClass);
                Next(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public abstract void Next(T data);
}
