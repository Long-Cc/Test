package com.avary.login.injection.component

import com.avary.baselibrary.injection.component.ActivityComponent
import com.avary.baselibrary.injection.scope.PreComponentScope
import com.avary.login.injection.module.LoginModule
import com.avary.login.ui.activity.LoginActivity
import dagger.Component

/**
 * Created by G1596570 on 2019/1/10.
 *
 *
 */
@PreComponentScope
@Component(dependencies = [(ActivityComponent::class)], modules = [(LoginModule::class)])
interface LoginComponent {
    fun inject(activityLoginActivity: LoginActivity)
}