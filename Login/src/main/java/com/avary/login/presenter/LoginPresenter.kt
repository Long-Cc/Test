package com.avary.login.presenter

import android.os.Handler
import android.os.Message
import android.util.Log
import com.avary.base.presenter.LoginView
import com.avary.baselibrary.data.protocol.CheckUser
import com.avary.baselibrary.data.protocol.Machine
import com.avary.baselibrary.ext.excute
import com.avary.baselibrary.presenter.BasePresenter
import com.avary.baselibrary.rx.BaseObserver
import com.avary.login.common.LoginConstant
import com.avary.login.common.LoginConstant.Companion.FORM_DOWNLOAD_TITLE
import com.avary.login.common.LoginConstant.Companion.PERMISSION_DOWNLOAD_TITLE
import com.avary.login.common.LoginConstant.Companion.USER_DOWNLOAD_TITLE
import com.avary.login.data.entiry.MachineEntity
import com.avary.login.data.entiry.UserEntity
import com.avary.login.service.UserInfoService
import com.trello.rxlifecycle2.android.ActivityEvent
import io.reactivex.Observable
import io.reactivex.ObservableSource
import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.functions.Function
import io.reactivex.schedulers.Schedulers
import java.util.*
import javax.inject.Inject

/**
 * Created by G1596570 on 2019/1/7.
 *
 *
 */
class LoginPresenter @Inject constructor() : BasePresenter<LoginView>() {

    @Inject
    lateinit var userInfoService: UserInfoService
    lateinit var progressTitle: List<String>
    private var successCount = 0
    private var failureCount = 0
    private var failureMsg: StringBuffer = StringBuffer()

    companion object {
        private const val MSG_USER = 0
        private const val MSG_MACHINE = 1
        private const val MSG_PERMISSION = 2
        private val TAG = this::class.java.simpleName
    }

    private val mHandler = Handler(Handler.Callback {
        val progress = it.arg1
        when (it.what) {
            MSG_USER -> mView.updateDownloadProgress(progress, USER_DOWNLOAD_TITLE)
            MSG_MACHINE -> mView.updateDownloadProgress(progress, FORM_DOWNLOAD_TITLE)
            MSG_PERMISSION -> mView.updateDownloadProgress(progress, PERMISSION_DOWNLOAD_TITLE)
        }
        true
    })

    fun startDownloadAllData(list: List<String>) {
        progressTitle = list
        if (list.contains(USER_DOWNLOAD_TITLE)) {
            Thread(Runnable {
                kotlin.run {
                    for (i in 1..100) {
                        val message = Message.obtain()
                        message.what = MSG_USER
                        message.arg1 = i
                        Thread.sleep(400)
                        mHandler.sendMessage(message)
                    }
                }
            }).start()
            //getCheckUserList("SzFpc")
        }
        if (list.contains(LoginConstant.FORM_DOWNLOAD_TITLE)) {
            Thread(Runnable {
                kotlin.run {
                    for (i in 1..100) {
                        val message = Message.obtain()
                        message.what = MSG_MACHINE
                        message.arg1 = i
                        Thread.sleep(500)
                        mHandler.sendMessage(message)
                    }
                }
            }).start()
           // getFormList("SzFpc")
        }
        if (list.contains(LoginConstant.PERMISSION_DOWNLOAD_TITLE)) {
            Thread(Runnable {
                kotlin.run {
                    for (i in 1..100) {
                        val message = Message.obtain()
                        message.what = MSG_PERMISSION
                        message.arg1 = i
                        Thread.sleep(300)
                        mHandler.sendMessage(message)
                    }
                }
            }).start()
           // Log.d(TAG, "PERMISSION_DOWNLOAD_TITLE")
        }
    }

    /*
        用户资料下载
     */
    private fun getCheckUserList(dataBase: String) {
        if (!checkNetWork()) {
            return
        }
        mView.showLoading()
        userInfoService.deleteAllUsers()
                .excute(object : BaseObserver<Boolean>(mView) {
                    override fun onComplete() {
                        super.onComplete()
                        getNetCheckUser(dataBase)
                    }
                }, lifecycleProvider)
    }

    private fun getNetCheckUser(dataBase: String) {
        userInfoService.getCheckUser(dataBase)
                .excute(object : BaseObserver<List<CheckUser>>(mView) {
                    override fun onNext(t: List<CheckUser>) {
                        super.onNext(t)
                        saveCheckUser(t)
                    }
                }, lifecycleProvider)
    }

    private fun saveCheckUser(users: List<CheckUser>) {
        Observable.fromIterable(users)
                .flatMap(Function<CheckUser, ObservableSource<UserEntity>> {
                    return@Function Observable.just(UserEntity(it.userID, it.name, it.authList))
                }).toList()
                .flatMap(Function<List<UserEntity>, Single<Boolean>> {
                    var count = 0
                    for (userEntity in it) {
                        userInfoService.saveCheckUser(userEntity)
                        count++
                        val progress = Math.round(count.toFloat() / it.size.toFloat() * 100f)
                        val message = Message.obtain()
                        message.what = MSG_USER
                        message.arg1 = progress
                        mHandler.sendMessage(message)
                    }
                    Log.d(TAG, "$count/${it.size}")
                    return@Function Single.just(count == it.size)
                })
                .compose(lifecycleProvider.bindUntilEvent(ActivityEvent.DESTROY))
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe({
                    if (it) {
                        successResult()
                    } else {
                        failureResult()
                    }
                }, {
                    Log.e(TAG, it.localizedMessage.toString())
                    failureResult()
                })
    }

    /*
        表单资料下载
     */
    private fun getFormList(dataBase: String) {
        if (!checkNetWork()) {
            return
        }
        mView.showLoading()
        userInfoService.deleteAllMachines()
                .excute(object : BaseObserver<Boolean>(mView) {
                    override fun onComplete() {
                        super.onComplete()
                        getNetMachine(dataBase)
                    }
                }, lifecycleProvider)
    }

    private fun getNetMachine(dataBase: String) {
        userInfoService.getMachine(dataBase)
                .excute(object : BaseObserver<List<Machine>>(mView) {
                    override fun onNext(t: List<Machine>) {
                        super.onNext(t)
                        saveMachine(t)
                    }
                }, lifecycleProvider)
    }

    private fun saveMachine(machines: List<Machine>) {
        Observable.fromIterable(machines)
                .flatMap(Function<Machine, ObservableSource<MachineEntity>> {
                    return@Function Observable.just(MachineEntity(it.equId, it.equName, it.nfctag, it.factory, it.classr, it.line, it.linename, it.limittime, it.ownedForms))
                }).toList()
                .flatMap(Function<List<MachineEntity>, Single<Boolean>> {
                    var count = 0
                    for (machineEntity in it) {
                        userInfoService.saveMachine(machineEntity)
                        count++
                        val progress = Math.round(count.toFloat() / it.size.toFloat() * 100f)
                        val message = Message.obtain()
                        message.what = MSG_MACHINE
                        message.arg1 = progress
                        mHandler.sendMessage(message)
                    }
                    Log.d(TAG, "$count/${it.size}")
                    return@Function Single.just(count == it.size)
                })
                .compose(lifecycleProvider.bindUntilEvent(ActivityEvent.DESTROY))
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe({
                    if (it) {
                        successResult()
                    } else {
                        failureResult()
                    }
                }, {
                    Log.e(TAG, it.localizedMessage.toString())
                    failureResult()
                })
    }

    private fun successResult() {
        successCount++
        if (successCount == progressTitle.size) {
            mView.successDownload()
        }
    }

    private fun failureResult() {
        failureCount++
        if (failureCount == progressTitle.size) {
            mView.failureDownload(failureMsg.toString())
        }
    }


}