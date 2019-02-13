package com.avary.login.service.Impl

import android.text.TextUtils.isEmpty
import com.avary.base.data.respository.LoginRepository
import com.avary.baselibrary.data.database.DbHelper
import com.avary.baselibrary.data.protocol.CheckUser
import com.avary.baselibrary.data.protocol.Machine
import com.avary.baselibrary.ext.convert
import com.avary.login.data.entiry.MachineEntity
import com.avary.login.data.entiry.UserEntity
import com.avary.login.data.protocol.user.WorkNoResp
import com.avary.login.service.UserInfoService
import io.reactivex.Observable
import io.reactivex.ObservableSource
import io.reactivex.functions.Function
import javax.inject.Inject

/**
 * Created by G1596570 on 2019/1/7.
 *
 *
 */
class UserInfoServiceImpl @Inject constructor():UserInfoService {

    @Inject
    lateinit var repository:LoginRepository

    override fun getWorkNO(softNo: String): Observable<WorkNoResp> {
        return repository.getWorkNO(softNo)
    }

    override fun getCheckUser(dataBase: String): Observable<List<CheckUser>> {
        return repository.getUserCheckList(dataBase).convert()
    }

    override fun deleteAllUsers(): Observable<Boolean> {
        return Observable.just("")
                .flatMap(Function<String, ObservableSource<Boolean>>{
                    repository.deleteAllUser()
                    return@Function Observable.just(DbHelper.INSTANCE!!.getCheckUserDao().getAll().isEmpty())
                })
    }

    override fun saveCheckUser(checkUser: UserEntity) {
        DbHelper.INSTANCE!!.getCheckUserDao().insert(checkUser)
    }


    override fun getMachine(dataBase: String): Observable<List<Machine>> {
        return repository.getMachineList(dataBase).convert()
    }
    override fun deleteAllMachines(): Observable<Boolean> {
        return Observable.just("")
                .flatMap(Function<String, ObservableSource<Boolean>>{
                    repository.deleteAllMachine()
                    return@Function Observable.just(DbHelper.INSTANCE!!.getMachineDao().getAll().isEmpty())
                })
    }

    override fun saveMachine(machine: MachineEntity) {
        DbHelper.INSTANCE!!.getMachineDao().insert(machine)
    }
}