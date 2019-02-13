package com.avary.baselibrary.data.database

import android.arch.persistence.room.Database
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import android.content.Context
import com.avary.login.data.dao.CheckUserEntityDao
import com.avary.login.data.entiry.UserEntity
import android.arch.persistence.db.SupportSQLiteDatabase
import android.arch.persistence.room.migration.Migration
import com.avary.login.data.dao.MachineEntityDao
import com.avary.login.data.entiry.MachineEntity


/**
 * Created by G1596570 on 2019/1/20.
 *
 *
 */
@Database(entities = [(UserEntity::class),(MachineEntity::class)], version = 3, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun checkUserDao(): CheckUserEntityDao
    abstract fun machineDao(): MachineEntityDao
}