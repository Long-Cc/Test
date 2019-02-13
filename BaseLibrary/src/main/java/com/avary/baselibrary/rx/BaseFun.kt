package com.avary.baselibrary.rx

import com.avary.baselibrary.common.BaseException
import com.avary.baselibrary.common.ResultCode
import com.avary.baselibrary.data.protocol.BaseResp
import io.reactivex.Observable
import io.reactivex.functions.Function

/**
 * Created by G1596570 on 2019/1/7.
 *
 *
 */
/*
    通用数据类型转换封装
 */
class BaseFun<T>:Function<BaseResp<T>,Observable<T>>{
    override fun apply(t: BaseResp<T>): Observable<T> {
        if (t.status != ResultCode.SUCCESS) {
            return Observable.error(BaseException(t.status,t.message))
        }
        return Observable.just(t.data)
    }
}