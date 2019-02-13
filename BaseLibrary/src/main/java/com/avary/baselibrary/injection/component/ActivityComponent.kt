package com.avary.baselibrary.injection.component

import android.app.Activity
import android.content.Context
import com.avary.baselibrary.injection.module.ActivityModule
import com.avary.baselibrary.injection.module.LifecycleProviderModule
import com.avary.baselibrary.injection.scope.ActivityScope
import com.trello.rxlifecycle2.LifecycleProvider
import com.trello.rxlifecycle2.android.ActivityEvent
import dagger.Component

/**
 * Created by G1596570 on 2019/1/10.
 *
 *
 */
@ActivityScope
@Component(dependencies = [(AppComponent::class)], modules = [(ActivityModule::class), (LifecycleProviderModule::class)])
interface ActivityComponent {
    fun activity(): Activity
    fun context(): Context
    fun lifecycleProvider(): LifecycleProvider<ActivityEvent>
}