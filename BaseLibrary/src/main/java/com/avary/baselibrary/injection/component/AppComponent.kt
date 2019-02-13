package com.avary.baselibrary.injection.component

import android.content.Context
import com.avary.baselibrary.injection.module.AppModule
import dagger.Component
import javax.inject.Singleton

/**
 * Created by G1596570 on 2019/1/10.
 *
 *
 */
@Singleton
@Component(modules = [(AppModule::class)])
interface AppComponent {
    fun context(): Context
}