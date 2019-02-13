package com.avary.baselibrary.ext

import android.view.View
import com.avary.baselibrary.data.protocol.BaseResp
import com.avary.baselibrary.rx.BaseFun
import com.avary.baselibrary.rx.BaseFuncBoolean
import com.avary.baselibrary.rx.BaseObserver
import com.trello.rxlifecycle2.LifecycleProvider
import com.trello.rxlifecycle2.android.ActivityEvent
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 * Created by G1596570 on 2019/1/7.
 *
 * Kotlin通用扩展
 */

/*
    扩展Observable执行
 */
fun <T> Observable<T>.excute(observer: BaseObserver<T>, lifecycleProvider: LifecycleProvider<ActivityEvent>) {
    this.subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .compose(lifecycleProvider.bindUntilEvent(ActivityEvent.DESTROY))
            .subscribe(observer)
}

/*
    扩展数据转换
 */
fun <T> Observable<BaseResp<T>>.convert(): Observable<T> {
    return this.flatMap(BaseFun())
}

/*
    扩展Boolean类型数据转换
 */
fun <T> Observable<BaseResp<T>>.convertBoolean(): Observable<Boolean> {
    return this.flatMap(BaseFuncBoolean())
}

/*
    扩展点击事件
 */
fun View.onClick(listener: View.OnClickListener): View {
    setOnClickListener(listener)
    return this
}

/*
    扩展点击事件，参数为方法
 */
fun View.onClick(method: () -> Unit): View {
    setOnClickListener { method() }
    return this
}

/*
    扩展视图可见性
 */
fun View.setVisible(visible: Boolean) {
    this.visibility = if (visible) View.VISIBLE else View.GONE
}