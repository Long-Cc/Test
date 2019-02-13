package com.avary.baselibrary.data.database

import android.arch.persistence.db.SupportSQLiteDatabase
import android.arch.persistence.room.Room
import android.arch.persistence.room.migration.Migration
import android.content.Context
import android.util.Log
import com.avary.login.data.dao.CheckUserEntityDao
import com.avary.login.data.dao.MachineEntityDao

/**
 * Created by G1596570 on 2019/1/28.
 *
 *
 */
class DbHelper constructor(context: Context) {

    private var appDb:  AppDatabase? = null
    private val dbName = "form.db"

    /**
     * 初始化 db
     */
    init {
        appDb = Room.databaseBuilder(context,
                AppDatabase::class.java, dbName)
                .fallbackToDestructiveMigration()
                .build()
        //.addMigrations(MigrateDb(1, 2))
    }

    /**
     * 获取 CheckUserDao
     */
    fun getCheckUserDao(): CheckUserEntityDao {
        return appDb!!.checkUserDao()
    }

    /**
     * 获取 MachineDao
     */
    fun getMachineDao(): MachineEntityDao {
        return appDb!!.machineDao()
    }


    /**
     * 单例实现
     */
    companion object {

        var INSTANCE: DbHelper? = null

        fun init(context: Context): DbHelper {
            if (INSTANCE == null) {
                synchronized(DbHelper::class) {
                    if (INSTANCE == null) {
                        INSTANCE = DbHelper(context)
                    }
                }
            }
            return INSTANCE!!
        }

    }

    /**
     * 关闭数据库
     */
    fun onDestory() {
        if (appDb != null) {
            appDb!!.close()
        }
    }

    /**
     * 版本合并
     */
    private val MIGRATION_1_2: Migration = object : Migration(1, 2) {
        override fun migrate(database: SupportSQLiteDatabase) {
            database.execSQL("CREATE TABLE `Fruit` (`id` INTEGER, " + "`name` TEXT, PRIMARY KEY(`id`))")
        }
    }

}