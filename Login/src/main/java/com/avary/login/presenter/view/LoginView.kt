package com.avary.base.presenter

import com.avary.baselibrary.data.protocol.SingleProgress
import com.avary.baselibrary.presenter.view.BaseView

/**
 * Created by G1596570 on 2019/1/4.
 *
 *
 */
interface LoginView : BaseView {
    fun updateDownloadProgress(progress: Int, progressTitle: String)
    fun successDownload()
    fun failureDownload(message: String)
}