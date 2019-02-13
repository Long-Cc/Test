package com.avary.login.data.entiry

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import android.arch.persistence.room.TypeConverters
import com.avary.baselibrary.data.converters.MachineFormConverter
import com.avary.baselibrary.data.converters.OwnedFormTypeConverter
import com.avary.baselibrary.data.protocol.OwnedForm

/**
 * Created by G1596570 on 2019/1/20.
 *
 *
 */
@Entity(tableName = "machine")
@TypeConverters(OwnedFormTypeConverter::class)
open class MachineEntity constructor(@ColumnInfo(name = "equID")
                                     @PrimaryKey
                                     var equID: String,
                                     @ColumnInfo(name = "equName")
                                     var equName: String,
                                     @ColumnInfo(name = "NFCTag")
                                     val NFCTag: String,
                                     @ColumnInfo(name = "factory")
                                     val factory: String,
                                     @ColumnInfo(name = "classR")
                                     val classR: String,
                                     @ColumnInfo(name = "line")
                                     val line: String,
                                     @ColumnInfo(name = "lineName")
                                     val lineName: String,
                                     @ColumnInfo(name = "limitTime")
                                     val limitTime: String,
                                     var ownedFormList: List<OwnedForm>)