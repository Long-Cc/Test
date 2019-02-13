package com.avary.baselibrary.common

import android.app.Application
import android.content.Context
import com.avary.baselibrary.data.database.DbHelper
import com.avary.baselibrary.injection.component.AppComponent
import com.avary.baselibrary.injection.component.DaggerAppComponent
import com.avary.baselibrary.injection.module.AppModule

/**
 * Created by G1596570 on 2019/1/10.
 *
 *
 */
class BaseApplication : Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        initAppInjection()
        context = this
        DbHelper.init(this)
        //ARouter初始化
//        ARouter.openLog()    // 打印日志
//        ARouter.openDebug()
//        ARouter.init(this)
    }

    /*
        Application Component初始化
     */
    private fun initAppInjection() {
        appComponent = DaggerAppComponent.builder().appModule(AppModule(this)).build()
    }

    /*
        全局伴生对象
     */
    companion object {
        lateinit var context: Context
    }
}