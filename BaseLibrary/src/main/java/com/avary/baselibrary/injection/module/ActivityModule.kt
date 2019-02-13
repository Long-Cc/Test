package com.avary.baselibrary.injection.module

import android.app.Activity
import com.avary.baselibrary.injection.scope.ActivityScope
import dagger.Module
import dagger.Provides

/**
 * Created by G1596570 on 2019/1/10.

    Activity级别Module
 */
@Module
class ActivityModule(private val activity: Activity) {
    @ActivityScope
    @Provides
    fun provideActivity(): Activity {
        return this.activity
    }
}