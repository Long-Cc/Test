package com.avary.baselibrary.data.protocol

import com.google.gson.annotations.SerializedName

/**
 * Created by G1596570 on 2019/1/5.
    能用响应对象
    @status:响应状态字串
    @message:响应文字消息
    @data:具体响应业务对象
 */
data class BaseResp<out T>(@SerializedName("Status") val status:String, @SerializedName("Message") val message:String, @SerializedName("Data") val data:T)
