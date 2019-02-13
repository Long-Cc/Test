package com.avary.login.data.dao

import android.arch.persistence.room.*
import com.avary.login.data.entiry.MachineEntity
import com.avary.login.data.entiry.UserEntity


/**
 * Created by G1596570 on 2019/1/20.
 *
 *
 */
@Dao
interface MachineEntityDao {
    //-----------------------query----------------------
    @Query("SELECT * FROM machine")
    fun getAll(): List<MachineEntity>

    @Query("SELECT * FROM machine WHERE equID = :equId")
    fun findById(equId: String): MachineEntity

    //-----------------------insert----------------------
    //Long 返回值为新行的ID
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(machine: MachineEntity): Long

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(vararg machines: MachineEntity): List<Long>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(machines: List<MachineEntity>): List<Long>

    //---------------------update------------------------
    //Int 返回值为更新的数量
    @Update
    fun update(machine: MachineEntity): Int

    @Update
    fun updateAll(vararg machine: MachineEntity): Int

    @Update
    fun updateAll(machines: List<MachineEntity>): Int

    //-------------------delete-------------------
    ////Int 返回值为删除的数量
    @Delete
    fun delete(machine: MachineEntity): Int

    @Delete
    fun deleteAll(machines: List<MachineEntity>): Int

    @Delete
    fun deleteMachines(vararg machines: MachineEntity): Int
}