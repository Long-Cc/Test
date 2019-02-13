package com.avary.baselibrary.common

/**
 * Created by G1596570 on 2019/1/7.
 *
 *  定义通用异常
 */

class BaseException(val status: String, val msg: String) : Throwable()