package com.avary.login.injection.module

import com.avary.baselibrary.injection.scope.PreComponentScope
import com.avary.login.service.Impl.UserInfoServiceImpl
import com.avary.login.service.UserInfoService
import dagger.Module
import dagger.Provides

/**
 * Created by G1596570 on 2019/1/10.
 *
 *
 */
@Module
class LoginModule {
    @PreComponentScope
    @Provides
    fun provideUserService(userService: UserInfoServiceImpl): UserInfoService {
        return userService
    }
}