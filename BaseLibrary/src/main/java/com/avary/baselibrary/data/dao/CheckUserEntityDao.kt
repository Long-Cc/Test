package com.avary.login.data.dao

import android.arch.persistence.room.*
import com.avary.login.data.entiry.UserEntity


/**
 * Created by G1596570 on 2019/1/20.
 *
 *
 */
@Dao
interface CheckUserEntityDao {
    //-----------------------query----------------------
    @Query("SELECT * FROM user")
    fun getAll(): List<UserEntity>

    @Query("SELECT * FROM user WHERE name LIKE :name LIMIT 1")
    fun findByName(name: String): UserEntity

    @Query("SELECT * FROM user WHERE userId = :userId")
    fun findByUid(userId: String): UserEntity

    //-----------------------insert----------------------
    //Long 返回值为新行的ID
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(user: UserEntity): Long?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(vararg users: UserEntity): List<Long>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(users: List<UserEntity>): List<Long>

    //---------------------update------------------------
    //Int 返回值为更新的数量
    @Update
    fun update(user: UserEntity): Int

    @Update
    fun updateAll(vararg user: UserEntity): Int

    @Update
    fun updateAll(user: List<UserEntity>): Int

    //-------------------delete-------------------
    ////Int 返回值为删除的数量
    @Delete
    fun delete(user: UserEntity): Int

    @Delete
    fun deleteAll(users: List<UserEntity>): Int

    @Delete
    fun deleteUsers(vararg users: UserEntity): Int
}