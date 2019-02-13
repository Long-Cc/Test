package com.avary.baselibrary.ui.activity

import android.os.Bundle
import com.avary.baselibrary.common.BaseApplication
import com.avary.baselibrary.injection.component.ActivityComponent
import com.avary.baselibrary.injection.component.DaggerActivityComponent
import com.avary.baselibrary.injection.module.ActivityModule
import com.avary.baselibrary.injection.module.LifecycleProviderModule
import com.avary.baselibrary.presenter.BasePresenter
import com.avary.baselibrary.presenter.view.BaseView
import com.avary.baselibrary.utils.DialogUtil
import com.avary.baselibrary.widgets.ProgressLoading
import com.uber.autodispose.AutoDisposeConverter
import org.jetbrains.anko.toast
import javax.inject.Inject

/**
 * Created by G1596570 on 2019/1/7.
 *
 *
 */
abstract class BaseMvpActivity<T : BasePresenter<*>> : BaseActivity(), BaseView {

    @Inject
    lateinit var mPresenter: T

    lateinit var activityComponent: ActivityComponent

    private lateinit var mLoadingDialog: ProgressLoading

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initActivityInjection()
        injectComponent()
        initBaseRepository()

        mLoadingDialog = ProgressLoading.create(this)
    }

    private fun initBaseRepository() {

    }

    private fun initActivityInjection() {
        activityComponent = DaggerActivityComponent.builder()
                .appComponent((application as BaseApplication).appComponent)
                .activityModule(ActivityModule(this))
                .lifecycleProviderModule(LifecycleProviderModule(this))
                .build()

    }

    protected abstract fun injectComponent()

    override fun showLoading() {
        mLoadingDialog.showLoading()
    }

    override fun hideLoading() {
        mLoadingDialog.hide()
    }

    override fun onError(text: String) {
        toast(text)
       // DialogUtil.showTips(this, "Error", text, "确定", null)
    }
}
