package com.avary.baselibrary.rx

import android.util.Log
import com.avary.baselibrary.common.BaseException
import com.avary.baselibrary.data.protocol.BaseResp
import com.avary.baselibrary.presenter.view.BaseView
import io.reactivex.Observer
import io.reactivex.disposables.Disposable


/**
 * Created by G1596570 on 2019/1/7.
 *
 *
 */
open class BaseObserver<T>(val baseView:BaseView): Observer<T> {
    private lateinit var  disposable: Disposable
    override fun onComplete() {
        baseView.hideLoading()
    }

    override fun onSubscribe(d: Disposable) {
        disposable = d
    }

    override fun onNext(t: T) {
        if (t == null){
            disposable.dispose()
        }
    }

    override fun onError(e: Throwable) {
        baseView.hideLoading()
        if (e is BaseException){
            baseView.onError(e.msg)
        } else {
            Log.e("BaseObserver", e.localizedMessage.toString())
        }
    }
}