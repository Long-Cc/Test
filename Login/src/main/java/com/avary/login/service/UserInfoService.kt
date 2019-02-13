package com.avary.login.service

import com.avary.baselibrary.data.protocol.CheckUser
import com.avary.baselibrary.data.protocol.Machine
import com.avary.login.data.entiry.MachineEntity
import com.avary.login.data.entiry.UserEntity
import com.avary.login.data.protocol.user.WorkNoResp
import io.reactivex.Observable

/**
 * Created by G1596570 on 2019/1/5.
 *
 *
 */
interface UserInfoService {
    /*
        下载用户资料
     */
    fun getWorkNO(softNo: String): Observable<WorkNoResp>

    fun getCheckUser(dataBase: String): Observable<List<CheckUser>>

    fun deleteAllUsers():Observable<Boolean>

    fun saveCheckUser(checkUser: UserEntity)

    /*
        下载设备资料
     */
    fun deleteAllMachines():Observable<Boolean>

    fun getMachine(dataBase: String): Observable<List<Machine>>

    fun saveMachine(machine: MachineEntity)
}