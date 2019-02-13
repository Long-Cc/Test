package com.avary.baselibrary.injection.module

import com.trello.rxlifecycle2.LifecycleProvider
import com.trello.rxlifecycle2.android.ActivityEvent
import dagger.Module
import dagger.Provides

/**
 * Created by G1596570 on 2019/1/11.
 *
 *
 */
@Module
class LifecycleProviderModule (private val lifecycleProvide: LifecycleProvider<ActivityEvent>) {

    @Provides
    fun providerLifecycleProvider() : LifecycleProvider<ActivityEvent> {
        return this.lifecycleProvide
    }
}