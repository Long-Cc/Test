package com.avary.baselibrary.presenter

import android.content.Context
import com.avary.baselibrary.presenter.view.BaseView
import com.avary.baselibrary.utils.NetWorkUtils
import com.trello.rxlifecycle2.LifecycleProvider
import com.trello.rxlifecycle2.android.ActivityEvent
import javax.inject.Inject

/**
 * Created by G1596570 on 2019/1/7.
 *
 *
 */
open class BasePresenter<T : BaseView> constructor() {

    lateinit var mView: T
    @Inject
    lateinit var context: Context

    @Inject
    lateinit var lifecycleProvider: LifecycleProvider<ActivityEvent>
    /*
        检查网络是否可用
     */
    fun checkNetWork(): Boolean {
        if (NetWorkUtils.isNetWorkAvailable(context)) {
            return true
        }
        mView.onError("网络不可用")
        return false
    }
}