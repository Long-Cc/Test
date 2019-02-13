package com.avary.baselibrary.data.net

import com.avary.baselibrary.common.BaseConstant
import com.avary.baselibrary.utils.AppPrefsUtils
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

/**
 * Created by G1596570 on 2019/1/5.
 *
 */
class RetrofitFactory private constructor() {
    companion object {
        val instance:RetrofitFactory by lazy { RetrofitFactory() }
    }

    private val interceptor: Interceptor
    private val retrofit: Retrofit

    init {
        retrofit = Retrofit.Builder()
                .baseUrl(BaseConstant.SERVER_ADDRESS_SZ)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .client(initOkHttpClient())
                .build()

        interceptor = Interceptor {
            chain -> val request = chain.request()
                .newBuilder()
                .addHeader("Content_Type","application/json")
                .addHeader("charset","UTF-8")
                .addHeader("token", AppPrefsUtils.getString(BaseConstant.KEY_SP_TOKEN))
                .build()
            chain.proceed(request)
        }
    }

    private fun initOkHttpClient(): OkHttpClient {
        return OkHttpClient.Builder()
                .addInterceptor(initLogInterceptor())
                //.addInterceptor(interceptor)
                .connectTimeout(20, TimeUnit.SECONDS)
                .readTimeout(20, TimeUnit.SECONDS)
                .build()
    }

    private fun initLogInterceptor(): HttpLoggingInterceptor {
        val logInterceptor = HttpLoggingInterceptor();
        logInterceptor.level = HttpLoggingInterceptor.Level.BODY
        return logInterceptor
    }


    fun <T> create(service:Class<T>):T{
        return retrofit.create(service)
    }
}