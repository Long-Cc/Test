package com.avary.baselibrary.common

import com.avary.baselibrary.common.BaseApplication.Companion.context
import com.avary.baselibrary.data.database.AppDatabase
import com.avary.baselibrary.data.net.RetrofitFactory

/**
 * Created by G1596570 on 2019/1/20.
 *
 *
 */
open class BaseRepository constructor() {
    val retrofitFactory: RetrofitFactory = RetrofitFactory.instance
}