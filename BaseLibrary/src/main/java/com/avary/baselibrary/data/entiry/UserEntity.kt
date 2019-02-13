package com.avary.login.data.entiry

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

/**
 * Created by G1596570 on 2019/1/20.
 *
 *
 */
@Entity(tableName = "user")
open class UserEntity constructor(@ColumnInfo(name = "userId")
                             @PrimaryKey
                             val userId: String,
                             @ColumnInfo(name = "name")
                             val name: String,
                             @ColumnInfo(name = "permission")
                             val permission: String)