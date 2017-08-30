package com.bway.duanzidemo.net.retrofit;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;


/**
 * @类用途:
 * @author: likaihu
 * @date: 2017/8/30  9:23
 */

public abstract class BaseObserBean<T> implements Observer<T> {

    public BaseObserBean(Context context) {
        this.context = context;
    }

    private Context context;

    @Override
    public void onComplete() {

    }

    @Override
    public void onError(Throwable e) {
        Log.d("这老小子onError死出来了：",e.toString());
        Toast.makeText(context,"网络异常",Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onSubscribe(@NonNull Disposable d) {

    }
}
