package com.bway.duanzidemo.net.retrofit;

import android.util.Log;

import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;


/**
 * @类用途:
 * @author: likaihu
 * @date: 2017/8/30  9:23
 */
public class BaseObserver<T> implements Observer<T> {

    public BaseObserver(BaseSuccess success) {
        mSuccess = success;
    }

    private BaseSuccess mSuccess;
    @Override
    public void onSubscribe(@NonNull Disposable d) {

    }

    @Override
    public void onNext(@NonNull T o) {
        mSuccess.Sueccess(o);
    }

    @Override
    public void onError(@NonNull Throwable e) {
        mSuccess.Error(e.toString());
        Log.e("这老小子onError死出来了：",e.toString());
    }

    @Override
    public void onComplete() {

    }
}
