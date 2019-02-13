package com.avary.base.data.respository

import com.avary.base.data.api.BackgroundApi
import com.avary.base.data.api.MyBackgroundApi
import com.avary.baselibrary.common.BaseRepository
import com.avary.baselibrary.data.database.DbHelper
import com.avary.baselibrary.data.protocol.BaseResp
import com.avary.baselibrary.data.protocol.CheckUser
import com.avary.baselibrary.data.protocol.Machine
import com.avary.login.data.protocol.user.WorkNoResp
import io.reactivex.Observable
import javax.inject.Inject

/**
 * Created by G1596570 on 2019/1/4.
 *
 *
 */
class LoginRepository @Inject constructor() : BaseRepository() {

    fun getWorkNO(softNo: String): Observable<WorkNoResp> {
        return retrofitFactory.create(MyBackgroundApi::class.java).getWorkNo(softNo)
    }

    /*
       用户数据
     */
    fun getUserCheckList(dataBase: String): Observable<BaseResp<List<CheckUser>>> {
        return retrofitFactory.create(BackgroundApi::class.java).getCheckUserList(dataBase)
    }

    fun deleteAllUser() {
        val userEntityList = DbHelper.INSTANCE!!.getCheckUserDao().getAll()
        DbHelper.INSTANCE!!.getCheckUserDao().deleteAll(userEntityList)
    }

    /*
        表单数据
     */
    fun getMachineList(dataBase: String): Observable<BaseResp<List<Machine>>> {
        return retrofitFactory.create(BackgroundApi::class.java).getMachineList(dataBase)
    }

    fun deleteAllMachine() {
        val machineEntityList = DbHelper.INSTANCE!!.getMachineDao().getAll()
        DbHelper.INSTANCE!!.getMachineDao().deleteAll(machineEntityList)
    }
}