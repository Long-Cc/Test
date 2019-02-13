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
class BaseFuncBoolean<T>: Function<BaseResp<T>, Observable<Boolean>> {
    override fun apply(t: BaseResp<T>): Observable<Boolean> {
        if (t.status != ResultCode.SUCCESS) {
            return Observable.error(BaseException(t.status,t.message))
        }
        return Observable.just(true)
    }
}