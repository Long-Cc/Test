package com.avary.baselibrary.presenter.view

/**
 * Created by G1596570 on 2019/1/7.
 * MVP中视图回调 基类
 *
 */

interface BaseView {
    fun showLoading()
    fun hideLoading()
    fun onError(text:String)
}
