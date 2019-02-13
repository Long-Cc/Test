package com.avary.baselibrary.injection.module

import android.content.Context
import com.avary.baselibrary.common.BaseApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by G1596570 on 2019/1/10.
 *
 */
@Module
class AppModule (private val context: BaseApplication) {
    @Singleton
    @Provides
    fun providerContext(): Context {
        return this.context
    }
}